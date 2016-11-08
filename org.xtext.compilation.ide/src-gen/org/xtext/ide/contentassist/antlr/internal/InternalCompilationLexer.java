package org.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCompilationLexer extends Lexer {
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
    public static final int RULE_SEP=6;
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
    public static final int RULE_VARIABLE=4;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SYMBOL=5;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalCompilationLexer() {;} 
    public InternalCompilationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCompilationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCompilation.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompilation.g:11:7: ( 'nop' )
            // InternalCompilation.g:11:9: 'nop'
            {
            match("nop"); 


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
            // InternalCompilation.g:12:7: ( 'fi' )
            // InternalCompilation.g:12:9: 'fi'
            {
            match("fi"); 


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
            // InternalCompilation.g:13:7: ( 'nil' )
            // InternalCompilation.g:13:9: 'nil'
            {
            match("nil"); 


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
            // InternalCompilation.g:14:7: ( 'function' )
            // InternalCompilation.g:14:9: 'function'
            {
            match("function"); 


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
            // InternalCompilation.g:15:7: ( ':' )
            // InternalCompilation.g:15:9: ':'
            {
            match(':'); 

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
            // InternalCompilation.g:16:7: ( 'read' )
            // InternalCompilation.g:16:9: 'read'
            {
            match("read"); 


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
            // InternalCompilation.g:17:7: ( '%' )
            // InternalCompilation.g:17:9: '%'
            {
            match('%'); 

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
            // InternalCompilation.g:18:7: ( 'write' )
            // InternalCompilation.g:18:9: 'write'
            {
            match("write"); 


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
            // InternalCompilation.g:19:7: ( ',' )
            // InternalCompilation.g:19:9: ','
            {
            match(','); 

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
            // InternalCompilation.g:20:7: ( ';' )
            // InternalCompilation.g:20:9: ';'
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
            // InternalCompilation.g:21:7: ( ':=' )
            // InternalCompilation.g:21:9: ':='
            {
            match(":="); 


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
            // InternalCompilation.g:22:7: ( 'while' )
            // InternalCompilation.g:22:9: 'while'
            {
            match("while"); 


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
            // InternalCompilation.g:23:7: ( 'do' )
            // InternalCompilation.g:23:9: 'do'
            {
            match("do"); 


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
            // InternalCompilation.g:24:7: ( 'od' )
            // InternalCompilation.g:24:9: 'od'
            {
            match("od"); 


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
            // InternalCompilation.g:25:7: ( 'for' )
            // InternalCompilation.g:25:9: 'for'
            {
            match("for"); 


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
            // InternalCompilation.g:26:7: ( 'if' )
            // InternalCompilation.g:26:9: 'if'
            {
            match("if"); 


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
            // InternalCompilation.g:27:7: ( 'then' )
            // InternalCompilation.g:27:9: 'then'
            {
            match("then"); 


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
            // InternalCompilation.g:28:7: ( 'else' )
            // InternalCompilation.g:28:9: 'else'
            {
            match("else"); 


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
            // InternalCompilation.g:29:7: ( 'foreach' )
            // InternalCompilation.g:29:9: 'foreach'
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
            // InternalCompilation.g:30:7: ( 'in' )
            // InternalCompilation.g:30:9: 'in'
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
            // InternalCompilation.g:31:7: ( '&&' )
            // InternalCompilation.g:31:9: '&&'
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
            // InternalCompilation.g:32:7: ( '||' )
            // InternalCompilation.g:32:9: '||'
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
            // InternalCompilation.g:33:7: ( '!' )
            // InternalCompilation.g:33:9: '!'
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
            // InternalCompilation.g:34:7: ( '=?' )
            // InternalCompilation.g:34:9: '=?'
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
            // InternalCompilation.g:35:7: ( '(' )
            // InternalCompilation.g:35:9: '('
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
            // InternalCompilation.g:36:7: ( ')' )
            // InternalCompilation.g:36:9: ')'
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
            // InternalCompilation.g:37:7: ( 'cons' )
            // InternalCompilation.g:37:9: 'cons'
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
            // InternalCompilation.g:38:7: ( 'list' )
            // InternalCompilation.g:38:9: 'list'
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
            // InternalCompilation.g:39:7: ( 'hd' )
            // InternalCompilation.g:39:9: 'hd'
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
            // InternalCompilation.g:40:7: ( 'tl' )
            // InternalCompilation.g:40:9: 'tl'
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
            // InternalCompilation.g:4411:15: ( 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ )* ( '!' | '?' )? )
            // InternalCompilation.g:4411:17: 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ )* ( '!' | '?' )?
            {
            matchRange('A','Z'); 
            // InternalCompilation.g:4411:26: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCompilation.g:
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
            	    break loop1;
                }
            } while (true);

            // InternalCompilation.g:4411:56: ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='&'||LA4_0=='+'||(LA4_0>='-' && LA4_0<='/')||LA4_0=='_') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCompilation.g:4411:57: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+
            	    {
            	    // InternalCompilation.g:4411:57: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0=='-') ) {
            	        int LA2_1 = input.LA(2);

            	        if ( (LA2_1=='>') ) {
            	            alt2=2;
            	        }
            	        else if ( ((LA2_1>='0' && LA2_1<='9')||(LA2_1>='A' && LA2_1<='Z')||(LA2_1>='a' && LA2_1<='z')) ) {
            	            alt2=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 2, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA2_0=='&'||LA2_0=='+'||(LA2_0>='.' && LA2_0<='/')||LA2_0=='_') ) {
            	        alt2=1;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalCompilation.g:4411:58: ( '-' | '+' | '.' | '/' | '_' | '&' )
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
            	            // InternalCompilation.g:4411:84: '->'
            	            {
            	            match("->"); 


            	            }
            	            break;

            	    }

            	    // InternalCompilation.g:4411:90: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalCompilation.g:
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
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalCompilation.g:4411:122: ( '!' | '?' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='!'||LA5_0=='?') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCompilation.g:
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
    // $ANTLR end "RULE_VARIABLE"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompilation.g:4413:13: ( 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ )* ( '!' | '?' )? )
            // InternalCompilation.g:4413:15: 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ )* ( '!' | '?' )?
            {
            matchRange('a','z'); 
            // InternalCompilation.g:4413:24: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCompilation.g:
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
            	    break loop6;
                }
            } while (true);

            // InternalCompilation.g:4413:54: ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='&'||LA9_0=='+'||(LA9_0>='-' && LA9_0<='/')||LA9_0=='_') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCompilation.g:4413:55: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+
            	    {
            	    // InternalCompilation.g:4413:55: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0=='-') ) {
            	        int LA7_1 = input.LA(2);

            	        if ( (LA7_1=='>') ) {
            	            alt7=2;
            	        }
            	        else if ( ((LA7_1>='0' && LA7_1<='9')||(LA7_1>='A' && LA7_1<='Z')||(LA7_1>='a' && LA7_1<='z')) ) {
            	            alt7=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 7, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA7_0=='&'||LA7_0=='+'||(LA7_0>='.' && LA7_0<='/')||LA7_0=='_') ) {
            	        alt7=1;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalCompilation.g:4413:56: ( '-' | '+' | '.' | '/' | '_' | '&' )
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
            	            // InternalCompilation.g:4413:82: '->'
            	            {
            	            match("->"); 


            	            }
            	            break;

            	    }

            	    // InternalCompilation.g:4413:88: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||(LA8_0>='a' && LA8_0<='z')) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalCompilation.g:
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
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalCompilation.g:4413:120: ( '!' | '?' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='!'||LA10_0=='?') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCompilation.g:
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

    // $ANTLR start "RULE_SEP"
    public final void mRULE_SEP() throws RecognitionException {
        try {
            int _type = RULE_SEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompilation.g:4415:10: ( ( ' ' | '\\r\\n' | '\\t' | '\\n' ) )
            // InternalCompilation.g:4415:12: ( ' ' | '\\r\\n' | '\\t' | '\\n' )
            {
            // InternalCompilation.g:4415:12: ( ' ' | '\\r\\n' | '\\t' | '\\n' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt11=1;
                }
                break;
            case '\r':
                {
                alt11=2;
                }
                break;
            case '\t':
                {
                alt11=3;
                }
                break;
            case '\n':
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalCompilation.g:4415:13: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // InternalCompilation.g:4415:17: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 3 :
                    // InternalCompilation.g:4415:24: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 4 :
                    // InternalCompilation.g:4415:29: '\\n'
                    {
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
    // $ANTLR end "RULE_SEP"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompilation.g:4417:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCompilation.g:4417:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCompilation.g:4417:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCompilation.g:4417:11: '^'
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

            // InternalCompilation.g:4417:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCompilation.g:
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
            	    break loop13;
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
            // InternalCompilation.g:4419:10: ( ( '0' .. '9' )+ )
            // InternalCompilation.g:4419:12: ( '0' .. '9' )+
            {
            // InternalCompilation.g:4419:12: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCompilation.g:4419:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalCompilation.g:4421:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCompilation.g:4421:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCompilation.g:4421:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCompilation.g:4421:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCompilation.g:4421:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalCompilation.g:4421:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCompilation.g:4421:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCompilation.g:4421:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCompilation.g:4421:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalCompilation.g:4421:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCompilation.g:4421:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop16;
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
            // InternalCompilation.g:4423:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCompilation.g:4423:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCompilation.g:4423:24: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCompilation.g:4423:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
            // InternalCompilation.g:4425:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCompilation.g:4425:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCompilation.g:4425:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCompilation.g:4425:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop19;
                }
            } while (true);

            // InternalCompilation.g:4425:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCompilation.g:4425:41: ( '\\r' )? '\\n'
                    {
                    // InternalCompilation.g:4425:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalCompilation.g:4425:41: '\\r'
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
            // InternalCompilation.g:4427:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCompilation.g:4427:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCompilation.g:4427:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCompilation.g:
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
            // InternalCompilation.g:4429:16: ( . )
            // InternalCompilation.g:4429:18: .
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
        // InternalCompilation.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_VARIABLE | RULE_SYMBOL | RULE_SEP | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt23=40;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // InternalCompilation.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalCompilation.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalCompilation.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalCompilation.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalCompilation.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalCompilation.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalCompilation.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalCompilation.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalCompilation.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalCompilation.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalCompilation.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalCompilation.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalCompilation.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalCompilation.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalCompilation.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalCompilation.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalCompilation.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalCompilation.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalCompilation.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalCompilation.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalCompilation.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalCompilation.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalCompilation.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalCompilation.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalCompilation.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalCompilation.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalCompilation.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalCompilation.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalCompilation.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalCompilation.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalCompilation.g:1:190: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 32 :
                // InternalCompilation.g:1:204: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 33 :
                // InternalCompilation.g:1:216: RULE_SEP
                {
                mRULE_SEP(); 

                }
                break;
            case 34 :
                // InternalCompilation.g:1:225: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalCompilation.g:1:233: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalCompilation.g:1:242: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalCompilation.g:1:254: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalCompilation.g:1:270: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalCompilation.g:1:286: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalCompilation.g:1:294: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\1\uffff\2\46\1\55\1\46\1\uffff\1\46\2\uffff\5\46\2\43\1\uffff\1\43\2\uffff\3\46\1\104\1\46\1\107\1\110\2\107\1\43\2\uffff\3\43\1\uffff\2\46\1\uffff\1\46\1\112\1\122\2\46\2\uffff\1\46\1\uffff\2\46\2\uffff\1\130\1\131\1\132\1\133\1\46\1\135\1\46\6\uffff\2\46\1\141\1\uffff\1\104\1\112\2\uffff\1\107\5\uffff\1\143\1\144\1\46\1\uffff\1\46\1\147\3\46\4\uffff\1\46\1\uffff\3\46\1\uffff\1\104\2\uffff\2\46\1\uffff\1\161\2\46\1\164\1\165\1\166\1\167\2\46\1\uffff\1\172\1\173\4\uffff\2\46\2\uffff\1\46\1\177\1\u0080\2\uffff";
    static final String DFA23_eofS =
        "\u0081\uffff";
    static final String DFA23_minS =
        "\1\0\2\60\1\75\1\60\1\uffff\1\60\2\uffff\5\60\1\46\1\174\1\uffff\1\77\2\uffff\5\60\1\11\1\12\2\11\1\101\2\uffff\2\0\1\52\1\uffff\2\60\1\uffff\2\60\1\41\2\60\2\uffff\1\60\1\uffff\2\60\2\uffff\4\41\1\60\1\41\1\60\6\uffff\2\60\1\41\1\uffff\2\60\2\uffff\1\11\5\uffff\2\41\1\60\1\uffff\1\60\1\41\3\60\4\uffff\1\60\1\uffff\3\60\1\uffff\1\60\2\uffff\2\60\1\uffff\1\41\2\60\4\41\2\60\1\uffff\2\41\4\uffff\2\60\2\uffff\1\60\2\41\2\uffff";
    static final String DFA23_maxS =
        "\1\uffff\2\172\1\75\1\172\1\uffff\1\172\2\uffff\5\172\1\46\1\174\1\uffff\1\77\2\uffff\5\172\1\40\1\12\2\40\1\172\2\uffff\2\uffff\1\57\1\uffff\2\172\1\uffff\5\172\2\uffff\1\172\1\uffff\2\172\2\uffff\7\172\6\uffff\3\172\1\uffff\2\172\2\uffff\1\40\5\uffff\3\172\1\uffff\5\172\4\uffff\1\172\1\uffff\3\172\1\uffff\1\172\2\uffff\2\172\1\uffff\11\172\1\uffff\2\172\4\uffff\2\172\2\uffff\3\172\2\uffff";
    static final String DFA23_acceptS =
        "\5\uffff\1\7\1\uffff\1\11\1\12\7\uffff\1\27\1\uffff\1\31\1\32\12\uffff\1\42\1\43\3\uffff\1\50\2\uffff\1\40\5\uffff\1\13\1\5\1\uffff\1\7\2\uffff\1\11\1\12\7\uffff\1\25\1\26\1\27\1\30\1\31\1\32\3\uffff\1\37\2\uffff\1\41\1\47\1\uffff\1\42\1\43\1\44\1\45\1\46\3\uffff\1\2\5\uffff\1\15\1\16\1\20\1\24\1\uffff\1\36\3\uffff\1\35\1\uffff\1\1\1\3\2\uffff\1\17\11\uffff\1\6\2\uffff\1\21\1\22\1\33\1\34\2\uffff\1\10\1\14\3\uffff\1\23\1\4";
    static final String DFA23_specialS =
        "\1\1\37\uffff\1\2\1\0\137\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\43\1\33\1\34\2\43\1\32\22\43\1\31\1\20\1\40\2\43\1\5\1\16\1\41\1\22\1\23\2\43\1\7\2\43\1\42\12\37\1\3\1\10\1\43\1\21\3\43\32\27\3\43\1\35\1\36\1\43\2\30\1\24\1\11\1\15\1\2\1\30\1\26\1\13\2\30\1\25\1\30\1\1\1\12\2\30\1\4\1\30\1\14\2\30\1\6\3\30\1\43\1\17\uff83\43",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\45\5\47\1\44\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\51\5\47\1\53\5\47\1\52\5\47",
            "\1\54",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\56\25\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\7\47\1\61\11\47\1\60\10\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\16\47\1\64\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\3\47\1\65\26\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\5\47\1\66\7\47\1\67\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\7\47\1\70\3\47\1\71\16\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\13\47\1\72\16\47",
            "\1\73",
            "\1\74",
            "",
            "\1\76",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\16\47\1\101\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\102\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\3\47\1\103\26\47",
            "\12\105\7\uffff\32\105\4\uffff\1\106\1\uffff\32\105",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\2\110\2\uffff\1\110\22\uffff\1\110",
            "\1\111",
            "\2\110\2\uffff\1\110\22\uffff\1\110",
            "\2\110\2\uffff\1\110\22\uffff\1\110",
            "\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "",
            "\0\114",
            "\0\114",
            "\1\115\4\uffff\1\116",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\17\47\1\117\12\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\13\47\1\120\16\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\12\121\7\uffff\32\121\6\uffff\32\121",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\15\47\1\123\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\21\47\1\124\10\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\1\125\31\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\126\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\127\21\47",
            "",
            "",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\134\25\47",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\22\47\1\136\7\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\15\47\1\137\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\22\47\1\140\7\47",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "",
            "\12\105\7\uffff\32\105\4\uffff\1\106\1\uffff\32\105",
            "\12\142\7\uffff\32\142\6\uffff\32\142",
            "",
            "",
            "\2\110\2\uffff\1\110\22\uffff\1\110",
            "",
            "",
            "",
            "",
            "",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\12\121\7\uffff\32\121\4\uffff\1\50\1\uffff\32\121",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\2\47\1\145\27\47",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\146\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\3\47\1\150\26\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\151\6\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\13\47\1\152\16\47",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\15\47\1\153\14\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\154\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\22\47\1\155\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\156\6\47",
            "",
            "\12\142\7\uffff\32\142\4\uffff\1\106\1\uffff\32\142",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\157\6\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\1\160\31\47",
            "",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\162\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\163\25\47",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\170\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\2\47\1\171\27\47",
            "",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\16\47\1\174\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\7\47\1\175\22\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\50\1\uffff\15\47\1\176\14\47",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "\1\46\4\uffff\1\46\4\uffff\1\46\1\uffff\3\46\12\47\5\uffff\1\46\1\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_VARIABLE | RULE_SYMBOL | RULE_SEP | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_33 = input.LA(1);

                        s = -1;
                        if ( ((LA23_33>='\u0000' && LA23_33<='\uFFFF')) ) {s = 76;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_0 = input.LA(1);

                        s = -1;
                        if ( (LA23_0=='n') ) {s = 1;}

                        else if ( (LA23_0=='f') ) {s = 2;}

                        else if ( (LA23_0==':') ) {s = 3;}

                        else if ( (LA23_0=='r') ) {s = 4;}

                        else if ( (LA23_0=='%') ) {s = 5;}

                        else if ( (LA23_0=='w') ) {s = 6;}

                        else if ( (LA23_0==',') ) {s = 7;}

                        else if ( (LA23_0==';') ) {s = 8;}

                        else if ( (LA23_0=='d') ) {s = 9;}

                        else if ( (LA23_0=='o') ) {s = 10;}

                        else if ( (LA23_0=='i') ) {s = 11;}

                        else if ( (LA23_0=='t') ) {s = 12;}

                        else if ( (LA23_0=='e') ) {s = 13;}

                        else if ( (LA23_0=='&') ) {s = 14;}

                        else if ( (LA23_0=='|') ) {s = 15;}

                        else if ( (LA23_0=='!') ) {s = 16;}

                        else if ( (LA23_0=='=') ) {s = 17;}

                        else if ( (LA23_0=='(') ) {s = 18;}

                        else if ( (LA23_0==')') ) {s = 19;}

                        else if ( (LA23_0=='c') ) {s = 20;}

                        else if ( (LA23_0=='l') ) {s = 21;}

                        else if ( (LA23_0=='h') ) {s = 22;}

                        else if ( ((LA23_0>='A' && LA23_0<='Z')) ) {s = 23;}

                        else if ( ((LA23_0>='a' && LA23_0<='b')||LA23_0=='g'||(LA23_0>='j' && LA23_0<='k')||LA23_0=='m'||(LA23_0>='p' && LA23_0<='q')||LA23_0=='s'||(LA23_0>='u' && LA23_0<='v')||(LA23_0>='x' && LA23_0<='z')) ) {s = 24;}

                        else if ( (LA23_0==' ') ) {s = 25;}

                        else if ( (LA23_0=='\r') ) {s = 26;}

                        else if ( (LA23_0=='\t') ) {s = 27;}

                        else if ( (LA23_0=='\n') ) {s = 28;}

                        else if ( (LA23_0=='^') ) {s = 29;}

                        else if ( (LA23_0=='_') ) {s = 30;}

                        else if ( ((LA23_0>='0' && LA23_0<='9')) ) {s = 31;}

                        else if ( (LA23_0=='\"') ) {s = 32;}

                        else if ( (LA23_0=='\'') ) {s = 33;}

                        else if ( (LA23_0=='/') ) {s = 34;}

                        else if ( ((LA23_0>='\u0000' && LA23_0<='\b')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\u001F')||(LA23_0>='#' && LA23_0<='$')||(LA23_0>='*' && LA23_0<='+')||(LA23_0>='-' && LA23_0<='.')||LA23_0=='<'||(LA23_0>='>' && LA23_0<='@')||(LA23_0>='[' && LA23_0<=']')||LA23_0=='`'||LA23_0=='{'||(LA23_0>='}' && LA23_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_32 = input.LA(1);

                        s = -1;
                        if ( ((LA23_32>='\u0000' && LA23_32<='\uFFFF')) ) {s = 76;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}