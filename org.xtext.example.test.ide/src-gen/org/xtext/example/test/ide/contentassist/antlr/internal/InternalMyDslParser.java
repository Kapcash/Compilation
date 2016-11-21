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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'%'", "'read'", "','", "'write'", "':='", "'nop'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__FunctionsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__FunctionsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__FunctionsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__FunctionsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__FunctionsAssignment )*
            {
             before(grammarAccess.getModelAccess().getFunctionsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__FunctionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__FunctionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__FunctionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFunctionsAssignment()); 

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


    // $ANTLR start "entryRuleFunction"
    // InternalMyDsl.g:78:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleFunction EOF )
            // InternalMyDsl.g:80:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMyDsl.g:87:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Function__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Function__Group__0 )
            // InternalMyDsl.g:94:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleRead"
    // InternalMyDsl.g:103:1: entryRuleRead : ruleRead EOF ;
    public final void entryRuleRead() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleRead EOF )
            // InternalMyDsl.g:105:1: ruleRead EOF
            {
             before(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            ruleRead();

            state._fsp--;

             after(grammarAccess.getReadRule()); 
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
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalMyDsl.g:112:1: ruleRead : ( ( rule__Read__Group__0 ) ) ;
    public final void ruleRead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Read__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Read__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Read__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Read__Group__0 )
            {
             before(grammarAccess.getReadAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Read__Group__0 )
            // InternalMyDsl.g:119:4: rule__Read__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getGroup()); 

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
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleWrite"
    // InternalMyDsl.g:128:1: entryRuleWrite : ruleWrite EOF ;
    public final void entryRuleWrite() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleWrite EOF )
            // InternalMyDsl.g:130:1: ruleWrite EOF
            {
             before(grammarAccess.getWriteRule()); 
            pushFollow(FOLLOW_1);
            ruleWrite();

            state._fsp--;

             after(grammarAccess.getWriteRule()); 
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
    // $ANTLR end "entryRuleWrite"


    // $ANTLR start "ruleWrite"
    // InternalMyDsl.g:137:1: ruleWrite : ( ( rule__Write__Group__0 ) ) ;
    public final void ruleWrite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Write__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Write__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Write__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Write__Group__0 )
            {
             before(grammarAccess.getWriteAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Write__Group__0 )
            // InternalMyDsl.g:144:4: rule__Write__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Write__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWriteAccess().getGroup()); 

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
    // $ANTLR end "ruleWrite"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:153:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleCommand EOF )
            // InternalMyDsl.g:155:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDsl.g:162:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Command__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Command__Alternatives )
            // InternalMyDsl.g:169:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleNop"
    // InternalMyDsl.g:178:1: entryRuleNop : ruleNop EOF ;
    public final void entryRuleNop() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleNop EOF )
            // InternalMyDsl.g:180:1: ruleNop EOF
            {
             before(grammarAccess.getNopRule()); 
            pushFollow(FOLLOW_1);
            ruleNop();

            state._fsp--;

             after(grammarAccess.getNopRule()); 
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
    // $ANTLR end "entryRuleNop"


    // $ANTLR start "ruleNop"
    // InternalMyDsl.g:187:1: ruleNop : ( ( rule__Nop__NameAssignment ) ) ;
    public final void ruleNop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Nop__NameAssignment ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Nop__NameAssignment ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Nop__NameAssignment ) )
            // InternalMyDsl.g:193:3: ( rule__Nop__NameAssignment )
            {
             before(grammarAccess.getNopAccess().getNameAssignment()); 
            // InternalMyDsl.g:194:3: ( rule__Nop__NameAssignment )
            // InternalMyDsl.g:194:4: rule__Nop__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Nop__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNopAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleNop"


    // $ANTLR start "entryRuleAffectation"
    // InternalMyDsl.g:203:1: entryRuleAffectation : ruleAffectation EOF ;
    public final void entryRuleAffectation() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleAffectation EOF )
            // InternalMyDsl.g:205:1: ruleAffectation EOF
            {
             before(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_1);
            ruleAffectation();

            state._fsp--;

             after(grammarAccess.getAffectationRule()); 
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
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalMyDsl.g:212:1: ruleAffectation : ( ( rule__Affectation__Group__0 ) ) ;
    public final void ruleAffectation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Affectation__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Affectation__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Affectation__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Affectation__Group__0 )
            {
             before(grammarAccess.getAffectationAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Affectation__Group__0 )
            // InternalMyDsl.g:219:4: rule__Affectation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getGroup()); 

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
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalMyDsl.g:227:1: rule__Command__Alternatives : ( ( ruleNop ) | ( ruleAffectation ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:231:1: ( ( ruleNop ) | ( ruleAffectation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:232:2: ( ruleNop )
                    {
                    // InternalMyDsl.g:232:2: ( ruleNop )
                    // InternalMyDsl.g:233:3: ruleNop
                    {
                     before(grammarAccess.getCommandAccess().getNopParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNop();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getNopParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:238:2: ( ruleAffectation )
                    {
                    // InternalMyDsl.g:238:2: ( ruleAffectation )
                    // InternalMyDsl.g:239:3: ruleAffectation
                    {
                     before(grammarAccess.getCommandAccess().getAffectationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAffectation();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getAffectationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__Function__Group__0"
    // InternalMyDsl.g:248:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:252:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalMyDsl.g:253:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalMyDsl.g:260:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:264:1: ( ( 'function' ) )
            // InternalMyDsl.g:265:1: ( 'function' )
            {
            // InternalMyDsl.g:265:1: ( 'function' )
            // InternalMyDsl.g:266:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

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
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalMyDsl.g:275:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:279:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalMyDsl.g:280:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalMyDsl.g:287:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalMyDsl.g:292:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:292:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalMyDsl.g:293:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:294:2: ( rule__Function__NameAssignment_1 )
            // InternalMyDsl.g:294:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalMyDsl.g:302:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalMyDsl.g:307:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

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
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalMyDsl.g:314:1: rule__Function__Group__2__Impl : ( ':' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:318:1: ( ( ':' ) )
            // InternalMyDsl.g:319:1: ( ':' )
            {
            // InternalMyDsl.g:319:1: ( ':' )
            // InternalMyDsl.g:320:2: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalMyDsl.g:329:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:333:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalMyDsl.g:334:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

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
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalMyDsl.g:341:1: rule__Function__Group__3__Impl : ( ( rule__Function__ReadsAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:345:1: ( ( ( rule__Function__ReadsAssignment_3 ) ) )
            // InternalMyDsl.g:346:1: ( ( rule__Function__ReadsAssignment_3 ) )
            {
            // InternalMyDsl.g:346:1: ( ( rule__Function__ReadsAssignment_3 ) )
            // InternalMyDsl.g:347:2: ( rule__Function__ReadsAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getReadsAssignment_3()); 
            // InternalMyDsl.g:348:2: ( rule__Function__ReadsAssignment_3 )
            // InternalMyDsl.g:348:3: rule__Function__ReadsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Function__ReadsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getReadsAssignment_3()); 

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
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // InternalMyDsl.g:356:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:360:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalMyDsl.g:361:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__5();

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
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalMyDsl.g:368:1: rule__Function__Group__4__Impl : ( '%' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( ( '%' ) )
            // InternalMyDsl.g:373:1: ( '%' )
            {
            // InternalMyDsl.g:373:1: ( '%' )
            // InternalMyDsl.g:374:2: '%'
            {
             before(grammarAccess.getFunctionAccess().getPercentSignKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getPercentSignKeyword_4()); 

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
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // InternalMyDsl.g:383:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:387:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // InternalMyDsl.g:388:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__6();

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
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // InternalMyDsl.g:395:1: rule__Function__Group__5__Impl : ( ( rule__Function__CommandsAssignment_5 )* ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( ( ( rule__Function__CommandsAssignment_5 )* ) )
            // InternalMyDsl.g:400:1: ( ( rule__Function__CommandsAssignment_5 )* )
            {
            // InternalMyDsl.g:400:1: ( ( rule__Function__CommandsAssignment_5 )* )
            // InternalMyDsl.g:401:2: ( rule__Function__CommandsAssignment_5 )*
            {
             before(grammarAccess.getFunctionAccess().getCommandsAssignment_5()); 
            // InternalMyDsl.g:402:2: ( rule__Function__CommandsAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:402:3: rule__Function__CommandsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Function__CommandsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getCommandsAssignment_5()); 

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
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group__6"
    // InternalMyDsl.g:410:1: rule__Function__Group__6 : rule__Function__Group__6__Impl rule__Function__Group__7 ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:414:1: ( rule__Function__Group__6__Impl rule__Function__Group__7 )
            // InternalMyDsl.g:415:2: rule__Function__Group__6__Impl rule__Function__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Function__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__7();

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
    // $ANTLR end "rule__Function__Group__6"


    // $ANTLR start "rule__Function__Group__6__Impl"
    // InternalMyDsl.g:422:1: rule__Function__Group__6__Impl : ( '%' ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:426:1: ( ( '%' ) )
            // InternalMyDsl.g:427:1: ( '%' )
            {
            // InternalMyDsl.g:427:1: ( '%' )
            // InternalMyDsl.g:428:2: '%'
            {
             before(grammarAccess.getFunctionAccess().getPercentSignKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getPercentSignKeyword_6()); 

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
    // $ANTLR end "rule__Function__Group__6__Impl"


    // $ANTLR start "rule__Function__Group__7"
    // InternalMyDsl.g:437:1: rule__Function__Group__7 : rule__Function__Group__7__Impl ;
    public final void rule__Function__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:1: ( rule__Function__Group__7__Impl )
            // InternalMyDsl.g:442:2: rule__Function__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__7__Impl();

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
    // $ANTLR end "rule__Function__Group__7"


    // $ANTLR start "rule__Function__Group__7__Impl"
    // InternalMyDsl.g:448:1: rule__Function__Group__7__Impl : ( ( rule__Function__WritesAssignment_7 ) ) ;
    public final void rule__Function__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:452:1: ( ( ( rule__Function__WritesAssignment_7 ) ) )
            // InternalMyDsl.g:453:1: ( ( rule__Function__WritesAssignment_7 ) )
            {
            // InternalMyDsl.g:453:1: ( ( rule__Function__WritesAssignment_7 ) )
            // InternalMyDsl.g:454:2: ( rule__Function__WritesAssignment_7 )
            {
             before(grammarAccess.getFunctionAccess().getWritesAssignment_7()); 
            // InternalMyDsl.g:455:2: ( rule__Function__WritesAssignment_7 )
            // InternalMyDsl.g:455:3: rule__Function__WritesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Function__WritesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getWritesAssignment_7()); 

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
    // $ANTLR end "rule__Function__Group__7__Impl"


    // $ANTLR start "rule__Read__Group__0"
    // InternalMyDsl.g:464:1: rule__Read__Group__0 : rule__Read__Group__0__Impl rule__Read__Group__1 ;
    public final void rule__Read__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:468:1: ( rule__Read__Group__0__Impl rule__Read__Group__1 )
            // InternalMyDsl.g:469:2: rule__Read__Group__0__Impl rule__Read__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Read__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__1();

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
    // $ANTLR end "rule__Read__Group__0"


    // $ANTLR start "rule__Read__Group__0__Impl"
    // InternalMyDsl.g:476:1: rule__Read__Group__0__Impl : ( 'read' ) ;
    public final void rule__Read__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( ( 'read' ) )
            // InternalMyDsl.g:481:1: ( 'read' )
            {
            // InternalMyDsl.g:481:1: ( 'read' )
            // InternalMyDsl.g:482:2: 'read'
            {
             before(grammarAccess.getReadAccess().getReadKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getReadKeyword_0()); 

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
    // $ANTLR end "rule__Read__Group__0__Impl"


    // $ANTLR start "rule__Read__Group__1"
    // InternalMyDsl.g:491:1: rule__Read__Group__1 : rule__Read__Group__1__Impl rule__Read__Group__2 ;
    public final void rule__Read__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:495:1: ( rule__Read__Group__1__Impl rule__Read__Group__2 )
            // InternalMyDsl.g:496:2: rule__Read__Group__1__Impl rule__Read__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Read__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__2();

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
    // $ANTLR end "rule__Read__Group__1"


    // $ANTLR start "rule__Read__Group__1__Impl"
    // InternalMyDsl.g:503:1: rule__Read__Group__1__Impl : ( ( rule__Read__NameAssignment_1 ) ) ;
    public final void rule__Read__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( ( ( rule__Read__NameAssignment_1 ) ) )
            // InternalMyDsl.g:508:1: ( ( rule__Read__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:508:1: ( ( rule__Read__NameAssignment_1 ) )
            // InternalMyDsl.g:509:2: ( rule__Read__NameAssignment_1 )
            {
             before(grammarAccess.getReadAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:510:2: ( rule__Read__NameAssignment_1 )
            // InternalMyDsl.g:510:3: rule__Read__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Read__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Read__Group__1__Impl"


    // $ANTLR start "rule__Read__Group__2"
    // InternalMyDsl.g:518:1: rule__Read__Group__2 : rule__Read__Group__2__Impl ;
    public final void rule__Read__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:522:1: ( rule__Read__Group__2__Impl )
            // InternalMyDsl.g:523:2: rule__Read__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__2__Impl();

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
    // $ANTLR end "rule__Read__Group__2"


    // $ANTLR start "rule__Read__Group__2__Impl"
    // InternalMyDsl.g:529:1: rule__Read__Group__2__Impl : ( ( rule__Read__Group_2__0 )* ) ;
    public final void rule__Read__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:533:1: ( ( ( rule__Read__Group_2__0 )* ) )
            // InternalMyDsl.g:534:1: ( ( rule__Read__Group_2__0 )* )
            {
            // InternalMyDsl.g:534:1: ( ( rule__Read__Group_2__0 )* )
            // InternalMyDsl.g:535:2: ( rule__Read__Group_2__0 )*
            {
             before(grammarAccess.getReadAccess().getGroup_2()); 
            // InternalMyDsl.g:536:2: ( rule__Read__Group_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:536:3: rule__Read__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Read__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getReadAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Read__Group__2__Impl"


    // $ANTLR start "rule__Read__Group_2__0"
    // InternalMyDsl.g:545:1: rule__Read__Group_2__0 : rule__Read__Group_2__0__Impl rule__Read__Group_2__1 ;
    public final void rule__Read__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:549:1: ( rule__Read__Group_2__0__Impl rule__Read__Group_2__1 )
            // InternalMyDsl.g:550:2: rule__Read__Group_2__0__Impl rule__Read__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Read__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group_2__1();

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
    // $ANTLR end "rule__Read__Group_2__0"


    // $ANTLR start "rule__Read__Group_2__0__Impl"
    // InternalMyDsl.g:557:1: rule__Read__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Read__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( ( ',' ) )
            // InternalMyDsl.g:562:1: ( ',' )
            {
            // InternalMyDsl.g:562:1: ( ',' )
            // InternalMyDsl.g:563:2: ','
            {
             before(grammarAccess.getReadAccess().getCommaKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Read__Group_2__0__Impl"


    // $ANTLR start "rule__Read__Group_2__1"
    // InternalMyDsl.g:572:1: rule__Read__Group_2__1 : rule__Read__Group_2__1__Impl ;
    public final void rule__Read__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:576:1: ( rule__Read__Group_2__1__Impl )
            // InternalMyDsl.g:577:2: rule__Read__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group_2__1__Impl();

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
    // $ANTLR end "rule__Read__Group_2__1"


    // $ANTLR start "rule__Read__Group_2__1__Impl"
    // InternalMyDsl.g:583:1: rule__Read__Group_2__1__Impl : ( ( rule__Read__NameAssignment_2_1 ) ) ;
    public final void rule__Read__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:587:1: ( ( ( rule__Read__NameAssignment_2_1 ) ) )
            // InternalMyDsl.g:588:1: ( ( rule__Read__NameAssignment_2_1 ) )
            {
            // InternalMyDsl.g:588:1: ( ( rule__Read__NameAssignment_2_1 ) )
            // InternalMyDsl.g:589:2: ( rule__Read__NameAssignment_2_1 )
            {
             before(grammarAccess.getReadAccess().getNameAssignment_2_1()); 
            // InternalMyDsl.g:590:2: ( rule__Read__NameAssignment_2_1 )
            // InternalMyDsl.g:590:3: rule__Read__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Read__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getNameAssignment_2_1()); 

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
    // $ANTLR end "rule__Read__Group_2__1__Impl"


    // $ANTLR start "rule__Write__Group__0"
    // InternalMyDsl.g:599:1: rule__Write__Group__0 : rule__Write__Group__0__Impl rule__Write__Group__1 ;
    public final void rule__Write__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:603:1: ( rule__Write__Group__0__Impl rule__Write__Group__1 )
            // InternalMyDsl.g:604:2: rule__Write__Group__0__Impl rule__Write__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Write__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Write__Group__1();

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
    // $ANTLR end "rule__Write__Group__0"


    // $ANTLR start "rule__Write__Group__0__Impl"
    // InternalMyDsl.g:611:1: rule__Write__Group__0__Impl : ( 'write' ) ;
    public final void rule__Write__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:615:1: ( ( 'write' ) )
            // InternalMyDsl.g:616:1: ( 'write' )
            {
            // InternalMyDsl.g:616:1: ( 'write' )
            // InternalMyDsl.g:617:2: 'write'
            {
             before(grammarAccess.getWriteAccess().getWriteKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWriteAccess().getWriteKeyword_0()); 

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
    // $ANTLR end "rule__Write__Group__0__Impl"


    // $ANTLR start "rule__Write__Group__1"
    // InternalMyDsl.g:626:1: rule__Write__Group__1 : rule__Write__Group__1__Impl rule__Write__Group__2 ;
    public final void rule__Write__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:1: ( rule__Write__Group__1__Impl rule__Write__Group__2 )
            // InternalMyDsl.g:631:2: rule__Write__Group__1__Impl rule__Write__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Write__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Write__Group__2();

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
    // $ANTLR end "rule__Write__Group__1"


    // $ANTLR start "rule__Write__Group__1__Impl"
    // InternalMyDsl.g:638:1: rule__Write__Group__1__Impl : ( ( rule__Write__NameAssignment_1 ) ) ;
    public final void rule__Write__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:1: ( ( ( rule__Write__NameAssignment_1 ) ) )
            // InternalMyDsl.g:643:1: ( ( rule__Write__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:643:1: ( ( rule__Write__NameAssignment_1 ) )
            // InternalMyDsl.g:644:2: ( rule__Write__NameAssignment_1 )
            {
             before(grammarAccess.getWriteAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:645:2: ( rule__Write__NameAssignment_1 )
            // InternalMyDsl.g:645:3: rule__Write__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Write__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWriteAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Write__Group__1__Impl"


    // $ANTLR start "rule__Write__Group__2"
    // InternalMyDsl.g:653:1: rule__Write__Group__2 : rule__Write__Group__2__Impl ;
    public final void rule__Write__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:657:1: ( rule__Write__Group__2__Impl )
            // InternalMyDsl.g:658:2: rule__Write__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Write__Group__2__Impl();

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
    // $ANTLR end "rule__Write__Group__2"


    // $ANTLR start "rule__Write__Group__2__Impl"
    // InternalMyDsl.g:664:1: rule__Write__Group__2__Impl : ( ( rule__Write__Group_2__0 )* ) ;
    public final void rule__Write__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:668:1: ( ( ( rule__Write__Group_2__0 )* ) )
            // InternalMyDsl.g:669:1: ( ( rule__Write__Group_2__0 )* )
            {
            // InternalMyDsl.g:669:1: ( ( rule__Write__Group_2__0 )* )
            // InternalMyDsl.g:670:2: ( rule__Write__Group_2__0 )*
            {
             before(grammarAccess.getWriteAccess().getGroup_2()); 
            // InternalMyDsl.g:671:2: ( rule__Write__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:671:3: rule__Write__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Write__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getWriteAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Write__Group__2__Impl"


    // $ANTLR start "rule__Write__Group_2__0"
    // InternalMyDsl.g:680:1: rule__Write__Group_2__0 : rule__Write__Group_2__0__Impl rule__Write__Group_2__1 ;
    public final void rule__Write__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:684:1: ( rule__Write__Group_2__0__Impl rule__Write__Group_2__1 )
            // InternalMyDsl.g:685:2: rule__Write__Group_2__0__Impl rule__Write__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Write__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Write__Group_2__1();

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
    // $ANTLR end "rule__Write__Group_2__0"


    // $ANTLR start "rule__Write__Group_2__0__Impl"
    // InternalMyDsl.g:692:1: rule__Write__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Write__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( ( ',' ) )
            // InternalMyDsl.g:697:1: ( ',' )
            {
            // InternalMyDsl.g:697:1: ( ',' )
            // InternalMyDsl.g:698:2: ','
            {
             before(grammarAccess.getWriteAccess().getCommaKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWriteAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Write__Group_2__0__Impl"


    // $ANTLR start "rule__Write__Group_2__1"
    // InternalMyDsl.g:707:1: rule__Write__Group_2__1 : rule__Write__Group_2__1__Impl ;
    public final void rule__Write__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:711:1: ( rule__Write__Group_2__1__Impl )
            // InternalMyDsl.g:712:2: rule__Write__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Write__Group_2__1__Impl();

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
    // $ANTLR end "rule__Write__Group_2__1"


    // $ANTLR start "rule__Write__Group_2__1__Impl"
    // InternalMyDsl.g:718:1: rule__Write__Group_2__1__Impl : ( ( rule__Write__NameAssignment_2_1 ) ) ;
    public final void rule__Write__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:722:1: ( ( ( rule__Write__NameAssignment_2_1 ) ) )
            // InternalMyDsl.g:723:1: ( ( rule__Write__NameAssignment_2_1 ) )
            {
            // InternalMyDsl.g:723:1: ( ( rule__Write__NameAssignment_2_1 ) )
            // InternalMyDsl.g:724:2: ( rule__Write__NameAssignment_2_1 )
            {
             before(grammarAccess.getWriteAccess().getNameAssignment_2_1()); 
            // InternalMyDsl.g:725:2: ( rule__Write__NameAssignment_2_1 )
            // InternalMyDsl.g:725:3: rule__Write__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Write__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWriteAccess().getNameAssignment_2_1()); 

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
    // $ANTLR end "rule__Write__Group_2__1__Impl"


    // $ANTLR start "rule__Affectation__Group__0"
    // InternalMyDsl.g:734:1: rule__Affectation__Group__0 : rule__Affectation__Group__0__Impl rule__Affectation__Group__1 ;
    public final void rule__Affectation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:738:1: ( rule__Affectation__Group__0__Impl rule__Affectation__Group__1 )
            // InternalMyDsl.g:739:2: rule__Affectation__Group__0__Impl rule__Affectation__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Affectation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__1();

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
    // $ANTLR end "rule__Affectation__Group__0"


    // $ANTLR start "rule__Affectation__Group__0__Impl"
    // InternalMyDsl.g:746:1: rule__Affectation__Group__0__Impl : ( ( rule__Affectation__NameAssignment_0 ) ) ;
    public final void rule__Affectation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:750:1: ( ( ( rule__Affectation__NameAssignment_0 ) ) )
            // InternalMyDsl.g:751:1: ( ( rule__Affectation__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:751:1: ( ( rule__Affectation__NameAssignment_0 ) )
            // InternalMyDsl.g:752:2: ( rule__Affectation__NameAssignment_0 )
            {
             before(grammarAccess.getAffectationAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:753:2: ( rule__Affectation__NameAssignment_0 )
            // InternalMyDsl.g:753:3: rule__Affectation__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Affectation__Group__0__Impl"


    // $ANTLR start "rule__Affectation__Group__1"
    // InternalMyDsl.g:761:1: rule__Affectation__Group__1 : rule__Affectation__Group__1__Impl rule__Affectation__Group__2 ;
    public final void rule__Affectation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:765:1: ( rule__Affectation__Group__1__Impl rule__Affectation__Group__2 )
            // InternalMyDsl.g:766:2: rule__Affectation__Group__1__Impl rule__Affectation__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Affectation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__2();

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
    // $ANTLR end "rule__Affectation__Group__1"


    // $ANTLR start "rule__Affectation__Group__1__Impl"
    // InternalMyDsl.g:773:1: rule__Affectation__Group__1__Impl : ( ':=' ) ;
    public final void rule__Affectation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( ( ':=' ) )
            // InternalMyDsl.g:778:1: ( ':=' )
            {
            // InternalMyDsl.g:778:1: ( ':=' )
            // InternalMyDsl.g:779:2: ':='
            {
             before(grammarAccess.getAffectationAccess().getColonEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getColonEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Affectation__Group__1__Impl"


    // $ANTLR start "rule__Affectation__Group__2"
    // InternalMyDsl.g:788:1: rule__Affectation__Group__2 : rule__Affectation__Group__2__Impl ;
    public final void rule__Affectation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:792:1: ( rule__Affectation__Group__2__Impl )
            // InternalMyDsl.g:793:2: rule__Affectation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group__2__Impl();

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
    // $ANTLR end "rule__Affectation__Group__2"


    // $ANTLR start "rule__Affectation__Group__2__Impl"
    // InternalMyDsl.g:799:1: rule__Affectation__Group__2__Impl : ( ( rule__Affectation__ValeurAssignment_2 ) ) ;
    public final void rule__Affectation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:803:1: ( ( ( rule__Affectation__ValeurAssignment_2 ) ) )
            // InternalMyDsl.g:804:1: ( ( rule__Affectation__ValeurAssignment_2 ) )
            {
            // InternalMyDsl.g:804:1: ( ( rule__Affectation__ValeurAssignment_2 ) )
            // InternalMyDsl.g:805:2: ( rule__Affectation__ValeurAssignment_2 )
            {
             before(grammarAccess.getAffectationAccess().getValeurAssignment_2()); 
            // InternalMyDsl.g:806:2: ( rule__Affectation__ValeurAssignment_2 )
            // InternalMyDsl.g:806:3: rule__Affectation__ValeurAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__ValeurAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getValeurAssignment_2()); 

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
    // $ANTLR end "rule__Affectation__Group__2__Impl"


    // $ANTLR start "rule__Model__FunctionsAssignment"
    // InternalMyDsl.g:815:1: rule__Model__FunctionsAssignment : ( ruleFunction ) ;
    public final void rule__Model__FunctionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:819:1: ( ( ruleFunction ) )
            // InternalMyDsl.g:820:2: ( ruleFunction )
            {
            // InternalMyDsl.g:820:2: ( ruleFunction )
            // InternalMyDsl.g:821:3: ruleFunction
            {
             before(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__FunctionsAssignment"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalMyDsl.g:830:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:834:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:835:2: ( RULE_ID )
            {
            // InternalMyDsl.g:835:2: ( RULE_ID )
            // InternalMyDsl.g:836:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__ReadsAssignment_3"
    // InternalMyDsl.g:845:1: rule__Function__ReadsAssignment_3 : ( ruleRead ) ;
    public final void rule__Function__ReadsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:849:1: ( ( ruleRead ) )
            // InternalMyDsl.g:850:2: ( ruleRead )
            {
            // InternalMyDsl.g:850:2: ( ruleRead )
            // InternalMyDsl.g:851:3: ruleRead
            {
             before(grammarAccess.getFunctionAccess().getReadsReadParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRead();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getReadsReadParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Function__ReadsAssignment_3"


    // $ANTLR start "rule__Function__CommandsAssignment_5"
    // InternalMyDsl.g:860:1: rule__Function__CommandsAssignment_5 : ( ruleCommand ) ;
    public final void rule__Function__CommandsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:865:2: ( ruleCommand )
            {
            // InternalMyDsl.g:865:2: ( ruleCommand )
            // InternalMyDsl.g:866:3: ruleCommand
            {
             before(grammarAccess.getFunctionAccess().getCommandsCommandParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getCommandsCommandParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Function__CommandsAssignment_5"


    // $ANTLR start "rule__Function__WritesAssignment_7"
    // InternalMyDsl.g:875:1: rule__Function__WritesAssignment_7 : ( ruleWrite ) ;
    public final void rule__Function__WritesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( ( ruleWrite ) )
            // InternalMyDsl.g:880:2: ( ruleWrite )
            {
            // InternalMyDsl.g:880:2: ( ruleWrite )
            // InternalMyDsl.g:881:3: ruleWrite
            {
             before(grammarAccess.getFunctionAccess().getWritesWriteParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleWrite();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getWritesWriteParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Function__WritesAssignment_7"


    // $ANTLR start "rule__Read__NameAssignment_1"
    // InternalMyDsl.g:890:1: rule__Read__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Read__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:894:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:895:2: ( RULE_ID )
            {
            // InternalMyDsl.g:895:2: ( RULE_ID )
            // InternalMyDsl.g:896:3: RULE_ID
            {
             before(grammarAccess.getReadAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Read__NameAssignment_1"


    // $ANTLR start "rule__Read__NameAssignment_2_1"
    // InternalMyDsl.g:905:1: rule__Read__NameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Read__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:910:2: ( RULE_ID )
            {
            // InternalMyDsl.g:910:2: ( RULE_ID )
            // InternalMyDsl.g:911:3: RULE_ID
            {
             before(grammarAccess.getReadAccess().getNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getNameIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Read__NameAssignment_2_1"


    // $ANTLR start "rule__Write__NameAssignment_1"
    // InternalMyDsl.g:920:1: rule__Write__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Write__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:924:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:925:2: ( RULE_ID )
            {
            // InternalMyDsl.g:925:2: ( RULE_ID )
            // InternalMyDsl.g:926:3: RULE_ID
            {
             before(grammarAccess.getWriteAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWriteAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Write__NameAssignment_1"


    // $ANTLR start "rule__Write__NameAssignment_2_1"
    // InternalMyDsl.g:935:1: rule__Write__NameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Write__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:940:2: ( RULE_ID )
            {
            // InternalMyDsl.g:940:2: ( RULE_ID )
            // InternalMyDsl.g:941:3: RULE_ID
            {
             before(grammarAccess.getWriteAccess().getNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWriteAccess().getNameIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Write__NameAssignment_2_1"


    // $ANTLR start "rule__Nop__NameAssignment"
    // InternalMyDsl.g:950:1: rule__Nop__NameAssignment : ( ( 'nop' ) ) ;
    public final void rule__Nop__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:954:1: ( ( ( 'nop' ) ) )
            // InternalMyDsl.g:955:2: ( ( 'nop' ) )
            {
            // InternalMyDsl.g:955:2: ( ( 'nop' ) )
            // InternalMyDsl.g:956:3: ( 'nop' )
            {
             before(grammarAccess.getNopAccess().getNameNopKeyword_0()); 
            // InternalMyDsl.g:957:3: ( 'nop' )
            // InternalMyDsl.g:958:4: 'nop'
            {
             before(grammarAccess.getNopAccess().getNameNopKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNopAccess().getNameNopKeyword_0()); 

            }

             after(grammarAccess.getNopAccess().getNameNopKeyword_0()); 

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
    // $ANTLR end "rule__Nop__NameAssignment"


    // $ANTLR start "rule__Affectation__NameAssignment_0"
    // InternalMyDsl.g:969:1: rule__Affectation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Affectation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:974:2: ( RULE_ID )
            {
            // InternalMyDsl.g:974:2: ( RULE_ID )
            // InternalMyDsl.g:975:3: RULE_ID
            {
             before(grammarAccess.getAffectationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Affectation__NameAssignment_0"


    // $ANTLR start "rule__Affectation__ValeurAssignment_2"
    // InternalMyDsl.g:984:1: rule__Affectation__ValeurAssignment_2 : ( RULE_INT ) ;
    public final void rule__Affectation__ValeurAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:989:2: ( RULE_INT )
            {
            // InternalMyDsl.g:989:2: ( RULE_INT )
            // InternalMyDsl.g:990:3: RULE_INT
            {
             before(grammarAccess.getAffectationAccess().getValeurINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getValeurINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Affectation__ValeurAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});

}