package org.xtext.compilation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWhileCompLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NOMBRE=6;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SYMBOL=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalWhileCompLexer() {;} 
    public InternalWhileCompLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalWhileCompLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalWhileComp.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:11:7: ( 'function' )
            // InternalWhileComp.g:11:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:12:7: ( ':' )
            // InternalWhileComp.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:13:7: ( '%' )
            // InternalWhileComp.g:13:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:14:7: ( 'read' )
            // InternalWhileComp.g:14:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:15:7: ( ',' )
            // InternalWhileComp.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:16:7: ( 'write' )
            // InternalWhileComp.g:16:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:17:7: ( 'nop' )
            // InternalWhileComp.g:17:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:18:7: ( ':=' )
            // InternalWhileComp.g:18:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:19:7: ( 'nil' )
            // InternalWhileComp.g:19:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:20:7: ( ';' )
            // InternalWhileComp.g:20:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:21:7: ( 'while' )
            // InternalWhileComp.g:21:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:22:7: ( 'do' )
            // InternalWhileComp.g:22:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:23:7: ( 'od' )
            // InternalWhileComp.g:23:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:24:7: ( 'for' )
            // InternalWhileComp.g:24:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:25:7: ( 'if' )
            // InternalWhileComp.g:25:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:26:7: ( 'then' )
            // InternalWhileComp.g:26:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:27:7: ( 'else' )
            // InternalWhileComp.g:27:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:28:7: ( 'fi' )
            // InternalWhileComp.g:28:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:29:7: ( 'foreach' )
            // InternalWhileComp.g:29:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:30:7: ( 'in' )
            // InternalWhileComp.g:30:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:31:7: ( '&&' )
            // InternalWhileComp.g:31:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:32:7: ( '||' )
            // InternalWhileComp.g:32:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:33:7: ( '!' )
            // InternalWhileComp.g:33:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:34:7: ( '=?' )
            // InternalWhileComp.g:34:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:35:7: ( '(' )
            // InternalWhileComp.g:35:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:36:7: ( ')' )
            // InternalWhileComp.g:36:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:37:7: ( 'cons' )
            // InternalWhileComp.g:37:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:38:7: ( 'list' )
            // InternalWhileComp.g:38:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:39:7: ( 'hd' )
            // InternalWhileComp.g:39:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:40:7: ( 'tl' )
            // InternalWhileComp.g:40:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:2196:15: ( 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' )* )
            // InternalWhileComp.g:2196:17: 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' )*
            {
            matchRange('A','Z'); 
            // InternalWhileComp.g:2196:26: ( 'A' .. 'Z' | 'a' .. 'z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWhileComp.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLE"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:2198:13: ( 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ )* ( '!' | '?' )? )
            // InternalWhileComp.g:2198:15: 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ )* ( '!' | '?' )?
            {
            matchRange('a','z'); 
            // InternalWhileComp.g:2198:24: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWhileComp.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

            // InternalWhileComp.g:2198:54: ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='&'||LA5_0=='+'||(LA5_0>='-' && LA5_0<='/')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWhileComp.g:2198:55: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+
            	    {
            	    // InternalWhileComp.g:2198:55: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0=='-') ) {
            	        int LA3_1 = input.LA(2);

            	        if ( (LA3_1=='>') ) {
            	            alt3=2;
            	        }
            	        else if ( ((LA3_1>='0' && LA3_1<='9')||(LA3_1>='A' && LA3_1<='Z')||(LA3_1>='a' && LA3_1<='z')) ) {
            	            alt3=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 3, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA3_0=='&'||LA3_0=='+'||(LA3_0>='.' && LA3_0<='/')||LA3_0=='_') ) {
            	        alt3=1;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalWhileComp.g:2198:56: ( '-' | '+' | '.' | '/' | '_' | '&' )
            	            {
            	            if ( input.LA(1)=='&'||input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='/')||input.LA(1)=='_' ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // InternalWhileComp.g:2198:82: '->'
            	            {
            	            match("->"); 


            	            }
            	            break;

            	    }

            	    // InternalWhileComp.g:2198:88: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalWhileComp.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalWhileComp.g:2198:120: ( '!' | '?' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='!'||LA6_0=='?') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWhileComp.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "RULE_SYMBOL"

    // $ANTLR start "RULE_NOMBRE"
    public final void mRULE_NOMBRE() throws RecognitionException {
        try {
            int _type = RULE_NOMBRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:2200:13: ( '1' .. '9' ( '0' .. '9' )* )
            // InternalWhileComp.g:2200:15: '1' .. '9' ( '0' .. '9' )*
            {
            matchRange('1','9'); 
            // InternalWhileComp.g:2200:24: ( '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWhileComp.g:2200:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOMBRE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:2202:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalWhileComp.g:2202:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalWhileComp.g:2202:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalWhileComp.g:2202:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalWhileComp.g:2202:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWhileComp.g:
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
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:2204:10: ( ( '0' .. '9' )+ )
            // InternalWhileComp.g:2204:12: ( '0' .. '9' )+
            {
            // InternalWhileComp.g:2204:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalWhileComp.g:2204:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:2206:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalWhileComp.g:2206:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalWhileComp.g:2206:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalWhileComp.g:2206:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalWhileComp.g:2206:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalWhileComp.g:2206:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalWhileComp.g:2206:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:2206:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalWhileComp.g:2206:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalWhileComp.g:2206:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalWhileComp.g:2206:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:2208:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalWhileComp.g:2208:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalWhileComp.g:2208:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalWhileComp.g:2208:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:2210:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalWhileComp.g:2210:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalWhileComp.g:2210:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalWhileComp.g:2210:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalWhileComp.g:2210:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalWhileComp.g:2210:41: ( '\\r' )? '\\n'
                    {
                    // InternalWhileComp.g:2210:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalWhileComp.g:2210:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:2212:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalWhileComp.g:2212:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalWhileComp.g:2212:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalWhileComp.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhileComp.g:2214:16: ( . )
            // InternalWhileComp.g:2214:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalWhileComp.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_VARIABLE | RULE_SYMBOL | RULE_NOMBRE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=40;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalWhileComp.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalWhileComp.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalWhileComp.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalWhileComp.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalWhileComp.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalWhileComp.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalWhileComp.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalWhileComp.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalWhileComp.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalWhileComp.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalWhileComp.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalWhileComp.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalWhileComp.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalWhileComp.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalWhileComp.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalWhileComp.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalWhileComp.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalWhileComp.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalWhileComp.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalWhileComp.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalWhileComp.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalWhileComp.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalWhileComp.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalWhileComp.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalWhileComp.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalWhileComp.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalWhileComp.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalWhileComp.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalWhileComp.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalWhileComp.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalWhileComp.g:1:190: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 32 :
                // InternalWhileComp.g:1:204: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 33 :
                // InternalWhileComp.g:1:216: RULE_NOMBRE
                {
                mRULE_NOMBRE(); 

                }
                break;
            case 34 :
                // InternalWhileComp.g:1:228: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalWhileComp.g:1:236: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalWhileComp.g:1:245: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalWhileComp.g:1:257: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalWhileComp.g:1:273: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalWhileComp.g:1:289: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalWhileComp.g:1:297: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\1\45\1\51\1\uffff\1\45\1\uffff\2\45\1\uffff\5\45\2\41\1\uffff\1\41\2\uffff\3\45\1\102\1\45\1\105\1\41\2\uffff\3\41\2\uffff\2\45\1\116\1\uffff\1\45\1\104\3\uffff\1\45\1\uffff\4\45\1\uffff\1\125\1\126\1\127\1\130\1\45\1\132\1\45\6\uffff\2\45\1\136\1\uffff\1\102\2\uffff\1\105\5\uffff\1\45\1\141\1\uffff\4\45\1\145\1\146\4\uffff\1\45\1\uffff\3\45\1\uffff\2\45\1\uffff\1\155\2\45\2\uffff\1\160\1\161\1\162\1\163\2\45\1\uffff\1\166\1\167\4\uffff\2\45\2\uffff\1\45\1\173\1\174\2\uffff";
    static final String DFA19_eofS =
        "\175\uffff";
    static final String DFA19_minS =
        "\1\0\1\60\1\75\1\uffff\1\60\1\uffff\2\60\1\uffff\5\60\1\46\1\174\1\uffff\1\77\2\uffff\6\60\1\101\2\uffff\2\0\1\52\2\uffff\2\60\1\41\1\uffff\2\60\3\uffff\1\60\1\uffff\4\60\1\uffff\4\41\1\60\1\41\1\60\6\uffff\2\60\1\41\1\uffff\1\60\2\uffff\1\60\5\uffff\1\60\1\41\1\uffff\4\60\2\41\4\uffff\1\60\1\uffff\3\60\1\uffff\2\60\1\uffff\1\41\2\60\2\uffff\4\41\2\60\1\uffff\2\41\4\uffff\2\60\2\uffff\1\60\2\41\2\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\172\1\75\1\uffff\1\172\1\uffff\2\172\1\uffff\5\172\1\46\1\174\1\uffff\1\77\2\uffff\5\172\1\71\1\172\2\uffff\2\uffff\1\57\2\uffff\3\172\1\uffff\2\172\3\uffff\1\172\1\uffff\4\172\1\uffff\7\172\6\uffff\3\172\1\uffff\1\172\2\uffff\1\71\5\uffff\2\172\1\uffff\6\172\4\uffff\1\172\1\uffff\3\172\1\uffff\2\172\1\uffff\3\172\2\uffff\6\172\1\uffff\2\172\4\uffff\2\172\2\uffff\3\172\2\uffff";
    static final String DFA19_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\2\uffff\1\12\7\uffff\1\27\1\uffff\1\31\1\32\7\uffff\1\42\1\43\3\uffff\1\47\1\50\3\uffff\1\40\2\uffff\1\10\1\2\1\3\1\uffff\1\5\4\uffff\1\12\7\uffff\1\25\1\26\1\27\1\30\1\31\1\32\3\uffff\1\37\1\uffff\1\42\1\41\1\uffff\1\43\1\44\1\45\1\46\1\47\2\uffff\1\22\6\uffff\1\14\1\15\1\17\1\24\1\uffff\1\36\3\uffff\1\35\2\uffff\1\16\3\uffff\1\7\1\11\6\uffff\1\4\2\uffff\1\20\1\21\1\33\1\34\2\uffff\1\6\1\13\3\uffff\1\23\1\1";
    static final String DFA19_specialS =
        "\1\1\34\uffff\1\0\1\2\136\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\20\1\35\2\41\1\3\1\16\1\36\1\22\1\23\2\41\1\5\2\41\1\37\1\34\11\31\1\2\1\10\1\41\1\21\3\41\32\27\3\41\1\32\1\33\1\41\2\30\1\24\1\11\1\15\1\1\1\30\1\26\1\13\2\30\1\25\1\30\1\7\1\12\2\30\1\4\1\30\1\14\2\30\1\6\3\30\1\41\1\17\uff83\41",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\10\46\1\44\5\46\1\43\5\46\1\42\5\46",
            "\1\50",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\4\46\1\53\25\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\7\46\1\56\11\46\1\55\10\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\10\46\1\60\5\46\1\57\13\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\16\46\1\62\13\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\3\46\1\63\26\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\5\46\1\64\7\46\1\65\14\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\7\46\1\66\3\46\1\67\16\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\13\46\1\70\16\46",
            "\1\71",
            "\1\72",
            "",
            "\1\74",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\16\46\1\77\13\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\10\46\1\100\21\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\3\46\1\101\26\46",
            "\12\104\7\uffff\32\103\4\uffff\1\104\1\uffff\32\103",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\12\106",
            "\32\104\4\uffff\1\104\1\uffff\32\104",
            "",
            "",
            "\0\110",
            "\0\110",
            "\1\111\4\uffff\1\112",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\15\46\1\114\14\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\21\46\1\115\10\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\12\117\7\uffff\32\117\6\uffff\32\117",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\1\120\31\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\10\46\1\121\21\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\10\46\1\122\21\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\17\46\1\123\12\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\13\46\1\124\16\46",
            "",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\4\46\1\131\25\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\22\46\1\133\7\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\15\46\1\134\14\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\22\46\1\135\7\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "",
            "\12\104\7\uffff\32\103\4\uffff\1\104\1\uffff\32\103",
            "",
            "",
            "\12\106",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\2\46\1\137\27\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\4\46\1\140\25\46",
            "",
            "\12\117\7\uffff\32\117\4\uffff\1\47\1\uffff\32\117",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\3\46\1\142\26\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\23\46\1\143\6\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\13\46\1\144\16\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\15\46\1\147\14\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\4\46\1\150\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\22\46\1\151\7\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\23\46\1\152\6\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\23\46\1\153\6\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\1\154\31\46",
            "",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\4\46\1\156\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\4\46\1\157\25\46",
            "",
            "",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\10\46\1\164\21\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\2\46\1\165\27\46",
            "",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\16\46\1\170\13\46",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\7\46\1\171\22\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\47\1\uffff\15\46\1\172\14\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "\1\45\4\uffff\1\45\4\uffff\1\45\1\uffff\3\45\12\46\5\uffff\1\45\1\uffff\32\46\4\uffff\1\47\1\uffff\32\46",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_VARIABLE | RULE_SYMBOL | RULE_NOMBRE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_29 = input.LA(1);

                        s = -1;
                        if ( ((LA19_29>='\u0000' && LA19_29<='\uFFFF')) ) {s = 72;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='f') ) {s = 1;}

                        else if ( (LA19_0==':') ) {s = 2;}

                        else if ( (LA19_0=='%') ) {s = 3;}

                        else if ( (LA19_0=='r') ) {s = 4;}

                        else if ( (LA19_0==',') ) {s = 5;}

                        else if ( (LA19_0=='w') ) {s = 6;}

                        else if ( (LA19_0=='n') ) {s = 7;}

                        else if ( (LA19_0==';') ) {s = 8;}

                        else if ( (LA19_0=='d') ) {s = 9;}

                        else if ( (LA19_0=='o') ) {s = 10;}

                        else if ( (LA19_0=='i') ) {s = 11;}

                        else if ( (LA19_0=='t') ) {s = 12;}

                        else if ( (LA19_0=='e') ) {s = 13;}

                        else if ( (LA19_0=='&') ) {s = 14;}

                        else if ( (LA19_0=='|') ) {s = 15;}

                        else if ( (LA19_0=='!') ) {s = 16;}

                        else if ( (LA19_0=='=') ) {s = 17;}

                        else if ( (LA19_0=='(') ) {s = 18;}

                        else if ( (LA19_0==')') ) {s = 19;}

                        else if ( (LA19_0=='c') ) {s = 20;}

                        else if ( (LA19_0=='l') ) {s = 21;}

                        else if ( (LA19_0=='h') ) {s = 22;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')) ) {s = 23;}

                        else if ( ((LA19_0>='a' && LA19_0<='b')||LA19_0=='g'||(LA19_0>='j' && LA19_0<='k')||LA19_0=='m'||(LA19_0>='p' && LA19_0<='q')||LA19_0=='s'||(LA19_0>='u' && LA19_0<='v')||(LA19_0>='x' && LA19_0<='z')) ) {s = 24;}

                        else if ( ((LA19_0>='1' && LA19_0<='9')) ) {s = 25;}

                        else if ( (LA19_0=='^') ) {s = 26;}

                        else if ( (LA19_0=='_') ) {s = 27;}

                        else if ( (LA19_0=='0') ) {s = 28;}

                        else if ( (LA19_0=='\"') ) {s = 29;}

                        else if ( (LA19_0=='\'') ) {s = 30;}

                        else if ( (LA19_0=='/') ) {s = 31;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 32;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||(LA19_0>='#' && LA19_0<='$')||(LA19_0>='*' && LA19_0<='+')||(LA19_0>='-' && LA19_0<='.')||LA19_0=='<'||(LA19_0>='>' && LA19_0<='@')||(LA19_0>='[' && LA19_0<=']')||LA19_0=='`'||LA19_0=='{'||(LA19_0>='}' && LA19_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_30 = input.LA(1);

                        s = -1;
                        if ( ((LA19_30>='\u0000' && LA19_30<='\uFFFF')) ) {s = 72;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}