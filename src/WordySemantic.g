tree grammar WordySemantic;

options {
  language     = Java;
  tokenVocab   = Wordy;
  ASTLabelType = CommonTree;
  backtrack    = true;
}

@members {
private VariableScopesHandler varHandler = new VariableScopesHandler();
private FunctionsTable functions;
private FunctionsHandler functionsHandler;
private boolean mainFound = false;

public String getErrorHeader(RecognitionException e) {
	return "line " + e.line;
}
}

program[FunctionsTable functions]
@init {
this.functions = functions;
functionsHandler = new FunctionsHandler(functions);
VariableScope globals = new VariableScope();
varHandler.enterScope(globals);
}
  :
  declaration* 
              {
               if (!mainFound) {
               	Tool.error(this, "invalid file,main method(Void main()) not found");
               }
              }
  ;

declaration
  :
  variable
  | function
  ;

variable
  :
  ^(VAR type declarator)
  
  {
   VariableScope scope = varHandler.getCurrentScope();
   if (scope.varDeclared($declarator.text)) {
   	Tool.error(this, $declarator.text + " duplicated", $VAR);
   } else {
   	scope.add(new Variable($declarator.text, $type.idType, $declarator.line));
   }
  }
  ;

declarator returns [String text, int line]
  :
  ID 
    {
     $text = $ID.text;
     $line = $ID.line;
    }
  ;
// END: declaration

// BEGINNING: function

function
scope {
String name;
boolean returnRequired;
}
@init {
$function::returnRequired = false;
}
  :
  regularFunction
  | main
  ;

regularFunction
@init {
VariableScope functionVars = new VariableScope();
varHandler.enterScope(functionVars);
}
@after {
varHandler.leaveScope();
}
  :
  ^(
    FUNC type ID 
                {
                 $function::name = $ID.text;
                                                                    if($type.idType!="V") {
                                                                       $function::returnRequired = true;
                                                                    }
                }
    (
      formalParameter
    )*
    block[$function::returnRequired]
   )
  ;

formalParameter
  :
  ^(PARAM type ID)
  
  {
   VariableScope scope = varHandler.getCurrentScope();
   if (scope.varDeclared($ID.text)) {
   	Tool.error(this, $ID.text + " duplicated", $ID);
   } else {
   	scope.add(new Variable($ID.text, $type.idType, $ID.line));
   }
  }
  ;

main
@init {
VariableScope mainFunctionVars = new VariableScope();
varHandler.enterScope(mainFunctionVars);
$function::name = "main";
}
@after {
varHandler.leaveScope();
}
  :
  ^(MAIN block[false])
  
  {
   if (!mainFound) {
   	mainFound = true;
   } else {
   	Tool.error(this, "must be only one main method", $MAIN);
   }
  }
  ;
// END: function

// BEGINNING:type

type returns [String idType]
  :
  STRING 
        {
         $idType = "Ljava/lang/String;";
        }
  | LIST 
        {
         $idType = "Ljava/util/ArrayList;";
        }
  | VOID 
        {
         $idType = "V";
        }
  ;
// END:type

block[boolean neadedToReturn]
@init {
VariableScope blockVars = new VariableScope();
varHandler.enterScope(blockVars);
}
@after {
varHandler.leaveScope();
}
  :
  ^(BLOCK blockContainment[neadedToReturn])
  ;

blockContainment[boolean neadedToReturn]
  :
  (
    (
      variable
      | stmt
    )+
    returnStat
  )
  |
  (
    (
      variable
      | stmt
    )+
    
    {
     if (neadedToReturn) {
          	Tool.error(this,
          			"you must to return from function " + $function::name + " with non empty return type");
          }
    }
  )
  ;

stmt
  :
  simple_stmt
  | compound_stmt
  ;

simple_stmt
  :
  expr
  | assignStat
  | printOp
  ;

returnStat
  :
  ^(RETURN returnable)
  
  {
   String retType = functions.get($function::name).getReturnType();
                   if(retType!=$returnable.type) {
                     Tool.error(this, "you must return from function result of type " + retType, $r);
                   }
  }
  | r=RETURN 
            {
             String retType = functions.get($function::name).getReturnType();
                                                 if(retType!="V") {
                                                   Tool.error(this, "you must return from function result of type " + retType, $r);
                                                 }
            }
  ;

returnable returns [String type]
  :
  expr 
      {
       $type = $expr.type;
      }
  ;

printOp
  :
  ^(PRINT ID)
  ;

assignStat
  :
  ^(ASSIGN ID assignable)
  
  {
   if (varHandler.isVariableDeclared($ID.text)) {
   	VariableScope scope = varHandler.getNearestScopeWithVar($ID.text);
   	String typeOfTarget = scope.get($ID.text).getType();
   	String typeOfValue = $assignable.type;
   	if (typeOfTarget.equals(typeOfValue)) {
   		scope.get($ID.text).addLineUses($ID.line);
   	} else {
   		Tool.error(this, "type mismatch: can not convert " + typeOfValue
   				+ " to " + typeOfTarget, $ID);
   	}
   } else {
   	Tool.error(this, $ID.text + " cannot be resolved to variable", $ID);
   }
  }
  ;

assignable returns [String type]
  :
  ^(
    LIST
    (
      STRING
    )*
   )
  
  {
   $type = "Ljava/util/ArrayList;";
  }
  | expr 
        {
         $type = $expr.type;
        }
  ;

compound_stmt
  :
  if_stmt
  | while_stmt
  | foreach_stmt
  ;

if_stmt
  :
  ^(
    IF
    ^(TEST test)
    block[false]
   )
  ;

while_stmt
  :
  ^(WHILE test block[false])
  ;

foreach_stmt
@init {
VariableScope foreachVars = new VariableScope();
varHandler.enterScope(foreachVars);
}
@after {
varHandler.leaveScope();
}
  :
  ^(
    FOREACH
    ^(PART type part=ID)
    ^(w=WHOLE whole=ID)
    block[false]
   )
  
  {
   VariableScope scope = varHandler.getNearestScopeWithVar($whole.text);
   if (scope == null) {
   	Tool.error(this, $whole.text + " cannot be resolved to variable", $whole);
   } else {
   	scope.get($whole.text).addLineUses($whole.line);
   }
   scope = varHandler.getCurrentScope();
   scope.add(new Variable($part.text, $type.idType, $part.line));
  }
  ;

funcCall returns [String returnType]
@init {
List<String> parameterTypes = new ArrayList<String>();
}
  :
  ^(
    CALL ID
    (
      param 
           {
            parameterTypes.add($param.type);
           }
    )*
   )
  
  {
   if (functions.isDeclared($ID.text)) {
   	if (functionsHandler.isParametersCorrect($ID.text, parameterTypes)) {
   		Function function = functions.get($ID.text);
   		function.addLineCall($ID.line);
   		$returnType = function.getReturnType();
   	}
   } else {
   	Tool.error(this, "function " + $ID.text + " is not found", $ID);
   }
  }
  ;

param returns [String type]
  :
  ^(PARAM expr)
  
  {
   $type = $expr.type;
  }
  ;

test
  //  :
  //  ^(OR and_test)
  //  ;
  //
  //and_test
  //  :
  //  ^(AND check)
  //  ;
  //
  //check
  :
  ^(
    b=NOT_CONTAINS
    ^(VERIFIABLE e1=expr)
    ^(CHECKING e2=expr)
   )
  
  {
   if ($e1.type == "Ljava/lang/String;") {
   	Tool.error(this, "unsupported opperation: expected List but got String", $b);
   }
   if ($e2.type == "Ljava/util/ArrayList;") {
   	Tool.error(this, "unsupported opperation: expected String but got List", $b);
   }
  }
  |
  ^(
    b=CONTAINS
    ^(VERIFIABLE e1=expr)
    ^(CHECKING e2=expr)
   )
  
  {
   if ($e1.type == "Ljava/lang/String;") {
   	Tool.error(this, "unsupported opperation: expected List but got String", $b);
   }
   if ($e2.type == "Ljava/util/ArrayList;") {
   	Tool.error(this, "unsupported opperation: expected String but got List", $b);
   }
  }
  |
  ^(
    b=NOT_EQUALS
    ^(VERIFIABLE e1=expr)
    ^(CHECKING e2=expr)
   )
  
  {
   if ($e1.type != $e2.type) {
   	Tool.error(this, "unsupported opperation: cannot convert " + $e2.type
   			+ " to " + $e1.type, $b);
   }
  }
  |
  ^(
    b=EQUALS
    ^(VERIFIABLE e1=expr)
    ^(CHECKING e2=expr)
   )
  
  {
   if ($e1.type != $e2.type) {
   	Tool.error(this, "unsupported opperation: cannot convert " + $e2.type
   			+ " to " + $e1.type, $b);
   }
  }
  ;

expr returns [String type]
  :
    s=atom
    {
   $type = $s.type;
  }
    |
    ^(
      r=REMOVE
      ^(SUBJECT s=atom)
      ^(POSITION INT)
     )
    
    {
     if ($s.type == "Ljava/lang/String;") {
     	Tool.error(this, "unsupported opperation: expected List but got String", $r);
     }
     $type = $s.type;
    }
    |
    ^(
      r=REMOVE
      ^(SUBJECT s=atom)
      ^(TARGET t=atom)
     )
    
    {
     if ($t.type == "Ljava/lang/String;") {
     	Tool.error(this, "unsupported opperation: expected List but got String", $r);
     }
     if ($s.type == "Ljava/util/ArrayList;") {
     	Tool.error(this, "unsupported opperation: expected String but got List", $r);
     }
     $type = $s.type;
    }
    |
    ^(
      a=ADD
      ^(SUBJECT atom)
      ^(POSITION INT)
     )
    
    {
     Tool.error(this, "invalid opperation", $a);
     $type = $atom.type;
    }
    |
    ^(
      a=ADD
      ^(SUBJECT s=atom)
      ^(TARGET t=atom)
     )
    
    {
     if ($t.type == "Ljava/lang/String;") {
     	Tool.error(this, "unsupported opperation: expected List but got String", $a);
     }
     if ($s.type == "Ljava/util/ArrayList;") {
     	Tool.error(this, "unsupported opperation: expected String but got List", $a);
     }
     $type = $s.type;
    }
    |
    ^(
      g=GET
      ^(SUBJECT s=atom)
      ^(POSITION INT)
     )
    
    {
     if ($s.type == "Ljava/lang/String;") {
     	Tool.error(this, "unsupported opperation: expected List but got String", $g);
     }
     $type = "Ljava/lang/String;";
    }
    |
    ^(
      g=GET
      ^(SUBJECT s=atom)
      ^(TARGET t=atom)
     )
    
    {
     Tool.error(this, "invalid opperation", $g);
     $type = $s.type;
    }
  ;

atom returns [String type]
  :
  ID 
    {
     VariableScope scope = varHandler.getNearestScopeWithVar($ID.text);
     if (scope == null) {
     	Tool.error(this, "name " + $ID.text + " cannot be resolved to a variable",
     			$ID);
     	$type = "V";
     
     } else {
     	scope.get($ID.text).addLineUses($ID.line);
     	$type = scope.get($ID.text).getType();
     }
    }
  | STRING 
          {
           $type = "Ljava/lang/String;";
          }
  | funcCall 
            {
             $type = $funcCall.returnType;
            }
  ;
