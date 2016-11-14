// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 vsl.g 2009-11-02 17:54:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class vslLexer extends Lexer {
    public static final int DEC=15;
    public static final int LETTER=47;
    public static final int OD_KW=36;
    public static final int PARAM=11;
    public static final int EOF=-1;
    public static final int INT_KW=21;
    public static final int INST=14;
    public static final int MOINS=40;
    public static final int PROG=5;
    public static final int RETURN_KW=27;
    public static final int IMAGINERY_TOKEN=4;
    public static final int ARELEM=13;
    public static final int IF_KW=30;
    public static final int ARDEC=10;
    public static final int VIRG=23;
    public static final int AD=38;
    public static final int IDENT=17;
    public static final int PLUS=39;
    public static final int FI_KW=33;
    public static final int AG=37;
    public static final int DIGIT=48;
    public static final int ASSIGN_KW=26;
    public static final int COMMENT=46;
    public static final int ARRAY=12;
    public static final int READ_KW=29;
    public static final int INTEGER=43;
    public static final int FCALL=9;
    public static final int DO_KW=35;
    public static final int FUNC_KW=16;
    public static final int ELSE_KW=32;
    public static final int TEXT=44;
    public static final int MUL=41;
    public static final int THEN_KW=31;
    public static final int WS=45;
    public static final int PROTO_KW=20;
    public static final int WHILE_KW=34;
    public static final int CORPS=6;
    public static final int BLOCK=8;
    public static final int ASCII=49;
    public static final int FCALL_S=7;
    public static final int CG=24;
    public static final int DIV=42;
    public static final int CD=25;
    public static final int PRINT_KW=28;
    public static final int PD=19;
    public static final int PG=18;
    public static final int VOID_KW=22;

    // delegates
    // delegators

    public vslLexer() {;} 
    public vslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public vslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "vsl.g"; }

    // $ANTLR start "PROG"
    public final void mPROG() throws RecognitionException {
        try {
            int _type = PROG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:3:6: ( 'PROG' )
            // vsl.g:3:8: 'PROG'
            {
            match("PROG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROG"

    // $ANTLR start "CORPS"
    public final void mCORPS() throws RecognitionException {
        try {
            int _type = CORPS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:4:7: ( 'CORPS' )
            // vsl.g:4:9: 'CORPS'
            {
            match("CORPS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CORPS"

    // $ANTLR start "FCALL_S"
    public final void mFCALL_S() throws RecognitionException {
        try {
            int _type = FCALL_S;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:5:9: ( 'FCALL_S' )
            // vsl.g:5:11: 'FCALL_S'
            {
            match("FCALL_S"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FCALL_S"

    // $ANTLR start "BLOCK"
    public final void mBLOCK() throws RecognitionException {
        try {
            int _type = BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:6:7: ( 'BLOCK' )
            // vsl.g:6:9: 'BLOCK'
            {
            match("BLOCK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLOCK"

    // $ANTLR start "FCALL"
    public final void mFCALL() throws RecognitionException {
        try {
            int _type = FCALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:7:7: ( 'FCALL' )
            // vsl.g:7:9: 'FCALL'
            {
            match("FCALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FCALL"

    // $ANTLR start "ARDEC"
    public final void mARDEC() throws RecognitionException {
        try {
            int _type = ARDEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:8:7: ( 'ARDEC' )
            // vsl.g:8:9: 'ARDEC'
            {
            match("ARDEC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARDEC"

    // $ANTLR start "PARAM"
    public final void mPARAM() throws RecognitionException {
        try {
            int _type = PARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:9:7: ( 'PARAM' )
            // vsl.g:9:9: 'PARAM'
            {
            match("PARAM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARAM"

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:10:7: ( 'ARRAY' )
            // vsl.g:10:9: 'ARRAY'
            {
            match("ARRAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY"

    // $ANTLR start "ARELEM"
    public final void mARELEM() throws RecognitionException {
        try {
            int _type = ARELEM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:11:8: ( 'ARELEM' )
            // vsl.g:11:10: 'ARELEM'
            {
            match("ARELEM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARELEM"

    // $ANTLR start "INST"
    public final void mINST() throws RecognitionException {
        try {
            int _type = INST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:12:6: ( 'INST' )
            // vsl.g:12:8: 'INST'
            {
            match("INST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INST"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:13:5: ( 'DEC' )
            // vsl.g:13:7: 'DEC'
            {
            match("DEC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:142:17: ( ( ' ' | '\\n' | '\\t' | '\\r' ) )
            // vsl.g:142:20: ( ' ' | '\\n' | '\\t' | '\\r' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:146:10: ( '//' (~ '\\n' )* )
            // vsl.g:146:12: '//' (~ '\\n' )*
            {
            match("//"); 

            // vsl.g:146:16: (~ '\\n' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // vsl.g:146:17: ~ '\\n'
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
            	    break loop1;
                }
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // vsl.g:150:9: ( 'a' .. 'z' )
            // vsl.g:150:11: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // vsl.g:153:8: ( '0' .. '9' )
            // vsl.g:153:10: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ASCII"
    public final void mASCII() throws RecognitionException {
        try {
            // vsl.g:156:8: (~ ( '\\n' | '\\\"' ) )
            // vsl.g:156:10: ~ ( '\\n' | '\\\"' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end "ASCII"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:158:8: ( LETTER ( LETTER | DIGIT )* )
            // vsl.g:158:10: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // vsl.g:158:16: ( LETTER | DIGIT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // vsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "IDENT"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:160:7: ( '\\\"' ( ASCII )* '\\\"' )
            // vsl.g:160:9: '\\\"' ( ASCII )* '\\\"'
            {
            match('\"'); 
            // vsl.g:160:14: ( ASCII )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // vsl.g:160:14: ASCII
            	    {
            	    mASCII(); 

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
    // $ANTLR end "TEXT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:162:10: ( ( DIGIT )+ )
            // vsl.g:162:12: ( DIGIT )+
            {
            // vsl.g:162:12: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // vsl.g:162:12: DIGIT
            	    {
            	    mDIGIT(); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "PG"
    public final void mPG() throws RecognitionException {
        try {
            int _type = PG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:163:5: ( '(' )
            // vsl.g:163:7: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PG"

    // $ANTLR start "PD"
    public final void mPD() throws RecognitionException {
        try {
            int _type = PD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:164:5: ( ')' )
            // vsl.g:164:7: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PD"

    // $ANTLR start "CG"
    public final void mCG() throws RecognitionException {
        try {
            int _type = CG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:165:5: ( '[' )
            // vsl.g:165:7: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CG"

    // $ANTLR start "CD"
    public final void mCD() throws RecognitionException {
        try {
            int _type = CD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:166:5: ( ']' )
            // vsl.g:166:7: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CD"

    // $ANTLR start "AG"
    public final void mAG() throws RecognitionException {
        try {
            int _type = AG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:167:5: ( '{' )
            // vsl.g:167:7: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AG"

    // $ANTLR start "AD"
    public final void mAD() throws RecognitionException {
        try {
            int _type = AD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:168:5: ( '}' )
            // vsl.g:168:7: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AD"

    // $ANTLR start "VIRG"
    public final void mVIRG() throws RecognitionException {
        try {
            int _type = VIRG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:169:7: ( ',' )
            // vsl.g:169:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VIRG"

    // $ANTLR start "FUNC_KW"
    public final void mFUNC_KW() throws RecognitionException {
        try {
            int _type = FUNC_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:170:10: ( 'FUNC' )
            // vsl.g:170:12: 'FUNC'
            {
            match("FUNC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNC_KW"

    // $ANTLR start "PROTO_KW"
    public final void mPROTO_KW() throws RecognitionException {
        try {
            int _type = PROTO_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:171:10: ( 'PROTO' )
            // vsl.g:171:12: 'PROTO'
            {
            match("PROTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROTO_KW"

    // $ANTLR start "INT_KW"
    public final void mINT_KW() throws RecognitionException {
        try {
            int _type = INT_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:172:9: ( 'INT' )
            // vsl.g:172:11: 'INT'
            {
            match("INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_KW"

    // $ANTLR start "VOID_KW"
    public final void mVOID_KW() throws RecognitionException {
        try {
            int _type = VOID_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:173:10: ( 'VOID' )
            // vsl.g:173:12: 'VOID'
            {
            match("VOID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VOID_KW"

    // $ANTLR start "ASSIGN_KW"
    public final void mASSIGN_KW() throws RecognitionException {
        try {
            int _type = ASSIGN_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:174:11: ( ':=' )
            // vsl.g:174:13: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN_KW"

    // $ANTLR start "RETURN_KW"
    public final void mRETURN_KW() throws RecognitionException {
        try {
            int _type = RETURN_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:175:11: ( 'RETURN' )
            // vsl.g:175:13: 'RETURN'
            {
            match("RETURN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN_KW"

    // $ANTLR start "PRINT_KW"
    public final void mPRINT_KW() throws RecognitionException {
        try {
            int _type = PRINT_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:176:10: ( 'PRINT' )
            // vsl.g:176:12: 'PRINT'
            {
            match("PRINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT_KW"

    // $ANTLR start "READ_KW"
    public final void mREAD_KW() throws RecognitionException {
        try {
            int _type = READ_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:177:10: ( 'READ' )
            // vsl.g:177:12: 'READ'
            {
            match("READ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READ_KW"

    // $ANTLR start "IF_KW"
    public final void mIF_KW() throws RecognitionException {
        try {
            int _type = IF_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:178:8: ( 'IF' )
            // vsl.g:178:10: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF_KW"

    // $ANTLR start "THEN_KW"
    public final void mTHEN_KW() throws RecognitionException {
        try {
            int _type = THEN_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:179:10: ( 'THEN' )
            // vsl.g:179:12: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN_KW"

    // $ANTLR start "ELSE_KW"
    public final void mELSE_KW() throws RecognitionException {
        try {
            int _type = ELSE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:180:10: ( 'ELSE' )
            // vsl.g:180:12: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE_KW"

    // $ANTLR start "FI_KW"
    public final void mFI_KW() throws RecognitionException {
        try {
            int _type = FI_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:181:8: ( 'FI' )
            // vsl.g:181:10: 'FI'
            {
            match("FI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FI_KW"

    // $ANTLR start "WHILE_KW"
    public final void mWHILE_KW() throws RecognitionException {
        try {
            int _type = WHILE_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:182:10: ( 'WHILE' )
            // vsl.g:182:12: 'WHILE'
            {
            match("WHILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE_KW"

    // $ANTLR start "DO_KW"
    public final void mDO_KW() throws RecognitionException {
        try {
            int _type = DO_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:183:8: ( 'DO' )
            // vsl.g:183:10: 'DO'
            {
            match("DO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO_KW"

    // $ANTLR start "OD_KW"
    public final void mOD_KW() throws RecognitionException {
        try {
            int _type = OD_KW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:184:8: ( 'DONE' )
            // vsl.g:184:10: 'DONE'
            {
            match("DONE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OD_KW"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:185:7: ( '+' )
            // vsl.g:185:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MOINS"
    public final void mMOINS() throws RecognitionException {
        try {
            int _type = MOINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:186:8: ( '-' )
            // vsl.g:186:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOINS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:187:6: ( '*' )
            // vsl.g:187:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // vsl.g:188:6: ( '/' )
            // vsl.g:188:8: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    public void mTokens() throws RecognitionException {
        // vsl.g:1:8: ( PROG | CORPS | FCALL_S | BLOCK | FCALL | ARDEC | PARAM | ARRAY | ARELEM | INST | DEC | WS | COMMENT | IDENT | TEXT | INTEGER | PG | PD | CG | CD | AG | AD | VIRG | FUNC_KW | PROTO_KW | INT_KW | VOID_KW | ASSIGN_KW | RETURN_KW | PRINT_KW | READ_KW | IF_KW | THEN_KW | ELSE_KW | FI_KW | WHILE_KW | DO_KW | OD_KW | PLUS | MOINS | MUL | DIV )
        int alt5=42;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // vsl.g:1:10: PROG
                {
                mPROG(); 

                }
                break;
            case 2 :
                // vsl.g:1:15: CORPS
                {
                mCORPS(); 

                }
                break;
            case 3 :
                // vsl.g:1:21: FCALL_S
                {
                mFCALL_S(); 

                }
                break;
            case 4 :
                // vsl.g:1:29: BLOCK
                {
                mBLOCK(); 

                }
                break;
            case 5 :
                // vsl.g:1:35: FCALL
                {
                mFCALL(); 

                }
                break;
            case 6 :
                // vsl.g:1:41: ARDEC
                {
                mARDEC(); 

                }
                break;
            case 7 :
                // vsl.g:1:47: PARAM
                {
                mPARAM(); 

                }
                break;
            case 8 :
                // vsl.g:1:53: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 9 :
                // vsl.g:1:59: ARELEM
                {
                mARELEM(); 

                }
                break;
            case 10 :
                // vsl.g:1:66: INST
                {
                mINST(); 

                }
                break;
            case 11 :
                // vsl.g:1:71: DEC
                {
                mDEC(); 

                }
                break;
            case 12 :
                // vsl.g:1:75: WS
                {
                mWS(); 

                }
                break;
            case 13 :
                // vsl.g:1:78: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 14 :
                // vsl.g:1:86: IDENT
                {
                mIDENT(); 

                }
                break;
            case 15 :
                // vsl.g:1:92: TEXT
                {
                mTEXT(); 

                }
                break;
            case 16 :
                // vsl.g:1:97: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 17 :
                // vsl.g:1:105: PG
                {
                mPG(); 

                }
                break;
            case 18 :
                // vsl.g:1:108: PD
                {
                mPD(); 

                }
                break;
            case 19 :
                // vsl.g:1:111: CG
                {
                mCG(); 

                }
                break;
            case 20 :
                // vsl.g:1:114: CD
                {
                mCD(); 

                }
                break;
            case 21 :
                // vsl.g:1:117: AG
                {
                mAG(); 

                }
                break;
            case 22 :
                // vsl.g:1:120: AD
                {
                mAD(); 

                }
                break;
            case 23 :
                // vsl.g:1:123: VIRG
                {
                mVIRG(); 

                }
                break;
            case 24 :
                // vsl.g:1:128: FUNC_KW
                {
                mFUNC_KW(); 

                }
                break;
            case 25 :
                // vsl.g:1:136: PROTO_KW
                {
                mPROTO_KW(); 

                }
                break;
            case 26 :
                // vsl.g:1:145: INT_KW
                {
                mINT_KW(); 

                }
                break;
            case 27 :
                // vsl.g:1:152: VOID_KW
                {
                mVOID_KW(); 

                }
                break;
            case 28 :
                // vsl.g:1:160: ASSIGN_KW
                {
                mASSIGN_KW(); 

                }
                break;
            case 29 :
                // vsl.g:1:170: RETURN_KW
                {
                mRETURN_KW(); 

                }
                break;
            case 30 :
                // vsl.g:1:180: PRINT_KW
                {
                mPRINT_KW(); 

                }
                break;
            case 31 :
                // vsl.g:1:189: READ_KW
                {
                mREAD_KW(); 

                }
                break;
            case 32 :
                // vsl.g:1:197: IF_KW
                {
                mIF_KW(); 

                }
                break;
            case 33 :
                // vsl.g:1:203: THEN_KW
                {
                mTHEN_KW(); 

                }
                break;
            case 34 :
                // vsl.g:1:211: ELSE_KW
                {
                mELSE_KW(); 

                }
                break;
            case 35 :
                // vsl.g:1:219: FI_KW
                {
                mFI_KW(); 

                }
                break;
            case 36 :
                // vsl.g:1:225: WHILE_KW
                {
                mWHILE_KW(); 

                }
                break;
            case 37 :
                // vsl.g:1:234: DO_KW
                {
                mDO_KW(); 

                }
                break;
            case 38 :
                // vsl.g:1:240: OD_KW
                {
                mOD_KW(); 

                }
                break;
            case 39 :
                // vsl.g:1:246: PLUS
                {
                mPLUS(); 

                }
                break;
            case 40 :
                // vsl.g:1:251: MOINS
                {
                mMOINS(); 

                }
                break;
            case 41 :
                // vsl.g:1:257: MUL
                {
                mMUL(); 

                }
                break;
            case 42 :
                // vsl.g:1:261: DIV
                {
                mDIV(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\11\uffff\1\50\34\uffff\1\63\22\uffff\1\73\2\uffff";
    static final String DFA5_eofS =
        "\74\uffff";
    static final String DFA5_minS =
        "\1\11\1\101\1\uffff\1\103\1\uffff\1\122\1\106\1\105\1\uffff\1\57"+
        "\14\uffff\1\105\6\uffff\1\111\1\uffff\1\101\2\uffff\1\104\1\123"+
        "\2\uffff\1\116\2\uffff\1\101\1\107\1\uffff\1\114\13\uffff\1\114"+
        "\1\137\2\uffff";
    static final String DFA5_maxS =
        "\1\175\1\122\1\uffff\1\125\1\uffff\1\122\1\116\1\117\1\uffff\1\57"+
        "\14\uffff\1\105\6\uffff\1\117\1\uffff\1\101\2\uffff\1\122\1\124"+
        "\2\uffff\1\116\2\uffff\2\124\1\uffff\1\114\13\uffff\1\114\1\137"+
        "\2\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\3\uffff\1\14\1\uffff\1\16\1\17\1\20\1\21"+
        "\1\22\1\23\1\24\1\25\1\26\1\27\1\33\1\34\1\uffff\1\41\1\42\1\44"+
        "\1\47\1\50\1\51\1\uffff\1\7\1\uffff\1\30\1\43\2\uffff\1\40\1\13"+
        "\1\uffff\1\15\1\52\2\uffff\1\36\1\uffff\1\6\1\10\1\11\1\12\1\32"+
        "\1\46\1\45\1\35\1\37\1\1\1\31\2\uffff\1\3\1\5";
    static final String DFA5_specialS =
        "\74\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\10\2\uffff\1\10\22\uffff\1\10\1\uffff\1\13\5\uffff\1\15\1"+
            "\16\1\34\1\32\1\23\1\33\1\uffff\1\11\12\14\1\25\6\uffff\1\5"+
            "\1\4\1\2\1\7\1\30\1\3\2\uffff\1\6\6\uffff\1\1\1\uffff\1\26\1"+
            "\uffff\1\27\1\uffff\1\24\1\31\3\uffff\1\17\1\uffff\1\20\3\uffff"+
            "\32\12\1\21\1\uffff\1\22",
            "\1\36\20\uffff\1\35",
            "",
            "\1\37\5\uffff\1\41\13\uffff\1\40",
            "",
            "\1\42",
            "\1\44\7\uffff\1\43",
            "\1\45\11\uffff\1\46",
            "",
            "\1\47",
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
            "",
            "",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\5\uffff\1\52",
            "",
            "\1\54",
            "",
            "",
            "\1\55\1\57\14\uffff\1\56",
            "\1\60\1\61",
            "",
            "",
            "\1\62",
            "",
            "",
            "\1\65\22\uffff\1\64",
            "\1\66\14\uffff\1\67",
            "",
            "\1\70",
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
            "",
            "\1\71",
            "\1\72",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PROG | CORPS | FCALL_S | BLOCK | FCALL | ARDEC | PARAM | ARRAY | ARELEM | INST | DEC | WS | COMMENT | IDENT | TEXT | INTEGER | PG | PD | CG | CD | AG | AD | VIRG | FUNC_KW | PROTO_KW | INT_KW | VOID_KW | ASSIGN_KW | RETURN_KW | PRINT_KW | READ_KW | IF_KW | THEN_KW | ELSE_KW | FI_KW | WHILE_KW | DO_KW | OD_KW | PLUS | MOINS | MUL | DIV );";
        }
    }
 

}