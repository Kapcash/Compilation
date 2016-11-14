package org.xtext.example.test.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.test.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'float'", "'boolean'", "'char'", "'String'", "'Class'", "'{'", "'}'", "';'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__ClassesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__ClassesAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__ClassesAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__ClassesAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__ClassesAssignment )*
            {
             before(grammarAccess.getModelAccess().getClassesAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__ClassesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__ClassesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ClassesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getClassesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleClasse"
    // InternalMyDsl.g:78:1: entryRuleClasse : ruleClasse EOF ;
    public final void entryRuleClasse() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleClasse EOF )
            // InternalMyDsl.g:80:1: ruleClasse EOF
            {
             before(grammarAccess.getClasseRule()); 
            pushFollow(FOLLOW_1);
            ruleClasse();

            state._fsp--;

             after(grammarAccess.getClasseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClasse"


    // $ANTLR start "ruleClasse"
    // InternalMyDsl.g:87:1: ruleClasse : ( ( rule__Classe__Group__0 ) ) ;
    public final void ruleClasse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Classe__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Classe__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Classe__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Classe__Group__0 )
            {
             before(grammarAccess.getClasseAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Classe__Group__0 )
            // InternalMyDsl.g:94:4: rule__Classe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Classe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClasseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClasse"


    // $ANTLR start "entryRuleAttribut"
    // InternalMyDsl.g:103:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleAttribut EOF )
            // InternalMyDsl.g:105:1: ruleAttribut EOF
            {
             before(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAttributRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalMyDsl.g:112:1: ruleAttribut : ( ( rule__Attribut__Group__0 ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Attribut__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Attribut__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Attribut__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Attribut__Group__0 )
            {
             before(grammarAccess.getAttributAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Attribut__Group__0 )
            // InternalMyDsl.g:119:4: rule__Attribut__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "rule__Attribut__TypeAlternatives_0_0"
    // InternalMyDsl.g:127:1: rule__Attribut__TypeAlternatives_0_0 : ( ( 'int' ) | ( 'float' ) | ( 'boolean' ) | ( 'char' ) | ( 'String' ) );
    public final void rule__Attribut__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:131:1: ( ( 'int' ) | ( 'float' ) | ( 'boolean' ) | ( 'char' ) | ( 'String' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:132:2: ( 'int' )
                    {
                    // InternalMyDsl.g:132:2: ( 'int' )
                    // InternalMyDsl.g:133:3: 'int'
                    {
                     before(grammarAccess.getAttributAccess().getTypeIntKeyword_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getTypeIntKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:138:2: ( 'float' )
                    {
                    // InternalMyDsl.g:138:2: ( 'float' )
                    // InternalMyDsl.g:139:3: 'float'
                    {
                     before(grammarAccess.getAttributAccess().getTypeFloatKeyword_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getTypeFloatKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:144:2: ( 'boolean' )
                    {
                    // InternalMyDsl.g:144:2: ( 'boolean' )
                    // InternalMyDsl.g:145:3: 'boolean'
                    {
                     before(grammarAccess.getAttributAccess().getTypeBooleanKeyword_0_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getTypeBooleanKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:150:2: ( 'char' )
                    {
                    // InternalMyDsl.g:150:2: ( 'char' )
                    // InternalMyDsl.g:151:3: 'char'
                    {
                     before(grammarAccess.getAttributAccess().getTypeCharKeyword_0_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getTypeCharKeyword_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:156:2: ( 'String' )
                    {
                    // InternalMyDsl.g:156:2: ( 'String' )
                    // InternalMyDsl.g:157:3: 'String'
                    {
                     before(grammarAccess.getAttributAccess().getTypeStringKeyword_0_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAttributAccess().getTypeStringKeyword_0_0_4()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__TypeAlternatives_0_0"


    // $ANTLR start "rule__Classe__Group__0"
    // InternalMyDsl.g:166:1: rule__Classe__Group__0 : rule__Classe__Group__0__Impl rule__Classe__Group__1 ;
    public final void rule__Classe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:170:1: ( rule__Classe__Group__0__Impl rule__Classe__Group__1 )
            // InternalMyDsl.g:171:2: rule__Classe__Group__0__Impl rule__Classe__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Classe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__0"


    // $ANTLR start "rule__Classe__Group__0__Impl"
    // InternalMyDsl.g:178:1: rule__Classe__Group__0__Impl : ( 'Class' ) ;
    public final void rule__Classe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:182:1: ( ( 'Class' ) )
            // InternalMyDsl.g:183:1: ( 'Class' )
            {
            // InternalMyDsl.g:183:1: ( 'Class' )
            // InternalMyDsl.g:184:2: 'Class'
            {
             before(grammarAccess.getClasseAccess().getClassKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__0__Impl"


    // $ANTLR start "rule__Classe__Group__1"
    // InternalMyDsl.g:193:1: rule__Classe__Group__1 : rule__Classe__Group__1__Impl rule__Classe__Group__2 ;
    public final void rule__Classe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:197:1: ( rule__Classe__Group__1__Impl rule__Classe__Group__2 )
            // InternalMyDsl.g:198:2: rule__Classe__Group__1__Impl rule__Classe__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Classe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__1"


    // $ANTLR start "rule__Classe__Group__1__Impl"
    // InternalMyDsl.g:205:1: rule__Classe__Group__1__Impl : ( ( rule__Classe__NameAssignment_1 ) ) ;
    public final void rule__Classe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:209:1: ( ( ( rule__Classe__NameAssignment_1 ) ) )
            // InternalMyDsl.g:210:1: ( ( rule__Classe__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:210:1: ( ( rule__Classe__NameAssignment_1 ) )
            // InternalMyDsl.g:211:2: ( rule__Classe__NameAssignment_1 )
            {
             before(grammarAccess.getClasseAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:212:2: ( rule__Classe__NameAssignment_1 )
            // InternalMyDsl.g:212:3: rule__Classe__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Classe__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClasseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__1__Impl"


    // $ANTLR start "rule__Classe__Group__2"
    // InternalMyDsl.g:220:1: rule__Classe__Group__2 : rule__Classe__Group__2__Impl rule__Classe__Group__3 ;
    public final void rule__Classe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:224:1: ( rule__Classe__Group__2__Impl rule__Classe__Group__3 )
            // InternalMyDsl.g:225:2: rule__Classe__Group__2__Impl rule__Classe__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Classe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__2"


    // $ANTLR start "rule__Classe__Group__2__Impl"
    // InternalMyDsl.g:232:1: rule__Classe__Group__2__Impl : ( '{' ) ;
    public final void rule__Classe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:236:1: ( ( '{' ) )
            // InternalMyDsl.g:237:1: ( '{' )
            {
            // InternalMyDsl.g:237:1: ( '{' )
            // InternalMyDsl.g:238:2: '{'
            {
             before(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__2__Impl"


    // $ANTLR start "rule__Classe__Group__3"
    // InternalMyDsl.g:247:1: rule__Classe__Group__3 : rule__Classe__Group__3__Impl rule__Classe__Group__4 ;
    public final void rule__Classe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:251:1: ( rule__Classe__Group__3__Impl rule__Classe__Group__4 )
            // InternalMyDsl.g:252:2: rule__Classe__Group__3__Impl rule__Classe__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Classe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__3"


    // $ANTLR start "rule__Classe__Group__3__Impl"
    // InternalMyDsl.g:259:1: rule__Classe__Group__3__Impl : ( ( rule__Classe__AttributsAssignment_3 )* ) ;
    public final void rule__Classe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:263:1: ( ( ( rule__Classe__AttributsAssignment_3 )* ) )
            // InternalMyDsl.g:264:1: ( ( rule__Classe__AttributsAssignment_3 )* )
            {
            // InternalMyDsl.g:264:1: ( ( rule__Classe__AttributsAssignment_3 )* )
            // InternalMyDsl.g:265:2: ( rule__Classe__AttributsAssignment_3 )*
            {
             before(grammarAccess.getClasseAccess().getAttributsAssignment_3()); 
            // InternalMyDsl.g:266:2: ( rule__Classe__AttributsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=15)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:266:3: rule__Classe__AttributsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Classe__AttributsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getClasseAccess().getAttributsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__3__Impl"


    // $ANTLR start "rule__Classe__Group__4"
    // InternalMyDsl.g:274:1: rule__Classe__Group__4 : rule__Classe__Group__4__Impl ;
    public final void rule__Classe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:278:1: ( rule__Classe__Group__4__Impl )
            // InternalMyDsl.g:279:2: rule__Classe__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Classe__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__4"


    // $ANTLR start "rule__Classe__Group__4__Impl"
    // InternalMyDsl.g:285:1: rule__Classe__Group__4__Impl : ( '}' ) ;
    public final void rule__Classe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:289:1: ( ( '}' ) )
            // InternalMyDsl.g:290:1: ( '}' )
            {
            // InternalMyDsl.g:290:1: ( '}' )
            // InternalMyDsl.g:291:2: '}'
            {
             before(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__4__Impl"


    // $ANTLR start "rule__Attribut__Group__0"
    // InternalMyDsl.g:301:1: rule__Attribut__Group__0 : rule__Attribut__Group__0__Impl rule__Attribut__Group__1 ;
    public final void rule__Attribut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:305:1: ( rule__Attribut__Group__0__Impl rule__Attribut__Group__1 )
            // InternalMyDsl.g:306:2: rule__Attribut__Group__0__Impl rule__Attribut__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Attribut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__0"


    // $ANTLR start "rule__Attribut__Group__0__Impl"
    // InternalMyDsl.g:313:1: rule__Attribut__Group__0__Impl : ( ( rule__Attribut__TypeAssignment_0 ) ) ;
    public final void rule__Attribut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:317:1: ( ( ( rule__Attribut__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:318:1: ( ( rule__Attribut__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:318:1: ( ( rule__Attribut__TypeAssignment_0 ) )
            // InternalMyDsl.g:319:2: ( rule__Attribut__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:320:2: ( rule__Attribut__TypeAssignment_0 )
            // InternalMyDsl.g:320:3: rule__Attribut__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__0__Impl"


    // $ANTLR start "rule__Attribut__Group__1"
    // InternalMyDsl.g:328:1: rule__Attribut__Group__1 : rule__Attribut__Group__1__Impl rule__Attribut__Group__2 ;
    public final void rule__Attribut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:332:1: ( rule__Attribut__Group__1__Impl rule__Attribut__Group__2 )
            // InternalMyDsl.g:333:2: rule__Attribut__Group__1__Impl rule__Attribut__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Attribut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__1"


    // $ANTLR start "rule__Attribut__Group__1__Impl"
    // InternalMyDsl.g:340:1: rule__Attribut__Group__1__Impl : ( ( rule__Attribut__NameAssignment_1 ) ) ;
    public final void rule__Attribut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:344:1: ( ( ( rule__Attribut__NameAssignment_1 ) ) )
            // InternalMyDsl.g:345:1: ( ( rule__Attribut__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:345:1: ( ( rule__Attribut__NameAssignment_1 ) )
            // InternalMyDsl.g:346:2: ( rule__Attribut__NameAssignment_1 )
            {
             before(grammarAccess.getAttributAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:347:2: ( rule__Attribut__NameAssignment_1 )
            // InternalMyDsl.g:347:3: rule__Attribut__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__1__Impl"


    // $ANTLR start "rule__Attribut__Group__2"
    // InternalMyDsl.g:355:1: rule__Attribut__Group__2 : rule__Attribut__Group__2__Impl ;
    public final void rule__Attribut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:359:1: ( rule__Attribut__Group__2__Impl )
            // InternalMyDsl.g:360:2: rule__Attribut__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__2"


    // $ANTLR start "rule__Attribut__Group__2__Impl"
    // InternalMyDsl.g:366:1: rule__Attribut__Group__2__Impl : ( ';' ) ;
    public final void rule__Attribut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:370:1: ( ( ';' ) )
            // InternalMyDsl.g:371:1: ( ';' )
            {
            // InternalMyDsl.g:371:1: ( ';' )
            // InternalMyDsl.g:372:2: ';'
            {
             before(grammarAccess.getAttributAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__2__Impl"


    // $ANTLR start "rule__Model__ClassesAssignment"
    // InternalMyDsl.g:382:1: rule__Model__ClassesAssignment : ( ruleClasse ) ;
    public final void rule__Model__ClassesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:386:1: ( ( ruleClasse ) )
            // InternalMyDsl.g:387:2: ( ruleClasse )
            {
            // InternalMyDsl.g:387:2: ( ruleClasse )
            // InternalMyDsl.g:388:3: ruleClasse
            {
             before(grammarAccess.getModelAccess().getClassesClasseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleClasse();

            state._fsp--;

             after(grammarAccess.getModelAccess().getClassesClasseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ClassesAssignment"


    // $ANTLR start "rule__Classe__NameAssignment_1"
    // InternalMyDsl.g:397:1: rule__Classe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Classe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:401:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:402:2: ( RULE_ID )
            {
            // InternalMyDsl.g:402:2: ( RULE_ID )
            // InternalMyDsl.g:403:3: RULE_ID
            {
             before(grammarAccess.getClasseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__NameAssignment_1"


    // $ANTLR start "rule__Classe__AttributsAssignment_3"
    // InternalMyDsl.g:412:1: rule__Classe__AttributsAssignment_3 : ( ruleAttribut ) ;
    public final void rule__Classe__AttributsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:1: ( ( ruleAttribut ) )
            // InternalMyDsl.g:417:2: ( ruleAttribut )
            {
            // InternalMyDsl.g:417:2: ( ruleAttribut )
            // InternalMyDsl.g:418:3: ruleAttribut
            {
             before(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__AttributsAssignment_3"


    // $ANTLR start "rule__Attribut__TypeAssignment_0"
    // InternalMyDsl.g:427:1: rule__Attribut__TypeAssignment_0 : ( ( rule__Attribut__TypeAlternatives_0_0 ) ) ;
    public final void rule__Attribut__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( ( ( rule__Attribut__TypeAlternatives_0_0 ) ) )
            // InternalMyDsl.g:432:2: ( ( rule__Attribut__TypeAlternatives_0_0 ) )
            {
            // InternalMyDsl.g:432:2: ( ( rule__Attribut__TypeAlternatives_0_0 ) )
            // InternalMyDsl.g:433:3: ( rule__Attribut__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getAttributAccess().getTypeAlternatives_0_0()); 
            // InternalMyDsl.g:434:3: ( rule__Attribut__TypeAlternatives_0_0 )
            // InternalMyDsl.g:434:4: rule__Attribut__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getTypeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__TypeAssignment_0"


    // $ANTLR start "rule__Attribut__NameAssignment_1"
    // InternalMyDsl.g:442:1: rule__Attribut__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:446:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:447:2: ( RULE_ID )
            {
            // InternalMyDsl.g:447:2: ( RULE_ID )
            // InternalMyDsl.g:448:3: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000004F800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});

}