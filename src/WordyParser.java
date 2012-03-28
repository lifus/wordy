// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/malagan/Programming/workspace/Wordy/src/Wordy.g 2011-05-22 20:08:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class WordyParser extends Parser {
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


        public WordyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public WordyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return WordyParser.tokenNames; }
    public String getGrammarFileName() { return "/home/malagan/Programming/workspace/Wordy/src/Wordy.g"; }


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


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:88:1: program : ( declaration )* ;
    public final WordyParser.program_return program() throws RecognitionException {
        WordyParser.program_return retval = new WordyParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        WordyParser.declaration_return declaration1 = null;



        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:89:3: ( ( declaration )* )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:90:3: ( declaration )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:90:3: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NEWLINE||(LA1_0>=55 && LA1_0<=57)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:90:4: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program287);
            	    declaration1=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:93:1: declaration : ( variables[true] | function | NEWLINE );
    public final WordyParser.declaration_return declaration() throws RecognitionException {
        WordyParser.declaration_return retval = new WordyParser.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEWLINE4=null;
        WordyParser.variables_return variables2 = null;

        WordyParser.function_return function3 = null;


        CommonTree NEWLINE4_tree=null;

        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:94:3: ( variables[true] | function | NEWLINE )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==NEWLINE||LA2_5==53) ) {
                        alt2=1;
                    }
                    else if ( (LA2_5==LPAREN) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 57:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==ID) ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==NEWLINE||LA2_5==53) ) {
                        alt2=1;
                    }
                    else if ( (LA2_5==LPAREN) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 55:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==ID) ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==NEWLINE||LA2_5==53) ) {
                        alt2=1;
                    }
                    else if ( (LA2_5==LPAREN) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_3==54) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case NEWLINE:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:95:3: variables[true]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variables_in_declaration304);
                    variables2=variables(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variables2.getTree());

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:96:5: function
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_in_declaration311);
                    function3=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function3.getTree());

                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:97:5: NEWLINE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_declaration317); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class variables_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variables"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:100:1: variables[boolean global] : type a= declarator ( ',' b= declarator )* ln= NEWLINE -> ( ^( VAR[$ln, \"VAR\"] type declarator ) )+ ;
    public final WordyParser.variables_return variables(boolean global) throws RecognitionException {
        WordyParser.variables_return retval = new WordyParser.variables_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ln=null;
        Token char_literal6=null;
        WordyParser.declarator_return a = null;

        WordyParser.declarator_return b = null;

        WordyParser.type_return type5 = null;


        CommonTree ln_tree=null;
        CommonTree char_literal6_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:101:3: ( type a= declarator ( ',' b= declarator )* ln= NEWLINE -> ( ^( VAR[$ln, \"VAR\"] type declarator ) )+ )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:102:3: type a= declarator ( ',' b= declarator )* ln= NEWLINE
            {
            pushFollow(FOLLOW_type_in_variables334);
            type5=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type5.getTree());
            pushFollow(FOLLOW_declarator_in_variables338);
            a=declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(a.getTree());
            if ( state.backtracking==0 ) {

                                  if (!global) {
                                                                                                                                                                                                                      	functions.getCurrentFunction().addVariable(
                                                                                                                                                                                                                      			new Variable((a!=null?a.text:null), (type5!=null?type5.idType:null), (a!=null?a.line:0)));
                                                                                                                                                                                                                      			((function_scope)function_stack.peek()).locals.add((type5!=null?type5.idType:null), (a!=null?a.text:null));
                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                      	globals.add((type5!=null?type5.idType:null), (a!=null?a.text:null));
                                                                                                                                                                                                                      }
                                 
            }
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:112:3: ( ',' b= declarator )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==53) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:112:4: ',' b= declarator
            	    {
            	    char_literal6=(Token)match(input,53,FOLLOW_53_in_variables365); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_53.add(char_literal6);

            	    pushFollow(FOLLOW_declarator_in_variables369);
            	    b=declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declarator.add(b.getTree());
            	    if ( state.backtracking==0 ) {

            	                          if (!global) {
            	                                                                                                                                                                                                              	functions.getCurrentFunction().addVariable(
            	                                                                                                                                                                                                              			new Variable((b!=null?b.text:null), (type5!=null?type5.idType:null), (b!=null?b.line:0)));
            	                                                                                                                                                                                                              			((function_scope)function_stack.peek()).locals.add((type5!=null?type5.idType:null), (b!=null?b.text:null));
            	                                                                                                                                                                                                              } else {
            	                                                                                                                                                                                                              	globals.add((type5!=null?type5.idType:null), (b!=null?b.text:null));
            	                                                                                                                                                                                                              }
            	                         
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            ln=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_variables397); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(ln);



            // AST REWRITE
            // elements: type, declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 122:5: -> ( ^( VAR[$ln, \"VAR\"] type declarator ) )+
            {
                if ( !(stream_type.hasNext()||stream_declarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_type.hasNext()||stream_declarator.hasNext() ) {
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:123:7: ^( VAR[$ln, \"VAR\"] type declarator )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, ln, "VAR"), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_declarator.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_declarator.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variables"

    public static class declarator_return extends ParserRuleReturnScope {
        public String text;
        public int line;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarator"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:126:1: declarator returns [String text, int line] : ID ;
    public final WordyParser.declarator_return declarator() throws RecognitionException {
        WordyParser.declarator_return retval = new WordyParser.declarator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID7=null;

        CommonTree ID7_tree=null;

        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:127:3: ( ID )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:128:3: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            ID7=(Token)match(input,ID,FOLLOW_ID_in_declarator438); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID7_tree = (CommonTree)adaptor.create(ID7);
            adaptor.addChild(root_0, ID7_tree);
            }
            if ( state.backtracking==0 ) {

                   retval.text = (ID7!=null?ID7.getText():null);
                   retval.line = (ID7!=null?ID7.getLine():0);
                  
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarator"

    protected static class function_scope {
        Locals locals;
    }
    protected Stack function_stack = new Stack();

    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:138:1: function : ( main | regularFunction );
    public final WordyParser.function_return function() throws RecognitionException {
        function_stack.push(new function_scope());
        WordyParser.function_return retval = new WordyParser.function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        WordyParser.main_return main8 = null;

        WordyParser.regularFunction_return regularFunction9 = null;




        ((function_scope)function_stack.peek()).locals = new Locals();

        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:145:3: ( main | regularFunction )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==55) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==54) ) {
                    alt4=1;
                }
                else if ( (LA4_1==ID) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=56 && LA4_0<=57)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:146:3: main
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_main_in_function472);
                    main8=main();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, main8.getTree());

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:147:5: regularFunction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_regularFunction_in_function478);
                    regularFunction9=regularFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, regularFunction9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            function_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class main_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "main"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:150:1: main : emptyType 'main' a= LPAREN RPAREN block -> ^( MAIN[$a, \"MAIN\"] block ) ;
    public final WordyParser.main_return main() throws RecognitionException {
        WordyParser.main_return retval = new WordyParser.main_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token a=null;
        Token string_literal11=null;
        Token RPAREN12=null;
        WordyParser.emptyType_return emptyType10 = null;

        WordyParser.block_return block13 = null;


        CommonTree a_tree=null;
        CommonTree string_literal11_tree=null;
        CommonTree RPAREN12_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_emptyType=new RewriteRuleSubtreeStream(adaptor,"rule emptyType");
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:151:3: ( emptyType 'main' a= LPAREN RPAREN block -> ^( MAIN[$a, \"MAIN\"] block ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:152:3: emptyType 'main' a= LPAREN RPAREN block
            {
            pushFollow(FOLLOW_emptyType_in_main493);
            emptyType10=emptyType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_emptyType.add(emptyType10.getTree());
            string_literal11=(Token)match(input,54,FOLLOW_54_in_main495); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(string_literal11);

            a=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_main499); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(a);

            RPAREN12=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_main501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN12);

            if ( state.backtracking==0 ) {

                                                 functions.add(new Function((emptyType10!=null?emptyType10.idType:null), "main", (a!=null?a.getLine():0)));
                                                
            }
            pushFollow(FOLLOW_block_in_main542);
            block13=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block13.getTree());


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 157:5: -> ^( MAIN[$a, \"MAIN\"] block )
            {
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:158:7: ^( MAIN[$a, \"MAIN\"] block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAIN, a, "MAIN"), root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "main"

    protected static class regularFunction_scope {
        ArrayList<String> parameterTypes;
    }
    protected Stack regularFunction_stack = new Stack();

    public static class regularFunction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "regularFunction"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:161:1: regularFunction : type ID LPAREN (a= formalParameter ( ',' b= formalParameter )* )? RPAREN block -> ^( FUNC type ID ( formalParameter )* block ) ;
    public final WordyParser.regularFunction_return regularFunction() throws RecognitionException {
        regularFunction_stack.push(new regularFunction_scope());
        WordyParser.regularFunction_return retval = new WordyParser.regularFunction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID15=null;
        Token LPAREN16=null;
        Token char_literal17=null;
        Token RPAREN18=null;
        WordyParser.formalParameter_return a = null;

        WordyParser.formalParameter_return b = null;

        WordyParser.type_return type14 = null;

        WordyParser.block_return block19 = null;


        CommonTree ID15_tree=null;
        CommonTree LPAREN16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree RPAREN18_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_formalParameter=new RewriteRuleSubtreeStream(adaptor,"rule formalParameter");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

        ((regularFunction_scope)regularFunction_stack.peek()).parameterTypes = new ArrayList<String>();

        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:168:3: ( type ID LPAREN (a= formalParameter ( ',' b= formalParameter )* )? RPAREN block -> ^( FUNC type ID ( formalParameter )* block ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:169:3: type ID LPAREN (a= formalParameter ( ',' b= formalParameter )* )? RPAREN block
            {
            pushFollow(FOLLOW_type_in_regularFunction585);
            type14=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type14.getTree());
            ID15=(Token)match(input,ID,FOLLOW_ID_in_regularFunction587); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID15);

            if ( state.backtracking==0 ) {

                        functions.add(new Function((type14!=null?type14.idType:null), (ID15!=null?ID15.getText():null), (ID15!=null?ID15.getLine():0)));
                       
            }
            LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_regularFunction603); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN16);

            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:173:10: (a= formalParameter ( ',' b= formalParameter )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=56 && LA6_0<=57)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:173:11: a= formalParameter ( ',' b= formalParameter )*
                    {
                    pushFollow(FOLLOW_formalParameter_in_regularFunction608);
                    a=formalParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameter.add(a.getTree());
                    if ( state.backtracking==0 ) {

                                                  ((regularFunction_scope)regularFunction_stack.peek()).parameterTypes.add((a!=null?a.idType:null));
                                                                                                                                                                                                                                                                                              functions.getCurrentFunction().addVariable(new Variable((a!=null?a.text:null), (a!=null?a.idType:null), (a!=null?a.line:null)));
                                                                                                                                                                                                                                                                                              ((function_scope)function_stack.peek()).locals.add((type14!=null?type14.idType:null), (a!=null?a.text:null));
                                                 
                    }
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:179:5: ( ',' b= formalParameter )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==53) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:179:6: ',' b= formalParameter
                    	    {
                    	    char_literal17=(Token)match(input,53,FOLLOW_53_in_regularFunction645); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_53.add(char_literal17);

                    	    pushFollow(FOLLOW_formalParameter_in_regularFunction649);
                    	    b=formalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_formalParameter.add(b.getTree());
                    	    if ( state.backtracking==0 ) {

                    	                                 ((regularFunction_scope)regularFunction_stack.peek()).parameterTypes.add((b!=null?b.idType:null));
                    	                                                                                                                                                                                                                              functions.getCurrentFunction().addVariable(new Variable((b!=null?b.text:null), (b!=null?b.idType:null), (b!=null?b.line:null)));
                    	                                                                                                                                                                                                                              ((function_scope)function_stack.peek()).locals.add((type14!=null?type14.idType:null), (b!=null?b.text:null));
                    	                                
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN18=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_regularFunction684); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN18);

            if ( state.backtracking==0 ) {

                                                     functions.getCurrentFunction().setParameterTypes(((regularFunction_scope)regularFunction_stack.peek()).parameterTypes);
                                                    
            }
            pushFollow(FOLLOW_block_in_regularFunction729);
            block19=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block19.getTree());


            // AST REWRITE
            // elements: block, ID, type, formalParameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 189:5: -> ^( FUNC type ID ( formalParameter )* block )
            {
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:190:7: ^( FUNC type ID ( formalParameter )* block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC, "FUNC"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:190:22: ( formalParameter )*
                while ( stream_formalParameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameter.nextTree());

                }
                stream_formalParameter.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            regularFunction_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "regularFunction"

    public static class formalParameter_return extends ParserRuleReturnScope {
        public String idType;
        public String text;
        public Integer line;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameter"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:193:1: formalParameter returns [String idType, String text, Integer line] : meaningfullType ID -> ^( PARAM meaningfullType ID ) ;
    public final WordyParser.formalParameter_return formalParameter() throws RecognitionException {
        WordyParser.formalParameter_return retval = new WordyParser.formalParameter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID21=null;
        WordyParser.meaningfullType_return meaningfullType20 = null;


        CommonTree ID21_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_meaningfullType=new RewriteRuleSubtreeStream(adaptor,"rule meaningfullType");
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:194:3: ( meaningfullType ID -> ^( PARAM meaningfullType ID ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:195:3: meaningfullType ID
            {
            pushFollow(FOLLOW_meaningfullType_in_formalParameter773);
            meaningfullType20=meaningfullType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_meaningfullType.add(meaningfullType20.getTree());
            ID21=(Token)match(input,ID,FOLLOW_ID_in_formalParameter775); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID21);

            if ( state.backtracking==0 ) {

                                   retval.idType = (meaningfullType20!=null?meaningfullType20.idType:null);
                                   retval.text = (ID21!=null?ID21.getText():null);
                                   retval.line = (ID21!=null?ID21.getLine():0);
                                  
            }


            // AST REWRITE
            // elements: meaningfullType, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 201:5: -> ^( PARAM meaningfullType ID )
            {
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:202:7: ^( PARAM meaningfullType ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);

                adaptor.addChild(root_1, stream_meaningfullType.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameter"

    public static class type_return extends ParserRuleReturnScope {
        public String idType;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:208:1: type returns [String idType] : buildInType ;
    public final WordyParser.type_return type() throws RecognitionException {
        WordyParser.type_return retval = new WordyParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        WordyParser.buildInType_return buildInType22 = null;



        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:209:3: ( buildInType )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:210:3: buildInType
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_buildInType_in_type840);
            buildInType22=buildInType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, buildInType22.getTree());
            if ( state.backtracking==0 ) {

                            retval.idType = (buildInType22!=null?buildInType22.idType:null);
                           
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class buildInType_return extends ParserRuleReturnScope {
        public String idType;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "buildInType"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:216:1: buildInType returns [String idType] : ( meaningfullType | emptyType );
    public final WordyParser.buildInType_return buildInType() throws RecognitionException {
        WordyParser.buildInType_return retval = new WordyParser.buildInType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        WordyParser.meaningfullType_return meaningfullType23 = null;

        WordyParser.emptyType_return emptyType24 = null;



        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:217:3: ( meaningfullType | emptyType )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=56 && LA7_0<=57)) ) {
                alt7=1;
            }
            else if ( (LA7_0==55) ) {
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
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:218:3: meaningfullType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_meaningfullType_in_buildInType875);
                    meaningfullType23=meaningfullType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, meaningfullType23.getTree());
                    if ( state.backtracking==0 ) {

                                        retval.idType = (meaningfullType23!=null?meaningfullType23.idType:null);
                                       
                    }

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:222:5: emptyType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_emptyType_in_buildInType901);
                    emptyType24=emptyType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emptyType24.getTree());
                    if ( state.backtracking==0 ) {

                                    retval.idType = (emptyType24!=null?emptyType24.idType:null);
                                   
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "buildInType"

    public static class emptyType_return extends ParserRuleReturnScope {
        public String idType;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "emptyType"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:228:1: emptyType returns [String idType] : 'Void' -> VOID ;
    public final WordyParser.emptyType_return emptyType() throws RecognitionException {
        WordyParser.emptyType_return retval = new WordyParser.emptyType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal25=null;

        CommonTree string_literal25_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");

        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:229:3: ( 'Void' -> VOID )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:230:3: 'Void'
            {
            string_literal25=(Token)match(input,55,FOLLOW_55_in_emptyType936); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(string_literal25);

            if ( state.backtracking==0 ) {

                       retval.idType = "V";
                      
            }


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 234:5: -> VOID
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(VOID, "VOID"));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "emptyType"

    public static class meaningfullType_return extends ParserRuleReturnScope {
        public String idType;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "meaningfullType"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:237:1: meaningfullType returns [String idType] : ( compoundType | atomicType );
    public final WordyParser.meaningfullType_return meaningfullType() throws RecognitionException {
        WordyParser.meaningfullType_return retval = new WordyParser.meaningfullType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        WordyParser.compoundType_return compoundType26 = null;

        WordyParser.atomicType_return atomicType27 = null;



        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:238:3: ( compoundType | atomicType )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==56) ) {
                alt8=1;
            }
            else if ( (LA8_0==57) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:239:3: compoundType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_compoundType_in_meaningfullType974);
                    compoundType26=compoundType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compoundType26.getTree());
                    if ( state.backtracking==0 ) {

                                     retval.idType = (compoundType26!=null?compoundType26.idType:null);
                                    
                    }

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:243:5: atomicType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atomicType_in_meaningfullType997);
                    atomicType27=atomicType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicType27.getTree());
                    if ( state.backtracking==0 ) {

                                     retval.idType = (atomicType27!=null?atomicType27.idType:null);
                                    
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "meaningfullType"

    public static class compoundType_return extends ParserRuleReturnScope {
        public String idType;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compoundType"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:249:1: compoundType returns [String idType] : 'List' -> LIST ;
    public final WordyParser.compoundType_return compoundType() throws RecognitionException {
        WordyParser.compoundType_return retval = new WordyParser.compoundType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal28=null;

        CommonTree string_literal28_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");

        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:250:3: ( 'List' -> LIST )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:251:3: 'List'
            {
            string_literal28=(Token)match(input,56,FOLLOW_56_in_compoundType1033); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_56.add(string_literal28);

            if ( state.backtracking==0 ) {

                       retval.idType = "Ljava/util/ArrayList;";
                      
            }


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 255:5: -> LIST
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(LIST, "LIST"));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compoundType"

    public static class atomicType_return extends ParserRuleReturnScope {
        public String idType;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomicType"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:258:1: atomicType returns [String idType] : 'String' -> STRING ;
    public final WordyParser.atomicType_return atomicType() throws RecognitionException {
        WordyParser.atomicType_return retval = new WordyParser.atomicType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal29=null;

        CommonTree string_literal29_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");

        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:259:3: ( 'String' -> STRING )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:260:3: 'String'
            {
            string_literal29=(Token)match(input,57,FOLLOW_57_in_atomicType1071); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(string_literal29);

            if ( state.backtracking==0 ) {

                         retval.idType = "Ljava/lang/String;";
                        
            }


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 264:5: -> STRING
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING, "STRING"));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atomicType"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:268:1: block : NEWLINE lc= INDENT blockContainment ( DEDENT | ) -> ^( BLOCK[$lc, \"BLOCK\"] blockContainment ) ;
    public final WordyParser.block_return block() throws RecognitionException {
        WordyParser.block_return retval = new WordyParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lc=null;
        Token NEWLINE30=null;
        Token DEDENT32=null;
        WordyParser.blockContainment_return blockContainment31 = null;


        CommonTree lc_tree=null;
        CommonTree NEWLINE30_tree=null;
        CommonTree DEDENT32_tree=null;
        RewriteRuleTokenStream stream_DEDENT=new RewriteRuleTokenStream(adaptor,"token DEDENT");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_INDENT=new RewriteRuleTokenStream(adaptor,"token INDENT");
        RewriteRuleSubtreeStream stream_blockContainment=new RewriteRuleSubtreeStream(adaptor,"rule blockContainment");
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:269:3: ( NEWLINE lc= INDENT blockContainment ( DEDENT | ) -> ^( BLOCK[$lc, \"BLOCK\"] blockContainment ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:270:3: NEWLINE lc= INDENT blockContainment ( DEDENT | )
            {
            NEWLINE30=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block1108); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE30);

            lc=(Token)match(input,INDENT,FOLLOW_INDENT_in_block1112); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDENT.add(lc);

            pushFollow(FOLLOW_blockContainment_in_block1114);
            blockContainment31=blockContainment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockContainment.add(blockContainment31.getTree());
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:271:3: ( DEDENT | )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DEDENT) ) {
                alt9=1;
            }
            else if ( (LA9_0==EOF||LA9_0==STRING||(LA9_0>=NEWLINE && LA9_0<=ID)||(LA9_0>=55 && LA9_0<=57)||(LA9_0>=59 && LA9_0<=63)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:272:5: DEDENT
                    {
                    DEDENT32=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_block1124); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEDENT.add(DEDENT32);


                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:274:3: 
                    {
                    }
                    break;

            }



            // AST REWRITE
            // elements: blockContainment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 275:5: -> ^( BLOCK[$lc, \"BLOCK\"] blockContainment )
            {
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:276:7: ^( BLOCK[$lc, \"BLOCK\"] blockContainment )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, lc, "BLOCK"), root_1);

                adaptor.addChild(root_1, stream_blockContainment.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class blockContainment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockContainment"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:279:1: blockContainment : ( variables[false] | stmt | NEWLINE )+ ( returnStat )? ( NEWLINE | ) ;
    public final WordyParser.blockContainment_return blockContainment() throws RecognitionException {
        WordyParser.blockContainment_return retval = new WordyParser.blockContainment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEWLINE35=null;
        Token NEWLINE37=null;
        WordyParser.variables_return variables33 = null;

        WordyParser.stmt_return stmt34 = null;

        WordyParser.returnStat_return returnStat36 = null;


        CommonTree NEWLINE35_tree=null;
        CommonTree NEWLINE37_tree=null;

        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:280:3: ( ( variables[false] | stmt | NEWLINE )+ ( returnStat )? ( NEWLINE | ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:281:3: ( variables[false] | stmt | NEWLINE )+ ( returnStat )? ( NEWLINE | )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:281:3: ( variables[false] | stmt | NEWLINE )+
            int cnt10=0;
            loop10:
            do {
                int alt10=4;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:282:5: variables[false]
            	    {
            	    pushFollow(FOLLOW_variables_in_blockContainment1174);
            	    variables33=variables(false);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variables33.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:283:7: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_blockContainment1183);
            	    stmt34=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt34.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:284:7: NEWLINE
            	    {
            	    NEWLINE35=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_blockContainment1191); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:286:3: ( returnStat )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==59) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:286:3: returnStat
                    {
                    pushFollow(FOLLOW_returnStat_in_blockContainment1201);
                    returnStat36=returnStat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStat36.getTree());

                    }
                    break;

            }

            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:286:15: ( NEWLINE | )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NEWLINE) ) {
                alt12=1;
            }
            else if ( (LA12_0==EOF||LA12_0==DEDENT||LA12_0==STRING||LA12_0==ID||(LA12_0>=55 && LA12_0<=57)||(LA12_0>=59 && LA12_0<=63)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:286:16: NEWLINE
                    {
                    NEWLINE37=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_blockContainment1205); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:286:25: 
                    {
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "blockContainment"

    public static class stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmt"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:289:1: stmt : ( simple_stmt ( NEWLINE | ) | compound_stmt ( NEWLINE | ) );
    public final WordyParser.stmt_return stmt() throws RecognitionException {
        WordyParser.stmt_return retval = new WordyParser.stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEWLINE39=null;
        Token NEWLINE41=null;
        WordyParser.simple_stmt_return simple_stmt38 = null;

        WordyParser.compound_stmt_return compound_stmt40 = null;


        CommonTree NEWLINE39_tree=null;
        CommonTree NEWLINE41_tree=null;

        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:290:3: ( simple_stmt ( NEWLINE | ) | compound_stmt ( NEWLINE | ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==STRING||LA15_0==ID||LA15_0==60) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=61 && LA15_0<=63)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:291:3: simple_stmt ( NEWLINE | )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_simple_stmt_in_stmt1223);
                    simple_stmt38=simple_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_stmt38.getTree());
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:292:3: ( NEWLINE | )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NEWLINE) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==EOF||LA13_0==DEDENT||LA13_0==STRING||LA13_0==ID||(LA13_0>=55 && LA13_0<=57)||(LA13_0>=59 && LA13_0<=63)) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:293:5: NEWLINE
                            {
                            NEWLINE39=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt1233); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:295:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:296:5: compound_stmt ( NEWLINE | )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_compound_stmt_in_stmt1250);
                    compound_stmt40=compound_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_stmt40.getTree());
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:297:3: ( NEWLINE | )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==NEWLINE) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==EOF||LA14_0==DEDENT||LA14_0==STRING||LA14_0==ID||(LA14_0>=55 && LA14_0<=57)||(LA14_0>=59 && LA14_0<=63)) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:298:5: NEWLINE
                            {
                            NEWLINE41=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stmt1260); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:300:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stmt"

    public static class simple_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:303:1: simple_stmt : ( expr | assignStat | printOp );
    public final WordyParser.simple_stmt_return simple_stmt() throws RecognitionException {
        WordyParser.simple_stmt_return retval = new WordyParser.simple_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        WordyParser.expr_return expr42 = null;

        WordyParser.assignStat_return assignStat43 = null;

        WordyParser.printOp_return printOp44 = null;



        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:304:3: ( expr | assignStat | printOp )
            int alt16=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==EOF||LA16_1==DEDENT||LA16_1==STRING||(LA16_1>=NEWLINE && LA16_1<=LPAREN)||(LA16_1>=55 && LA16_1<=57)||(LA16_1>=59 && LA16_1<=63)||LA16_1==69||LA16_1==71||LA16_1==73) ) {
                    alt16=1;
                }
                else if ( (LA16_1==58) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case STRING:
                {
                alt16=1;
                }
                break;
            case 60:
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
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:305:3: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_simple_stmt1286);
                    expr42=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr42.getTree());

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:306:5: assignStat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignStat_in_simple_stmt1292);
                    assignStat43=assignStat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignStat43.getTree());

                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:307:5: printOp
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_printOp_in_simple_stmt1298);
                    printOp44=printOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, printOp44.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simple_stmt"

    public static class assignStat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignStat"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:310:1: assignStat : ID '=' assignable[$ID.text] -> ^( ASSIGN ID assignable ) ;
    public final WordyParser.assignStat_return assignStat() throws RecognitionException {
        WordyParser.assignStat_return retval = new WordyParser.assignStat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID45=null;
        Token char_literal46=null;
        WordyParser.assignable_return assignable47 = null;


        CommonTree ID45_tree=null;
        CommonTree char_literal46_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_assignable=new RewriteRuleSubtreeStream(adaptor,"rule assignable");
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:311:3: ( ID '=' assignable[$ID.text] -> ^( ASSIGN ID assignable ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:312:3: ID '=' assignable[$ID.text]
            {
            ID45=(Token)match(input,ID,FOLLOW_ID_in_assignStat1313); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID45);

            if ( state.backtracking==0 ) {

                   if (((function_scope)function_stack.peek()).locals.getLocalsTypeByName((ID45!=null?ID45.getText():null)) != null) {
                                                                                                          functions.getCurrentFunction().addVarCalled((ID45!=null?ID45.getText():null));
                                                                                                        }
                                                                                                        functions.getCurrentFunction().addOperation();
                  
            }
            char_literal46=(Token)match(input,58,FOLLOW_58_in_assignStat1324); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_58.add(char_literal46);

            pushFollow(FOLLOW_assignable_in_assignStat1326);
            assignable47=assignable((ID45!=null?ID45.getText():null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignable.add(assignable47.getTree());


            // AST REWRITE
            // elements: ID, assignable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 320:5: -> ^( ASSIGN ID assignable )
            {
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:321:7: ^( ASSIGN ID assignable )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_assignable.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignStat"

    public static class returnStat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnStat"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:324:1: returnStat : ( 'return' -> RETURN ) ( returnable -> ^( RETURN returnable ) )? ;
    public final WordyParser.returnStat_return returnStat() throws RecognitionException {
        WordyParser.returnStat_return retval = new WordyParser.returnStat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal48=null;
        WordyParser.returnable_return returnable49 = null;


        CommonTree string_literal48_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleSubtreeStream stream_returnable=new RewriteRuleSubtreeStream(adaptor,"rule returnable");
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:325:3: ( ( 'return' -> RETURN ) ( returnable -> ^( RETURN returnable ) )? )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:326:3: ( 'return' -> RETURN ) ( returnable -> ^( RETURN returnable ) )?
            {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:326:3: ( 'return' -> RETURN )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:326:4: 'return'
            {
            string_literal48=(Token)match(input,59,FOLLOW_59_in_returnStat1363); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(string_literal48);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 327:7: -> RETURN
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(RETURN, "RETURN"));

            }

            retval.tree = root_0;}
            }

            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:327:18: ( returnable -> ^( RETURN returnable ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:327:19: returnable
                    {
                    pushFollow(FOLLOW_returnable_in_returnStat1377);
                    returnable49=returnable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_returnable.add(returnable49.getTree());
                    if ( state.backtracking==0 ) {

                                        functions.getCurrentFunction().addOperation();
                                       
                    }


                    // AST REWRITE
                    // elements: returnable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 330:7: -> ^( RETURN returnable )
                    {
                        // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:331:9: ^( RETURN returnable )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                        adaptor.addChild(root_1, stream_returnable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "returnStat"

    public static class returnable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnable"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:334:1: returnable : expr ;
    public final WordyParser.returnable_return returnable() throws RecognitionException {
        WordyParser.returnable_return retval = new WordyParser.returnable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        WordyParser.expr_return expr50 = null;



        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:335:3: ( expr )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:336:3: expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_returnable1419);
            expr50=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr50.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "returnable"

    public static class printOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "printOp"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:339:1: printOp : 'print' ID -> ^( PRINT ID ) ;
    public final WordyParser.printOp_return printOp() throws RecognitionException {
        WordyParser.printOp_return retval = new WordyParser.printOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal51=null;
        Token ID52=null;

        CommonTree string_literal51_tree=null;
        CommonTree ID52_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");

        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:340:3: ( 'print' ID -> ^( PRINT ID ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:341:3: 'print' ID
            {
            string_literal51=(Token)match(input,60,FOLLOW_60_in_printOp1434); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_60.add(string_literal51);

            ID52=(Token)match(input,ID,FOLLOW_ID_in_printOp1436); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID52);

            if ( state.backtracking==0 ) {

                           if (((function_scope)function_stack.peek()).locals.getLocalsTypeByName((ID52!=null?ID52.getText():null)) != null) {
                                                                                                                                                                                                                  functions.getCurrentFunction().addVarCalled((ID52!=null?ID52.getText():null));
                                                                                                                                                                                                                }
                                                     functions.getCurrentFunction().addOperation();
                          
            }


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 348:5: -> ^( PRINT ID )
            {
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:349:7: ^( PRINT ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRINT, "PRINT"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "printOp"

    public static class compound_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compound_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:352:1: compound_stmt : ( if_stmt | while_stmt | foreach_stmt );
    public final WordyParser.compound_stmt_return compound_stmt() throws RecognitionException {
        WordyParser.compound_stmt_return retval = new WordyParser.compound_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        WordyParser.if_stmt_return if_stmt53 = null;

        WordyParser.while_stmt_return while_stmt54 = null;

        WordyParser.foreach_stmt_return foreach_stmt55 = null;



        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:353:3: ( if_stmt | while_stmt | foreach_stmt )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt18=1;
                }
                break;
            case 62:
                {
                alt18=2;
                }
                break;
            case 63:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:354:3: if_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_stmt_in_compound_stmt1483);
                    if_stmt53=if_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_stmt53.getTree());

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:355:5: while_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_stmt_in_compound_stmt1489);
                    while_stmt54=while_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_stmt54.getTree());

                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:356:5: foreach_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_foreach_stmt_in_compound_stmt1495);
                    foreach_stmt55=foreach_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, foreach_stmt55.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compound_stmt"

    public static class if_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:359:1: if_stmt : 'if' test block -> ^( IF ^( TEST test ) block ) ;
    public final WordyParser.if_stmt_return if_stmt() throws RecognitionException {
        WordyParser.if_stmt_return retval = new WordyParser.if_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal56=null;
        WordyParser.test_return test57 = null;

        WordyParser.block_return block58 = null;


        CommonTree string_literal56_tree=null;
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_test=new RewriteRuleSubtreeStream(adaptor,"rule test");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:360:3: ( 'if' test block -> ^( IF ^( TEST test ) block ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:361:3: 'if' test block
            {
            string_literal56=(Token)match(input,61,FOLLOW_61_in_if_stmt1510); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(string_literal56);

            pushFollow(FOLLOW_test_in_if_stmt1512);
            test57=test();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_test.add(test57.getTree());
            pushFollow(FOLLOW_block_in_if_stmt1514);
            block58=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block58.getTree());
            if ( state.backtracking==0 ) {

                                functions.getCurrentFunction().addOperation();
                               
            }


            // AST REWRITE
            // elements: test, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 365:5: -> ^( IF ^( TEST test ) block )
            {
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:366:7: ^( IF ^( TEST test ) block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:368:9: ^( TEST test )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TEST, "TEST"), root_2);

                adaptor.addChild(root_2, stream_test.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_stmt"

    public static class while_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:373:1: while_stmt : 'while' test block -> ^( WHILE test block ) ;
    public final WordyParser.while_stmt_return while_stmt() throws RecognitionException {
        WordyParser.while_stmt_return retval = new WordyParser.while_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal59=null;
        WordyParser.test_return test60 = null;

        WordyParser.block_return block61 = null;


        CommonTree string_literal59_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_test=new RewriteRuleSubtreeStream(adaptor,"rule test");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:374:3: ( 'while' test block -> ^( WHILE test block ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:375:3: 'while' test block
            {
            string_literal59=(Token)match(input,62,FOLLOW_62_in_while_stmt1606); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_62.add(string_literal59);

            pushFollow(FOLLOW_test_in_while_stmt1608);
            test60=test();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_test.add(test60.getTree());
            pushFollow(FOLLOW_block_in_while_stmt1610);
            block61=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block61.getTree());
            if ( state.backtracking==0 ) {

                                   functions.getCurrentFunction().addOperation();
                                  
            }


            // AST REWRITE
            // elements: test, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 379:5: -> ^( WHILE test block )
            {
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:380:7: ^( WHILE test block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);

                adaptor.addChild(root_1, stream_test.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_stmt"

    public static class foreach_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "foreach_stmt"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:383:1: foreach_stmt : 'foreach' atomicType p= ID 'in' w= ID block -> ^( FOREACH ^( PART atomicType $p) ^( WHOLE $w) block ) ;
    public final WordyParser.foreach_stmt_return foreach_stmt() throws RecognitionException {
        WordyParser.foreach_stmt_return retval = new WordyParser.foreach_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token p=null;
        Token w=null;
        Token string_literal62=null;
        Token string_literal64=null;
        WordyParser.atomicType_return atomicType63 = null;

        WordyParser.block_return block65 = null;


        CommonTree p_tree=null;
        CommonTree w_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree string_literal64_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_atomicType=new RewriteRuleSubtreeStream(adaptor,"rule atomicType");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:384:3: ( 'foreach' atomicType p= ID 'in' w= ID block -> ^( FOREACH ^( PART atomicType $p) ^( WHOLE $w) block ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:385:3: 'foreach' atomicType p= ID 'in' w= ID block
            {
            string_literal62=(Token)match(input,63,FOLLOW_63_in_foreach_stmt1668); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_63.add(string_literal62);

            pushFollow(FOLLOW_atomicType_in_foreach_stmt1670);
            atomicType63=atomicType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atomicType.add(atomicType63.getTree());
            p=(Token)match(input,ID,FOLLOW_ID_in_foreach_stmt1674); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(p);

            string_literal64=(Token)match(input,64,FOLLOW_64_in_foreach_stmt1676); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_64.add(string_literal64);

            w=(Token)match(input,ID,FOLLOW_ID_in_foreach_stmt1680); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(w);

            pushFollow(FOLLOW_block_in_foreach_stmt1682);
            block65=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block65.getTree());
            if ( state.backtracking==0 ) {

                                                          ((function_scope)function_stack.peek()).locals.add((atomicType63!=null?atomicType63.idType:null), (p!=null?p.getText():null));
                                                                                                                                                                                                                                                                                                                                                                              functions.getCurrentFunction().addVarCalled(); // for iterator
                                                                                                                                                                                                                                                                                                                                                                              functions.getCurrentFunction().addVariable(new Variable((p!=null?p.getText():null), (atomicType63!=null?atomicType63.idType:null), (p!=null?p.getLine():0)));
                                                                                                                                                                                                                                                                                                                                                                              functions.getCurrentFunction().addVarCalled((p!=null?p.getText():null));
                                                                                                                                                                                                                                                                                                                                                                              functions.getCurrentFunction().addOperation();
                                                                                                                                                                                                                                                                                                                                                                              functions.getCurrentFunction().addOperation();
                                                         
            }


            // AST REWRITE
            // elements: w, p, atomicType, block
            // token labels: w, p
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
            RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 394:5: -> ^( FOREACH ^( PART atomicType $p) ^( WHOLE $w) block )
            {
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:395:7: ^( FOREACH ^( PART atomicType $p) ^( WHOLE $w) block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOREACH, "FOREACH"), root_1);

                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:397:9: ^( PART atomicType $p)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PART, "PART"), root_2);

                adaptor.addChild(root_2, stream_atomicType.nextTree());
                adaptor.addChild(root_2, stream_p.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:398:9: ^( WHOLE $w)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHOLE, "WHOLE"), root_2);

                adaptor.addChild(root_2, stream_w.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "foreach_stmt"

    public static class funcCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcCall"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:403:1: funcCall : ID LPAREN ( param ( ',' param )* )? RPAREN -> ^( CALL ID ( param )* ) ;
    public final WordyParser.funcCall_return funcCall() throws RecognitionException {
        WordyParser.funcCall_return retval = new WordyParser.funcCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID66=null;
        Token LPAREN67=null;
        Token char_literal69=null;
        Token RPAREN71=null;
        WordyParser.param_return param68 = null;

        WordyParser.param_return param70 = null;


        CommonTree ID66_tree=null;
        CommonTree LPAREN67_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree RPAREN71_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:404:3: ( ID LPAREN ( param ( ',' param )* )? RPAREN -> ^( CALL ID ( param )* ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:405:3: ID LPAREN ( param ( ',' param )* )? RPAREN
            {
            ID66=(Token)match(input,ID,FOLLOW_ID_in_funcCall1818); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID66);

            LPAREN67=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcCall1820); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN67);

            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:405:13: ( param ( ',' param )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==STRING||LA20_0==ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:405:14: param ( ',' param )*
                    {
                    pushFollow(FOLLOW_param_in_funcCall1823);
                    param68=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param68.getTree());
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:405:20: ( ',' param )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==53) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:405:21: ',' param
                    	    {
                    	    char_literal69=(Token)match(input,53,FOLLOW_53_in_funcCall1826); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_53.add(char_literal69);

                    	    pushFollow(FOLLOW_param_in_funcCall1828);
                    	    param70=param();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_param.add(param70.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN71=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcCall1834); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN71);

            if ( state.backtracking==0 ) {

                                                       functions.getCurrentFunction().addOperation();
                                                      
            }


            // AST REWRITE
            // elements: param, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 409:5: -> ^( CALL ID ( param )* )
            {
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:410:7: ^( CALL ID ( param )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:410:17: ( param )*
                while ( stream_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_param.nextTree());

                }
                stream_param.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funcCall"

    public static class param_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:413:1: param : expr -> ^( PARAM expr ) ;
    public final WordyParser.param_return param() throws RecognitionException {
        WordyParser.param_return retval = new WordyParser.param_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        WordyParser.expr_return expr72 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:414:3: ( expr -> ^( PARAM expr ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:415:3: expr
            {
            pushFollow(FOLLOW_expr_in_param1913);
            expr72=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr72.getTree());


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 416:5: -> ^( PARAM expr )
            {
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:417:7: ^( PARAM expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "param"

    public static class test_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "test"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:420:1: test : ex1= expr check_operation ex2= expr -> ^( check_operation ^( VERIFIABLE $ex1) ^( CHECKING $ex2) ) ;
    public final WordyParser.test_return test() throws RecognitionException {
        WordyParser.test_return retval = new WordyParser.test_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        WordyParser.expr_return ex1 = null;

        WordyParser.expr_return ex2 = null;

        WordyParser.check_operation_return check_operation73 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_check_operation=new RewriteRuleSubtreeStream(adaptor,"rule check_operation");
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:421:3: (ex1= expr check_operation ex2= expr -> ^( check_operation ^( VERIFIABLE $ex1) ^( CHECKING $ex2) ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:436:3: ex1= expr check_operation ex2= expr
            {
            pushFollow(FOLLOW_expr_in_test1990);
            ex1=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(ex1.getTree());
            pushFollow(FOLLOW_check_operation_in_test1992);
            check_operation73=check_operation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_check_operation.add(check_operation73.getTree());
            pushFollow(FOLLOW_expr_in_test1996);
            ex2=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(ex2.getTree());
            if ( state.backtracking==0 ) {

                                                  functions.getCurrentFunction().addOperation();
                                                 
            }


            // AST REWRITE
            // elements: ex1, check_operation, ex2
            // token labels: 
            // rule labels: retval, ex2, ex1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"rule ex2",ex2!=null?ex2.tree:null);
            RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"rule ex1",ex1!=null?ex1.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 440:5: -> ^( check_operation ^( VERIFIABLE $ex1) ^( CHECKING $ex2) )
            {
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:441:7: ^( check_operation ^( VERIFIABLE $ex1) ^( CHECKING $ex2) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_check_operation.nextNode(), root_1);

                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:443:9: ^( VERIFIABLE $ex1)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VERIFIABLE, "VERIFIABLE"), root_2);

                adaptor.addChild(root_2, stream_ex1.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:444:9: ^( CHECKING $ex2)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHECKING, "CHECKING"), root_2);

                adaptor.addChild(root_2, stream_ex2.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "test"

    public static class check_operation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "check_operation"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:448:1: check_operation : (lc= 'is' 'not' 'contains' -> NOT_CONTAINS[$lc, \"NOT_CONTAINS\"] | lc= 'is' 'not' 'equals' -> NOT_EQUALS[$lc, \"NOT_EQUALS\"] | lc= 'is' 'contains' -> CONTAINS[$lc, \"CONTAINS\"] | lc= 'is' 'equals' -> EQUALS[$lc, \"NOT_EQUALS\"] );
    public final WordyParser.check_operation_return check_operation() throws RecognitionException {
        WordyParser.check_operation_return retval = new WordyParser.check_operation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lc=null;
        Token string_literal74=null;
        Token string_literal75=null;
        Token string_literal76=null;
        Token string_literal77=null;
        Token string_literal78=null;
        Token string_literal79=null;

        CommonTree lc_tree=null;
        CommonTree string_literal74_tree=null;
        CommonTree string_literal75_tree=null;
        CommonTree string_literal76_tree=null;
        CommonTree string_literal77_tree=null;
        CommonTree string_literal78_tree=null;
        CommonTree string_literal79_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");

        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:449:3: (lc= 'is' 'not' 'contains' -> NOT_CONTAINS[$lc, \"NOT_CONTAINS\"] | lc= 'is' 'not' 'equals' -> NOT_EQUALS[$lc, \"NOT_EQUALS\"] | lc= 'is' 'contains' -> CONTAINS[$lc, \"CONTAINS\"] | lc= 'is' 'equals' -> EQUALS[$lc, \"NOT_EQUALS\"] )
            int alt21=4;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==65) ) {
                switch ( input.LA(2) ) {
                case 66:
                    {
                    int LA21_2 = input.LA(3);

                    if ( (LA21_2==67) ) {
                        alt21=1;
                    }
                    else if ( (LA21_2==68) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 67:
                    {
                    alt21=3;
                    }
                    break;
                case 68:
                    {
                    alt21=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:450:3: lc= 'is' 'not' 'contains'
                    {
                    lc=(Token)match(input,65,FOLLOW_65_in_check_operation2114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_65.add(lc);

                    string_literal74=(Token)match(input,66,FOLLOW_66_in_check_operation2116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(string_literal74);

                    string_literal75=(Token)match(input,67,FOLLOW_67_in_check_operation2118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 451:5: -> NOT_CONTAINS[$lc, \"NOT_CONTAINS\"]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NOT_CONTAINS, lc, "NOT_CONTAINS"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:452:5: lc= 'is' 'not' 'equals'
                    {
                    lc=(Token)match(input,65,FOLLOW_65_in_check_operation2135); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_65.add(lc);

                    string_literal76=(Token)match(input,66,FOLLOW_66_in_check_operation2137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(string_literal76);

                    string_literal77=(Token)match(input,68,FOLLOW_68_in_check_operation2139); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal77);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 453:5: -> NOT_EQUALS[$lc, \"NOT_EQUALS\"]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NOT_EQUALS, lc, "NOT_EQUALS"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:454:5: lc= 'is' 'contains'
                    {
                    lc=(Token)match(input,65,FOLLOW_65_in_check_operation2156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_65.add(lc);

                    string_literal78=(Token)match(input,67,FOLLOW_67_in_check_operation2158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal78);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 455:5: -> CONTAINS[$lc, \"CONTAINS\"]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CONTAINS, lc, "CONTAINS"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:456:5: lc= 'is' 'equals'
                    {
                    lc=(Token)match(input,65,FOLLOW_65_in_check_operation2175); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_65.add(lc);

                    string_literal79=(Token)match(input,68,FOLLOW_68_in_check_operation2177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal79);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 457:5: -> EQUALS[$lc, \"NOT_EQUALS\"]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EQUALS, lc, "NOT_EQUALS"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "check_operation"

    public static class assignable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignable"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:460:1: assignable[String assigned] : ( list[assigned] | expr );
    public final WordyParser.assignable_return assignable(String assigned) throws RecognitionException {
        WordyParser.assignable_return retval = new WordyParser.assignable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        WordyParser.list_return list80 = null;

        WordyParser.expr_return expr81 = null;



        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:461:3: ( list[assigned] | expr )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LCURLY) ) {
                alt22=1;
            }
            else if ( (LA22_0==STRING||LA22_0==ID) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:462:3: list[assigned]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_in_assignable2202);
                    list80=list(assigned);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list80.getTree());

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:463:5: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_assignable2209);
                    expr81=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr81.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignable"

    public static class list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:466:1: list[String assigned] : LCURLY ( STRING ( ',' STRING )* )? RCURLY -> ^( LIST ( STRING )* ) ;
    public final WordyParser.list_return list(String assigned) throws RecognitionException {
        WordyParser.list_return retval = new WordyParser.list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCURLY82=null;
        Token STRING83=null;
        Token char_literal84=null;
        Token STRING85=null;
        Token RCURLY86=null;

        CommonTree LCURLY82_tree=null;
        CommonTree STRING83_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree STRING85_tree=null;
        CommonTree RCURLY86_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");

        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:467:3: ( LCURLY ( STRING ( ',' STRING )* )? RCURLY -> ^( LIST ( STRING )* ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:468:3: LCURLY ( STRING ( ',' STRING )* )? RCURLY
            {
            LCURLY82=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_list2225); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY82);

            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:468:10: ( STRING ( ',' STRING )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:468:11: STRING ( ',' STRING )*
                    {
                    STRING83=(Token)match(input,STRING,FOLLOW_STRING_in_list2228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING83);

                    if ( state.backtracking==0 ) {

                                       functions.getCurrentFunction().addOperation();
                                      
                    }
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:472:5: ( ',' STRING )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==53) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:472:6: ',' STRING
                    	    {
                    	    char_literal84=(Token)match(input,53,FOLLOW_53_in_list2254); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_53.add(char_literal84);

                    	    STRING85=(Token)match(input,STRING,FOLLOW_STRING_in_list2256); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_STRING.add(STRING85);

                    	    if ( state.backtracking==0 ) {

                    	                      functions.getCurrentFunction().addOperation();
                    	                     
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            RCURLY86=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_list2280); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY86);

            if ( state.backtracking==0 ) {

                                          if (((function_scope)function_stack.peek()).locals.getLocalsTypeByName(assigned) != null) {
                                                                                                                                                                                                                                                functions.getCurrentFunction().addVarCalled(assigned); // for list
                                                                                                                                                                                                                                              }
                                         
            }


            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 481:5: -> ^( LIST ( STRING )* )
            {
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:482:7: ^( LIST ( STRING )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, "LIST"), root_1);

                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:482:14: ( STRING )*
                while ( stream_STRING.hasNext() ) {
                    adaptor.addChild(root_1, stream_STRING.nextNode());

                }
                stream_STRING.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:485:1: expr : ( atom -> atom ) ( expr_operation expr_qualification -> ^( expr_operation ^( SUBJECT $expr) expr_qualification ) )* ;
    public final WordyParser.expr_return expr() throws RecognitionException {
        WordyParser.expr_return retval = new WordyParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        WordyParser.atom_return atom87 = null;

        WordyParser.expr_operation_return expr_operation88 = null;

        WordyParser.expr_qualification_return expr_qualification89 = null;


        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_expr_qualification=new RewriteRuleSubtreeStream(adaptor,"rule expr_qualification");
        RewriteRuleSubtreeStream stream_expr_operation=new RewriteRuleSubtreeStream(adaptor,"rule expr_operation");
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:486:3: ( ( atom -> atom ) ( expr_operation expr_qualification -> ^( expr_operation ^( SUBJECT $expr) expr_qualification ) )* )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:487:3: ( atom -> atom ) ( expr_operation expr_qualification -> ^( expr_operation ^( SUBJECT $expr) expr_qualification ) )*
            {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:487:3: ( atom -> atom )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:487:4: atom
            {
            pushFollow(FOLLOW_atom_in_expr2345);
            atom87=atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom.add(atom87.getTree());


            // AST REWRITE
            // elements: atom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 488:7: -> atom
            {
                adaptor.addChild(root_0, stream_atom.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:488:16: ( expr_operation expr_qualification -> ^( expr_operation ^( SUBJECT $expr) expr_qualification ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==69||LA25_0==71||LA25_0==73) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:488:17: expr_operation expr_qualification
            	    {
            	    pushFollow(FOLLOW_expr_operation_in_expr2359);
            	    expr_operation88=expr_operation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr_operation.add(expr_operation88.getTree());
            	    pushFollow(FOLLOW_expr_qualification_in_expr2361);
            	    expr_qualification89=expr_qualification();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr_qualification.add(expr_qualification89.getTree());


            	    // AST REWRITE
            	    // elements: expr_qualification, expr_operation, expr
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 489:7: -> ^( expr_operation ^( SUBJECT $expr) expr_qualification )
            	    {
            	        // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:490:9: ^( expr_operation ^( SUBJECT $expr) expr_qualification )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot(stream_expr_operation.nextNode(), root_1);

            	        // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:492:11: ^( SUBJECT $expr)
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUBJECT, "SUBJECT"), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        adaptor.addChild(root_1, stream_expr_qualification.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class expr_operation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_operation"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:497:1: expr_operation : (inf= 'remove' 'at' -> REMOVE[$inf, \"REMOVE\"] | inf= 'add' 'to' -> ADD[$inf, \"ADD\"] | inf= 'get' 'at' -> GET[$inf, \"GET\"] );
    public final WordyParser.expr_operation_return expr_operation() throws RecognitionException {
        WordyParser.expr_operation_return retval = new WordyParser.expr_operation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token inf=null;
        Token string_literal90=null;
        Token string_literal91=null;
        Token string_literal92=null;

        CommonTree inf_tree=null;
        CommonTree string_literal90_tree=null;
        CommonTree string_literal91_tree=null;
        CommonTree string_literal92_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");

        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:498:3: (inf= 'remove' 'at' -> REMOVE[$inf, \"REMOVE\"] | inf= 'add' 'to' -> ADD[$inf, \"ADD\"] | inf= 'get' 'at' -> GET[$inf, \"GET\"] )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt26=1;
                }
                break;
            case 71:
                {
                alt26=2;
                }
                break;
            case 73:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:499:3: inf= 'remove' 'at'
                    {
                    inf=(Token)match(input,69,FOLLOW_69_in_expr_operation2450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(inf);

                    string_literal90=(Token)match(input,70,FOLLOW_70_in_expr_operation2452); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(string_literal90);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 500:5: -> REMOVE[$inf, \"REMOVE\"]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(REMOVE, inf, "REMOVE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:501:5: inf= 'add' 'to'
                    {
                    inf=(Token)match(input,71,FOLLOW_71_in_expr_operation2469); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_71.add(inf);

                    string_literal91=(Token)match(input,72,FOLLOW_72_in_expr_operation2471); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_72.add(string_literal91);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 502:5: -> ADD[$inf, \"ADD\"]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ADD, inf, "ADD"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:503:5: inf= 'get' 'at'
                    {
                    inf=(Token)match(input,73,FOLLOW_73_in_expr_operation2488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_73.add(inf);

                    string_literal92=(Token)match(input,70,FOLLOW_70_in_expr_operation2490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(string_literal92);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 504:5: -> GET[$inf, \"GET\"]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(GET, inf, "GET"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_operation"

    public static class expr_qualification_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_qualification"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:507:1: expr_qualification : ( 'position' INT -> ^( POSITION INT ) | atom -> ^( TARGET atom ) );
    public final WordyParser.expr_qualification_return expr_qualification() throws RecognitionException {
        WordyParser.expr_qualification_return retval = new WordyParser.expr_qualification_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal93=null;
        Token INT94=null;
        WordyParser.atom_return atom95 = null;


        CommonTree string_literal93_tree=null;
        CommonTree INT94_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:508:3: ( 'position' INT -> ^( POSITION INT ) | atom -> ^( TARGET atom ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==74) ) {
                alt27=1;
            }
            else if ( (LA27_0==STRING||LA27_0==ID) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:509:3: 'position' INT
                    {
                    string_literal93=(Token)match(input,74,FOLLOW_74_in_expr_qualification2514); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(string_literal93);

                    INT94=(Token)match(input,INT,FOLLOW_INT_in_expr_qualification2516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT94);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 510:5: -> ^( POSITION INT )
                    {
                        // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:511:7: ^( POSITION INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POSITION, "POSITION"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:512:5: atom
                    {
                    pushFollow(FOLLOW_atom_in_expr_qualification2540);
                    atom95=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(atom95.getTree());


                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 513:5: -> ^( TARGET atom )
                    {
                        // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:514:7: ^( TARGET atom )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TARGET, "TARGET"), root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_qualification"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:517:1: atom options {backtrack=true; } : ( ID | STRING | funcCall );
    public final WordyParser.atom_return atom() throws RecognitionException {
        WordyParser.atom_return retval = new WordyParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID96=null;
        Token STRING97=null;
        WordyParser.funcCall_return funcCall98 = null;


        CommonTree ID96_tree=null;
        CommonTree STRING97_tree=null;

        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:521:3: ( ID | STRING | funcCall )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==LPAREN) ) {
                    alt28=3;
                }
                else if ( (LA28_1==EOF||LA28_1==DEDENT||LA28_1==STRING||(LA28_1>=NEWLINE && LA28_1<=ID)||LA28_1==RPAREN||LA28_1==53||(LA28_1>=55 && LA28_1<=57)||(LA28_1>=59 && LA28_1<=63)||LA28_1==65||LA28_1==69||LA28_1==71||LA28_1==73) ) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA28_0==STRING) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:522:3: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ID96=(Token)match(input,ID,FOLLOW_ID_in_atom2586); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID96_tree = (CommonTree)adaptor.create(ID96);
                    adaptor.addChild(root_0, ID96_tree);
                    }
                    if ( state.backtracking==0 ) {

                           if (((function_scope)function_stack.peek()).locals.getLocalsTypeByName((ID96!=null?ID96.getText():null)) != null) {
                                                                          	functions.getCurrentFunction().addVarCalled((ID96!=null?ID96.getText():null));
                                                                          }
                          
                    }

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:528:5: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING97=(Token)match(input,STRING,FOLLOW_STRING_in_atom2599); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING97_tree = (CommonTree)adaptor.create(STRING97);
                    adaptor.addChild(root_0, STRING97_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:529:5: funcCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_funcCall_in_atom2605);
                    funcCall98=funcCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcCall98.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\14\uffff";
    static final String DFA10_eofS =
        "\1\1\13\uffff";
    static final String DFA10_minS =
        "\1\5\13\uffff";
    static final String DFA10_maxS =
        "\1\77\13\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\4\1\3\3\1\6\2";
    static final String DFA10_specialS =
        "\14\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\33\uffff\1\7\4\uffff\1\2\1\6\17\uffff\1\5\1\3\1\4\1\uffff"+
            "\1\1\1\10\1\11\1\12\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()+ loopback of 281:3: ( variables[false] | stmt | NEWLINE )+";
        }
    }
 

    public static final BitSet FOLLOW_declaration_in_program287 = new BitSet(new long[]{0x0380004000000002L});
    public static final BitSet FOLLOW_variables_in_declaration304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_declaration317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variables334 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_declarator_in_variables338 = new BitSet(new long[]{0x0020004000000000L});
    public static final BitSet FOLLOW_53_in_variables365 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_declarator_in_variables369 = new BitSet(new long[]{0x0020004000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_variables397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarator438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_in_function472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regularFunction_in_function478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyType_in_main493 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_main495 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_main499 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RPAREN_in_main501 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_block_in_main542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_regularFunction585 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_regularFunction587 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_regularFunction603 = new BitSet(new long[]{0x0300020000000000L});
    public static final BitSet FOLLOW_formalParameter_in_regularFunction608 = new BitSet(new long[]{0x0020020000000000L});
    public static final BitSet FOLLOW_53_in_regularFunction645 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_formalParameter_in_regularFunction649 = new BitSet(new long[]{0x0020020000000000L});
    public static final BitSet FOLLOW_RPAREN_in_regularFunction684 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_block_in_regularFunction729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meaningfullType_in_formalParameter773 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_formalParameter775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_buildInType_in_type840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meaningfullType_in_buildInType875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyType_in_buildInType901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_emptyType936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_meaningfullType974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_meaningfullType997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_compoundType1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_atomicType1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_block1108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INDENT_in_block1112 = new BitSet(new long[]{0xF38000C200000000L});
    public static final BitSet FOLLOW_blockContainment_in_block1114 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_DEDENT_in_block1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variables_in_blockContainment1174 = new BitSet(new long[]{0xFB8000C200000002L});
    public static final BitSet FOLLOW_stmt_in_blockContainment1183 = new BitSet(new long[]{0xFB8000C200000002L});
    public static final BitSet FOLLOW_NEWLINE_in_blockContainment1191 = new BitSet(new long[]{0xFB8000C200000002L});
    public static final BitSet FOLLOW_returnStat_in_blockContainment1201 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_blockContainment1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_stmt_in_stmt1223 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_stmt_in_stmt1250 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stmt1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_simple_stmt1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_simple_stmt1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printOp_in_simple_stmt1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignStat1313 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_assignStat1324 = new BitSet(new long[]{0x0000048200000000L});
    public static final BitSet FOLLOW_assignable_in_assignStat1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_returnStat1363 = new BitSet(new long[]{0x0000008200000002L});
    public static final BitSet FOLLOW_returnable_in_returnStat1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_returnable1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_printOp1434 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_printOp1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_compound_stmt1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_compound_stmt1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_stmt_in_compound_stmt1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_if_stmt1510 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_test_in_if_stmt1512 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_block_in_if_stmt1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_while_stmt1606 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_test_in_while_stmt1608 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_block_in_while_stmt1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_foreach_stmt1668 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_atomicType_in_foreach_stmt1670 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_foreach_stmt1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_foreach_stmt1676 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_foreach_stmt1680 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_block_in_foreach_stmt1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcCall1818 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcCall1820 = new BitSet(new long[]{0x0000028200000000L});
    public static final BitSet FOLLOW_param_in_funcCall1823 = new BitSet(new long[]{0x0020020000000000L});
    public static final BitSet FOLLOW_53_in_funcCall1826 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_param_in_funcCall1828 = new BitSet(new long[]{0x0020020000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcCall1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_param1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_test1990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_check_operation_in_test1992 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_expr_in_test1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_check_operation2114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_check_operation2116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_check_operation2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_check_operation2135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_check_operation2137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_check_operation2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_check_operation2156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_check_operation2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_check_operation2175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_check_operation2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_assignable2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignable2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_list2225 = new BitSet(new long[]{0x0000080200000000L});
    public static final BitSet FOLLOW_STRING_in_list2228 = new BitSet(new long[]{0x0020080000000000L});
    public static final BitSet FOLLOW_53_in_list2254 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_STRING_in_list2256 = new BitSet(new long[]{0x0020080000000000L});
    public static final BitSet FOLLOW_RCURLY_in_list2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_expr2345 = new BitSet(new long[]{0x0000000000000002L,0x00000000000002A0L});
    public static final BitSet FOLLOW_expr_operation_in_expr2359 = new BitSet(new long[]{0x0000008200000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_expr_qualification_in_expr2361 = new BitSet(new long[]{0x0000000000000002L,0x00000000000002A0L});
    public static final BitSet FOLLOW_69_in_expr_operation2450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_expr_operation2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_expr_operation2469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_expr_operation2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_expr_operation2488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_expr_operation2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_expr_qualification2514 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_INT_in_expr_qualification2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_expr_qualification2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCall_in_atom2605 = new BitSet(new long[]{0x0000000000000002L});

}