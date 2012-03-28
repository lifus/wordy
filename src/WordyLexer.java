// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/malagan/Programming/workspace/Wordy/src/Wordy.g 2011-05-22 20:08:28

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class WordyLexer extends Lexer {
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

    int implicitLineJoiningLevel = 0;
    int startPos = -1;


    // delegates
    // delegators

    public WordyLexer() {;} 
    public WordyLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public WordyLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/malagan/Programming/workspace/Wordy/src/Wordy.g"; }

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:12:7: ( ',' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:13:7: ( 'main' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:13:9: 'main'
            {
            match("main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:14:7: ( 'Void' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:14:9: 'Void'
            {
            match("Void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:15:7: ( 'List' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:15:9: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:16:7: ( 'String' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:16:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:17:7: ( '=' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:18:7: ( 'return' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:18:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:19:7: ( 'print' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:19:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:20:7: ( 'if' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:20:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:21:7: ( 'while' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:21:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:22:7: ( 'foreach' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:22:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:23:7: ( 'in' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:23:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:24:7: ( 'is' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:24:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:25:7: ( 'not' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:25:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:26:7: ( 'contains' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:26:9: 'contains'
            {
            match("contains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:27:7: ( 'equals' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:27:9: 'equals'
            {
            match("equals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:28:7: ( 'remove' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:28:9: 'remove'
            {
            match("remove"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:29:7: ( 'at' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:29:9: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:30:7: ( 'add' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:30:9: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:31:7: ( 'to' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:31:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:32:7: ( 'get' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:32:9: 'get'
            {
            match("get"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:33:7: ( 'position' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:33:9: 'position'
            {
            match("position"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:533:3: ( '(' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:534:3: '('
            {
            match('('); 

                  implicitLineJoiningLevel++;
                 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:541:3: ( ')' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:542:3: ')'
            {
            match(')'); 

                  implicitLineJoiningLevel--;
                 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:549:3: ( '{' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:550:3: '{'
            {
            match('{'); 

                  implicitLineJoiningLevel++;
                 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:557:3: ( '}' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:558:3: '}'
            {
            match('}'); 

                  implicitLineJoiningLevel--;
                 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:565:3: ( ( '0' .. '9' )+ )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:566:3: ( '0' .. '9' )+
            {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:566:3: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:566:4: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:570:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:571:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:576:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:585:3: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:586:3: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:587:3: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:588:5: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:590:5: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:600:3: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:601:3: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:610:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt4=1;
                    }
                    break;
                case 'u':
                    {
                    alt4=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:611:3: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:622:5: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:623:5: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:628:3: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\\') ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>='0' && LA5_1<='3')) ) {
                    int LA5_2 = input.LA(3);

                    if ( ((LA5_2>='0' && LA5_2<='7')) ) {
                        int LA5_4 = input.LA(4);

                        if ( ((LA5_4>='0' && LA5_4<='7')) ) {
                            alt5=1;
                        }
                        else {
                            alt5=2;}
                    }
                    else {
                        alt5=3;}
                }
                else if ( ((LA5_1>='4' && LA5_1<='7')) ) {
                    int LA5_3 = input.LA(3);

                    if ( ((LA5_3>='0' && LA5_3<='7')) ) {
                        alt5=2;
                    }
                    else {
                        alt5=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:629:3: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:629:8: ( '0' .. '3' )
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:629:9: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:629:19: ( '0' .. '7' )
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:629:20: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:629:30: ( '0' .. '7' )
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:629:31: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:630:5: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:630:10: ( '0' .. '7' )
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:630:11: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:630:21: ( '0' .. '7' )
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:630:22: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:631:5: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:631:10: ( '0' .. '7' )
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:631:11: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:636:3: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:637:3: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "CONTINUED_LINE"
    public final void mCONTINUED_LINE() throws RecognitionException {
        try {
            int _type = CONTINUED_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:641:3: ( '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:642:3: '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )*
            {
            match('\\'); 
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:642:8: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:642:9: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:643:3: ( ' ' | '\\t' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


               _channel = HIDDEN;
              

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUED_LINE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:654:3: ( ( ( '\\r' )? '\\n' )+ )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:655:3: ( ( '\\r' )? '\\n' )+
            {
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:655:3: ( ( '\\r' )? '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:655:5: ( '\\r' )? '\\n'
            	    {
            	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:655:5: ( '\\r' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0=='\r') ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:655:6: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


                               if (startPos == 0 || implicitLineJoiningLevel > 0)
                               	_channel = HIDDEN;
                              

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:663:3: ({...}? => ( ' ' | '\\t' )+ )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:664:3: {...}? => ( ' ' | '\\t' )+
            {
            if ( !((startPos > 0)) ) {
                throw new FailedPredicateException(input, "WS", "startPos > 0");
            }
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:665:3: ( ' ' | '\\t' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


               _channel = HIDDEN;
              

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LEADING_WS"
    public final void mLEADING_WS() throws RecognitionException {
        try {
            int _type = LEADING_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            int spaces = 0;

            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:679:3: ({...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* ) )
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:680:3: {...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* )
            {
            if ( !((startPos == 0)) ) {
                throw new FailedPredicateException(input, "LEADING_WS", "startPos == 0");
            }
            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:681:3: ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==' ') ) {
                int LA15_1 = input.LA(2);

                if ( ((implicitLineJoiningLevel > 0)) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0=='\t') ) {
                int LA15_2 = input.LA(2);

                if ( ((implicitLineJoiningLevel > 0)) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:682:5: {...}? ( ' ' | '\\t' )+
                    {
                    if ( !((implicitLineJoiningLevel > 0)) ) {
                        throw new FailedPredicateException(input, "LEADING_WS", "implicitLineJoiningLevel > 0");
                    }
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:683:5: ( ' ' | '\\t' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\t'||LA11_0==' ') ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                         _channel = HIDDEN;
                        

                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:692:5: ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )*
                    {
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:692:5: ( ' ' | '\\t' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==' ') ) {
                            alt12=1;
                        }
                        else if ( (LA12_0=='\t') ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:693:7: ' '
                    	    {
                    	    match(' '); 

                    	              spaces++;
                    	             

                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:697:9: '\\t'
                    	    {
                    	    match('\t'); 

                    	                 spaces += 8; spaces -= (spaces % 8);
                    	                

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                         char[] indentation = new char[spaces];
                         for (int i = 0; i < spaces; i++) {
                         	indentation[i] = ' ';
                         }
                         String s = new String(indentation);
                         emit(new ClassicToken(LEADING_WS, new String(indentation)));
                        
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:711:5: ( ( '\\r' )? '\\n' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:711:7: ( '\\r' )? '\\n'
                    	    {
                    	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:711:7: ( '\\r' )?
                    	    int alt13=2;
                    	    int LA13_0 = input.LA(1);

                    	    if ( (LA13_0=='\r') ) {
                    	        alt13=1;
                    	    }
                    	    switch (alt13) {
                    	        case 1 :
                    	            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:711:8: '\\r'
                    	            {
                    	            match('\r'); 

                    	            }
                    	            break;

                    	    }

                    	    match('\n'); 

                    	                       if (state.token != null)
                    	                       	state.token.setChannel(HIDDEN);
                    	                       else
                    	                       	_channel = HIDDEN;
                    	                      

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEADING_WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _channel = HIDDEN;

            // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:725:3: ({...}? => ( ' ' | '\\t' )* '//' (~ '\\n' )* ( '\\n' )+ | {...}? => '//' (~ '\\n' )* | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:726:3: {...}? => ( ' ' | '\\t' )* '//' (~ '\\n' )* ( '\\n' )+
                    {
                    if ( !((startPos == 0)) ) {
                        throw new FailedPredicateException(input, "COMMENT", "startPos == 0");
                    }
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:727:3: ( ' ' | '\\t' )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\t'||LA16_0==' ') ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match("//"); 

                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:731:8: (~ '\\n' )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\uFFFF')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:731:9: ~ '\\n'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:731:17: ( '\\n' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\n') ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:731:17: '\\n'
                    	    {
                    	    match('\n'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:732:5: {...}? => '//' (~ '\\n' )*
                    {
                    if ( !((startPos > 0)) ) {
                        throw new FailedPredicateException(input, "COMMENT", "startPos > 0");
                    }
                    match("//"); 

                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:732:28: (~ '\\n' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\uFFFF')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:732:29: ~ '\\n'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:733:5: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:733:10: ( options {greedy=false; } : . )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='*') ) {
                            int LA20_1 = input.LA(2);

                            if ( (LA20_1=='/') ) {
                                alt20=2;
                            }
                            else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                                alt20=1;
                            }


                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:733:36: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match("*/"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:8: ( T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | LPAREN | RPAREN | LCURLY | RCURLY | INT | ID | STRING | CONTINUED_LINE | NEWLINE | WS | LEADING_WS | COMMENT )
        int alt22=34;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:10: T__53
                {
                mT__53(); 

                }
                break;
            case 2 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:16: T__54
                {
                mT__54(); 

                }
                break;
            case 3 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:22: T__55
                {
                mT__55(); 

                }
                break;
            case 4 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:28: T__56
                {
                mT__56(); 

                }
                break;
            case 5 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:34: T__57
                {
                mT__57(); 

                }
                break;
            case 6 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:40: T__58
                {
                mT__58(); 

                }
                break;
            case 7 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:46: T__59
                {
                mT__59(); 

                }
                break;
            case 8 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:52: T__60
                {
                mT__60(); 

                }
                break;
            case 9 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:58: T__61
                {
                mT__61(); 

                }
                break;
            case 10 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:64: T__62
                {
                mT__62(); 

                }
                break;
            case 11 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:70: T__63
                {
                mT__63(); 

                }
                break;
            case 12 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:76: T__64
                {
                mT__64(); 

                }
                break;
            case 13 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:82: T__65
                {
                mT__65(); 

                }
                break;
            case 14 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:88: T__66
                {
                mT__66(); 

                }
                break;
            case 15 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:94: T__67
                {
                mT__67(); 

                }
                break;
            case 16 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:100: T__68
                {
                mT__68(); 

                }
                break;
            case 17 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:106: T__69
                {
                mT__69(); 

                }
                break;
            case 18 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:112: T__70
                {
                mT__70(); 

                }
                break;
            case 19 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:118: T__71
                {
                mT__71(); 

                }
                break;
            case 20 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:124: T__72
                {
                mT__72(); 

                }
                break;
            case 21 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:130: T__73
                {
                mT__73(); 

                }
                break;
            case 22 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:136: T__74
                {
                mT__74(); 

                }
                break;
            case 23 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:142: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 24 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:149: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 25 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:156: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 26 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:163: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 27 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:170: INT
                {
                mINT(); 

                }
                break;
            case 28 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:174: ID
                {
                mID(); 

                }
                break;
            case 29 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:177: STRING
                {
                mSTRING(); 

                }
                break;
            case 30 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:184: CONTINUED_LINE
                {
                mCONTINUED_LINE(); 

                }
                break;
            case 31 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:199: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 32 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:207: WS
                {
                mWS(); 

                }
                break;
            case 33 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:210: LEADING_WS
                {
                mLEADING_WS(); 

                }
                break;
            case 34 :
                // /home/malagan/Programming/workspace/Wordy/src/Wordy.g:1:221: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA21_eotS =
        "\3\uffff\1\6\1\uffff\1\6\1\uffff";
    static final String DFA21_eofS =
        "\7\uffff";
    static final String DFA21_minS =
        "\1\11\1\uffff\1\52\1\0\1\uffff\1\0\1\uffff";
    static final String DFA21_maxS =
        "\1\57\1\uffff\1\57\1\uffff\1\uffff\1\uffff\1\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\uffff\1\2";
    static final String DFA21_specialS =
        "\1\3\1\uffff\1\1\1\0\1\uffff\1\2\1\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\26\uffff\1\1\16\uffff\1\2",
            "",
            "\1\4\4\uffff\1\3",
            "\12\5\1\1\ufff5\5",
            "",
            "\12\5\1\1\ufff5\5",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "721:1: COMMENT : ({...}? => ( ' ' | '\\t' )* '//' (~ '\\n' )* ( '\\n' )+ | {...}? => '//' (~ '\\n' )* | '/*' ( options {greedy=false; } : . )* '*/' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_3 = input.LA(1);

                         
                        int index21_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA21_3>='\u0000' && LA21_3<='\t')||(LA21_3>='\u000B' && LA21_3<='\uFFFF')) && (((startPos > 0)||(startPos == 0)))) {s = 5;}

                        else if ( (LA21_3=='\n') && ((startPos == 0))) {s = 1;}

                        else s = 6;

                         
                        input.seek(index21_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_2 = input.LA(1);

                         
                        int index21_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_2=='/') && (((startPos > 0)||(startPos == 0)))) {s = 3;}

                        else if ( (LA21_2=='*') ) {s = 4;}

                         
                        input.seek(index21_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_5 = input.LA(1);

                         
                        int index21_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_5=='\n') && ((startPos == 0))) {s = 1;}

                        else if ( ((LA21_5>='\u0000' && LA21_5<='\t')||(LA21_5>='\u000B' && LA21_5<='\uFFFF')) && (((startPos > 0)||(startPos == 0)))) {s = 5;}

                        else s = 6;

                         
                        input.seek(index21_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_0 = input.LA(1);

                         
                        int index21_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_0=='\t'||LA21_0==' ') && ((startPos == 0))) {s = 1;}

                        else if ( (LA21_0=='/') ) {s = 2;}

                         
                        input.seek(index21_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\2\uffff\4\27\1\uffff\13\27\11\uffff\1\61\1\64\1\uffff\7\27\1\75"+
        "\1\76\1\77\5\27\1\105\1\27\1\107\1\27\4\uffff\10\27\3\uffff\2\27"+
        "\1\124\2\27\1\uffff\1\127\1\uffff\1\130\1\uffff\1\131\1\132\1\133"+
        "\7\27\1\uffff\2\27\5\uffff\3\27\1\150\1\27\1\152\3\27\1\156\1\157"+
        "\1\160\1\uffff\1\27\1\uffff\2\27\1\164\3\uffff\1\27\1\166\1\27\1"+
        "\uffff\1\170\1\uffff\1\171\2\uffff";
    static final String DFA22_eofS =
        "\172\uffff";
    static final String DFA22_minS =
        "\1\11\1\uffff\1\141\1\157\1\151\1\164\1\uffff\1\145\1\157\1\146"+
        "\1\150\3\157\1\161\1\144\1\157\1\145\11\uffff\2\11\1\uffff\2\151"+
        "\1\163\1\162\1\155\1\151\1\163\3\60\1\151\1\162\1\164\1\156\1\165"+
        "\1\60\1\144\1\60\1\164\1\0\2\uffff\1\0\1\156\1\144\1\164\1\151\1"+
        "\165\1\157\1\156\1\151\3\uffff\1\154\1\145\1\60\1\164\1\141\1\uffff"+
        "\1\60\1\uffff\1\60\1\uffff\3\60\1\156\1\162\1\166\2\164\1\145\1"+
        "\141\1\uffff\1\141\1\154\5\uffff\1\147\1\156\1\145\1\60\1\151\1"+
        "\60\1\143\1\151\1\163\3\60\1\uffff\1\157\1\uffff\1\150\1\156\1\60"+
        "\3\uffff\1\156\1\60\1\163\1\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA22_maxS =
        "\1\175\1\uffff\1\141\1\157\1\151\1\164\1\uffff\1\145\1\162\1\163"+
        "\1\150\3\157\1\161\1\164\1\157\1\145\11\uffff\2\57\1\uffff\2\151"+
        "\1\163\1\162\1\164\1\151\1\163\3\172\1\151\1\162\1\164\1\156\1\165"+
        "\1\172\1\144\1\172\1\164\1\0\2\uffff\1\0\1\156\1\144\1\164\1\151"+
        "\1\165\1\157\1\156\1\151\3\uffff\1\154\1\145\1\172\1\164\1\141\1"+
        "\uffff\1\172\1\uffff\1\172\1\uffff\3\172\1\156\1\162\1\166\2\164"+
        "\1\145\1\141\1\uffff\1\141\1\154\5\uffff\1\147\1\156\1\145\1\172"+
        "\1\151\1\172\1\143\1\151\1\163\3\172\1\uffff\1\157\1\uffff\1\150"+
        "\1\156\1\172\3\uffff\1\156\1\172\1\163\1\uffff\1\172\1\uffff\1\172"+
        "\2\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\4\uffff\1\6\13\uffff\1\27\1\30\1\31\1\32\1\33\1\34"+
        "\1\35\1\36\1\37\2\uffff\1\42\24\uffff\1\41\1\42\11\uffff\1\11\1"+
        "\14\1\15\5\uffff\1\22\1\uffff\1\24\1\uffff\1\40\12\uffff\1\16\2"+
        "\uffff\1\23\1\25\1\2\1\3\1\4\14\uffff\1\10\1\uffff\1\12\3\uffff"+
        "\1\5\1\7\1\21\3\uffff\1\20\1\uffff\1\13\1\uffff\1\26\1\17";
    static final String DFA22_specialS =
        "\1\4\32\uffff\1\2\1\3\24\uffff\1\0\2\uffff\1\1\105\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\34\1\32\2\uffff\1\32\22\uffff\1\33\1\uffff\1\30\5\uffff\1"+
            "\22\1\23\2\uffff\1\1\2\uffff\1\35\12\26\3\uffff\1\6\3\uffff"+
            "\13\27\1\4\6\27\1\5\2\27\1\3\4\27\1\uffff\1\31\2\uffff\1\27"+
            "\1\uffff\1\17\1\27\1\15\1\27\1\16\1\13\1\21\1\27\1\11\3\27\1"+
            "\2\1\14\1\27\1\10\1\27\1\7\1\27\1\20\2\27\1\12\3\27\1\24\1\uffff"+
            "\1\25",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "",
            "\1\42",
            "\1\44\2\uffff\1\43",
            "\1\45\7\uffff\1\46\4\uffff\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\56\17\uffff\1\55",
            "\1\57",
            "\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34\1\62\2\uffff\1\62\22\uffff\1\33\16\uffff\1\63",
            "\1\34\1\62\2\uffff\1\62\22\uffff\1\33\16\uffff\1\63",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\72\6\uffff\1\71",
            "\1\73",
            "\1\74",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\106",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\110",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\125",
            "\1\126",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "",
            "",
            "",
            "",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\151",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "\1\165",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\167",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | LPAREN | RPAREN | LCURLY | RCURLY | INT | ID | STRING | CONTINUED_LINE | NEWLINE | WS | LEADING_WS | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_49 = input.LA(1);

                         
                        int index22_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((startPos > 0)) ) {s = 73;}

                        else if ( (((startPos == 0)||((startPos == 0)&&(implicitLineJoiningLevel > 0)))) ) {s = 50;}

                         
                        input.seek(index22_49);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_52 = input.LA(1);

                         
                        int index22_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((startPos > 0)) ) {s = 73;}

                        else if ( (((startPos == 0)||((startPos == 0)&&(implicitLineJoiningLevel > 0)))) ) {s = 50;}

                         
                        input.seek(index22_52);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_27 = input.LA(1);

                         
                        int index22_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_27==' ') && (((startPos > 0)||(startPos == 0)))) {s = 27;}

                        else if ( (LA22_27=='\n'||LA22_27=='\r') && ((startPos == 0))) {s = 50;}

                        else if ( (LA22_27=='\t') && (((startPos > 0)||(startPos == 0)))) {s = 28;}

                        else if ( (LA22_27=='/') && ((startPos == 0))) {s = 51;}

                        else s = 49;

                         
                        input.seek(index22_27);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_28 = input.LA(1);

                         
                        int index22_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_28==' ') && (((startPos > 0)||(startPos == 0)))) {s = 27;}

                        else if ( (LA22_28=='\n'||LA22_28=='\r') && ((startPos == 0))) {s = 50;}

                        else if ( (LA22_28=='\t') && (((startPos > 0)||(startPos == 0)))) {s = 28;}

                        else if ( (LA22_28=='/') && ((startPos == 0))) {s = 51;}

                        else s = 52;

                         
                        input.seek(index22_28);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_0==',') ) {s = 1;}

                        else if ( (LA22_0=='m') ) {s = 2;}

                        else if ( (LA22_0=='V') ) {s = 3;}

                        else if ( (LA22_0=='L') ) {s = 4;}

                        else if ( (LA22_0=='S') ) {s = 5;}

                        else if ( (LA22_0=='=') ) {s = 6;}

                        else if ( (LA22_0=='r') ) {s = 7;}

                        else if ( (LA22_0=='p') ) {s = 8;}

                        else if ( (LA22_0=='i') ) {s = 9;}

                        else if ( (LA22_0=='w') ) {s = 10;}

                        else if ( (LA22_0=='f') ) {s = 11;}

                        else if ( (LA22_0=='n') ) {s = 12;}

                        else if ( (LA22_0=='c') ) {s = 13;}

                        else if ( (LA22_0=='e') ) {s = 14;}

                        else if ( (LA22_0=='a') ) {s = 15;}

                        else if ( (LA22_0=='t') ) {s = 16;}

                        else if ( (LA22_0=='g') ) {s = 17;}

                        else if ( (LA22_0=='(') ) {s = 18;}

                        else if ( (LA22_0==')') ) {s = 19;}

                        else if ( (LA22_0=='{') ) {s = 20;}

                        else if ( (LA22_0=='}') ) {s = 21;}

                        else if ( ((LA22_0>='0' && LA22_0<='9')) ) {s = 22;}

                        else if ( ((LA22_0>='A' && LA22_0<='K')||(LA22_0>='M' && LA22_0<='R')||(LA22_0>='T' && LA22_0<='U')||(LA22_0>='W' && LA22_0<='Z')||LA22_0=='_'||LA22_0=='b'||LA22_0=='d'||LA22_0=='h'||(LA22_0>='j' && LA22_0<='l')||LA22_0=='o'||LA22_0=='q'||LA22_0=='s'||(LA22_0>='u' && LA22_0<='v')||(LA22_0>='x' && LA22_0<='z')) ) {s = 23;}

                        else if ( (LA22_0=='\"') ) {s = 24;}

                        else if ( (LA22_0=='\\') ) {s = 25;}

                        else if ( (LA22_0=='\n'||LA22_0=='\r') ) {s = 26;}

                        else if ( (LA22_0==' ') && (((startPos > 0)||(startPos == 0)))) {s = 27;}

                        else if ( (LA22_0=='\t') && (((startPos > 0)||(startPos == 0)))) {s = 28;}

                        else if ( (LA22_0=='/') ) {s = 29;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}