// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g 2011-05-22 19:57:30

import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class WordyWalker extends TreeParser {
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


        public WordyWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public WordyWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("WordyWalkerTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return WordyWalker.tokenNames; }
    public String getGrammarFileName() { return "/home/malagan/Programming/workspace/Wordy/src/WordyWalker.g"; }


    private FunctionsTable functionsData;
    private Globals globalsData;


    protected static class program_scope {
        List globals;
        List functions;
        List globalsInitialization;
        List main;
    }
    protected Stack program_stack = new Stack();

    public static class program_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:19:1: program[FunctionsTable functionsData, Globals globalsData] : ( declaration )* -> program(globals=$program::globalsmainBody=$program::mainfunctions=$program::functionsmaxStackDepth=functionsData.get(\"main\").getOperatorsCount()maxLocals=functionsData.get(\"main\").getLocalsCount()init=\"<init>\");
    public final WordyWalker.program_return program(FunctionsTable functionsData, Globals globalsData) throws RecognitionException {
        program_stack.push(new program_scope());
        WordyWalker.program_return retval = new WordyWalker.program_return();
        retval.start = input.LT(1);


        this.functionsData = functionsData;
        this.globalsData = globalsData;
        ((program_scope)program_stack.peek()).globals = new ArrayList();
          ((program_scope)program_stack.peek()).functions = new ArrayList();
          ((program_scope)program_stack.peek()).main = new ArrayList();

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:33:3: ( ( declaration )* -> program(globals=$program::globalsmainBody=$program::mainfunctions=$program::functionsmaxStackDepth=functionsData.get(\"main\").getOperatorsCount()maxLocals=functionsData.get(\"main\").getLocalsCount()init=\"<init>\"))
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:34:3: ( declaration )*
            {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:34:3: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=MAIN && LA1_0<=VAR)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:34:3: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program91);
            	    declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 35:5: -> program(globals=$program::globalsmainBody=$program::mainfunctions=$program::functionsmaxStackDepth=functionsData.get(\"main\").getOperatorsCount()maxLocals=functionsData.get(\"main\").getLocalsCount()init=\"<init>\")
              {
                  retval.st = templateLib.getInstanceOf("program",
                new STAttrMap().put("globals", ((program_scope)program_stack.peek()).globals).put("mainBody", ((program_scope)program_stack.peek()).main).put("functions", ((program_scope)program_stack.peek()).functions).put("maxStackDepth", functionsData.get("main").getOperatorsCount()).put("maxLocals", functionsData.get("main").getLocalsCount()).put("init", "<init>"));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            program_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class declaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:39:1: declaration : ( variable[true] | function );
    public final WordyWalker.declaration_return declaration() throws RecognitionException {
        WordyWalker.declaration_return retval = new WordyWalker.declaration_return();
        retval.start = input.LT(1);

        WordyWalker.variable_return variable1 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:40:3: ( variable[true] | function )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==VAR) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=MAIN && LA2_0<=FUNC)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:41:3: variable[true]
                    {
                    pushFollow(FOLLOW_variable_in_declaration151);
                    variable1=variable(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                                       ((program_scope)program_stack.peek()).globals.add((variable1!=null?variable1.st:null));
                                      
                    }

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:45:5: function
                    {
                    pushFollow(FOLLOW_function_in_declaration177);
                    function();

                    state._fsp--;
                    if (state.failed) return retval;

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
        return retval;
    }
    // $ANTLR end "declaration"

    public static class variable_return extends TreeRuleReturnScope {
        public String idType;
        public String name;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variable"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:48:1: variable[boolean global] returns [String idType, String name] : ^( VAR type declarator ) -> {global}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st);
    public final WordyWalker.variable_return variable(boolean global) throws RecognitionException {
        WordyWalker.variable_return retval = new WordyWalker.variable_return();
        retval.start = input.LT(1);

        WordyWalker.type_return type2 = null;

        WordyWalker.declarator_return declarator3 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:49:3: ( ^( VAR type declarator ) -> {global}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st))
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:50:3: ^( VAR type declarator )
            {
            match(input,VAR,FOLLOW_VAR_in_variable198); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_variable200);
            type2=type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_declarator_in_variable202);
            declarator3=declarator();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                 if(!global) {retval.idType = (type2!=null?type2.idType:null);
                                                   retval.name = (declarator3!=null?declarator3.text:null); 
                                                           ((function_scope)function_stack.peek()).locals.put((declarator3!=null?declarator3.text:null), true);
                                                           }
                
            }


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 58:5: -> {global}? globalVariable(type=$type.stname=$declarator.st)
              if (global) {
                  retval.st = templateLib.getInstanceOf("globalVariable",
                new STAttrMap().put("type", (type2!=null?type2.st:null)).put("name", (declarator3!=null?declarator3.st:null)));
              }
              else // 60:5: -> variable(type=$type.stname=$declarator.st)
              {
                  retval.st = templateLib.getInstanceOf("variable",
                new STAttrMap().put("type", (type2!=null?type2.st:null)).put("name", (declarator3!=null?declarator3.st:null)));
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
        return retval;
    }
    // $ANTLR end "variable"

    public static class declarator_return extends TreeRuleReturnScope {
        public String text;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declarator"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:64:1: declarator returns [String text] : ID -> {new StringTemplate($ID.text)};
    public final WordyWalker.declarator_return declarator() throws RecognitionException {
        WordyWalker.declarator_return retval = new WordyWalker.declarator_return();
        retval.start = input.LT(1);

        CommonTree ID4=null;

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:65:3: ( ID -> {new StringTemplate($ID.text)})
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:66:3: ID
            {
            ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_declarator279); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                   retval.text = (ID4!=null?ID4.getText():null);
                  
            }


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 70:5: -> {new StringTemplate($ID.text)}
              {
                  retval.st = new StringTemplate((ID4!=null?ID4.getText():null));
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
        return retval;
    }
    // $ANTLR end "declarator"

    protected static class function_scope {
        HashMap locals;
        Function currentFunction;
        int numOps;
    }
    protected Stack function_stack = new Stack();

    public static class function_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "function"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:77:1: function : ( main | regularFunction );
    public final WordyWalker.function_return function() throws RecognitionException {
        function_stack.push(new function_scope());
        WordyWalker.function_return retval = new WordyWalker.function_return();
        retval.start = input.LT(1);

        WordyWalker.main_return main5 = null;

        WordyWalker.regularFunction_return regularFunction6 = null;



        ((function_scope)function_stack.peek()).numOps = 0;
        ((function_scope)function_stack.peek()).locals = new HashMap();

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:87:3: ( main | regularFunction )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==MAIN) ) {
                alt3=1;
            }
            else if ( (LA3_0==FUNC) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:88:3: main
                    {
                    pushFollow(FOLLOW_main_in_function327);
                    main5=main();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                             ((program_scope)program_stack.peek()).main.add((main5!=null?main5.st:null));
                            
                    }

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:92:5: regularFunction
                    {
                    pushFollow(FOLLOW_regularFunction_in_function342);
                    regularFunction6=regularFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                                          ((program_scope)program_stack.peek()).functions.add((regularFunction6!=null?regularFunction6.st:null));
                                         
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
            function_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "function"

    protected static class regularFunction_scope {
        List formalParameters;
    }
    protected Stack regularFunction_stack = new Stack();

    public static class regularFunction_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "regularFunction"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:98:1: regularFunction : ^( FUNC type ID ( formalParameter )* block[true] ) -> function(retType=$type.stname=$ID.textparameters=$regularFunction::formalParametersmaxStackDepth=functionsData.get($ID.text).getOperatorsCount()maxLocals=functionsData.get($ID.text).getLocalsCount()content=$block.st);
    public final WordyWalker.regularFunction_return regularFunction() throws RecognitionException {
        regularFunction_stack.push(new regularFunction_scope());
        WordyWalker.regularFunction_return retval = new WordyWalker.regularFunction_return();
        retval.start = input.LT(1);

        CommonTree ID7=null;
        WordyWalker.formalParameter_return formalParameter8 = null;

        WordyWalker.type_return type9 = null;

        WordyWalker.block_return block10 = null;



        ((regularFunction_scope)regularFunction_stack.peek()).formalParameters = new ArrayList();

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:105:3: ( ^( FUNC type ID ( formalParameter )* block[true] ) -> function(retType=$type.stname=$ID.textparameters=$regularFunction::formalParametersmaxStackDepth=functionsData.get($ID.text).getOperatorsCount()maxLocals=functionsData.get($ID.text).getLocalsCount()content=$block.st))
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:106:3: ^( FUNC type ID ( formalParameter )* block[true] )
            {
            match(input,FUNC,FOLLOW_FUNC_in_regularFunction394); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_regularFunction396);
            type9=type();

            state._fsp--;
            if (state.failed) return retval;
            ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_regularFunction398); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                               ((function_scope)function_stack.peek()).currentFunction =functionsData.get((ID7!=null?ID7.getText():null));
                              
            }
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:111:5: ( formalParameter )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==PARAM) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:112:7: formalParameter
            	    {
            	    pushFollow(FOLLOW_formalParameter_in_regularFunction431);
            	    formalParameter8=formalParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {

            	                            ((regularFunction_scope)regularFunction_stack.peek()).formalParameters.add((formalParameter8!=null?formalParameter8.st:null));
            	                           
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            pushFollow(FOLLOW_block_in_regularFunction468);
            block10=block(true);

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 119:5: -> function(retType=$type.stname=$ID.textparameters=$regularFunction::formalParametersmaxStackDepth=functionsData.get($ID.text).getOperatorsCount()maxLocals=functionsData.get($ID.text).getLocalsCount()content=$block.st)
              {
                  retval.st = templateLib.getInstanceOf("function",
                new STAttrMap().put("retType", (type9!=null?type9.st:null)).put("name", (ID7!=null?ID7.getText():null)).put("parameters", ((regularFunction_scope)regularFunction_stack.peek()).formalParameters).put("maxStackDepth", functionsData.get((ID7!=null?ID7.getText():null)).getOperatorsCount()).put("maxLocals", functionsData.get((ID7!=null?ID7.getText():null)).getLocalsCount()).put("content", (block10!=null?block10.st:null)));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            regularFunction_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "regularFunction"

    public static class formalParameter_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameter"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:123:1: formalParameter : ^( PARAM type ID ) -> parameter(type=$type.stname=$ID.text);
    public final WordyWalker.formalParameter_return formalParameter() throws RecognitionException {
        WordyWalker.formalParameter_return retval = new WordyWalker.formalParameter_return();
        retval.start = input.LT(1);

        CommonTree ID11=null;
        WordyWalker.type_return type12 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:124:3: ( ^( PARAM type ID ) -> parameter(type=$type.stname=$ID.text))
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:125:3: ^( PARAM type ID )
            {
            match(input,PARAM,FOLLOW_PARAM_in_formalParameter534); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameter536);
            type12=type();

            state._fsp--;
            if (state.failed) return retval;
            ID11=(CommonTree)match(input,ID,FOLLOW_ID_in_formalParameter538); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                 ((function_scope)function_stack.peek()).locals.put((ID11!=null?ID11.getText():null) ,true);
                
            }


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 130:5: -> parameter(type=$type.stname=$ID.text)
              {
                  retval.st = templateLib.getInstanceOf("parameter",
                new STAttrMap().put("type", (type12!=null?type12.st:null)).put("name", (ID11!=null?ID11.getText():null)));
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
        return retval;
    }
    // $ANTLR end "formalParameter"

    public static class main_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:134:1: main : ^( MAIN block[false] ) -> {$block.st};
    public final WordyWalker.main_return main() throws RecognitionException {
        WordyWalker.main_return retval = new WordyWalker.main_return();
        retval.start = input.LT(1);

        WordyWalker.block_return block13 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:135:3: ( ^( MAIN block[false] ) -> {$block.st})
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:136:3: ^( MAIN block[false] )
            {
            match(input,MAIN,FOLLOW_MAIN_in_main586); if (state.failed) return retval;

            if ( state.backtracking==0 ) {

                       ((function_scope)function_stack.peek()).currentFunction =functionsData.get("main");
                      
            }

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_main603);
            block13=block(false);

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 141:5: -> {$block.st}
              {
                  retval.st = (block13!=null?block13.st:null);
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
        return retval;
    }
    // $ANTLR end "main"

    public static class type_return extends TreeRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:148:1: type returns [String idType] : ( STRING -> type_String() | LIST -> type_List() | VOID -> type_Void());
    public final WordyWalker.type_return type() throws RecognitionException {
        WordyWalker.type_return retval = new WordyWalker.type_return();
        retval.start = input.LT(1);

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:149:3: ( STRING -> type_String() | LIST -> type_List() | VOID -> type_Void())
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:150:3: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_type641); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                               retval.idType = "Ljava/lang/String;";
                              
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 154:5: -> type_String()
                      {
                          retval.st = templateLib.getInstanceOf("type_String");
                      }

                    }
                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:156:5: LIST
                    {
                    match(input,LIST,FOLLOW_LIST_in_type674); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                               retval.idType = "Ljava/util/ArrayList;";
                              
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 160:5: -> type_List()
                      {
                          retval.st = templateLib.getInstanceOf("type_List");
                      }

                    }
                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:162:5: VOID
                    {
                    match(input,VOID,FOLLOW_VOID_in_type707); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                               retval.idType = "V";
                              
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 166:5: -> type_Void()
                      {
                          retval.st = templateLib.getInstanceOf("type_Void");
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
        return retval;
    }
    // $ANTLR end "type"

    protected static class block_scope {
        List content;
    }
    protected Stack block_stack = new Stack();

    public static class block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:171:1: block[boolean neadedToReturn] : ^( BLOCK blockContainment[neadedToReturn] ) -> block(content=$block::content);
    public final WordyWalker.block_return block(boolean neadedToReturn) throws RecognitionException {
        block_stack.push(new block_scope());
        WordyWalker.block_return retval = new WordyWalker.block_return();
        retval.start = input.LT(1);


        ((block_scope)block_stack.peek()).content = new ArrayList();

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:178:3: ( ^( BLOCK blockContainment[neadedToReturn] ) -> block(content=$block::content))
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:179:3: ^( BLOCK blockContainment[neadedToReturn] )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block761); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_blockContainment_in_block763);
            blockContainment(neadedToReturn);

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 180:5: -> block(content=$block::content)
              {
                  retval.st = templateLib.getInstanceOf("block",
                new STAttrMap().put("content", ((block_scope)block_stack.peek()).content));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            block_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class blockContainment_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blockContainment"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:184:1: blockContainment[boolean neadedToReturn] : ( variable[false] | stmt )+ returnStat[neadedToReturn] ;
    public final WordyWalker.blockContainment_return blockContainment(boolean neadedToReturn) throws RecognitionException {
        WordyWalker.blockContainment_return retval = new WordyWalker.blockContainment_return();
        retval.start = input.LT(1);

        WordyWalker.variable_return variable14 = null;

        WordyWalker.stmt_return stmt15 = null;

        WordyWalker.returnStat_return returnStat16 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:185:3: ( ( variable[false] | stmt )+ returnStat[neadedToReturn] )
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:186:3: ( variable[false] | stmt )+ returnStat[neadedToReturn]
            {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:186:3: ( variable[false] | stmt )+
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
            	    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:187:5: variable[false]
            	    {
            	    pushFollow(FOLLOW_variable_in_blockContainment806);
            	    variable14=variable(false);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {

            	                          ((block_scope)block_stack.peek()).content.add((variable14!=null?variable14.st:null));
            	                         
            	    }

            	    }
            	    break;
            	case 2 :
            	    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:191:7: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_blockContainment837);
            	    stmt15=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {

            	                 ((block_scope)block_stack.peek()).content.add((stmt15!=null?stmt15.st:null));
            	                
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            pushFollow(FOLLOW_returnStat_in_blockContainment859);
            returnStat16=returnStat(neadedToReturn);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                           ((block_scope)block_stack.peek()).content.add((returnStat16!=null?returnStat16.st:null));
                          
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
    // $ANTLR end "blockContainment"

    public static class stmt_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stmt"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:202:1: stmt : ( simple_stmt -> {$simple_stmt.st} | compound_stmt -> {$compound_stmt.st});
    public final WordyWalker.stmt_return stmt() throws RecognitionException {
        WordyWalker.stmt_return retval = new WordyWalker.stmt_return();
        retval.start = input.LT(1);

        WordyWalker.simple_stmt_return simple_stmt17 = null;

        WordyWalker.compound_stmt_return compound_stmt18 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:203:3: ( simple_stmt -> {$simple_stmt.st} | compound_stmt -> {$compound_stmt.st})
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CALL||(LA7_0>=REMOVE && LA7_0<=ASSIGN)||LA7_0==STRING||LA7_0==PRINT||LA7_0==ID) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=IF && LA7_0<=WHILE)||LA7_0==FOREACH) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:204:3: simple_stmt
                    {
                    pushFollow(FOLLOW_simple_stmt_in_stmt890);
                    simple_stmt17=simple_stmt();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 205:5: -> {$simple_stmt.st}
                      {
                          retval.st = (simple_stmt17!=null?simple_stmt17.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:207:5: compound_stmt
                    {
                    pushFollow(FOLLOW_compound_stmt_in_stmt910);
                    compound_stmt18=compound_stmt();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 208:5: -> {$compound_stmt.st}
                      {
                          retval.st = (compound_stmt18!=null?compound_stmt18.st:null);
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
        return retval;
    }
    // $ANTLR end "stmt"

    public static class simple_stmt_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "simple_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:212:1: simple_stmt : ( expr -> {$expr.st} | assignStat -> {$assignStat.st} | printOp -> {$printOp.st});
    public final WordyWalker.simple_stmt_return simple_stmt() throws RecognitionException {
        WordyWalker.simple_stmt_return retval = new WordyWalker.simple_stmt_return();
        retval.start = input.LT(1);

        WordyWalker.expr_return expr19 = null;

        WordyWalker.assignStat_return assignStat20 = null;

        WordyWalker.printOp_return printOp21 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:213:3: ( expr -> {$expr.st} | assignStat -> {$assignStat.st} | printOp -> {$printOp.st})
            int alt8=3;
            switch ( input.LA(1) ) {
            case CALL:
            case REMOVE:
            case ADD:
            case GET:
            case STRING:
            case ID:
                {
                alt8=1;
                }
                break;
            case ASSIGN:
                {
                alt8=2;
                }
                break;
            case PRINT:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:214:3: expr
                    {
                    pushFollow(FOLLOW_expr_in_simple_stmt939);
                    expr19=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 215:5: -> {$expr.st}
                      {
                          retval.st = (expr19!=null?expr19.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:217:5: assignStat
                    {
                    pushFollow(FOLLOW_assignStat_in_simple_stmt959);
                    assignStat20=assignStat();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 218:5: -> {$assignStat.st}
                      {
                          retval.st = (assignStat20!=null?assignStat20.st:null);
                      }

                    }
                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:220:5: printOp
                    {
                    pushFollow(FOLLOW_printOp_in_simple_stmt979);
                    printOp21=printOp();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 221:5: -> {$printOp.st}
                      {
                          retval.st = (printOp21!=null?printOp21.st:null);
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
        return retval;
    }
    // $ANTLR end "simple_stmt"

    public static class returnStat_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "returnStat"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:225:1: returnStat[boolean neadedToReturn] : ( ^( RETURN returnable ) -> returnObject(returnable=$returnable.st) | RETURN -> returnVoid() | -> {neadedToReturn}? returnVoid() ->);
    public final WordyWalker.returnStat_return returnStat(boolean neadedToReturn) throws RecognitionException {
        WordyWalker.returnStat_return retval = new WordyWalker.returnStat_return();
        retval.start = input.LT(1);

        WordyWalker.returnable_return returnable22 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:226:3: ( ^( RETURN returnable ) -> returnObject(returnable=$returnable.st) | RETURN -> returnVoid() | -> {neadedToReturn}? returnVoid() ->)
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RETURN) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==DOWN) ) {
                    alt9=1;
                }
                else if ( (LA9_1==UP) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==UP) ) {
                alt9=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:227:3: ^( RETURN returnable )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_returnStat1010); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_returnable_in_returnStat1012);
                    returnable22=returnable();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 228:5: -> returnObject(returnable=$returnable.st)
                      {
                          retval.st = templateLib.getInstanceOf("returnObject",
                        new STAttrMap().put("returnable", (returnable22!=null?returnable22.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:230:5: RETURN
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_returnStat1038); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 231:5: -> returnVoid()
                      {
                          retval.st = templateLib.getInstanceOf("returnVoid");
                      }

                    }
                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:234:5: 
                    {

                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 234:5: -> {neadedToReturn}? returnVoid()
                      if (neadedToReturn) {
                          retval.st = templateLib.getInstanceOf("returnVoid");
                      }
                      else // 235:5: ->
                      {
                          retval.st = null;;
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
        return retval;
    }
    // $ANTLR end "returnStat"

    public static class returnable_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "returnable"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:238:1: returnable : expr -> {$expr.st};
    public final WordyWalker.returnable_return returnable() throws RecognitionException {
        WordyWalker.returnable_return retval = new WordyWalker.returnable_return();
        retval.start = input.LT(1);

        WordyWalker.expr_return expr23 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:239:3: ( expr -> {$expr.st})
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:240:3: expr
            {
            pushFollow(FOLLOW_expr_in_returnable1091);
            expr23=expr();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 241:5: -> {$expr.st}
              {
                  retval.st = (expr23!=null?expr23.st:null);
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
        return retval;
    }
    // $ANTLR end "returnable"

    public static class printOp_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "printOp"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:245:1: printOp : ^( PRINT ID ) -> {$function::locals.get($ID.text)!=null}? printVar(varNum=$function::currentFunction.getVariableLocalNumber($ID.text)) -> printGlob(id=$ID.texttype=globalsData.getGlobalTypeByName($ID.text));
    public final WordyWalker.printOp_return printOp() throws RecognitionException {
        WordyWalker.printOp_return retval = new WordyWalker.printOp_return();
        retval.start = input.LT(1);

        CommonTree ID24=null;

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:246:3: ( ^( PRINT ID ) -> {$function::locals.get($ID.text)!=null}? printVar(varNum=$function::currentFunction.getVariableLocalNumber($ID.text)) -> printGlob(id=$ID.texttype=globalsData.getGlobalTypeByName($ID.text)))
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:247:3: ^( PRINT ID )
            {
            match(input,PRINT,FOLLOW_PRINT_in_printOp1121); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID24=(CommonTree)match(input,ID,FOLLOW_ID_in_printOp1123); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 248:5: -> {$function::locals.get($ID.text)!=null}? printVar(varNum=$function::currentFunction.getVariableLocalNumber($ID.text))
              if (((function_scope)function_stack.peek()).locals.get((ID24!=null?ID24.getText():null))!=null) {
                  retval.st = templateLib.getInstanceOf("printVar",
                new STAttrMap().put("varNum", ((function_scope)function_stack.peek()).currentFunction.getVariableLocalNumber((ID24!=null?ID24.getText():null))));
              }
              else // 250:5: -> printGlob(id=$ID.texttype=globalsData.getGlobalTypeByName($ID.text))
              {
                  retval.st = templateLib.getInstanceOf("printGlob",
                new STAttrMap().put("id", (ID24!=null?ID24.getText():null)).put("type", globalsData.getGlobalTypeByName((ID24!=null?ID24.getText():null))));
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
        return retval;
    }
    // $ANTLR end "printOp"

    public static class assignStat_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignStat"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:254:1: assignStat : ^( ASSIGN ID assignable[$ID.text] ) -> {$assignable.st};
    public final WordyWalker.assignStat_return assignStat() throws RecognitionException {
        WordyWalker.assignStat_return retval = new WordyWalker.assignStat_return();
        retval.start = input.LT(1);

        CommonTree ID25=null;
        WordyWalker.assignable_return assignable26 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:255:3: ( ^( ASSIGN ID assignable[$ID.text] ) -> {$assignable.st})
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:256:3: ^( ASSIGN ID assignable[$ID.text] )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignStat1185); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID25=(CommonTree)match(input,ID,FOLLOW_ID_in_assignStat1187); if (state.failed) return retval;
            pushFollow(FOLLOW_assignable_in_assignStat1189);
            assignable26=assignable((ID25!=null?ID25.getText():null));

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 257:5: -> {$assignable.st}
              {
                  retval.st = (assignable26!=null?assignable26.st:null);
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
        return retval;
    }
    // $ANTLR end "assignStat"

    public static class assignable_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignable"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:261:1: assignable[String assigned] : ( expr -> {$function::locals.get(assigned)!=null}? assignVar(id=assignedvarNum=$function::currentFunction.getVariableLocalNumber(assigned)v=$expr.st) -> assignGlob(id=assignedv=$expr.stfullType=globalsData.getGlobalTypeByName(assigned)type=globalsData.getGlobalTypeByName(assigned).substring(1,globalsData.getGlobalTypeByName(assigned).length()-1)) | list[assigned, false] -> {$list.st});
    public final WordyWalker.assignable_return assignable(String assigned) throws RecognitionException {
        WordyWalker.assignable_return retval = new WordyWalker.assignable_return();
        retval.start = input.LT(1);

        WordyWalker.expr_return expr27 = null;

        WordyWalker.list_return list28 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:262:3: ( expr -> {$function::locals.get(assigned)!=null}? assignVar(id=assignedvarNum=$function::currentFunction.getVariableLocalNumber(assigned)v=$expr.st) -> assignGlob(id=assignedv=$expr.stfullType=globalsData.getGlobalTypeByName(assigned)type=globalsData.getGlobalTypeByName(assigned).substring(1,globalsData.getGlobalTypeByName(assigned).length()-1)) | list[assigned, false] -> {$list.st})
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==CALL||(LA10_0>=REMOVE && LA10_0<=GET)||LA10_0==STRING||LA10_0==ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==LIST) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:263:3: expr
                    {
                    pushFollow(FOLLOW_expr_in_assignable1221);
                    expr27=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 264:5: -> {$function::locals.get(assigned)!=null}? assignVar(id=assignedvarNum=$function::currentFunction.getVariableLocalNumber(assigned)v=$expr.st)
                      if (((function_scope)function_stack.peek()).locals.get(assigned)!=null) {
                          retval.st = templateLib.getInstanceOf("assignVar",
                        new STAttrMap().put("id", assigned).put("varNum", ((function_scope)function_stack.peek()).currentFunction.getVariableLocalNumber(assigned)).put("v", (expr27!=null?expr27.st:null)));
                      }
                      else // 266:5: -> assignGlob(id=assignedv=$expr.stfullType=globalsData.getGlobalTypeByName(assigned)type=globalsData.getGlobalTypeByName(assigned).substring(1,globalsData.getGlobalTypeByName(assigned).length()-1))
                      {
                          retval.st = templateLib.getInstanceOf("assignGlob",
                        new STAttrMap().put("id", assigned).put("v", (expr27!=null?expr27.st:null)).put("fullType", globalsData.getGlobalTypeByName(assigned)).put("type", globalsData.getGlobalTypeByName(assigned).substring(1,globalsData.getGlobalTypeByName(assigned).length()-1)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:268:5: list[assigned, false]
                    {
                    pushFollow(FOLLOW_list_in_assignable1292);
                    list28=list(assigned, false);

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 269:5: -> {$list.st}
                      {
                          retval.st = (list28!=null?list28.st:null);
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
        return retval;
    }
    // $ANTLR end "assignable"

    public static class list_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "list"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:273:1: list[String assigned, boolean returnable] : ^( LIST (s+= STRING )* ) -> {$function::locals.get(assigned) != null}? createLocalList(elements=$svarNum=$function::currentFunction.getVariableLocalNumber(assigned)) -> createGlobalList(elements=$sglobName=assigned);
    public final WordyWalker.list_return list(String assigned, boolean returnable) throws RecognitionException {
        WordyWalker.list_return retval = new WordyWalker.list_return();
        retval.start = input.LT(1);

        CommonTree s=null;
        List list_s=null;

        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:274:3: ( ^( LIST (s+= STRING )* ) -> {$function::locals.get(assigned) != null}? createLocalList(elements=$svarNum=$function::currentFunction.getVariableLocalNumber(assigned)) -> createGlobalList(elements=$sglobName=assigned))
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:275:3: ^( LIST (s+= STRING )* )
            {
            match(input,LIST,FOLLOW_LIST_in_list1329); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:277:5: (s+= STRING )*
                loop11:
                do {
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==STRING) ) {
                        alt11=1;
                    }


                    switch (alt11) {
                	case 1 :
                	    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:278:7: s+= STRING
                	    {
                	    s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_list1345); if (state.failed) return retval;
                	    if (list_s==null) list_s=new ArrayList();
                	    list_s.add(s);


                	    }
                	    break;

                	default :
                	    break loop11;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 281:5: -> {$function::locals.get(assigned) != null}? createLocalList(elements=$svarNum=$function::currentFunction.getVariableLocalNumber(assigned))
              if (((function_scope)function_stack.peek()).locals.get(assigned) != null) {
                  retval.st = templateLib.getInstanceOf("createLocalList",
                new STAttrMap().put("elements", list_s).put("varNum", ((function_scope)function_stack.peek()).currentFunction.getVariableLocalNumber(assigned)));
              }
              else // 283:5: -> createGlobalList(elements=$sglobName=assigned)
              {
                  retval.st = templateLib.getInstanceOf("createGlobalList",
                new STAttrMap().put("elements", list_s).put("globName", assigned));
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
        return retval;
    }
    // $ANTLR end "list"

    public static class compound_stmt_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "compound_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:287:1: compound_stmt : ( if_stmt -> {$if_stmt.st} | while_stmt -> {$while_stmt.st} | foreach_stmt -> {$foreach_stmt.st});
    public final WordyWalker.compound_stmt_return compound_stmt() throws RecognitionException {
        WordyWalker.compound_stmt_return retval = new WordyWalker.compound_stmt_return();
        retval.start = input.LT(1);

        WordyWalker.if_stmt_return if_stmt29 = null;

        WordyWalker.while_stmt_return while_stmt30 = null;

        WordyWalker.foreach_stmt_return foreach_stmt31 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:288:3: ( if_stmt -> {$if_stmt.st} | while_stmt -> {$while_stmt.st} | foreach_stmt -> {$foreach_stmt.st})
            int alt12=3;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt12=1;
                }
                break;
            case WHILE:
                {
                alt12=2;
                }
                break;
            case FOREACH:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:289:3: if_stmt
                    {
                    pushFollow(FOLLOW_if_stmt_in_compound_stmt1422);
                    if_stmt29=if_stmt();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 290:5: -> {$if_stmt.st}
                      {
                          retval.st = (if_stmt29!=null?if_stmt29.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:292:5: while_stmt
                    {
                    pushFollow(FOLLOW_while_stmt_in_compound_stmt1442);
                    while_stmt30=while_stmt();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 293:5: -> {$while_stmt.st}
                      {
                          retval.st = (while_stmt30!=null?while_stmt30.st:null);
                      }

                    }
                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:295:5: foreach_stmt
                    {
                    pushFollow(FOLLOW_foreach_stmt_in_compound_stmt1462);
                    foreach_stmt31=foreach_stmt();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 296:5: -> {$foreach_stmt.st}
                      {
                          retval.st = (foreach_stmt31!=null?foreach_stmt31.st:null);
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
        return retval;
    }
    // $ANTLR end "compound_stmt"

    public static class if_stmt_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "if_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:300:1: if_stmt : ^( IF ^( TEST test ) block[false] ) -> if(conclusion=$test.stcontainment=$block.stopNum=$function::numOps++);
    public final WordyWalker.if_stmt_return if_stmt() throws RecognitionException {
        WordyWalker.if_stmt_return retval = new WordyWalker.if_stmt_return();
        retval.start = input.LT(1);

        WordyWalker.test_return test32 = null;

        WordyWalker.block_return block33 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:301:3: ( ^( IF ^( TEST test ) block[false] ) -> if(conclusion=$test.stcontainment=$block.stopNum=$function::numOps++))
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:302:3: ^( IF ^( TEST test ) block[false] )
            {
            match(input,IF,FOLLOW_IF_in_if_stmt1497); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            match(input,TEST,FOLLOW_TEST_in_if_stmt1504); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_test_in_if_stmt1506);
            test32=test();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_if_stmt1513);
            block33=block(false);

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 307:5: -> if(conclusion=$test.stcontainment=$block.stopNum=$function::numOps++)
              {
                  retval.st = templateLib.getInstanceOf("if",
                new STAttrMap().put("conclusion", (test32!=null?test32.st:null)).put("containment", (block33!=null?block33.st:null)).put("opNum", ((function_scope)function_stack.peek()).numOps++));
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
        return retval;
    }
    // $ANTLR end "if_stmt"

    public static class while_stmt_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "while_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:311:1: while_stmt : ^( WHILE test block[false] ) -> while(condition=$test.stcontainment=$block.stopNum=$function::numOps++);
    public final WordyWalker.while_stmt_return while_stmt() throws RecognitionException {
        WordyWalker.while_stmt_return retval = new WordyWalker.while_stmt_return();
        retval.start = input.LT(1);

        WordyWalker.test_return test34 = null;

        WordyWalker.block_return block35 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:312:3: ( ^( WHILE test block[false] ) -> while(condition=$test.stcontainment=$block.stopNum=$function::numOps++))
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:313:3: ^( WHILE test block[false] )
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_stmt1564); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_test_in_while_stmt1566);
            test34=test();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_while_stmt1568);
            block35=block(false);

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 314:5: -> while(condition=$test.stcontainment=$block.stopNum=$function::numOps++)
              {
                  retval.st = templateLib.getInstanceOf("while",
                new STAttrMap().put("condition", (test34!=null?test34.st:null)).put("containment", (block35!=null?block35.st:null)).put("opNum", ((function_scope)function_stack.peek()).numOps++));
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
        return retval;
    }
    // $ANTLR end "while_stmt"

    public static class foreach_stmt_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "foreach_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:318:1: foreach_stmt : ^( FOREACH ^( PART type part= ID ) ^( WHOLE whole= ID ) block[false] ) -> {$function::locals.get($whole.text)!=null}? foreachVar(iterableNum=$function::currentFunction.getVariableLocalNumber($whole.text)iteratorNum=$function::currentFunction.getVariableLocalNumber($part.text)-1variable=$part.textvarNum=$function::currentFunction.getVariableLocalNumber($part.text)containment=$block.stopNum=$function::numOps++) -> foreachGlob(iterableName=$whole.textiteratorNum=$function::currentFunction.getVariableLocalNumber($part.text)-1variable=$part.textvarNum=$function::currentFunction.getVariableLocalNumber($part.text)containment=$block.stopNum=$function::numOps++);
    public final WordyWalker.foreach_stmt_return foreach_stmt() throws RecognitionException {
        WordyWalker.foreach_stmt_return retval = new WordyWalker.foreach_stmt_return();
        retval.start = input.LT(1);

        CommonTree part=null;
        CommonTree whole=null;
        WordyWalker.block_return block36 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:319:3: ( ^( FOREACH ^( PART type part= ID ) ^( WHOLE whole= ID ) block[false] ) -> {$function::locals.get($whole.text)!=null}? foreachVar(iterableNum=$function::currentFunction.getVariableLocalNumber($whole.text)iteratorNum=$function::currentFunction.getVariableLocalNumber($part.text)-1variable=$part.textvarNum=$function::currentFunction.getVariableLocalNumber($part.text)containment=$block.stopNum=$function::numOps++) -> foreachGlob(iterableName=$whole.textiteratorNum=$function::currentFunction.getVariableLocalNumber($part.text)-1variable=$part.textvarNum=$function::currentFunction.getVariableLocalNumber($part.text)containment=$block.stopNum=$function::numOps++))
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:320:3: ^( FOREACH ^( PART type part= ID ) ^( WHOLE whole= ID ) block[false] )
            {
            match(input,FOREACH,FOLLOW_FOREACH_in_foreach_stmt1620); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            match(input,PART,FOLLOW_PART_in_foreach_stmt1627); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_foreach_stmt1629);
            type();

            state._fsp--;
            if (state.failed) return retval;
            part=(CommonTree)match(input,ID,FOLLOW_ID_in_foreach_stmt1633); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                   ((function_scope)function_stack.peek()).locals.put((part!=null?part.getText():null) ,true);
                  
            }
            match(input,WHOLE,FOLLOW_WHOLE_in_foreach_stmt1652); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            whole=(CommonTree)match(input,ID,FOLLOW_ID_in_foreach_stmt1656); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_foreach_stmt1663);
            block36=block(false);

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 330:5: -> {$function::locals.get($whole.text)!=null}? foreachVar(iterableNum=$function::currentFunction.getVariableLocalNumber($whole.text)iteratorNum=$function::currentFunction.getVariableLocalNumber($part.text)-1variable=$part.textvarNum=$function::currentFunction.getVariableLocalNumber($part.text)containment=$block.stopNum=$function::numOps++)
              if (((function_scope)function_stack.peek()).locals.get((whole!=null?whole.getText():null))!=null) {
                  retval.st = templateLib.getInstanceOf("foreachVar",
                new STAttrMap().put("iterableNum", ((function_scope)function_stack.peek()).currentFunction.getVariableLocalNumber((whole!=null?whole.getText():null))).put("iteratorNum", ((function_scope)function_stack.peek()).currentFunction.getVariableLocalNumber((part!=null?part.getText():null))-1).put("variable", (part!=null?part.getText():null)).put("varNum", ((function_scope)function_stack.peek()).currentFunction.getVariableLocalNumber((part!=null?part.getText():null))).put("containment", (block36!=null?block36.st:null)).put("opNum", ((function_scope)function_stack.peek()).numOps++));
              }
              else // 332:5: -> foreachGlob(iterableName=$whole.textiteratorNum=$function::currentFunction.getVariableLocalNumber($part.text)-1variable=$part.textvarNum=$function::currentFunction.getVariableLocalNumber($part.text)containment=$block.stopNum=$function::numOps++)
              {
                  retval.st = templateLib.getInstanceOf("foreachGlob",
                new STAttrMap().put("iterableName", (whole!=null?whole.getText():null)).put("iteratorNum", ((function_scope)function_stack.peek()).currentFunction.getVariableLocalNumber((part!=null?part.getText():null))-1).put("variable", (part!=null?part.getText():null)).put("varNum", ((function_scope)function_stack.peek()).currentFunction.getVariableLocalNumber((part!=null?part.getText():null))).put("containment", (block36!=null?block36.st:null)).put("opNum", ((function_scope)function_stack.peek()).numOps++));
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
        return retval;
    }
    // $ANTLR end "foreach_stmt"

    public static class funcCall_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "funcCall"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:336:1: funcCall : ^( CALL ID (p+= param )* ) -> call(retType=functionsData.get($ID.text).getReturnType()funcName=$ID.textparams=$pparamTypes=functionsData.get($ID.text).getParameterTypes());
    public final WordyWalker.funcCall_return funcCall() throws RecognitionException {
        WordyWalker.funcCall_return retval = new WordyWalker.funcCall_return();
        retval.start = input.LT(1);

        CommonTree ID37=null;
        List list_p=null;
        RuleReturnScope p = null;
        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:337:3: ( ^( CALL ID (p+= param )* ) -> call(retType=functionsData.get($ID.text).getReturnType()funcName=$ID.textparams=$pparamTypes=functionsData.get($ID.text).getParameterTypes()))
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:338:3: ^( CALL ID (p+= param )* )
            {
            match(input,CALL,FOLLOW_CALL_in_funcCall1780); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID37=(CommonTree)match(input,ID,FOLLOW_ID_in_funcCall1782); if (state.failed) return retval;
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:340:5: (p+= param )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==PARAM) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:341:7: p+= param
            	    {
            	    pushFollow(FOLLOW_param_in_funcCall1798);
            	    p=param();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_p==null) list_p=new ArrayList();
            	    list_p.add(p.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 344:5: -> call(retType=functionsData.get($ID.text).getReturnType()funcName=$ID.textparams=$pparamTypes=functionsData.get($ID.text).getParameterTypes())
              {
                  retval.st = templateLib.getInstanceOf("call",
                new STAttrMap().put("retType", functionsData.get((ID37!=null?ID37.getText():null)).getReturnType()).put("funcName", (ID37!=null?ID37.getText():null)).put("params", list_p).put("paramTypes", functionsData.get((ID37!=null?ID37.getText():null)).getParameterTypes()));
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
        return retval;
    }
    // $ANTLR end "funcCall"

    public static class param_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "param"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:348:1: param : ^( PARAM expr ) -> {$expr.st};
    public final WordyWalker.param_return param() throws RecognitionException {
        WordyWalker.param_return retval = new WordyWalker.param_return();
        retval.start = input.LT(1);

        WordyWalker.expr_return expr38 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:349:3: ( ^( PARAM expr ) -> {$expr.st})
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:350:3: ^( PARAM expr )
            {
            match(input,PARAM,FOLLOW_PARAM_in_param1860); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_param1862);
            expr38=expr();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 351:5: -> {$expr.st}
              {
                  retval.st = (expr38!=null?expr38.st:null);
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
        return retval;
    }
    // $ANTLR end "param"

    public static class test_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "test"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:355:1: test : ( ^( NOT_CONTAINS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) -> not_contains(verifiable=$e1.stchecking=$e2.stopNum=$function::numOps) | ^( CONTAINS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) -> contains(verifiable=$e1.stchecking=$e2.stopNum=$function::numOps) | ^( NOT_EQUALS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) -> not_equals(verifiable=$e1.stchecking=$e2.stopNum=$function::numOps) | ^( EQUALS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) -> equals(verifiable=$e1.stchecking=$e2.stopNum=$function::numOps));
    public final WordyWalker.test_return test() throws RecognitionException {
        WordyWalker.test_return retval = new WordyWalker.test_return();
        retval.start = input.LT(1);

        WordyWalker.expr_return e1 = null;

        WordyWalker.expr_return e2 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:356:3: ( ^( NOT_CONTAINS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) -> not_contains(verifiable=$e1.stchecking=$e2.stopNum=$function::numOps) | ^( CONTAINS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) -> contains(verifiable=$e1.stchecking=$e2.stopNum=$function::numOps) | ^( NOT_EQUALS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) -> not_equals(verifiable=$e1.stchecking=$e2.stopNum=$function::numOps) | ^( EQUALS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) ) -> equals(verifiable=$e1.stchecking=$e2.stopNum=$function::numOps))
            int alt14=4;
            switch ( input.LA(1) ) {
            case NOT_CONTAINS:
                {
                alt14=1;
                }
                break;
            case CONTAINS:
                {
                alt14=2;
                }
                break;
            case NOT_EQUALS:
                {
                alt14=3;
                }
                break;
            case EQUALS:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:367:3: ^( NOT_CONTAINS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) )
                    {
                    match(input,NOT_CONTAINS,FOLLOW_NOT_CONTAINS_in_test1928); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,VERIFIABLE,FOLLOW_VERIFIABLE_in_test1935); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_test1939);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    match(input,CHECKING,FOLLOW_CHECKING_in_test1947); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_test1951);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                         ((function_scope)function_stack.peek()).numOps++;
                        
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 376:5: -> not_contains(verifiable=$e1.stchecking=$e2.stopNum=$function::numOps)
                      {
                          retval.st = templateLib.getInstanceOf("not_contains",
                        new STAttrMap().put("verifiable", (e1!=null?e1.st:null)).put("checking", (e2!=null?e2.st:null)).put("opNum", ((function_scope)function_stack.peek()).numOps));
                      }

                    }
                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:379:3: ^( CONTAINS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) )
                    {
                    match(input,CONTAINS,FOLLOW_CONTAINS_in_test2007); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,VERIFIABLE,FOLLOW_VERIFIABLE_in_test2014); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_test2018);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    match(input,CHECKING,FOLLOW_CHECKING_in_test2026); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_test2030);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                         ((function_scope)function_stack.peek()).numOps++;
                        
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 388:5: -> contains(verifiable=$e1.stchecking=$e2.stopNum=$function::numOps)
                      {
                          retval.st = templateLib.getInstanceOf("contains",
                        new STAttrMap().put("verifiable", (e1!=null?e1.st:null)).put("checking", (e2!=null?e2.st:null)).put("opNum", ((function_scope)function_stack.peek()).numOps));
                      }

                    }
                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:391:3: ^( NOT_EQUALS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) )
                    {
                    match(input,NOT_EQUALS,FOLLOW_NOT_EQUALS_in_test2086); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,VERIFIABLE,FOLLOW_VERIFIABLE_in_test2093); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_test2097);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    match(input,CHECKING,FOLLOW_CHECKING_in_test2105); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_test2109);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                         ((function_scope)function_stack.peek()).numOps++;
                        
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 400:5: -> not_equals(verifiable=$e1.stchecking=$e2.stopNum=$function::numOps)
                      {
                          retval.st = templateLib.getInstanceOf("not_equals",
                        new STAttrMap().put("verifiable", (e1!=null?e1.st:null)).put("checking", (e2!=null?e2.st:null)).put("opNum", ((function_scope)function_stack.peek()).numOps));
                      }

                    }
                    }
                    break;
                case 4 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:403:3: ^( EQUALS ^( VERIFIABLE e1= expr ) ^( CHECKING e2= expr ) )
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_test2165); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,VERIFIABLE,FOLLOW_VERIFIABLE_in_test2172); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_test2176);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    match(input,CHECKING,FOLLOW_CHECKING_in_test2184); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_test2188);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                         ((function_scope)function_stack.peek()).numOps++;
                        
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 412:5: -> equals(verifiable=$e1.stchecking=$e2.stopNum=$function::numOps)
                      {
                          retval.st = templateLib.getInstanceOf("equals",
                        new STAttrMap().put("verifiable", (e1!=null?e1.st:null)).put("checking", (e2!=null?e2.st:null)).put("opNum", ((function_scope)function_stack.peek()).numOps));
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
        return retval;
    }
    // $ANTLR end "test"

    public static class expr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:416:1: expr options {backtrack=true; } : ( atom -> {$atom.st} | ^( REMOVE ^( SUBJECT atom ) ^( POSITION INT ) ) -> removeAt(target=$atom.stposition=$INT.text) | ^( REMOVE ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) -> removeFrom(target=$t.stsubject=$s.st) | ^( ADD ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) -> add(target=$t.stsubject=$s.st) | ^( GET ^( SUBJECT atom ) ^( POSITION INT ) ) -> getAt(target=$atom.stposition=$INT.text));
    public final WordyWalker.expr_return expr() throws RecognitionException {
        WordyWalker.expr_return retval = new WordyWalker.expr_return();
        retval.start = input.LT(1);

        CommonTree INT41=null;
        CommonTree INT43=null;
        WordyWalker.atom_return s = null;

        WordyWalker.atom_return t = null;

        WordyWalker.atom_return atom39 = null;

        WordyWalker.atom_return atom40 = null;

        WordyWalker.atom_return atom42 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:420:3: ( atom -> {$atom.st} | ^( REMOVE ^( SUBJECT atom ) ^( POSITION INT ) ) -> removeAt(target=$atom.stposition=$INT.text) | ^( REMOVE ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) -> removeFrom(target=$t.stsubject=$s.st) | ^( ADD ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) -> add(target=$t.stsubject=$s.st) | ^( GET ^( SUBJECT atom ) ^( POSITION INT ) ) -> getAt(target=$atom.stposition=$INT.text))
            int alt15=5;
            switch ( input.LA(1) ) {
            case CALL:
            case STRING:
            case ID:
                {
                alt15=1;
                }
                break;
            case REMOVE:
                {
                int LA15_4 = input.LA(2);

                if ( (synpred2_WordyWalker()) ) {
                    alt15=2;
                }
                else if ( (synpred3_WordyWalker()) ) {
                    alt15=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 4, input);

                    throw nvae;
                }
                }
                break;
            case ADD:
                {
                alt15=4;
                }
                break;
            case GET:
                {
                alt15=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:421:3: atom
                    {
                    pushFollow(FOLLOW_atom_in_expr2258);
                    atom39=atom();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 422:5: -> {$atom.st}
                      {
                          retval.st = (atom39!=null?atom39.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:425:3: ^( REMOVE ^( SUBJECT atom ) ^( POSITION INT ) )
                    {
                    match(input,REMOVE,FOLLOW_REMOVE_in_expr2286); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,SUBJECT,FOLLOW_SUBJECT_in_expr2293); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_atom_in_expr2295);
                    atom40=atom();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    match(input,POSITION,FOLLOW_POSITION_in_expr2303); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    INT41=(CommonTree)match(input,INT,FOLLOW_INT_in_expr2305); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                         ((function_scope)function_stack.peek()).numOps++;
                        
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 434:5: -> removeAt(target=$atom.stposition=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("removeAt",
                        new STAttrMap().put("target", (atom40!=null?atom40.st:null)).put("position", (INT41!=null?INT41.getText():null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:437:3: ^( REMOVE ^( SUBJECT s= atom ) ^( TARGET t= atom ) )
                    {
                    match(input,REMOVE,FOLLOW_REMOVE_in_expr2356); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,SUBJECT,FOLLOW_SUBJECT_in_expr2363); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_atom_in_expr2367);
                    s=atom();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    match(input,TARGET,FOLLOW_TARGET_in_expr2375); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_atom_in_expr2379);
                    t=atom();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                         ((function_scope)function_stack.peek()).numOps++;
                        
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 446:5: -> removeFrom(target=$t.stsubject=$s.st)
                      {
                          retval.st = templateLib.getInstanceOf("removeFrom",
                        new STAttrMap().put("target", (t!=null?t.st:null)).put("subject", (s!=null?s.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:449:3: ^( ADD ^( SUBJECT s= atom ) ^( TARGET t= atom ) )
                    {
                    match(input,ADD,FOLLOW_ADD_in_expr2430); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,SUBJECT,FOLLOW_SUBJECT_in_expr2437); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_atom_in_expr2441);
                    s=atom();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    match(input,TARGET,FOLLOW_TARGET_in_expr2449); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_atom_in_expr2453);
                    t=atom();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                         ((function_scope)function_stack.peek()).numOps++;
                        
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 458:5: -> add(target=$t.stsubject=$s.st)
                      {
                          retval.st = templateLib.getInstanceOf("add",
                        new STAttrMap().put("target", (t!=null?t.st:null)).put("subject", (s!=null?s.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:461:3: ^( GET ^( SUBJECT atom ) ^( POSITION INT ) )
                    {
                    match(input,GET,FOLLOW_GET_in_expr2504); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,SUBJECT,FOLLOW_SUBJECT_in_expr2511); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_atom_in_expr2513);
                    atom42=atom();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    match(input,POSITION,FOLLOW_POSITION_in_expr2521); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    INT43=(CommonTree)match(input,INT,FOLLOW_INT_in_expr2523); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                         ((function_scope)function_stack.peek()).numOps++;
                        
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 470:5: -> getAt(target=$atom.stposition=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("getAt",
                        new STAttrMap().put("target", (atom42!=null?atom42.st:null)).put("position", (INT43!=null?INT43.getText():null)));
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
        return retval;
    }
    // $ANTLR end "expr"

    public static class atom_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "atom"
    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:474:1: atom : ( ID -> {$function::locals.get($ID.text)!=null}? varRef(id=$ID.textvarNum=$function::currentFunction.getVariableLocalNumber($ID.text)) -> globRef(id=$ID.texttypeWholePath=globalsData.getGlobalTypeByName($ID.text)) | STRING -> string(value=$STRING.text) | funcCall -> {$funcCall.st});
    public final WordyWalker.atom_return atom() throws RecognitionException {
        WordyWalker.atom_return retval = new WordyWalker.atom_return();
        retval.start = input.LT(1);

        CommonTree ID44=null;
        CommonTree STRING45=null;
        WordyWalker.funcCall_return funcCall46 = null;


        try {
            // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:475:3: ( ID -> {$function::locals.get($ID.text)!=null}? varRef(id=$ID.textvarNum=$function::currentFunction.getVariableLocalNumber($ID.text)) -> globRef(id=$ID.texttypeWholePath=globalsData.getGlobalTypeByName($ID.text)) | STRING -> string(value=$STRING.text) | funcCall -> {$funcCall.st})
            int alt16=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt16=1;
                }
                break;
            case STRING:
                {
                alt16=2;
                }
                break;
            case CALL:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:476:3: ID
                    {
                    ID44=(CommonTree)match(input,ID,FOLLOW_ID_in_atom2575); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 477:5: -> {$function::locals.get($ID.text)!=null}? varRef(id=$ID.textvarNum=$function::currentFunction.getVariableLocalNumber($ID.text))
                      if (((function_scope)function_stack.peek()).locals.get((ID44!=null?ID44.getText():null))!=null) {
                          retval.st = templateLib.getInstanceOf("varRef",
                        new STAttrMap().put("id", (ID44!=null?ID44.getText():null)).put("varNum", ((function_scope)function_stack.peek()).currentFunction.getVariableLocalNumber((ID44!=null?ID44.getText():null))));
                      }
                      else // 479:5: -> globRef(id=$ID.texttypeWholePath=globalsData.getGlobalTypeByName($ID.text))
                      {
                          retval.st = templateLib.getInstanceOf("globRef",
                        new STAttrMap().put("id", (ID44!=null?ID44.getText():null)).put("typeWholePath", globalsData.getGlobalTypeByName((ID44!=null?ID44.getText():null))));
                      }

                    }
                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:481:5: STRING
                    {
                    STRING45=(CommonTree)match(input,STRING,FOLLOW_STRING_in_atom2631); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 482:5: -> string(value=$STRING.text)
                      {
                          retval.st = templateLib.getInstanceOf("string",
                        new STAttrMap().put("value", (STRING45!=null?STRING45.getText():null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:484:5: funcCall
                    {
                    pushFollow(FOLLOW_funcCall_in_atom2656);
                    funcCall46=funcCall();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 485:5: -> {$funcCall.st}
                      {
                          retval.st = (funcCall46!=null?funcCall46.st:null);
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
        return retval;
    }
    // $ANTLR end "atom"

    // $ANTLR start synpred2_WordyWalker
    public final void synpred2_WordyWalker_fragment() throws RecognitionException {   
        // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:425:3: ( ^( REMOVE ^( SUBJECT atom ) ^( POSITION INT ) ) )
        // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:425:3: ^( REMOVE ^( SUBJECT atom ) ^( POSITION INT ) )
        {
        match(input,REMOVE,FOLLOW_REMOVE_in_synpred2_WordyWalker2286); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SUBJECT,FOLLOW_SUBJECT_in_synpred2_WordyWalker2293); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_atom_in_synpred2_WordyWalker2295);
        atom();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        match(input,POSITION,FOLLOW_POSITION_in_synpred2_WordyWalker2303); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,INT,FOLLOW_INT_in_synpred2_WordyWalker2305); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_WordyWalker

    // $ANTLR start synpred3_WordyWalker
    public final void synpred3_WordyWalker_fragment() throws RecognitionException {   
        WordyWalker.atom_return s = null;

        WordyWalker.atom_return t = null;


        // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:437:3: ( ^( REMOVE ^( SUBJECT s= atom ) ^( TARGET t= atom ) ) )
        // /home/malagan/Programming/workspace/Wordy/src/WordyWalker.g:437:3: ^( REMOVE ^( SUBJECT s= atom ) ^( TARGET t= atom ) )
        {
        match(input,REMOVE,FOLLOW_REMOVE_in_synpred3_WordyWalker2356); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,SUBJECT,FOLLOW_SUBJECT_in_synpred3_WordyWalker2363); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_atom_in_synpred3_WordyWalker2367);
        s=atom();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;
        match(input,TARGET,FOLLOW_TARGET_in_synpred3_WordyWalker2375); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_atom_in_synpred3_WordyWalker2379);
        t=atom();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_WordyWalker

    // Delegated rules

    public final boolean synpred3_WordyWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_WordyWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_WordyWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_WordyWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_declaration_in_program91 = new BitSet(new long[]{0x00000000000001C2L});
    public static final BitSet FOLLOW_variable_in_declaration151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variable198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_variable200 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_declarator_in_variable202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_declarator279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_in_function327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regularFunction_in_function342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_regularFunction394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_regularFunction396 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_regularFunction398 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_formalParameter_in_regularFunction431 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_block_in_regularFunction468 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAM_in_formalParameter534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_formalParameter536 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_formalParameter538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAIN_in_main586 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_main603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_type641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_type674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockContainment_in_block763 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_blockContainment806 = new BitSet(new long[]{0x000000B2003CB900L});
    public static final BitSet FOLLOW_stmt_in_blockContainment837 = new BitSet(new long[]{0x000000B2003CB900L});
    public static final BitSet FOLLOW_returnStat_in_blockContainment859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_stmt_in_stmt890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_stmt_in_stmt910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_simple_stmt939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_simple_stmt959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printOp_in_simple_stmt979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStat1010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_returnable_in_returnStat1012 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_returnStat1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_returnable1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_printOp1121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_printOp1123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_assignStat1185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignStat1187 = new BitSet(new long[]{0x00000086001C0800L});
    public static final BitSet FOLLOW_assignable_in_assignStat1189 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_assignable1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_assignable1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_list1329 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_list1345 = new BitSet(new long[]{0x0000000200000008L});
    public static final BitSet FOLLOW_if_stmt_in_compound_stmt1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_compound_stmt1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_stmt_in_compound_stmt1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt1497 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TEST_in_if_stmt1504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_test_in_if_stmt1506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_if_stmt1513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_test_in_while_stmt1566 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_block_in_while_stmt1568 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOREACH_in_foreach_stmt1620 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PART_in_foreach_stmt1627 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_foreach_stmt1629 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_foreach_stmt1633 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHOLE_in_foreach_stmt1652 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_foreach_stmt1656 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_foreach_stmt1663 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_funcCall1780 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_funcCall1782 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_param_in_funcCall1798 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_PARAM_in_param1860 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_param1862 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_CONTAINS_in_test1928 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VERIFIABLE_in_test1935 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test1939 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHECKING_in_test1947 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test1951 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTAINS_in_test2007 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VERIFIABLE_in_test2014 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test2018 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHECKING_in_test2026 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test2030 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUALS_in_test2086 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VERIFIABLE_in_test2093 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test2097 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHECKING_in_test2105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test2109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_test2165 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VERIFIABLE_in_test2172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test2176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHECKING_in_test2184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_test2188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_expr2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_in_expr2286 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_expr2293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr2295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITION_in_expr2303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_expr2305 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REMOVE_in_expr2356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_expr2363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr2367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TARGET_in_expr2375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr2379 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_in_expr2430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_expr2437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr2441 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TARGET_in_expr2449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr2453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GET_in_expr2504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_expr2511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expr2513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITION_in_expr2521 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_expr2523 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_atom2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCall_in_atom2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REMOVE_in_synpred2_WordyWalker2286 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_synpred2_WordyWalker2293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_synpred2_WordyWalker2295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITION_in_synpred2_WordyWalker2303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_synpred2_WordyWalker2305 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REMOVE_in_synpred3_WordyWalker2356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_synpred3_WordyWalker2363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_synpred3_WordyWalker2367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TARGET_in_synpred3_WordyWalker2375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_synpred3_WordyWalker2379 = new BitSet(new long[]{0x0000000000000008L});

}