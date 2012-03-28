// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g 2011-05-22 19:57:40

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class WordySemantic extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INDENT", "DEDENT", "MAIN", "FUNC", "VAR", "BLOCK", "PARAM", "CALL", "IF", "WHILE", "TEST", "FOREACH", "WHOLE", "PART", "REMOVE", "ADD", "GET", "ASSIGN", "POSITION", "TARGET", "SUBJECT", "CONTAINS", "EQUALS", "NOT_CONTAINS", "NOT_EQUALS", "VERIFIABLE", "CHECKING", "OR", "AND", "STRING", "LIST", "VOID", "RETURN", "PRINT", "NEWLINE", "ID", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "INT", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "CONTINUED_LINE", "WS", "LEADING_WS", "COMMENT", "','", "'main'", "'Void'", "'List'", "'String'", "'='", "'return'", "'print'", "'if'", "'while'", "'foreach'", "'in'", "'is'", "'not'", "'contains'", "'equals'", "'remove'", "'at'", "'add'", "'to'", "'get'", "'position'"
    };
    public static final int EOF=-1;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int INDENT=4;
    public static final int DEDENT=5;
    public static final int MAIN=6;
    public static final int FUNC=7;
    public static final int VAR=8;
    public static final int BLOCK=9;
    public static final int PARAM=10;
    public static final int CALL=11;
    public static final int IF=12;
    public static final int WHILE=13;
    public static final int TEST=14;
    public static final int FOREACH=15;
    public static final int WHOLE=16;
    public static final int PART=17;
    public static final int REMOVE=18;
    public static final int ADD=19;
    public static final int GET=20;
    public static final int ASSIGN=21;
    public static final int POSITION=22;
    public static final int TARGET=23;
    public static final int SUBJECT=24;
    public static final int CONTAINS=25;
    public static final int EQUALS=26;
    public static final int NOT_CONTAINS=27;
    public static final int NOT_EQUALS=28;
    public static final int VERIFIABLE=29;
    public static final int CHECKING=30;
    public static final int OR=31;
    public static final int AND=32;
    public static final int STRING=33;
    public static final int LIST=34;
    public static final int VOID=35;
    public static final int RETURN=36;
    public static final int PRINT=37;
    public static final int NEWLINE=38;
    public static final int ID=39;
    public static final int LPAREN=40;
    public static final int RPAREN=41;
    public static final int LCURLY=42;
    public static final int RCURLY=43;
    public static final int INT=44;
    public static final int ESC_SEQ=45;
    public static final int HEX_DIGIT=46;
    public static final int UNICODE_ESC=47;
    public static final int OCTAL_ESC=48;
    public static final int CONTINUED_LINE=49;
    public static final int WS=50;
    public static final int LEADING_WS=51;
    public static final int COMMENT=52;

    // delegates
    // delegators


        public WordySemantic(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public WordySemantic(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return WordySemantic.tokenNames; }
    public String getGrammarFileName() { return "/home/malagan/Programming/workspace/Wordy/src/WordySemantic.g"; }


    private VariableScopesHandler varHandler = new VariableScopesHandler();
    private FunctionsTable functions;
    private FunctionsHandler functionsHandler;
    private boolean mainFound = false;

    public String getErrorHeader(RecognitionException e) {
    	return "line " + e.line;
    }



    // $ANTLR start "program"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:21:1: program[FunctionsTable functions] : ( declaration )* ;
    public final void program(FunctionsTable functions) throws RecognitionException {

        this.functions = functions;
        functionsHandler = new FunctionsHandler(functions);
        VariableScope globals = new VariableScope();
        varHandler.enterScope(globals);

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:28:3: ( ( declaration )* )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:29:3: ( declaration )*
            {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:29:3: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=MAIN && LA1_0<=VAR)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:0:0: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program78);
            	    declaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                             if (!mainFound) {
                             	Tool.error(this, "invalid file,main method(Void main()) not found");
                             }
                            
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "declaration"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:37:1: declaration : ( variable | function );
    public final void declaration() throws RecognitionException {
        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:38:3: ( variable | function )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==VAR) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=MAIN && LA2_0<=FUNC)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:39:3: variable
                    {
                    pushFollow(FOLLOW_variable_in_declaration111);
                    variable();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:40:5: function
                    {
                    pushFollow(FOLLOW_function_in_declaration117);
                    function();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declaration"


    // $ANTLR start "variable"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:43:1: variable : ^( VAR type declarator ) ;
    public final void variable() throws RecognitionException {
        CommonTree VAR2=null;
        WordySemantic.declarator_return declarator1 = null;

        String type3 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:44:3: ( ^( VAR type declarator ) )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:45:3: ^( VAR type declarator )
            {
            VAR2=(CommonTree)match(input,VAR,FOLLOW_VAR_in_variable133); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_variable135);
            type3=type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_declarator_in_variable137);
            declarator1=declarator();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {

                 VariableScope scope = varHandler.getCurrentScope();
                 if (scope.varDeclared((declarator1!=null?declarator1.text:null))) {
                 	Tool.error(this, (declarator1!=null?declarator1.text:null) + " duplicated", VAR2);
                 } else {
                 	scope.add(new Variable((declarator1!=null?declarator1.text:null), type3, (declarator1!=null?declarator1.line:0)));
                 }
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variable"

    public static class declarator_return extends TreeRuleReturnScope {
        public String text;
        public int line;
    };

    // $ANTLR start "declarator"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:57:1: declarator returns [String text, int line] : ID ;
    public final WordySemantic.declarator_return declarator() throws RecognitionException {
        WordySemantic.declarator_return retval = new WordySemantic.declarator_return();
        retval.start = input.LT(1);

        CommonTree ID4=null;

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:58:3: ( ID )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:59:3: ID
            {
            ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_declarator164); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                   retval.text = (ID4!=null?ID4.getText():null);
                   retval.line = (ID4!=null?ID4.getLine():0);
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarator"

    protected static class function_scope {
        String name;
        boolean returnRequired;
    }
    protected Stack function_stack = new Stack();


    // $ANTLR start "function"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:69:1: function : ( regularFunction | main );
    public final void function() throws RecognitionException {
        function_stack.push(new function_scope());

        ((function_scope)function_stack.peek()).returnRequired = false;

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:77:3: ( regularFunction | main )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==FUNC) ) {
                alt3=1;
            }
            else if ( (LA3_0==MAIN) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:78:3: regularFunction
                    {
                    pushFollow(FOLLOW_regularFunction_in_function198);
                    regularFunction();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:79:5: main
                    {
                    pushFollow(FOLLOW_main_in_function204);
                    main();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            function_stack.pop();
        }
        return ;
    }
    // $ANTLR end "function"


    // $ANTLR start "regularFunction"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:82:1: regularFunction : ^( FUNC type ID ( formalParameter )* block[$function::returnRequired] ) ;
    public final void regularFunction() throws RecognitionException {
        CommonTree ID5=null;
        String type6 = null;



        VariableScope functionVars = new VariableScope();
        varHandler.enterScope(functionVars);

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:90:3: ( ^( FUNC type ID ( formalParameter )* block[$function::returnRequired] ) )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:91:3: ^( FUNC type ID ( formalParameter )* block[$function::returnRequired] )
            {
            match(input,FUNC,FOLLOW_FUNC_in_regularFunction235); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_regularFunction237);
            type6=type();

            state._fsp--;
            if (state.failed) return ;
            ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_regularFunction239); if (state.failed) return ;
            if ( state.backtracking==0 ) {

                               ((function_scope)function_stack.peek()).name = (ID5!=null?ID5.getText():null);
                                                                                  if(type6!="V") {
                                                                                     ((function_scope)function_stack.peek()).returnRequired = true;
                                                                                  }
                              
            }
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:99:5: ( formalParameter )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==PARAM) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:100:7: formalParameter
            	    {
            	    pushFollow(FOLLOW_formalParameter_in_regularFunction272);
            	    formalParameter();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            pushFollow(FOLLOW_block_in_regularFunction285);
            block(((function_scope)function_stack.peek()).returnRequired);

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {

              varHandler.leaveScope();

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "regularFunction"


    // $ANTLR start "formalParameter"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:106:1: formalParameter : ^( PARAM type ID ) ;
    public final void formalParameter() throws RecognitionException {
        CommonTree ID7=null;
        String type8 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:107:3: ( ^( PARAM type ID ) )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:108:3: ^( PARAM type ID )
            {
            match(input,PARAM,FOLLOW_PARAM_in_formalParameter307); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_formalParameter309);
            type8=type();

            state._fsp--;
            if (state.failed) return ;
            ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_formalParameter311); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {

                 VariableScope scope = varHandler.getCurrentScope();
                 if (scope.varDeclared((ID7!=null?ID7.getText():null))) {
                 	Tool.error(this, (ID7!=null?ID7.getText():null) + " duplicated", ID7);
                 } else {
                 	scope.add(new Variable((ID7!=null?ID7.getText():null), type8, (ID7!=null?ID7.getLine():0)));
                 }
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "formalParameter"


    // $ANTLR start "main"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:120:1: main : ^( MAIN block[false] ) ;
    public final void main() throws RecognitionException {
        CommonTree MAIN9=null;


        VariableScope mainFunctionVars = new VariableScope();
        varHandler.enterScope(mainFunctionVars);
        ((function_scope)function_stack.peek()).name = "main";

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:129:3: ( ^( MAIN block[false] ) )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:130:3: ^( MAIN block[false] )
            {
            MAIN9=(CommonTree)match(input,MAIN,FOLLOW_MAIN_in_main345); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_main347);
            block(false);

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {

                 if (!mainFound) {
                 	mainFound = true;
                 } else {
                 	Tool.error(this, "must be only one main method", MAIN9);
                 }
                
            }

            }

            if ( state.backtracking==0 ) {

              varHandler.leaveScope();

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "main"


    // $ANTLR start "type"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:144:1: type returns [String idType] : ( STRING | LIST | VOID );
    public final String type() throws RecognitionException {
        String idType = null;

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:145:3: ( STRING | LIST | VOID )
            int alt5=3;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt5=1;
                }
                break;
            case LIST:
                {
                alt5=2;
                }
                break;
            case VOID:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return idType;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:146:3: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_type378); if (state.failed) return idType;
                    if ( state.backtracking==0 ) {

                               idType = "Ljava/lang/String;";
                              
                    }

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:150:5: LIST
                    {
                    match(input,LIST,FOLLOW_LIST_in_type395); if (state.failed) return idType;
                    if ( state.backtracking==0 ) {

                               idType = "Ljava/util/ArrayList;";
                              
                    }

                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:154:5: VOID
                    {
                    match(input,VOID,FOLLOW_VOID_in_type412); if (state.failed) return idType;
                    if ( state.backtracking==0 ) {

                               idType = "V";
                              
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return idType;
    }
    // $ANTLR end "type"


    // $ANTLR start "block"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:161:1: block[boolean neadedToReturn] : ^( BLOCK blockContainment[neadedToReturn] ) ;
    public final void block(boolean neadedToReturn) throws RecognitionException {

        VariableScope blockVars = new VariableScope();
        varHandler.enterScope(blockVars);

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:169:3: ( ^( BLOCK blockContainment[neadedToReturn] ) )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:170:3: ^( BLOCK blockContainment[neadedToReturn] )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block451); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_blockContainment_in_block453);
            blockContainment(neadedToReturn);

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {

              varHandler.leaveScope();

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "block"


    // $ANTLR start "blockContainment"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:173:1: blockContainment[boolean neadedToReturn] : ( ( ( variable | stmt )+ returnStat ) | ( ( variable | stmt )+ ) );
    public final void blockContainment(boolean neadedToReturn) throws RecognitionException {
        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:174:3: ( ( ( variable | stmt )+ returnStat ) | ( ( variable | stmt )+ ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:175:3: ( ( variable | stmt )+ returnStat )
                    {
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:175:3: ( ( variable | stmt )+ returnStat )
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:176:5: ( variable | stmt )+ returnStat
                    {
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:176:5: ( variable | stmt )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==VAR) ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>=CALL && LA6_0<=WHILE)||LA6_0==FOREACH||(LA6_0>=REMOVE && LA6_0<=ASSIGN)||LA6_0==STRING||LA6_0==PRINT||LA6_0==ID) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:177:7: variable
                    	    {
                    	    pushFollow(FOLLOW_variable_in_blockContainment485);
                    	    variable();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:178:9: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_blockContainment495);
                    	    stmt();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    pushFollow(FOLLOW_returnStat_in_blockContainment508);
                    returnStat();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:183:3: ( ( variable | stmt )+ )
                    {
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:183:3: ( ( variable | stmt )+ )
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:184:5: ( variable | stmt )+
                    {
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:184:5: ( variable | stmt )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==VAR) ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>=CALL && LA7_0<=WHILE)||LA7_0==FOREACH||(LA7_0>=REMOVE && LA7_0<=ASSIGN)||LA7_0==STRING||LA7_0==PRINT||LA7_0==ID) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:185:7: variable
                    	    {
                    	    pushFollow(FOLLOW_variable_in_blockContainment534);
                    	    variable();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:186:9: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_blockContainment544);
                    	    stmt();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                           if (neadedToReturn) {
                                	Tool.error(this,
                                			"you must to return from function " + ((function_scope)function_stack.peek()).name + " with non empty return type");
                                }
                          
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "blockContainment"


    // $ANTLR start "stmt"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:198:1: stmt : ( simple_stmt | compound_stmt );
    public final void stmt() throws RecognitionException {
        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:199:3: ( simple_stmt | compound_stmt )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==CALL||(LA9_0>=REMOVE && LA9_0<=ASSIGN)||LA9_0==STRING||LA9_0==PRINT||LA9_0==ID) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=IF && LA9_0<=WHILE)||LA9_0==FOREACH) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:200:3: simple_stmt
                    {
                    pushFollow(FOLLOW_simple_stmt_in_stmt581);
                    simple_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:201:5: compound_stmt
                    {
                    pushFollow(FOLLOW_compound_stmt_in_stmt587);
                    compound_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "stmt"


    // $ANTLR start "simple_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:204:1: simple_stmt : ( expr | assignStat | printOp );
    public final void simple_stmt() throws RecognitionException {
        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:205:3: ( expr | assignStat | printOp )
            int alt10=3;
            switch ( input.LA(1) ) {
            case CALL:
            case REMOVE:
            case ADD:
            case GET:
            case STRING:
            case ID:
                {
                alt10=1;
                }
                break;
            case ASSIGN:
                {
                alt10=2;
                }
                break;
            case PRINT:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:206:3: expr
                    {
                    pushFollow(FOLLOW_expr_in_simple_stmt602);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:207:5: assignStat
                    {
                    pushFollow(FOLLOW_assignStat_in_simple_stmt608);
                    assignStat();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:208:5: printOp
                    {
                    pushFollow(FOLLOW_printOp_in_simple_stmt614);
                    printOp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "simple_stmt"


    // $ANTLR start "returnStat"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:211:1: returnStat : ( ^( RETURN returnable ) | r= RETURN );
    public final void returnStat() throws RecognitionException {
        CommonTree r=null;
        String returnable10 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:212:3: ( ^( RETURN returnable ) | r= RETURN )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RETURN) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==DOWN) ) {
                    alt11=1;
                }
                else if ( (LA11_1==EOF||LA11_1==UP) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:213:3: ^( RETURN returnable )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_returnStat630); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_returnable_in_returnStat632);
                    returnable10=returnable();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                         String retType = functions.get(((function_scope)function_stack.peek()).name).getReturnType();
                                         if(retType!=returnable10) {
                                           Tool.error(this, "you must return from function result of type " + retType, r);
                                         }
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:221:5: r= RETURN
                    {
                    r=(CommonTree)match(input,RETURN,FOLLOW_RETURN_in_returnStat648); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                                   String retType = functions.get(((function_scope)function_stack.peek()).name).getReturnType();
                                                                       if(retType!="V") {
                                                                         Tool.error(this, "you must return from function result of type " + retType, r);
                                                                       }
                                  
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "returnStat"


    // $ANTLR start "returnable"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:230:1: returnable returns [String type] : expr ;
    public final String returnable() throws RecognitionException {
        String type = null;

        String expr11 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:231:3: ( expr )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:232:3: expr
            {
            pushFollow(FOLLOW_expr_in_returnable682);
            expr11=expr();

            state._fsp--;
            if (state.failed) return type;
            if ( state.backtracking==0 ) {

                     type = expr11;
                    
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "returnable"


    // $ANTLR start "printOp"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:238:1: printOp : ^( PRINT ID ) ;
    public final void printOp() throws RecognitionException {
        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:239:3: ( ^( PRINT ID ) )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:240:3: ^( PRINT ID )
            {
            match(input,PRINT,FOLLOW_PRINT_in_printOp707); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_printOp709); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "printOp"


    // $ANTLR start "assignStat"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:243:1: assignStat : ^( ASSIGN ID assignable ) ;
    public final void assignStat() throws RecognitionException {
        CommonTree ID12=null;
        String assignable13 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:244:3: ( ^( ASSIGN ID assignable ) )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:245:3: ^( ASSIGN ID assignable )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignStat726); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID12=(CommonTree)match(input,ID,FOLLOW_ID_in_assignStat728); if (state.failed) return ;
            pushFollow(FOLLOW_assignable_in_assignStat730);
            assignable13=assignable();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {

                 if (varHandler.isVariableDeclared((ID12!=null?ID12.getText():null))) {
                 	VariableScope scope = varHandler.getNearestScopeWithVar((ID12!=null?ID12.getText():null));
                 	String typeOfTarget = scope.get((ID12!=null?ID12.getText():null)).getType();
                 	String typeOfValue = assignable13;
                 	if (typeOfTarget.equals(typeOfValue)) {
                 		scope.get((ID12!=null?ID12.getText():null)).addLineUses((ID12!=null?ID12.getLine():0));
                 	} else {
                 		Tool.error(this, "type mismatch: can not convert " + typeOfValue
                 				+ " to " + typeOfTarget, ID12);
                 	}
                 } else {
                 	Tool.error(this, (ID12!=null?ID12.getText():null) + " cannot be resolved to variable", ID12);
                 }
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assignStat"


    // $ANTLR start "assignable"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:264:1: assignable returns [String type] : ( ^( LIST ( STRING )* ) | expr );
    public final String assignable() throws RecognitionException {
        String type = null;

        String expr14 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:265:3: ( ^( LIST ( STRING )* ) | expr )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LIST) ) {
                alt13=1;
            }
            else if ( (LA13_0==CALL||(LA13_0>=REMOVE && LA13_0<=GET)||LA13_0==STRING||LA13_0==ID) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:266:3: ^( LIST ( STRING )* )
                    {
                    match(input,LIST,FOLLOW_LIST_in_assignable763); if (state.failed) return type;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return type;
                        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:268:5: ( STRING )*
                        loop12:
                        do {
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==STRING) ) {
                                alt12=1;
                            }


                            switch (alt12) {
                        	case 1 :
                        	    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:269:7: STRING
                        	    {
                        	    match(input,STRING,FOLLOW_STRING_in_assignable777); if (state.failed) return type;

                        	    }
                        	    break;

                        	default :
                        	    break loop12;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return type;
                    }
                    if ( state.backtracking==0 ) {

                         type = "Ljava/util/ArrayList;";
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:276:5: expr
                    {
                    pushFollow(FOLLOW_expr_in_assignable802);
                    expr14=expr();

                    state._fsp--;
                    if (state.failed) return type;
                    if ( state.backtracking==0 ) {

                               type = expr14;
                              
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "assignable"


    // $ANTLR start "compound_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:282:1: compound_stmt : ( if_stmt | while_stmt | foreach_stmt );
    public final void compound_stmt() throws RecognitionException {
        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:283:3: ( if_stmt | while_stmt | foreach_stmt )
            int alt14=3;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt14=1;
                }
                break;
            case WHILE:
                {
                alt14=2;
                }
                break;
            case FOREACH:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:284:3: if_stmt
                    {
                    pushFollow(FOLLOW_if_stmt_in_compound_stmt828);
                    if_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:285:5: while_stmt
                    {
                    pushFollow(FOLLOW_while_stmt_in_compound_stmt834);
                    while_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:286:5: foreach_stmt
                    {
                    pushFollow(FOLLOW_foreach_stmt_in_compound_stmt840);
                    foreach_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "compound_stmt"


    // $ANTLR start "if_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:289:1: if_stmt : ^( IF ^( TEST test ) block[false] ) ;
    public final void if_stmt() throws RecognitionException {
        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:290:3: ( ^( IF ^( TEST test ) block[false] ) )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:291:3: ^( IF ^( TEST test ) block[false] )
            {
            match(input,IF,FOLLOW_IF_in_if_stmt861); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,TEST,FOLLOW_TEST_in_if_stmt868); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_test_in_if_stmt870);
            test();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_if_stmt877);
            block(false);

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "if_stmt"


    // $ANTLR start "while_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:298:1: while_stmt : ^( WHILE test block[false] ) ;
    public final void while_stmt() throws RecognitionException {
        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:299:3: ( ^( WHILE test block[false] ) )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:300:3: ^( WHILE test block[false] )
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_stmt899); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_test_in_while_stmt901);
            test();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_block_in_while_stmt903);
            block(false);

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "while_stmt"


    // $ANTLR start "foreach_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:303:1: foreach_stmt : ^( FOREACH ^( PART type part= ID ) ^(w= WHOLE whole= ID ) block[false] ) ;
    public final void foreach_stmt() throws RecognitionException {
        CommonTree part=null;
        CommonTree w=null;
        CommonTree whole=null;
        String type15 = null;



        VariableScope foreachVars = new VariableScope();
        varHandler.enterScope(foreachVars);

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:311:3: ( ^( FOREACH ^( PART type part= ID ) ^(w= WHOLE whole= ID ) block[false] ) )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:312:3: ^( FOREACH ^( PART type part= ID ) ^(w= WHOLE whole= ID ) block[false] )
            {
            match(input,FOREACH,FOLLOW_FOREACH_in_foreach_stmt936); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,PART,FOLLOW_PART_in_foreach_stmt943); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_foreach_stmt945);
            type15=type();

            state._fsp--;
            if (state.failed) return ;
            part=(CommonTree)match(input,ID,FOLLOW_ID_in_foreach_stmt949); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            w=(CommonTree)match(input,WHOLE,FOLLOW_WHOLE_in_foreach_stmt959); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            whole=(CommonTree)match(input,ID,FOLLOW_ID_in_foreach_stmt963); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_foreach_stmt970);
            block(false);

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {

                 VariableScope scope = varHandler.getNearestScopeWithVar((whole!=null?whole.getText():null));
                 if (scope == null) {
                 	Tool.error(this, (whole!=null?whole.getText():null) + " cannot be resolved to variable", whole);
                 } else {
                 	scope.get((whole!=null?whole.getText():null)).addLineUses((whole!=null?whole.getLine():0));
                 }
                 scope = varHandler.getCurrentScope();
                 scope.add(new Variable((part!=null?part.getText():null), type15, (part!=null?part.getLine():0)));
                
            }

            }

            if ( state.backtracking==0 ) {

              varHandler.leaveScope();

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "foreach_stmt"


    // $ANTLR start "funcCall"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:331:1: funcCall returns [String returnType] : ^( CALL ID ( param )* ) ;
    public final String funcCall() throws RecognitionException {
        String returnType = null;

        CommonTree ID17=null;
        String param16 = null;



        List<String> parameterTypes = new ArrayList<String>();

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:335:3: ( ^( CALL ID ( param )* ) )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:336:3: ^( CALL ID ( param )* )
            {
            match(input,CALL,FOLLOW_CALL_in_funcCall1013); if (state.failed) return returnType;

            match(input, Token.DOWN, null); if (state.failed) return returnType;
            ID17=(CommonTree)match(input,ID,FOLLOW_ID_in_funcCall1015); if (state.failed) return returnType;
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:338:5: ( param )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==PARAM) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:339:7: param
            	    {
            	    pushFollow(FOLLOW_param_in_funcCall1029);
            	    param16=param();

            	    state._fsp--;
            	    if (state.failed) return returnType;
            	    if ( state.backtracking==0 ) {

            	                  parameterTypes.add(param16);
            	                 
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return returnType;
            if ( state.backtracking==0 ) {

                 if (functions.isDeclared((ID17!=null?ID17.getText():null))) {
                 	if (functionsHandler.isParametersCorrect((ID17!=null?ID17.getText():null), parameterTypes)) {
                 		Function function = functions.get((ID17!=null?ID17.getText():null));
                 		function.addLineCall((ID17!=null?ID17.getLine():0));
                 		returnType = function.getReturnType();
                 	}
                 } else {
                 	Tool.error(this, "function " + (ID17!=null?ID17.getText():null) + " is not found", ID17);
                 }
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return returnType;
    }
    // $ANTLR end "funcCall"


    // $ANTLR start "param"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:359:1: param returns [String type] : ^( PARAM expr ) ;
    public final String param() throws RecognitionException {
        String type = null;

        String expr18 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:360:3: ( ^( PARAM expr ) )
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:361:3: ^( PARAM expr )
            {
            match(input,PARAM,FOLLOW_PARAM_in_param1082); if (state.failed) return type;

            match(input, Token.DOWN, null); if (state.failed) return type;
            pushFollow(FOLLOW_expr_in_param1084);
            expr18=expr();

            state._fsp--;
            if (state.failed) return type;

            match(input, Token.UP, null); if (state.failed) return type;
            if ( state.backtracking==0 ) {

                 type = expr18;
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "param"


    // $ANTLR start "test"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:368:1: test : ( ^(b= NOT_CONTAINS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) | ^(b= CONTAINS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) | ^(b= NOT_EQUALS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) | ^(b= EQUALS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) );
    public final void test() throws RecognitionException {
        CommonTree b=null;
        String e1 = null;

        String e2 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:379:3: ( ^(b= NOT_CONTAINS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) | ^(b= CONTAINS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) | ^(b= NOT_EQUALS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) | ^(b= EQUALS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case NOT_CONTAINS:
                {
                alt16=1;
                }
                break;
            case CONTAINS:
                {
                alt16=2;
                }
                break;
            case NOT_EQUALS:
                {
                alt16=3;
                }
                break;
            case EQUALS:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:380:3: ^(b= NOT_CONTAINS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) )
                    {
                    b=(CommonTree)match(input,NOT_CONTAINS,FOLLOW_NOT_CONTAINS_in_test1145); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,VERIFIABLE,FOLLOW_VERIFIABLE_in_test1152); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_test1156);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    match(input,CHECKING,FOLLOW_CHECKING_in_test1164); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_test1168);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                         if (e1 == "Ljava/lang/String;") {
                         	Tool.error(this, "unsupported opperation: expected List but got String", b);
                         }
                         if (e2 == "Ljava/util/ArrayList;") {
                         	Tool.error(this, "unsupported opperation: expected String but got List", b);
                         }
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:395:3: ^(b= CONTAINS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) )
                    {
                    b=(CommonTree)match(input,CONTAINS,FOLLOW_CONTAINS_in_test1197); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,VERIFIABLE,FOLLOW_VERIFIABLE_in_test1204); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_test1208);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    match(input,CHECKING,FOLLOW_CHECKING_in_test1216); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_test1220);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                         if (e1 == "Ljava/lang/String;") {
                         	Tool.error(this, "unsupported opperation: expected List but got String", b);
                         }
                         if (e2 == "Ljava/util/ArrayList;") {
                         	Tool.error(this, "unsupported opperation: expected String but got List", b);
                         }
                        
                    }

                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:410:3: ^(b= NOT_EQUALS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) )
                    {
                    b=(CommonTree)match(input,NOT_EQUALS,FOLLOW_NOT_EQUALS_in_test1249); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,VERIFIABLE,FOLLOW_VERIFIABLE_in_test1256); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_test1260);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    match(input,CHECKING,FOLLOW_CHECKING_in_test1268); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_test1272);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                         if (e1 != e2) {
                         	Tool.error(this, "unsupported opperation: cannot convert " + e2
                         			+ " to " + e1, b);
                         }
                        
                    }

                    }
                    break;
                case 4 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:423:3: ^(b= EQUALS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) )
                    {
                    b=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_test1301); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,VERIFIABLE,FOLLOW_VERIFIABLE_in_test1308); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_test1312);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    match(input,CHECKING,FOLLOW_CHECKING_in_test1320); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_test1324);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                         if (e1 != e2) {
                         	Tool.error(this, "unsupported opperation: cannot convert " + e2
                         			+ " to " + e1, b);
                         }
                        
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "test"


    // $ANTLR start "expr"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:437:1: expr returns [String type] : (s= atom | ^(r= REMOVE ^( SUBJECT s= atom ) ^( POSITION INT ) ) | ^(r= REMOVE ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) | ^(a= ADD ^( SUBJECT atom ) ^( POSITION INT ) ) | ^(a= ADD ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) | ^(g= GET ^( SUBJECT s= atom ) ^( POSITION INT ) ) | ^(g= GET ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) );
    public final String expr() throws RecognitionException {
        String type = null;

        CommonTree r=null;
        CommonTree a=null;
        CommonTree g=null;
        String s = null;

        String t = null;

        String atom19 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:438:3: (s= atom | ^(r= REMOVE ^( SUBJECT s= atom ) ^( POSITION INT ) ) | ^(r= REMOVE ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) | ^(a= ADD ^( SUBJECT atom ) ^( POSITION INT ) ) | ^(a= ADD ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) | ^(g= GET ^( SUBJECT s= atom ) ^( POSITION INT ) ) | ^(g= GET ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) )
            int alt17=7;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:439:5: s= atom
                    {
                    pushFollow(FOLLOW_atom_in_expr1360);
                    s=atom();

                    state._fsp--;
                    if (state.failed) return type;
                    if ( state.backtracking==0 ) {

                         type = s;
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:444:5: ^(r= REMOVE ^( SUBJECT s= atom ) ^( POSITION INT ) )
                    {
                    r=(CommonTree)match(input,REMOVE,FOLLOW_REMOVE_in_expr1388); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,SUBJECT,FOLLOW_SUBJECT_in_expr1397); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_atom_in_expr1401);
                    s=atom();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;
                    match(input,POSITION,FOLLOW_POSITION_in_expr1411); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,INT,FOLLOW_INT_in_expr1413); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;
                    if ( state.backtracking==0 ) {

                           if (s == "Ljava/lang/String;") {
                           	Tool.error(this, "unsupported opperation: expected List but got String", r);
                           }
                           type = s;
                          
                    }

                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:457:5: ^(r= REMOVE ^( SUBJECT s= atom ) ^( TARGET t= atom ) )
                    {
                    r=(CommonTree)match(input,REMOVE,FOLLOW_REMOVE_in_expr1454); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,SUBJECT,FOLLOW_SUBJECT_in_expr1463); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_atom_in_expr1467);
                    s=atom();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;
                    match(input,TARGET,FOLLOW_TARGET_in_expr1477); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_atom_in_expr1481);
                    t=atom();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;
                    if ( state.backtracking==0 ) {

                           if (t == "Ljava/lang/String;") {
                           	Tool.error(this, "unsupported opperation: expected List but got String", r);
                           }
                           if (s == "Ljava/util/ArrayList;") {
                           	Tool.error(this, "unsupported opperation: expected String but got List", r);
                           }
                           type = s;
                          
                    }

                    }
                    break;
                case 4 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:473:5: ^(a= ADD ^( SUBJECT atom ) ^( POSITION INT ) )
                    {
                    a=(CommonTree)match(input,ADD,FOLLOW_ADD_in_expr1522); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,SUBJECT,FOLLOW_SUBJECT_in_expr1531); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_atom_in_expr1533);
                    atom19=atom();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;
                    match(input,POSITION,FOLLOW_POSITION_in_expr1543); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,INT,FOLLOW_INT_in_expr1545); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;
                    if ( state.backtracking==0 ) {

                           Tool.error(this, "invalid opperation", a);
                           type = atom19;
                          
                    }

                    }
                    break;
                case 5 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:484:5: ^(a= ADD ^( SUBJECT s= atom ) ^( TARGET t= atom ) )
                    {
                    a=(CommonTree)match(input,ADD,FOLLOW_ADD_in_expr1586); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,SUBJECT,FOLLOW_SUBJECT_in_expr1595); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_atom_in_expr1599);
                    s=atom();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;
                    match(input,TARGET,FOLLOW_TARGET_in_expr1609); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_atom_in_expr1613);
                    t=atom();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;
                    if ( state.backtracking==0 ) {

                           if (t == "Ljava/lang/String;") {
                           	Tool.error(this, "unsupported opperation: expected List but got String", a);
                           }
                           if (s == "Ljava/util/ArrayList;") {
                           	Tool.error(this, "unsupported opperation: expected String but got List", a);
                           }
                           type = s;
                          
                    }

                    }
                    break;
                case 6 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:500:5: ^(g= GET ^( SUBJECT s= atom ) ^( POSITION INT ) )
                    {
                    g=(CommonTree)match(input,GET,FOLLOW_GET_in_expr1654); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,SUBJECT,FOLLOW_SUBJECT_in_expr1663); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_atom_in_expr1667);
                    s=atom();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;
                    match(input,POSITION,FOLLOW_POSITION_in_expr1677); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,INT,FOLLOW_INT_in_expr1679); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;
                    if ( state.backtracking==0 ) {

                           if (s == "Ljava/lang/String;") {
                           	Tool.error(this, "unsupported opperation: expected List but got String", g);
                           }
                           type = "Ljava/lang/String;";
                          
                    }

                    }
                    break;
                case 7 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:513:5: ^(g= GET ^( SUBJECT s= atom ) ^( TARGET t= atom ) )
                    {
                    g=(CommonTree)match(input,GET,FOLLOW_GET_in_expr1720); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,SUBJECT,FOLLOW_SUBJECT_in_expr1729); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_atom_in_expr1733);
                    s=atom();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;
                    match(input,TARGET,FOLLOW_TARGET_in_expr1743); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_atom_in_expr1747);
                    t=atom();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;
                    if ( state.backtracking==0 ) {

                           Tool.error(this, "invalid opperation", g);
                           type = s;
                          
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "expr"


    // $ANTLR start "atom"
    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:525:1: atom returns [String type] : ( ID | STRING | funcCall );
    public final String atom() throws RecognitionException {
        String type = null;

        CommonTree ID20=null;
        String funcCall21 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:526:3: ( ID | STRING | funcCall )
            int alt18=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt18=1;
                }
                break;
            case STRING:
                {
                alt18=2;
                }
                break;
            case CALL:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:527:3: ID
                    {
                    ID20=(CommonTree)match(input,ID,FOLLOW_ID_in_atom1785); if (state.failed) return type;
                    if ( state.backtracking==0 ) {

                           VariableScope scope = varHandler.getNearestScopeWithVar((ID20!=null?ID20.getText():null));
                           if (scope == null) {
                           	Tool.error(this, "name " + (ID20!=null?ID20.getText():null) + " cannot be resolved to a variable",
                           			ID20);
                           	type = "V";
                           
                           } else {
                           	scope.get((ID20!=null?ID20.getText():null)).addLineUses((ID20!=null?ID20.getLine():0));
                           	type = scope.get((ID20!=null?ID20.getText():null)).getType();
                           }
                          
                    }

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:540:5: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_atom1798); if (state.failed) return type;
                    if ( state.backtracking==0 ) {

                                 type = "Ljava/lang/String;";
                                
                    }

                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:544:5: funcCall
                    {
                    pushFollow(FOLLOW_funcCall_in_atom1817);
                    funcCall21=funcCall();

                    state._fsp--;
                    if (state.failed) return type;
                    if ( state.backtracking==0 ) {

                                   type = funcCall21;
                                  
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "atom"

    // $ANTLR start synpred9_WordySemantic
    public final void synpred9_WordySemantic_fragment() throws RecognitionException {   
        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:175:3: ( ( ( variable | stmt )+ returnStat ) )
        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:175:3: ( ( variable | stmt )+ returnStat )
        {
        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:175:3: ( ( variable | stmt )+ returnStat )
        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:176:5: ( variable | stmt )+ returnStat
        {
        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:176:5: ( variable | stmt )+
        int cnt19=0;
        loop19:
        do {
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==VAR) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=CALL && LA19_0<=WHILE)||LA19_0==FOREACH||(LA19_0>=REMOVE && LA19_0<=ASSIGN)||LA19_0==STRING||LA19_0==PRINT||LA19_0==ID) ) {
                alt19=2;
            }


            switch (alt19) {
        	case 1 :
        	    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:177:7: variable
        	    {
        	    pushFollow(FOLLOW_variable_in_synpred9_WordySemantic485);
        	    variable();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;
        	case 2 :
        	    // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:178:9: stmt
        	    {
        	    pushFollow(FOLLOW_stmt_in_synpred9_WordySemantic495);
        	    stmt();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt19 >= 1 ) break loop19;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(19, input);
                    throw eee;
            }
            cnt19++;
        } while (true);

        pushFollow(FOLLOW_returnStat_in_synpred9_WordySemantic508);
        returnStat();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_WordySemantic

    // $ANTLR start synpred25_WordySemantic
    public final void synpred25_WordySemantic_fragment() throws RecognitionException {   
        CommonTree r=null;
        String s = null;


        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:444:5: ( ^(r= REMOVE ^( SUBJECT s= atom ) ^( POSITION INT ) ) )
        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:444:5: ^(r= REMOVE ^( SUBJECT s= atom ) ^( POSITION INT ) )
        {
        r=(CommonTree)match(input,REMOVE,FOLLOW_REMOVE_in_synpred25_WordySemantic1388); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SUBJECT,FOLLOW_SUBJECT_in_synpred25_WordySemantic1397); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_atom_in_synpred25_WordySemantic1401);
        s=atom();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        match(input,POSITION,FOLLOW_POSITION_in_synpred25_WordySemantic1411); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,INT,FOLLOW_INT_in_synpred25_WordySemantic1413); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_WordySemantic

    // $ANTLR start synpred26_WordySemantic
    public final void synpred26_WordySemantic_fragment() throws RecognitionException {   
        CommonTree r=null;
        String s = null;

        String t = null;


        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:457:5: ( ^(r= REMOVE ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) )
        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:457:5: ^(r= REMOVE ^( SUBJECT s= atom ) ^( TARGET t= atom ) )
        {
        r=(CommonTree)match(input,REMOVE,FOLLOW_REMOVE_in_synpred26_WordySemantic1454); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SUBJECT,FOLLOW_SUBJECT_in_synpred26_WordySemantic1463); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_atom_in_synpred26_WordySemantic1467);
        s=atom();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        match(input,TARGET,FOLLOW_TARGET_in_synpred26_WordySemantic1477); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_atom_in_synpred26_WordySemantic1481);
        t=atom();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_WordySemantic

    // $ANTLR start synpred27_WordySemantic
    public final void synpred27_WordySemantic_fragment() throws RecognitionException {   
        CommonTree a=null;

        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:473:5: ( ^(a= ADD ^( SUBJECT atom ) ^( POSITION INT ) ) )
        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:473:5: ^(a= ADD ^( SUBJECT atom ) ^( POSITION INT ) )
        {
        a=(CommonTree)match(input,ADD,FOLLOW_ADD_in_synpred27_WordySemantic1522); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SUBJECT,FOLLOW_SUBJECT_in_synpred27_WordySemantic1531); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_atom_in_synpred27_WordySemantic1533);
        atom();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        match(input,POSITION,FOLLOW_POSITION_in_synpred27_WordySemantic1543); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,INT,FOLLOW_INT_in_synpred27_WordySemantic1545); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_WordySemantic

    // $ANTLR start synpred28_WordySemantic
    public final void synpred28_WordySemantic_fragment() throws RecognitionException {   
        CommonTree a=null;
        String s = null;

        String t = null;


        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:484:5: ( ^(a= ADD ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) )
        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:484:5: ^(a= ADD ^( SUBJECT s= atom ) ^( TARGET t= atom ) )
        {
        a=(CommonTree)match(input,ADD,FOLLOW_ADD_in_synpred28_WordySemantic1586); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SUBJECT,FOLLOW_SUBJECT_in_synpred28_WordySemantic1595); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_atom_in_synpred28_WordySemantic1599);
        s=atom();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        match(input,TARGET,FOLLOW_TARGET_in_synpred28_WordySemantic1609); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_atom_in_synpred28_WordySemantic1613);
        t=atom();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_WordySemantic

    // $ANTLR start synpred29_WordySemantic
    public final void synpred29_WordySemantic_fragment() throws RecognitionException {   
        CommonTree g=null;
        String s = null;


        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:500:5: ( ^(g= GET ^( SUBJECT s= atom ) ^( POSITION INT ) ) )
        // /home/malagan/Programming/workspace/Wordy/src/WordySemantic.g:500:5: ^(g= GET ^( SUBJECT s= atom ) ^( POSITION INT ) )
        {
        g=(CommonTree)match(input,GET,FOLLOW_GET_in_synpred29_WordySemantic1654); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SUBJECT,FOLLOW_SUBJECT_in_synpred29_WordySemantic1663); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_atom_in_synpred29_WordySemantic1667);
        s=atom();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        match(input,POSITION,FOLLOW_POSITION_in_synpred29_WordySemantic1677); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,INT,FOLLOW_INT_in_synpred29_WordySemantic1679); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_WordySemantic

    // Delegated rules

    public final boolean synpred29_WordySemantic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_WordySemantic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_WordySemantic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_WordySemantic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_WordySemantic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_WordySemantic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_WordySemantic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_WordySemantic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_WordySemantic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_WordySemantic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_WordySemantic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_WordySemantic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA8_eotS =
        "\17\uffff";
    static final String DFA8_eofS =
        "\17\uffff";
    static final String DFA8_minS =
        "\1\10\14\0\2\uffff";
    static final String DFA8_maxS =
        "\1\47\14\0\2\uffff";
    static final String DFA8_acceptS =
        "\15\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\2\uffff\1\4\1\12\1\13\1\uffff\1\14\2\uffff\1\5\1\6\1\7"+
            "\1\10\13\uffff\1\3\3\uffff\1\11\1\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "173:1: blockContainment[boolean neadedToReturn] : ( ( ( variable | stmt )+ returnStat ) | ( ( variable | stmt )+ ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_WordySemantic()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_WordySemantic()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_WordySemantic()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_WordySemantic()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_WordySemantic()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_WordySemantic()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_WordySemantic()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_8 = input.LA(1);

                         
                        int index8_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_WordySemantic()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index8_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_9 = input.LA(1);

                         
                        int index8_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_WordySemantic()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index8_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA8_10 = input.LA(1);

                         
                        int index8_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_WordySemantic()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index8_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA8_11 = input.LA(1);

                         
                        int index8_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_WordySemantic()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index8_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA8_12 = input.LA(1);

                         
                        int index8_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_WordySemantic()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index8_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\15\uffff";
    static final String DFA17_eofS =
        "\15\uffff";
    static final String DFA17_minS =
        "\1\13\3\uffff\3\0\6\uffff";
    static final String DFA17_maxS =
        "\1\47\3\uffff\3\0\6\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String DFA17_specialS =
        "\4\uffff\1\0\1\1\1\2\6\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\6\uffff\1\4\1\5\1\6\14\uffff\1\1\5\uffff\1\1",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "437:1: expr returns [String type] : (s= atom | ^(r= REMOVE ^( SUBJECT s= atom ) ^( POSITION INT ) ) | ^(r= REMOVE ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) | ^(a= ADD ^( SUBJECT atom ) ^( POSITION INT ) ) | ^(a= ADD ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) | ^(g= GET ^( SUBJECT s= atom ) ^( POSITION INT ) ) | ^(g= GET ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_WordySemantic()) ) {s = 7;}

                        else if ( (synpred26_WordySemantic()) ) {s = 8;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_WordySemantic()) ) {s = 9;}

                        else if ( (synpred28_WordySemantic()) ) {s = 10;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_WordySemantic()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_declaration_in_program78 = new BitSet(new long[]{0x00000000000001C2L});
    public static final BitSet FOLLOW_variable_in_declaration111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variable133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_variable135 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_declarator_in_variable137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_declarator164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regularFunction_in_function198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_in_function204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_regularFunction235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_regularFunction237 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_regularFunction239 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_formalParameter_in_regularFunction272 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_block_in_regularFunction285 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAM_in_formalParameter307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_formalParameter309 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_formalParameter311 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAIN_in_main345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_main347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_type378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_type395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockContainment_in_block453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_blockContainment485 = new BitSet(new long[]{0x000000B2003CB900L});
    public static final BitSet FOLLOW_stmt_in_blockContainment495 = new BitSet(new long[]{0x000000B2003CB900L});
    public static final BitSet FOLLOW_returnStat_in_blockContainment508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_blockContainment534 = new BitSet(new long[]{0x000000B2003CB902L});
    public static final BitSet FOLLOW_stmt_in_blockContainment544 = new BitSet(new long[]{0x000000B2003CB902L});
    public static final BitSet FOLLOW_simple_stmt_in_stmt581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_stmt_in_stmt587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_simple_stmt602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_simple_stmt608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printOp_in_simple_stmt614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStat630 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_returnable_in_returnStat632 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_returnStat648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_returnable682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_printOp707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_printOp709 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_assignStat726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignStat728 = new BitSet(new long[]{0x00000086001C0800L});
    public static final BitSet FOLLOW_assignable_in_assignStat730 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_in_assignable763 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_assignable777 = new BitSet(new long[]{0x0000000200000008L});
    public static final BitSet FOLLOW_expr_in_assignable802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_compound_stmt828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_compound_stmt834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_stmt_in_compound_stmt840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt861 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TEST_in_if_stmt868 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_test_in_if_stmt870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_if_stmt877 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_test_in_while_stmt901 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_block_in_while_stmt903 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOREACH_in_foreach_stmt936 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PART_in_foreach_stmt943 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_foreach_stmt945 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_foreach_stmt949 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHOLE_in_foreach_stmt959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_foreach_stmt963 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_foreach_stmt970 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_funcCall1013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_funcCall1015 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_param_in_funcCall1029 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_PARAM_in_param1082 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_param1084 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_CONTAINS_in_test1145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VERIFIABLE_in_test1152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test1156 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHECKING_in_test1164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test1168 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTAINS_in_test1197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VERIFIABLE_in_test1204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test1208 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHECKING_in_test1216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test1220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUALS_in_test1249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VERIFIABLE_in_test1256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test1260 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHECKING_in_test1268 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test1272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_test1301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VERIFIABLE_in_test1308 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test1312 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHECKING_in_test1320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test1324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_expr1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_in_expr1388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_expr1397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr1401 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITION_in_expr1411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_expr1413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REMOVE_in_expr1454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_expr1463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr1467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TARGET_in_expr1477 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr1481 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_in_expr1522 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_expr1531 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr1533 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITION_in_expr1543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_expr1545 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_in_expr1586 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_expr1595 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr1599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TARGET_in_expr1609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr1613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GET_in_expr1654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_expr1663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr1667 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITION_in_expr1677 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_expr1679 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GET_in_expr1720 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_expr1729 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr1733 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TARGET_in_expr1743 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr1747 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_atom1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCall_in_atom1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred9_WordySemantic485 = new BitSet(new long[]{0x000000B2003CB900L});
    public static final BitSet FOLLOW_stmt_in_synpred9_WordySemantic495 = new BitSet(new long[]{0x000000B2003CB900L});
    public static final BitSet FOLLOW_returnStat_in_synpred9_WordySemantic508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_in_synpred25_WordySemantic1388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_synpred25_WordySemantic1397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_synpred25_WordySemantic1401 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITION_in_synpred25_WordySemantic1411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_synpred25_WordySemantic1413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REMOVE_in_synpred26_WordySemantic1454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_synpred26_WordySemantic1463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_synpred26_WordySemantic1467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TARGET_in_synpred26_WordySemantic1477 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_synpred26_WordySemantic1481 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_in_synpred27_WordySemantic1522 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_synpred27_WordySemantic1531 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_synpred27_WordySemantic1533 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITION_in_synpred27_WordySemantic1543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_synpred27_WordySemantic1545 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_in_synpred28_WordySemantic1586 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_synpred28_WordySemantic1595 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_synpred28_WordySemantic1599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TARGET_in_synpred28_WordySemantic1609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_synpred28_WordySemantic1613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GET_in_synpred29_WordySemantic1654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_synpred29_WordySemantic1663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_synpred29_WordySemantic1667 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITION_in_synpred29_WordySemantic1677 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_synpred29_WordySemantic1679 = new BitSet(new long[]{0x0000000000000008L});

}