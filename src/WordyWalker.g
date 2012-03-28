tree grammar WordyWalker;

options {
  language     = Java;
  output       = template;
  tokenVocab   = Wordy;
  ASTLabelType = CommonTree;
}

@header {
import java.util.HashMap;
}

@members {
private FunctionsTable functionsData;
private Globals globalsData;
}

program[FunctionsTable functionsData, Globals globalsData]
scope {
List globals;
List functions;
List globalsInitialization;
List main;
}
@init {
this.functionsData = functionsData;
this.globalsData = globalsData;
$program::globals = new ArrayList();
  $program::functions = new ArrayList();
  $program::main = new ArrayList();
}
  :
  declaration*
    ->
      program(globals={$program::globals}, mainBody={$program::main}, functions={$program::functions}, maxStackDepth={functionsData.get("main").getOperatorsCount()}, maxLocals={functionsData.get("main").getLocalsCount()}, init={"<init>"})
  ;

declaration
  :
  variable[true] 
                {
                 $program::globals.add($variable.st);
                }
  | function
  ;

variable[boolean global] returns [String idType, String name]
  :
  ^(VAR type declarator)
  
  {
   if(!global) {$idType = $type.idType;
                                     $name = $declarator.text; 
                                             $function::locals.put($declarator.text, true);
                                             }
  }
    -> {global}?
      globalVariable(type={$type.st}, name={$declarator.st})
    ->
      variable(type={$type.st}, name={$declarator.st})
  ;

declarator returns [String text]
  :
  ID 
    {
     $text = $ID.text;
    }
    ->
      {new StringTemplate($ID.text)}
  ;
// END: declaration

// BEGINNING: function

function
scope {
HashMap locals;
Function currentFunction;
int numOps;
}
@init {
$function::numOps = 0;
$function::locals = new HashMap();
}
  :
  main 
      {
       $program::main.add($main.st);
      }
  | regularFunction 
                   {
                    $program::functions.add($regularFunction.st);
                   }
  ;

regularFunction
scope {
List formalParameters;
}
@init {
$regularFunction::formalParameters = new ArrayList();
}
  :
  ^(
    FUNC type ID 
                {
                 $function::currentFunction=functionsData.get($ID.text);
                }
    (
      formalParameter 
                     {
                      $regularFunction::formalParameters.add($formalParameter.st);
                     }
    )*
    block[true]
   )
    ->
      function(retType={$type.st}, name={$ID.text}, parameters={$regularFunction::formalParameters}, maxStackDepth={functionsData.get($ID.text).getOperatorsCount()}, maxLocals={functionsData.get($ID.text).getLocalsCount()}, content={$block.st})
  ;

formalParameter
  :
  ^(PARAM type ID)
  
  {
   $function::locals.put($ID.text ,true);
  }
    ->
      parameter(type={$type.st}, name={$ID.text})
  ;

main
  :
  ^(MAIN 
        {
         $function::currentFunction=functionsData.get("main");
        }
    block[false])
    ->
      {$block.st}
  ;
// END: function

// BEGINNING:type

type returns [String idType]
  :
  STRING 
        {
         $idType = "Ljava/lang/String;";
        }
    ->
      type_String()
  | LIST 
        {
         $idType = "Ljava/util/ArrayList;";
        }
    ->
      type_List()
  | VOID 
        {
         $idType = "V";
        }
    ->
      type_Void()
  ;
// END:type

block[boolean neadedToReturn]
scope {
List content
}
@init {
$block::content = new ArrayList();
}
  :
  ^(BLOCK blockContainment[neadedToReturn])
    ->
      block(content={$block::content})
  ;

blockContainment[boolean neadedToReturn]
  :
  (
    variable[false] 
                   {
                    $block::content.add($variable.st);
                   }
    | stmt 
          {
           $block::content.add($stmt.st);
          }
  )+
  returnStat[neadedToReturn] 
            {
             $block::content.add($returnStat.st);
            }
  ;

stmt
  :
  simple_stmt
    ->
      {$simple_stmt.st}
  | compound_stmt
    ->
      {$compound_stmt.st}
  ;

simple_stmt
  :
  expr
    ->
      {$expr.st}
  | assignStat
    ->
      {$assignStat.st}
  | printOp
    ->
      {$printOp.st}
  ;

returnStat[boolean neadedToReturn]
  :
  ^(RETURN returnable)
    ->
      returnObject(returnable={$returnable.st})
  | RETURN
    ->
      returnVoid()
  |
    -> {neadedToReturn}? returnVoid()
    ->
  ;

returnable
  :
  expr
    ->
      {$expr.st}
  ;

printOp
  :
  ^(PRINT ID)
    -> {$function::locals.get($ID.text)!=null}?
      printVar(varNum={$function::currentFunction.getVariableLocalNumber($ID.text)})
    ->
      printGlob(id={$ID.text}, type={globalsData.getGlobalTypeByName($ID.text)})
  ;

assignStat
  :
  ^(ASSIGN ID assignable[$ID.text])
    ->
      {$assignable.st}
  ;

assignable[String assigned]
  :
  expr
    -> {$function::locals.get(assigned)!=null}?
      assignVar(id={assigned}, varNum={$function::currentFunction.getVariableLocalNumber(assigned)}, v={$expr.st})
    ->
      assignGlob(id={assigned}, v={$expr.st}, fullType={globalsData.getGlobalTypeByName(assigned)}, type={globalsData.getGlobalTypeByName(assigned).substring(1,globalsData.getGlobalTypeByName(assigned).length()-1)})
  | list[assigned, false]
    ->
      {$list.st}
  ;

list[String assigned, boolean returnable]
  :
  ^(
    LIST
    (
      s+=STRING
    )*
   )
    -> {$function::locals.get(assigned) != null}?
      createLocalList(elements={$s}, varNum={$function::currentFunction.getVariableLocalNumber(assigned)})
    ->
      createGlobalList(elements={$s}, globName={assigned})
  ;

compound_stmt
  :
  if_stmt
    ->
      {$if_stmt.st}
  | while_stmt
    ->
      {$while_stmt.st}
  | foreach_stmt
    ->
      {$foreach_stmt.st}
  ;

if_stmt
  :
  ^(
    IF
    ^(TEST test)
    block[false]
   )
    ->
      if(conclusion={$test.st}, containment={$block.st}, opNum={$function::numOps++})
  ;

while_stmt
  :
  ^(WHILE test block[false])
    ->
      while(condition={$test.st}, containment={$block.st}, opNum={$function::numOps++})
  ;

foreach_stmt
  :
  ^(
    FOREACH
    ^(PART type part=ID)
    
    {
     $function::locals.put($part.text ,true);
    }
    ^(WHOLE whole=ID)
    block[false]
   )
    -> {$function::locals.get($whole.text)!=null}?
      foreachVar(iterableNum={$function::currentFunction.getVariableLocalNumber($whole.text)}, iteratorNum={$function::currentFunction.getVariableLocalNumber($part.text)-1}, variable={$part.text}, varNum={$function::currentFunction.getVariableLocalNumber($part.text)}, containment={$block.st}, opNum={$function::numOps++})
    ->
      foreachGlob(iterableName={$whole.text}, iteratorNum={$function::currentFunction.getVariableLocalNumber($part.text)-1}, variable={$part.text}, varNum={$function::currentFunction.getVariableLocalNumber($part.text)}, containment={$block.st}, opNum={$function::numOps++})
  ;

funcCall
  :
  ^(
    CALL ID
    (
      p+=param
    )*
   )
    ->
      call(retType={functionsData.get($ID.text).getReturnType()}, funcName={$ID.text}, params={$p}, paramTypes={functionsData.get($ID.text).getParameterTypes()})
  ;

param
  :
  ^(PARAM expr)
    ->
      {$expr.st}
  ;

test
  :
  //  ^(OR and_test)
  //  ;
  //
  //and_test
  //  :
  //  ^(AND check)
  //  ;
  //
  //check
  //  :
  ^(
    NOT_CONTAINS
    ^(VERIFIABLE e1=expr)
    ^(CHECKING e2=expr)
   )
  
  {
   $function::numOps++;
  }
    ->
      not_contains(verifiable={$e1.st}, checking={$e2.st}, opNum={$function::numOps})
  |
  ^(
    CONTAINS
    ^(VERIFIABLE e1=expr)
    ^(CHECKING e2=expr)
   )
  
  {
   $function::numOps++;
  }
    ->
      contains(verifiable={$e1.st}, checking={$e2.st}, opNum={$function::numOps})
  |
  ^(
    NOT_EQUALS
    ^(VERIFIABLE e1=expr)
    ^(CHECKING e2=expr)
   )
  
  {
   $function::numOps++;
  }
    ->
      not_equals(verifiable={$e1.st}, checking={$e2.st}, opNum={$function::numOps})
  |
  ^(
    EQUALS
    ^(VERIFIABLE e1=expr)
    ^(CHECKING e2=expr)
   )
  
  {
   $function::numOps++;
  }
    ->
      equals(verifiable={$e1.st}, checking={$e2.st}, opNum={$function::numOps})
  ;

expr
options {
  backtrack = true;
}
  :
  atom
    ->
      {$atom.st}
  |
  ^(
    REMOVE
    ^(SUBJECT atom)
    ^(POSITION INT)
   )
  
  {
   $function::numOps++;
  }
    ->
      removeAt(target={$atom.st}, position={$INT.text})
  |
  ^(
    REMOVE
    ^(SUBJECT s=atom)
    ^(TARGET t=atom)
   )
  
  {
   $function::numOps++;
  }
    ->
      removeFrom(target={$t.st}, subject={$s.st})
  |
  ^(
    ADD
    ^(SUBJECT s=atom)
    ^(TARGET t=atom)
   )
  
  {
   $function::numOps++;
  }
    ->
      add(target={$t.st}, subject={$s.st})
  |
  ^(
    GET
    ^(SUBJECT atom)
    ^(POSITION INT)
   )
  
  {
   $function::numOps++;
  }
    ->
      getAt(target={$atom.st}, position={$INT.text})
  ;

atom
  :
  ID
    -> {$function::locals.get($ID.text)!=null}?
      varRef(id={$ID.text}, varNum={$function::currentFunction.getVariableLocalNumber($ID.text)})
    ->
      globRef(id={$ID.text}, typeWholePath={globalsData.getGlobalTypeByName($ID.text)})
  | STRING
    ->
      string(value={$STRING.text})
  | funcCall
    ->
      {$funcCall.st}
  ;
