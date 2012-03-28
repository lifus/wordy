

// BEGINNING: header
grammar Wordy;

options {
  language     = Java;
  output       = AST;
  ASTLabelType = CommonTree;
}

tokens {

  // positioning
  INDENT;
  DEDENT;

  // blocks
  MAIN;
  FUNC;
  VAR;
  BLOCK;
  PARAM;
  CALL;
  IF;
  WHILE;
  TEST;

  // foreach
  FOREACH;
  WHOLE;
  PART;

  // stat
  REMOVE;
  ADD;
  GET;
  ASSIGN;
  POSITION;
  TARGET;
  SUBJECT;
  CONTAINS;
  EQUALS;
  NOT_CONTAINS;
  NOT_EQUALS;
  VERIFIABLE;
  CHECKING;
  OR;
  AND;

  // type
  STRING;
  LIST;
  VOID;

  // flow
  RETURN;
  //  BREAK;
  //  CONTINUE;

  // io
  PRINT;
}

@members {
public boolean hasError = false;
FunctionsTable functions = new FunctionsTable();
Globals globals = new Globals();

public void reportError(RecognitionException recognitionException) {
	super.reportError(recognitionException);
	this.hasError = true;
}

public String getErrorHeader(RecognitionException e) {
	return "line " + e.line;
}
}

@lexer::members {
int implicitLineJoiningLevel = 0;
int startPos = -1;
}
// END: header

// BEGINNING: declaration

program
  :
  (declaration)*
  ;

declaration
  :
  variables[true]
  | function
  | NEWLINE!
  ;

variables[boolean global]
  :
  type a=declarator 
                   {
                    if (!global) {
                                                                                                                                                                                                        	functions.getCurrentFunction().addVariable(
                                                                                                                                                                                                        			new Variable($a.text, $type.idType, $a.line));
                                                                                                                                                                                                        			$function::locals.add($type.idType, $a.text);
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                        	globals.add($type.idType, $a.text);
                                                                                                                                                                                                        }
                   }
  (',' b=declarator 
                   {
                    if (!global) {
                                                                                                                                                                                                        	functions.getCurrentFunction().addVariable(
                                                                                                                                                                                                        			new Variable($b.text, $type.idType, $b.line));
                                                                                                                                                                                                        			$function::locals.add($type.idType, $b.text);
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                        	globals.add($type.idType, $b.text);
                                                                                                                                                                                                        }
                   })* ln=NEWLINE
    ->
      ^(VAR[$ln, "VAR"] type declarator)+
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
Locals locals;
}
@init {
$function::locals = new Locals();
}
  :
  main
  | regularFunction
  ;

main
  :
  emptyType 'main' a=LPAREN RPAREN 
                                  {
                                   functions.add(new Function($emptyType.idType, "main", $a.line));
                                  }
  block
    ->
      ^(MAIN[$a, "MAIN"] block)
  ;

regularFunction
scope {
ArrayList<String> parameterTypes;
}
@init {
$regularFunction::parameterTypes = new ArrayList<String>();
}
  :
  type ID 
         {
          functions.add(new Function($type.idType, $ID.text, $ID.line));
         }
  LPAREN (a=formalParameter 
                           {
                            $regularFunction::parameterTypes.add($a.idType);
                                                                                                                                                                                                                                                                        functions.getCurrentFunction().addVariable(new Variable($a.text, $a.idType, $a.line));
                                                                                                                                                                                                                                                                        $function::locals.add($type.idType, $a.text);
                           }
    (',' b=formalParameter 
                          {
                           $regularFunction::parameterTypes.add($b.idType);
                                                                                                                                                                                                                        functions.getCurrentFunction().addVariable(new Variable($b.text, $b.idType, $b.line));
                                                                                                                                                                                                                        $function::locals.add($type.idType, $b.text);
                          })*)? RPAREN 
                                      {
                                       functions.getCurrentFunction().setParameterTypes($regularFunction::parameterTypes);
                                      }
  block
    ->
      ^(FUNC type ID formalParameter* block)
  ;

formalParameter returns [String idType, String text, Integer line]
  :
  meaningfullType ID 
                    {
                     $idType = $meaningfullType.idType;
                     $text = $ID.text;
                     $line = $ID.line;
                    }
    ->
      ^(PARAM meaningfullType ID)
  ;
// END: function

// BEGINNING:type

type returns [String idType]
  :
  buildInType 
             {
              $idType = $buildInType.idType;
             }
  ;

buildInType returns [String idType]
  :
  meaningfullType 
                 {
                  $idType = $meaningfullType.idType;
                 }
  | emptyType 
             {
              $idType = $emptyType.idType;
             }
  ;

emptyType returns [String idType]
  :
  'Void' 
        {
         $idType = "V";
        }
    -> VOID
  ;

meaningfullType returns [String idType]
  :
  compoundType 
              {
               $idType = $compoundType.idType;
              }
  | atomicType 
              {
               $idType = $atomicType.idType;
              }
  ;

compoundType returns [String idType]
  :
  'List' 
        {
         $idType = "Ljava/util/ArrayList;";
        }
    -> LIST
  ;

atomicType returns [String idType]
  :
  'String' 
          {
           $idType = "Ljava/lang/String;";
          }
    -> STRING
  ;
// END:type

block
  :
  NEWLINE lc=INDENT blockContainment
  (
    DEDENT
    |
  )
    ->
      ^(BLOCK[$lc, "BLOCK"] blockContainment)
  ;

blockContainment
  :
  (
    variables[false]
    | stmt
    | NEWLINE!
  )+
  returnStat? (NEWLINE!|)
  ;

stmt
  :
  simple_stmt
  (
    NEWLINE!
    |
  )
  | compound_stmt
  (
    NEWLINE!
    |
  )
  ;

simple_stmt
  :
  expr
  | assignStat
  | printOp
  ;

assignStat
  :
  ID 
    {
     if ($function::locals.getLocalsTypeByName($ID.text) != null) {
                                                                                            functions.getCurrentFunction().addVarCalled($ID.text);
                                                                                          }
                                                                                          functions.getCurrentFunction().addOperation();
    }
  '=' assignable[$ID.text]
    ->
      ^(ASSIGN ID assignable)
  ;

returnStat
  :
  ('return'
      -> RETURN) (returnable  {
                  functions.getCurrentFunction().addOperation();
                 }
      ->
        ^(RETURN returnable))?
  ;

returnable
  :
  expr
  ;

printOp
  :
  'print' ID
            {
             if ($function::locals.getLocalsTypeByName($ID.text) != null) {
                                                                                                                                                                                                    functions.getCurrentFunction().addVarCalled($ID.text);
                                                                                                                                                                                                  }
                                       functions.getCurrentFunction().addOperation();
            }
    ->
      ^(PRINT ID)
  ;

compound_stmt
  :
  if_stmt
  | while_stmt
  | foreach_stmt
  ;

if_stmt
  :
  'if' test block 
                 {
                  functions.getCurrentFunction().addOperation();
                 }
    ->
      ^(
        IF
        ^(TEST test)
        block
       )
  ;

while_stmt
  :
  'while' test block 
                    {
                     functions.getCurrentFunction().addOperation();
                    }
    ->
      ^(WHILE test block)
  ;

foreach_stmt
  :
  'foreach' atomicType p=ID 'in' w=ID block 
                                           {
                                            $function::locals.add($atomicType.idType, $p.text);
                                                                                                                                                                                                                                                                                                                                                                functions.getCurrentFunction().addVarCalled(); // for iterator
                                                                                                                                                                                                                                                                                                                                                                functions.getCurrentFunction().addVariable(new Variable($p.text, $atomicType.idType, $p.line));
                                                                                                                                                                                                                                                                                                                                                                functions.getCurrentFunction().addVarCalled($p.text);
                                                                                                                                                                                                                                                                                                                                                                functions.getCurrentFunction().addOperation();
                                                                                                                                                                                                                                                                                                                                                                functions.getCurrentFunction().addOperation();
                                           }
    ->
      ^(
        FOREACH
        ^(PART atomicType $p)
        ^(WHOLE $w)
        block
       )
  ;

funcCall
  :
  ID LPAREN (param (',' param)*)? RPAREN 
                                        {
                                         functions.getCurrentFunction().addOperation();
                                        }
    ->
      ^(CALL ID param*)
  ;

param
  :
  expr
    ->
      ^(PARAM expr)
  ;

test
  :
  //  and_test ('or' and_test)*
  //    ->
  //      ^(OR and_test)+
  //  ;
  //
  //and_test
  //  :
  //  check ('and' check)*
  //    ->
  //      ^(AND check)+
  //  ;
  //
  //check
  //  :
  ex1=expr check_operation ex2=expr 
                                   {
                                    functions.getCurrentFunction().addOperation();
                                   }
    ->
      ^(
        check_operation
        ^(VERIFIABLE $ex1)
        ^(CHECKING $ex2)
       )
  ;

check_operation
  :
  lc='is' 'not' 'contains'
    -> NOT_CONTAINS[$lc, "NOT_CONTAINS"]
  | lc='is' 'not' 'equals'
    -> NOT_EQUALS[$lc, "NOT_EQUALS"]
  | lc='is' 'contains'
    -> CONTAINS[$lc, "CONTAINS"]
  | lc='is' 'equals'
    -> EQUALS[$lc, "NOT_EQUALS"]
  ;

assignable[String assigned]
  :
  list[assigned]
  | expr
  ;

list[String assigned]
  :
  LCURLY (STRING 
                {
                 functions.getCurrentFunction().addOperation();
                }
    (',' STRING 
               {
                functions.getCurrentFunction().addOperation();
               })*)? RCURLY 
                           {
                            if ($function::locals.getLocalsTypeByName(assigned) != null) {
                                                                                                                                                                                                                                  functions.getCurrentFunction().addVarCalled(assigned); // for list
                                                                                                                                                                                                                                }
                           }
    ->
      ^(LIST STRING*)
  ;

expr
  :
  (atom
      -> atom) (expr_operation expr_qualification
      ->
        ^(
          expr_operation
          ^(SUBJECT $expr)
          expr_qualification
         ))*
  ;

expr_operation
  :
  inf='remove' 'at'
    -> REMOVE[$inf, "REMOVE"]
  | inf='add' 'to'
    -> ADD[$inf, "ADD"]
  | inf='get' 'at'
    -> GET[$inf, "GET"]
  ;

expr_qualification
  :
  'position' INT
    ->
      ^(POSITION INT)
  | atom
    ->
      ^(TARGET atom)
  ;

atom
options {
  backtrack = true;
}
  :
  ID 
    {
     if ($function::locals.getLocalsTypeByName($ID.text) != null) {
                                                    	functions.getCurrentFunction().addVarCalled($ID.text);
                                                    }
    }
  | STRING
  | funcCall
  ;

LPAREN
  :
  '(' 
     {
      implicitLineJoiningLevel++;
     }
  ;

RPAREN
  :
  ')' 
     {
      implicitLineJoiningLevel--;
     }
  ;

LCURLY
  :
  '{' 
     {
      implicitLineJoiningLevel++;
     }
  ;

RCURLY
  :
  '}' 
     {
      implicitLineJoiningLevel--;
     }
  ;

INT
  :
  ('0'..'9')+
  ;

ID
  :
  (
    'a'..'z'
    | 'A'..'Z'
    | '_'
  )
  (
    'a'..'z'
    | 'A'..'Z'
    | '0'..'9'
    | '_'
  )*
  ;

STRING
  :
  '"'
  (
    ESC_SEQ
    |
    ~(
      '\\'
      | '"'
     )
  )*
  '"'
  ;

fragment
HEX_DIGIT
  :
  (
    '0'..'9'
    | 'a'..'f'
    | 'A'..'F'
  )
  ;

fragment
ESC_SEQ
  :
  '\\'
  (
    'b'
    | 't'
    | 'n'
    | 'f'
    | 'r'
    | '\"'
    | '\''
    | '\\'
  )
  | UNICODE_ESC
  | OCTAL_ESC
  ;

fragment
OCTAL_ESC
  :
  '\\' ('0'..'3') ('0'..'7') ('0'..'7')
  | '\\' ('0'..'7') ('0'..'7')
  | '\\' ('0'..'7')
  ;

fragment
UNICODE_ESC
  :
  '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
  ;

CONTINUED_LINE
  :
  '\\' ('\r')? '\n'
  (
    ' '
    | '\t'
  )*
  
  {
   $channel = HIDDEN;
  }
  ;

NEWLINE
  :
  ( ('\r')? '\n')+ 
                  {
                   if (startPos == 0 || implicitLineJoiningLevel > 0)
                   	$channel = HIDDEN;
                  }
  ;

WS
  :
  {startPos > 0}?=>
  (
    ' '
    | '\t'
  )+
  
  {
   $channel = HIDDEN;
  }
  ;

LEADING_WS
@init {
int spaces = 0;
}
  :
  {startPos == 0}?=>
  (
    {implicitLineJoiningLevel > 0}?
    (
      ' '
      | '\t'
    )+
    
    {
     $channel = HIDDEN;
    }
    |
    (
      ' ' 
         {
          spaces++;
         }
      | '\t' 
            {
             spaces += 8; spaces -= (spaces \% 8);
            }
    )+
    
    {
     char[] indentation = new char[spaces];
     for (int i = 0; i < spaces; i++) {
     	indentation[i] = ' ';
     }
     String s = new String(indentation);
     emit(new ClassicToken(LEADING_WS, new String(indentation)));
    }
    ( ('\r')? '\n' 
                  {
                   if (state.token != null)
                   	state.token.setChannel(HIDDEN);
                   else
                   	$channel = HIDDEN;
                  })*
  )
  ;

COMMENT
@init {
$channel = HIDDEN;
}
  :
  {startPos == 0}?=>
  (
    ' '
    | '\t'
  )*
  '//' (~'\n')* '\n'+
  | {startPos > 0}?=> '//' (~'\n')*
  | '/*' (options {greedy=false;}: .)* '*/'
  ;
