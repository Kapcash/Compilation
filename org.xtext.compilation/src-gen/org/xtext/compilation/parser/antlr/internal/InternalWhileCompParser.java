package org.xtext.compilation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.compilation.services.WhileCompGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWhileCompParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_NOMBRE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'%'", "'read'", "','", "'write'", "'nop'", "':='", "'nil'", "';'", "'while'", "'do'", "'od'", "'for'", "'if'", "'then'", "'else'", "'fi'", "'foreach'", "'in'", "'&&'", "'||'", "'!'", "'=?'", "'('", "')'", "'cons'", "'list'", "'hd'", "'tl'"
    };
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


        public InternalWhileCompParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWhileCompParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWhileCompParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWhileComp.g"; }



     	private WhileCompGrammarAccess grammarAccess;

        public InternalWhileCompParser(TokenStream input, WhileCompGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected WhileCompGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalWhileComp.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalWhileComp.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalWhileComp.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalWhileComp.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_functions_0_0= ruleFunction ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:77:2: ( ( (lv_functions_0_0= ruleFunction ) )* )
            // InternalWhileComp.g:78:2: ( (lv_functions_0_0= ruleFunction ) )*
            {
            // InternalWhileComp.g:78:2: ( (lv_functions_0_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWhileComp.g:79:3: (lv_functions_0_0= ruleFunction )
            	    {
            	    // InternalWhileComp.g:79:3: (lv_functions_0_0= ruleFunction )
            	    // InternalWhileComp.g:80:4: lv_functions_0_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_functions_0_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getProgramRule());
            	      				}
            	      				add(
            	      					current,
            	      					"functions",
            	      					lv_functions_0_0,
            	      					"org.xtext.compilation.WhileComp.Function");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // InternalWhileComp.g:100:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalWhileComp.g:100:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalWhileComp.g:101:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalWhileComp.g:107:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_function_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_function_1_0=null;
        Token otherlv_2=null;
        EObject lv_definition_3_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:113:2: ( (otherlv_0= 'function' ( (lv_function_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) )
            // InternalWhileComp.g:114:2: (otherlv_0= 'function' ( (lv_function_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            {
            // InternalWhileComp.g:114:2: (otherlv_0= 'function' ( (lv_function_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            // InternalWhileComp.g:115:3: otherlv_0= 'function' ( (lv_function_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
              		
            }
            // InternalWhileComp.g:119:3: ( (lv_function_1_0= RULE_SYMBOL ) )
            // InternalWhileComp.g:120:4: (lv_function_1_0= RULE_SYMBOL )
            {
            // InternalWhileComp.g:120:4: (lv_function_1_0= RULE_SYMBOL )
            // InternalWhileComp.g:121:5: lv_function_1_0= RULE_SYMBOL
            {
            lv_function_1_0=(Token)match(input,RULE_SYMBOL,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_function_1_0, grammarAccess.getFunctionAccess().getFunctionSYMBOLTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"function",
              						lv_function_1_0,
              						"org.xtext.compilation.WhileComp.SYMBOL");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
              		
            }
            // InternalWhileComp.g:141:3: ( (lv_definition_3_0= ruleDefinition ) )
            // InternalWhileComp.g:142:4: (lv_definition_3_0= ruleDefinition )
            {
            // InternalWhileComp.g:142:4: (lv_definition_3_0= ruleDefinition )
            // InternalWhileComp.g:143:5: lv_definition_3_0= ruleDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_definition_3_0=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"definition",
              						lv_definition_3_0,
              						"org.xtext.compilation.WhileComp.Definition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefinition"
    // InternalWhileComp.g:164:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalWhileComp.g:164:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalWhileComp.g:165:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalWhileComp.g:171:1: ruleDefinition returns [EObject current=null] : ( ( (lv_reads_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '%' ( (lv_writes_4_0= ruleWrite ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_reads_0_0 = null;

        EObject lv_commands_2_0 = null;

        EObject lv_writes_4_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:177:2: ( ( ( (lv_reads_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '%' ( (lv_writes_4_0= ruleWrite ) ) ) )
            // InternalWhileComp.g:178:2: ( ( (lv_reads_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '%' ( (lv_writes_4_0= ruleWrite ) ) )
            {
            // InternalWhileComp.g:178:2: ( ( (lv_reads_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '%' ( (lv_writes_4_0= ruleWrite ) ) )
            // InternalWhileComp.g:179:3: ( (lv_reads_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '%' ( (lv_writes_4_0= ruleWrite ) )
            {
            // InternalWhileComp.g:179:3: ( (lv_reads_0_0= ruleRead ) )
            // InternalWhileComp.g:180:4: (lv_reads_0_0= ruleRead )
            {
            // InternalWhileComp.g:180:4: (lv_reads_0_0= ruleRead )
            // InternalWhileComp.g:181:5: lv_reads_0_0= ruleRead
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getReadsReadParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_reads_0_0=ruleRead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					add(
              						current,
              						"reads",
              						lv_reads_0_0,
              						"org.xtext.compilation.WhileComp.Read");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getPercentSignKeyword_1());
              		
            }
            // InternalWhileComp.g:202:3: ( (lv_commands_2_0= ruleCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_VARIABLE||LA2_0==20||LA2_0==24||(LA2_0>=27 && LA2_0<=28)||LA2_0==32) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWhileComp.g:203:4: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalWhileComp.g:203:4: (lv_commands_2_0= ruleCommand )
            	    // InternalWhileComp.g:204:5: lv_commands_2_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDefinitionAccess().getCommandsCommandParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_2_0,
            	      						"org.xtext.compilation.WhileComp.Command");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getPercentSignKeyword_3());
              		
            }
            // InternalWhileComp.g:225:3: ( (lv_writes_4_0= ruleWrite ) )
            // InternalWhileComp.g:226:4: (lv_writes_4_0= ruleWrite )
            {
            // InternalWhileComp.g:226:4: (lv_writes_4_0= ruleWrite )
            // InternalWhileComp.g:227:5: lv_writes_4_0= ruleWrite
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getWritesWriteParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_writes_4_0=ruleWrite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					add(
              						current,
              						"writes",
              						lv_writes_4_0,
              						"org.xtext.compilation.WhileComp.Write");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleRead"
    // InternalWhileComp.g:248:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalWhileComp.g:248:45: (iv_ruleRead= ruleRead EOF )
            // InternalWhileComp.g:249:2: iv_ruleRead= ruleRead EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReadRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRead=ruleRead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRead; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalWhileComp.g:255:1: ruleRead returns [EObject current=null] : (otherlv_0= 'read' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token otherlv_2=null;
        Token lv_variable_3_0=null;


        	enterRule();

        try {
            // InternalWhileComp.g:261:2: ( (otherlv_0= 'read' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhileComp.g:262:2: (otherlv_0= 'read' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhileComp.g:262:2: (otherlv_0= 'read' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* )
            // InternalWhileComp.g:263:3: otherlv_0= 'read' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReadAccess().getReadKeyword_0());
              		
            }
            // InternalWhileComp.g:267:3: ( (lv_variable_1_0= RULE_VARIABLE ) )
            // InternalWhileComp.g:268:4: (lv_variable_1_0= RULE_VARIABLE )
            {
            // InternalWhileComp.g:268:4: (lv_variable_1_0= RULE_VARIABLE )
            // InternalWhileComp.g:269:5: lv_variable_1_0= RULE_VARIABLE
            {
            lv_variable_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variable_1_0, grammarAccess.getReadAccess().getVariableVARIABLETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReadRule());
              					}
              					addWithLastConsumed(
              						current,
              						"variable",
              						lv_variable_1_0,
              						"org.xtext.compilation.WhileComp.VARIABLE");
              				
            }

            }


            }

            // InternalWhileComp.g:285:3: (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWhileComp.g:286:4: otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getReadAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalWhileComp.g:290:4: ( (lv_variable_3_0= RULE_VARIABLE ) )
            	    // InternalWhileComp.g:291:5: (lv_variable_3_0= RULE_VARIABLE )
            	    {
            	    // InternalWhileComp.g:291:5: (lv_variable_3_0= RULE_VARIABLE )
            	    // InternalWhileComp.g:292:6: lv_variable_3_0= RULE_VARIABLE
            	    {
            	    lv_variable_3_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_variable_3_0, grammarAccess.getReadAccess().getVariableVARIABLETerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getReadRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"variable",
            	      							lv_variable_3_0,
            	      							"org.xtext.compilation.WhileComp.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleWrite"
    // InternalWhileComp.g:313:1: entryRuleWrite returns [EObject current=null] : iv_ruleWrite= ruleWrite EOF ;
    public final EObject entryRuleWrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrite = null;


        try {
            // InternalWhileComp.g:313:46: (iv_ruleWrite= ruleWrite EOF )
            // InternalWhileComp.g:314:2: iv_ruleWrite= ruleWrite EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWriteRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWrite=ruleWrite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWrite; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWrite"


    // $ANTLR start "ruleWrite"
    // InternalWhileComp.g:320:1: ruleWrite returns [EObject current=null] : (otherlv_0= 'write' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleWrite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token otherlv_2=null;
        Token lv_variable_3_0=null;


        	enterRule();

        try {
            // InternalWhileComp.g:326:2: ( (otherlv_0= 'write' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhileComp.g:327:2: (otherlv_0= 'write' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhileComp.g:327:2: (otherlv_0= 'write' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )* )
            // InternalWhileComp.g:328:3: otherlv_0= 'write' ( (lv_variable_1_0= RULE_VARIABLE ) ) (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWriteAccess().getWriteKeyword_0());
              		
            }
            // InternalWhileComp.g:332:3: ( (lv_variable_1_0= RULE_VARIABLE ) )
            // InternalWhileComp.g:333:4: (lv_variable_1_0= RULE_VARIABLE )
            {
            // InternalWhileComp.g:333:4: (lv_variable_1_0= RULE_VARIABLE )
            // InternalWhileComp.g:334:5: lv_variable_1_0= RULE_VARIABLE
            {
            lv_variable_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variable_1_0, grammarAccess.getWriteAccess().getVariableVARIABLETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWriteRule());
              					}
              					addWithLastConsumed(
              						current,
              						"variable",
              						lv_variable_1_0,
              						"org.xtext.compilation.WhileComp.VARIABLE");
              				
            }

            }


            }

            // InternalWhileComp.g:350:3: (otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWhileComp.g:351:4: otherlv_2= ',' ( (lv_variable_3_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getWriteAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalWhileComp.g:355:4: ( (lv_variable_3_0= RULE_VARIABLE ) )
            	    // InternalWhileComp.g:356:5: (lv_variable_3_0= RULE_VARIABLE )
            	    {
            	    // InternalWhileComp.g:356:5: (lv_variable_3_0= RULE_VARIABLE )
            	    // InternalWhileComp.g:357:6: lv_variable_3_0= RULE_VARIABLE
            	    {
            	    lv_variable_3_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_variable_3_0, grammarAccess.getWriteAccess().getVariableVARIABLETerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getWriteRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"variable",
            	      							lv_variable_3_0,
            	      							"org.xtext.compilation.WhileComp.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWrite"


    // $ANTLR start "entryRuleNop"
    // InternalWhileComp.g:378:1: entryRuleNop returns [EObject current=null] : iv_ruleNop= ruleNop EOF ;
    public final EObject entryRuleNop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNop = null;


        try {
            // InternalWhileComp.g:378:44: (iv_ruleNop= ruleNop EOF )
            // InternalWhileComp.g:379:2: iv_ruleNop= ruleNop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNop=ruleNop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNop; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNop"


    // $ANTLR start "ruleNop"
    // InternalWhileComp.g:385:1: ruleNop returns [EObject current=null] : ( (lv_nop_0_0= 'nop' ) ) ;
    public final EObject ruleNop() throws RecognitionException {
        EObject current = null;

        Token lv_nop_0_0=null;


        	enterRule();

        try {
            // InternalWhileComp.g:391:2: ( ( (lv_nop_0_0= 'nop' ) ) )
            // InternalWhileComp.g:392:2: ( (lv_nop_0_0= 'nop' ) )
            {
            // InternalWhileComp.g:392:2: ( (lv_nop_0_0= 'nop' ) )
            // InternalWhileComp.g:393:3: (lv_nop_0_0= 'nop' )
            {
            // InternalWhileComp.g:393:3: (lv_nop_0_0= 'nop' )
            // InternalWhileComp.g:394:4: lv_nop_0_0= 'nop'
            {
            lv_nop_0_0=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_nop_0_0, grammarAccess.getNopAccess().getNopNopKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNopRule());
              				}
              				setWithLastConsumed(current, "nop", lv_nop_0_0, "nop");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNop"


    // $ANTLR start "entryRuleAffectation"
    // InternalWhileComp.g:409:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // InternalWhileComp.g:409:52: (iv_ruleAffectation= ruleAffectation EOF )
            // InternalWhileComp.g:410:2: iv_ruleAffectation= ruleAffectation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalWhileComp.g:416:1: ruleAffectation returns [EObject current=null] : ( ( (lv_affectation_0_0= RULE_VARIABLE ) ) otherlv_1= ':=' ( ( (lv_valeur_2_0= RULE_VARIABLE ) ) | ( (lv_nil_3_0= ruleNil2 ) ) ) ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token lv_affectation_0_0=null;
        Token otherlv_1=null;
        Token lv_valeur_2_0=null;
        EObject lv_nil_3_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:422:2: ( ( ( (lv_affectation_0_0= RULE_VARIABLE ) ) otherlv_1= ':=' ( ( (lv_valeur_2_0= RULE_VARIABLE ) ) | ( (lv_nil_3_0= ruleNil2 ) ) ) ) )
            // InternalWhileComp.g:423:2: ( ( (lv_affectation_0_0= RULE_VARIABLE ) ) otherlv_1= ':=' ( ( (lv_valeur_2_0= RULE_VARIABLE ) ) | ( (lv_nil_3_0= ruleNil2 ) ) ) )
            {
            // InternalWhileComp.g:423:2: ( ( (lv_affectation_0_0= RULE_VARIABLE ) ) otherlv_1= ':=' ( ( (lv_valeur_2_0= RULE_VARIABLE ) ) | ( (lv_nil_3_0= ruleNil2 ) ) ) )
            // InternalWhileComp.g:424:3: ( (lv_affectation_0_0= RULE_VARIABLE ) ) otherlv_1= ':=' ( ( (lv_valeur_2_0= RULE_VARIABLE ) ) | ( (lv_nil_3_0= ruleNil2 ) ) )
            {
            // InternalWhileComp.g:424:3: ( (lv_affectation_0_0= RULE_VARIABLE ) )
            // InternalWhileComp.g:425:4: (lv_affectation_0_0= RULE_VARIABLE )
            {
            // InternalWhileComp.g:425:4: (lv_affectation_0_0= RULE_VARIABLE )
            // InternalWhileComp.g:426:5: lv_affectation_0_0= RULE_VARIABLE
            {
            lv_affectation_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_affectation_0_0, grammarAccess.getAffectationAccess().getAffectationVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAffectationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"affectation",
              						lv_affectation_0_0,
              						"org.xtext.compilation.WhileComp.VARIABLE");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalWhileComp.g:446:3: ( ( (lv_valeur_2_0= RULE_VARIABLE ) ) | ( (lv_nil_3_0= ruleNil2 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_VARIABLE) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalWhileComp.g:447:4: ( (lv_valeur_2_0= RULE_VARIABLE ) )
                    {
                    // InternalWhileComp.g:447:4: ( (lv_valeur_2_0= RULE_VARIABLE ) )
                    // InternalWhileComp.g:448:5: (lv_valeur_2_0= RULE_VARIABLE )
                    {
                    // InternalWhileComp.g:448:5: (lv_valeur_2_0= RULE_VARIABLE )
                    // InternalWhileComp.g:449:6: lv_valeur_2_0= RULE_VARIABLE
                    {
                    lv_valeur_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_valeur_2_0, grammarAccess.getAffectationAccess().getValeurVARIABLETerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAffectationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"valeur",
                      							lv_valeur_2_0,
                      							"org.xtext.compilation.WhileComp.VARIABLE");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:466:4: ( (lv_nil_3_0= ruleNil2 ) )
                    {
                    // InternalWhileComp.g:466:4: ( (lv_nil_3_0= ruleNil2 ) )
                    // InternalWhileComp.g:467:5: (lv_nil_3_0= ruleNil2 )
                    {
                    // InternalWhileComp.g:467:5: (lv_nil_3_0= ruleNil2 )
                    // InternalWhileComp.g:468:6: lv_nil_3_0= ruleNil2
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAffectationAccess().getNilNil2ParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_nil_3_0=ruleNil2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAffectationRule());
                      						}
                      						set(
                      							current,
                      							"nil",
                      							lv_nil_3_0,
                      							"org.xtext.compilation.WhileComp.Nil2");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleNil2"
    // InternalWhileComp.g:490:1: entryRuleNil2 returns [EObject current=null] : iv_ruleNil2= ruleNil2 EOF ;
    public final EObject entryRuleNil2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNil2 = null;


        try {
            // InternalWhileComp.g:490:45: (iv_ruleNil2= ruleNil2 EOF )
            // InternalWhileComp.g:491:2: iv_ruleNil2= ruleNil2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNil2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNil2=ruleNil2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNil2; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNil2"


    // $ANTLR start "ruleNil2"
    // InternalWhileComp.g:497:1: ruleNil2 returns [EObject current=null] : ( (lv_nil_0_0= 'nil' ) ) ;
    public final EObject ruleNil2() throws RecognitionException {
        EObject current = null;

        Token lv_nil_0_0=null;


        	enterRule();

        try {
            // InternalWhileComp.g:503:2: ( ( (lv_nil_0_0= 'nil' ) ) )
            // InternalWhileComp.g:504:2: ( (lv_nil_0_0= 'nil' ) )
            {
            // InternalWhileComp.g:504:2: ( (lv_nil_0_0= 'nil' ) )
            // InternalWhileComp.g:505:3: (lv_nil_0_0= 'nil' )
            {
            // InternalWhileComp.g:505:3: (lv_nil_0_0= 'nil' )
            // InternalWhileComp.g:506:4: lv_nil_0_0= 'nil'
            {
            lv_nil_0_0=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_nil_0_0, grammarAccess.getNil2Access().getNilNilKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNil2Rule());
              				}
              				setWithLastConsumed(current, "nil", lv_nil_0_0, "nil");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNil2"


    // $ANTLR start "entryRuleInput"
    // InternalWhileComp.g:521:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalWhileComp.g:521:46: (iv_ruleInput= ruleInput EOF )
            // InternalWhileComp.g:522:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalWhileComp.g:528:1: ruleInput returns [EObject current=null] : ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_input_2_0= ruleInput ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;
        Token otherlv_1=null;
        Token lv_variable_3_0=null;
        EObject lv_input_2_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:534:2: ( ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_input_2_0= ruleInput ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) ) )
            // InternalWhileComp.g:535:2: ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_input_2_0= ruleInput ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) )
            {
            // InternalWhileComp.g:535:2: ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_input_2_0= ruleInput ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_VARIABLE) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==18) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalWhileComp.g:536:3: ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_input_2_0= ruleInput ) ) )
                    {
                    // InternalWhileComp.g:536:3: ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_input_2_0= ruleInput ) ) )
                    // InternalWhileComp.g:537:4: ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_input_2_0= ruleInput ) )
                    {
                    // InternalWhileComp.g:537:4: ( (lv_variable_0_0= RULE_VARIABLE ) )
                    // InternalWhileComp.g:538:5: (lv_variable_0_0= RULE_VARIABLE )
                    {
                    // InternalWhileComp.g:538:5: (lv_variable_0_0= RULE_VARIABLE )
                    // InternalWhileComp.g:539:6: lv_variable_0_0= RULE_VARIABLE
                    {
                    lv_variable_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variable_0_0, grammarAccess.getInputAccess().getVariableVARIABLETerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInputRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"variable",
                      							lv_variable_0_0,
                      							"org.xtext.compilation.WhileComp.VARIABLE");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_0_1());
                      			
                    }
                    // InternalWhileComp.g:559:4: ( (lv_input_2_0= ruleInput ) )
                    // InternalWhileComp.g:560:5: (lv_input_2_0= ruleInput )
                    {
                    // InternalWhileComp.g:560:5: (lv_input_2_0= ruleInput )
                    // InternalWhileComp.g:561:6: lv_input_2_0= ruleInput
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInputAccess().getInputInputParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_input_2_0=ruleInput();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInputRule());
                      						}
                      						set(
                      							current,
                      							"input",
                      							lv_input_2_0,
                      							"org.xtext.compilation.WhileComp.Input");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:580:3: ( (lv_variable_3_0= RULE_VARIABLE ) )
                    {
                    // InternalWhileComp.g:580:3: ( (lv_variable_3_0= RULE_VARIABLE ) )
                    // InternalWhileComp.g:581:4: (lv_variable_3_0= RULE_VARIABLE )
                    {
                    // InternalWhileComp.g:581:4: (lv_variable_3_0= RULE_VARIABLE )
                    // InternalWhileComp.g:582:5: lv_variable_3_0= RULE_VARIABLE
                    {
                    lv_variable_3_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_variable_3_0, grammarAccess.getInputAccess().getVariableVARIABLETerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInputRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"variable",
                      						lv_variable_3_0,
                      						"org.xtext.compilation.WhileComp.VARIABLE");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalWhileComp.g:602:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalWhileComp.g:602:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalWhileComp.g:603:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalWhileComp.g:609:1: ruleOutput returns [EObject current=null] : ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_output_2_0= ruleOutput ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;
        Token otherlv_1=null;
        Token lv_variable_3_0=null;
        EObject lv_output_2_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:615:2: ( ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_output_2_0= ruleOutput ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) ) )
            // InternalWhileComp.g:616:2: ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_output_2_0= ruleOutput ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) )
            {
            // InternalWhileComp.g:616:2: ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_output_2_0= ruleOutput ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_VARIABLE) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF) ) {
                    alt7=2;
                }
                else if ( (LA7_1==18) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalWhileComp.g:617:3: ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_output_2_0= ruleOutput ) ) )
                    {
                    // InternalWhileComp.g:617:3: ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_output_2_0= ruleOutput ) ) )
                    // InternalWhileComp.g:618:4: ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_output_2_0= ruleOutput ) )
                    {
                    // InternalWhileComp.g:618:4: ( (lv_variable_0_0= RULE_VARIABLE ) )
                    // InternalWhileComp.g:619:5: (lv_variable_0_0= RULE_VARIABLE )
                    {
                    // InternalWhileComp.g:619:5: (lv_variable_0_0= RULE_VARIABLE )
                    // InternalWhileComp.g:620:6: lv_variable_0_0= RULE_VARIABLE
                    {
                    lv_variable_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variable_0_0, grammarAccess.getOutputAccess().getVariableVARIABLETerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOutputRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"variable",
                      							lv_variable_0_0,
                      							"org.xtext.compilation.WhileComp.VARIABLE");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_0_1());
                      			
                    }
                    // InternalWhileComp.g:640:4: ( (lv_output_2_0= ruleOutput ) )
                    // InternalWhileComp.g:641:5: (lv_output_2_0= ruleOutput )
                    {
                    // InternalWhileComp.g:641:5: (lv_output_2_0= ruleOutput )
                    // InternalWhileComp.g:642:6: lv_output_2_0= ruleOutput
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOutputAccess().getOutputOutputParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_output_2_0=ruleOutput();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOutputRule());
                      						}
                      						set(
                      							current,
                      							"output",
                      							lv_output_2_0,
                      							"org.xtext.compilation.WhileComp.Output");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:661:3: ( (lv_variable_3_0= RULE_VARIABLE ) )
                    {
                    // InternalWhileComp.g:661:3: ( (lv_variable_3_0= RULE_VARIABLE ) )
                    // InternalWhileComp.g:662:4: (lv_variable_3_0= RULE_VARIABLE )
                    {
                    // InternalWhileComp.g:662:4: (lv_variable_3_0= RULE_VARIABLE )
                    // InternalWhileComp.g:663:5: lv_variable_3_0= RULE_VARIABLE
                    {
                    lv_variable_3_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_variable_3_0, grammarAccess.getOutputAccess().getVariableVARIABLETerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getOutputRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"variable",
                      						lv_variable_3_0,
                      						"org.xtext.compilation.WhileComp.VARIABLE");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // InternalWhileComp.g:683:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalWhileComp.g:683:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalWhileComp.g:684:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalWhileComp.g:690:1: ruleCommands returns [EObject current=null] : ( ( ( ( ( ( ruleCommand ) ) ';' ( ( ruleCommands ) ) ) )=> ( ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) ) ) ) | ( (lv_command_3_0= ruleCommand ) ) ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_command_0_0 = null;

        EObject lv_commands_2_0 = null;

        EObject lv_command_3_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:696:2: ( ( ( ( ( ( ( ruleCommand ) ) ';' ( ( ruleCommands ) ) ) )=> ( ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) ) ) ) | ( (lv_command_3_0= ruleCommand ) ) ) )
            // InternalWhileComp.g:697:2: ( ( ( ( ( ( ruleCommand ) ) ';' ( ( ruleCommands ) ) ) )=> ( ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) ) ) ) | ( (lv_command_3_0= ruleCommand ) ) )
            {
            // InternalWhileComp.g:697:2: ( ( ( ( ( ( ruleCommand ) ) ';' ( ( ruleCommands ) ) ) )=> ( ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) ) ) ) | ( (lv_command_3_0= ruleCommand ) ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA8_1 = input.LA(2);

                if ( (synpred1_InternalWhileComp()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VARIABLE:
                {
                int LA8_2 = input.LA(2);

                if ( (synpred1_InternalWhileComp()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                int LA8_3 = input.LA(2);

                if ( (synpred1_InternalWhileComp()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                int LA8_4 = input.LA(2);

                if ( (synpred1_InternalWhileComp()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                int LA8_5 = input.LA(2);

                if ( (synpred1_InternalWhileComp()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 5, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                int LA8_6 = input.LA(2);

                if ( (synpred1_InternalWhileComp()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalWhileComp.g:698:3: ( ( ( ( ( ruleCommand ) ) ';' ( ( ruleCommands ) ) ) )=> ( ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) ) ) )
                    {
                    // InternalWhileComp.g:698:3: ( ( ( ( ( ruleCommand ) ) ';' ( ( ruleCommands ) ) ) )=> ( ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) ) ) )
                    // InternalWhileComp.g:699:4: ( ( ( ( ruleCommand ) ) ';' ( ( ruleCommands ) ) ) )=> ( ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) ) )
                    {
                    // InternalWhileComp.g:713:4: ( ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) ) )
                    // InternalWhileComp.g:714:5: ( (lv_command_0_0= ruleCommand ) ) otherlv_1= ';' ( (lv_commands_2_0= ruleCommands ) )
                    {
                    // InternalWhileComp.g:714:5: ( (lv_command_0_0= ruleCommand ) )
                    // InternalWhileComp.g:715:6: (lv_command_0_0= ruleCommand )
                    {
                    // InternalWhileComp.g:715:6: (lv_command_0_0= ruleCommand )
                    // InternalWhileComp.g:716:7: lv_command_0_0= ruleCommand
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCommandsAccess().getCommandCommandParserRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
                    lv_command_0_0=ruleCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCommandsRule());
                      							}
                      							set(
                      								current,
                      								"command",
                      								lv_command_0_0,
                      								"org.xtext.compilation.WhileComp.Command");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,23,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_0_0_1());
                      				
                    }
                    // InternalWhileComp.g:737:5: ( (lv_commands_2_0= ruleCommands ) )
                    // InternalWhileComp.g:738:6: (lv_commands_2_0= ruleCommands )
                    {
                    // InternalWhileComp.g:738:6: (lv_commands_2_0= ruleCommands )
                    // InternalWhileComp.g:739:7: lv_commands_2_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandsParserRuleCall_0_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_commands_2_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCommandsRule());
                      							}
                      							set(
                      								current,
                      								"commands",
                      								lv_commands_2_0,
                      								"org.xtext.compilation.WhileComp.Commands");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:759:3: ( (lv_command_3_0= ruleCommand ) )
                    {
                    // InternalWhileComp.g:759:3: ( (lv_command_3_0= ruleCommand ) )
                    // InternalWhileComp.g:760:4: (lv_command_3_0= ruleCommand )
                    {
                    // InternalWhileComp.g:760:4: (lv_command_3_0= ruleCommand )
                    // InternalWhileComp.g:761:5: lv_command_3_0= ruleCommand
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandsAccess().getCommandCommandParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_command_3_0=ruleCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandsRule());
                      					}
                      					set(
                      						current,
                      						"command",
                      						lv_command_3_0,
                      						"org.xtext.compilation.WhileComp.Command");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // InternalWhileComp.g:782:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalWhileComp.g:782:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalWhileComp.g:783:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalWhileComp.g:789:1: ruleCommand returns [EObject current=null] : ( ( (lv_command_0_0= ruleNop ) ) | ( (lv_command_1_0= ruleAffectation ) ) | (otherlv_2= 'while' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) | (otherlv_7= 'for' ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= 'do' ( (lv_commands_10_0= ruleCommands ) ) otherlv_11= 'od' ) | (otherlv_12= 'if' ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= 'then' ( (lv_commands1_15_0= ruleCommands ) ) otherlv_16= 'else' ( (lv_commands2_17_0= ruleCommands ) ) otherlv_18= 'fi' ) | (otherlv_19= 'foreach' ( (lv_expr1_20_0= ruleExpr ) ) otherlv_21= 'in' ( (lv_expr2_22_0= ruleExpr ) ) otherlv_23= 'do' ( (lv_commands_24_0= ruleCommands ) ) otherlv_25= 'od' ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_command_0_0 = null;

        EObject lv_command_1_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_commands_5_0 = null;

        EObject lv_expr_8_0 = null;

        EObject lv_commands_10_0 = null;

        EObject lv_expr_13_0 = null;

        EObject lv_commands1_15_0 = null;

        EObject lv_commands2_17_0 = null;

        EObject lv_expr1_20_0 = null;

        EObject lv_expr2_22_0 = null;

        EObject lv_commands_24_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:795:2: ( ( ( (lv_command_0_0= ruleNop ) ) | ( (lv_command_1_0= ruleAffectation ) ) | (otherlv_2= 'while' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) | (otherlv_7= 'for' ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= 'do' ( (lv_commands_10_0= ruleCommands ) ) otherlv_11= 'od' ) | (otherlv_12= 'if' ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= 'then' ( (lv_commands1_15_0= ruleCommands ) ) otherlv_16= 'else' ( (lv_commands2_17_0= ruleCommands ) ) otherlv_18= 'fi' ) | (otherlv_19= 'foreach' ( (lv_expr1_20_0= ruleExpr ) ) otherlv_21= 'in' ( (lv_expr2_22_0= ruleExpr ) ) otherlv_23= 'do' ( (lv_commands_24_0= ruleCommands ) ) otherlv_25= 'od' ) ) )
            // InternalWhileComp.g:796:2: ( ( (lv_command_0_0= ruleNop ) ) | ( (lv_command_1_0= ruleAffectation ) ) | (otherlv_2= 'while' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) | (otherlv_7= 'for' ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= 'do' ( (lv_commands_10_0= ruleCommands ) ) otherlv_11= 'od' ) | (otherlv_12= 'if' ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= 'then' ( (lv_commands1_15_0= ruleCommands ) ) otherlv_16= 'else' ( (lv_commands2_17_0= ruleCommands ) ) otherlv_18= 'fi' ) | (otherlv_19= 'foreach' ( (lv_expr1_20_0= ruleExpr ) ) otherlv_21= 'in' ( (lv_expr2_22_0= ruleExpr ) ) otherlv_23= 'do' ( (lv_commands_24_0= ruleCommands ) ) otherlv_25= 'od' ) )
            {
            // InternalWhileComp.g:796:2: ( ( (lv_command_0_0= ruleNop ) ) | ( (lv_command_1_0= ruleAffectation ) ) | (otherlv_2= 'while' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) | (otherlv_7= 'for' ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= 'do' ( (lv_commands_10_0= ruleCommands ) ) otherlv_11= 'od' ) | (otherlv_12= 'if' ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= 'then' ( (lv_commands1_15_0= ruleCommands ) ) otherlv_16= 'else' ( (lv_commands2_17_0= ruleCommands ) ) otherlv_18= 'fi' ) | (otherlv_19= 'foreach' ( (lv_expr1_20_0= ruleExpr ) ) otherlv_21= 'in' ( (lv_expr2_22_0= ruleExpr ) ) otherlv_23= 'do' ( (lv_commands_24_0= ruleCommands ) ) otherlv_25= 'od' ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 27:
                {
                alt9=4;
                }
                break;
            case 28:
                {
                alt9=5;
                }
                break;
            case 32:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalWhileComp.g:797:3: ( (lv_command_0_0= ruleNop ) )
                    {
                    // InternalWhileComp.g:797:3: ( (lv_command_0_0= ruleNop ) )
                    // InternalWhileComp.g:798:4: (lv_command_0_0= ruleNop )
                    {
                    // InternalWhileComp.g:798:4: (lv_command_0_0= ruleNop )
                    // InternalWhileComp.g:799:5: lv_command_0_0= ruleNop
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCommandNopParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_command_0_0=ruleNop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"command",
                      						lv_command_0_0,
                      						"org.xtext.compilation.WhileComp.Nop");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:817:3: ( (lv_command_1_0= ruleAffectation ) )
                    {
                    // InternalWhileComp.g:817:3: ( (lv_command_1_0= ruleAffectation ) )
                    // InternalWhileComp.g:818:4: (lv_command_1_0= ruleAffectation )
                    {
                    // InternalWhileComp.g:818:4: (lv_command_1_0= ruleAffectation )
                    // InternalWhileComp.g:819:5: lv_command_1_0= ruleAffectation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCommandAffectationParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_command_1_0=ruleAffectation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"command",
                      						lv_command_1_0,
                      						"org.xtext.compilation.WhileComp.Affectation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWhileComp.g:837:3: (otherlv_2= 'while' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' )
                    {
                    // InternalWhileComp.g:837:3: (otherlv_2= 'while' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' )
                    // InternalWhileComp.g:838:4: otherlv_2= 'while' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getWhileKeyword_2_0());
                      			
                    }
                    // InternalWhileComp.g:842:4: ( (lv_expr_3_0= ruleExpr ) )
                    // InternalWhileComp.g:843:5: (lv_expr_3_0= ruleExpr )
                    {
                    // InternalWhileComp.g:843:5: (lv_expr_3_0= ruleExpr )
                    // InternalWhileComp.g:844:6: lv_expr_3_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getExprExprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_expr_3_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_3_0,
                      							"org.xtext.compilation.WhileComp.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getDoKeyword_2_2());
                      			
                    }
                    // InternalWhileComp.g:865:4: ( (lv_commands_5_0= ruleCommands ) )
                    // InternalWhileComp.g:866:5: (lv_commands_5_0= ruleCommands )
                    {
                    // InternalWhileComp.g:866:5: (lv_commands_5_0= ruleCommands )
                    // InternalWhileComp.g:867:6: lv_commands_5_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandsParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_commands_5_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"commands",
                      							lv_commands_5_0,
                      							"org.xtext.compilation.WhileComp.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCommandAccess().getOdKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalWhileComp.g:890:3: (otherlv_7= 'for' ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= 'do' ( (lv_commands_10_0= ruleCommands ) ) otherlv_11= 'od' )
                    {
                    // InternalWhileComp.g:890:3: (otherlv_7= 'for' ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= 'do' ( (lv_commands_10_0= ruleCommands ) ) otherlv_11= 'od' )
                    // InternalWhileComp.g:891:4: otherlv_7= 'for' ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= 'do' ( (lv_commands_10_0= ruleCommands ) ) otherlv_11= 'od'
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getCommandAccess().getForKeyword_3_0());
                      			
                    }
                    // InternalWhileComp.g:895:4: ( (lv_expr_8_0= ruleExpr ) )
                    // InternalWhileComp.g:896:5: (lv_expr_8_0= ruleExpr )
                    {
                    // InternalWhileComp.g:896:5: (lv_expr_8_0= ruleExpr )
                    // InternalWhileComp.g:897:6: lv_expr_8_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getExprExprParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_expr_8_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_8_0,
                      							"org.xtext.compilation.WhileComp.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getCommandAccess().getDoKeyword_3_2());
                      			
                    }
                    // InternalWhileComp.g:918:4: ( (lv_commands_10_0= ruleCommands ) )
                    // InternalWhileComp.g:919:5: (lv_commands_10_0= ruleCommands )
                    {
                    // InternalWhileComp.g:919:5: (lv_commands_10_0= ruleCommands )
                    // InternalWhileComp.g:920:6: lv_commands_10_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandsParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_commands_10_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"commands",
                      							lv_commands_10_0,
                      							"org.xtext.compilation.WhileComp.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getCommandAccess().getOdKeyword_3_4());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalWhileComp.g:943:3: (otherlv_12= 'if' ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= 'then' ( (lv_commands1_15_0= ruleCommands ) ) otherlv_16= 'else' ( (lv_commands2_17_0= ruleCommands ) ) otherlv_18= 'fi' )
                    {
                    // InternalWhileComp.g:943:3: (otherlv_12= 'if' ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= 'then' ( (lv_commands1_15_0= ruleCommands ) ) otherlv_16= 'else' ( (lv_commands2_17_0= ruleCommands ) ) otherlv_18= 'fi' )
                    // InternalWhileComp.g:944:4: otherlv_12= 'if' ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= 'then' ( (lv_commands1_15_0= ruleCommands ) ) otherlv_16= 'else' ( (lv_commands2_17_0= ruleCommands ) ) otherlv_18= 'fi'
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getCommandAccess().getIfKeyword_4_0());
                      			
                    }
                    // InternalWhileComp.g:948:4: ( (lv_expr_13_0= ruleExpr ) )
                    // InternalWhileComp.g:949:5: (lv_expr_13_0= ruleExpr )
                    {
                    // InternalWhileComp.g:949:5: (lv_expr_13_0= ruleExpr )
                    // InternalWhileComp.g:950:6: lv_expr_13_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getExprExprParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_expr_13_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_13_0,
                      							"org.xtext.compilation.WhileComp.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getCommandAccess().getThenKeyword_4_2());
                      			
                    }
                    // InternalWhileComp.g:971:4: ( (lv_commands1_15_0= ruleCommands ) )
                    // InternalWhileComp.g:972:5: (lv_commands1_15_0= ruleCommands )
                    {
                    // InternalWhileComp.g:972:5: (lv_commands1_15_0= ruleCommands )
                    // InternalWhileComp.g:973:6: lv_commands1_15_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getCommands1CommandsParserRuleCall_4_3_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_commands1_15_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"commands1",
                      							lv_commands1_15_0,
                      							"org.xtext.compilation.WhileComp.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,30,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getCommandAccess().getElseKeyword_4_4());
                      			
                    }
                    // InternalWhileComp.g:994:4: ( (lv_commands2_17_0= ruleCommands ) )
                    // InternalWhileComp.g:995:5: (lv_commands2_17_0= ruleCommands )
                    {
                    // InternalWhileComp.g:995:5: (lv_commands2_17_0= ruleCommands )
                    // InternalWhileComp.g:996:6: lv_commands2_17_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getCommands2CommandsParserRuleCall_4_5_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_commands2_17_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"commands2",
                      							lv_commands2_17_0,
                      							"org.xtext.compilation.WhileComp.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getCommandAccess().getFiKeyword_4_6());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalWhileComp.g:1019:3: (otherlv_19= 'foreach' ( (lv_expr1_20_0= ruleExpr ) ) otherlv_21= 'in' ( (lv_expr2_22_0= ruleExpr ) ) otherlv_23= 'do' ( (lv_commands_24_0= ruleCommands ) ) otherlv_25= 'od' )
                    {
                    // InternalWhileComp.g:1019:3: (otherlv_19= 'foreach' ( (lv_expr1_20_0= ruleExpr ) ) otherlv_21= 'in' ( (lv_expr2_22_0= ruleExpr ) ) otherlv_23= 'do' ( (lv_commands_24_0= ruleCommands ) ) otherlv_25= 'od' )
                    // InternalWhileComp.g:1020:4: otherlv_19= 'foreach' ( (lv_expr1_20_0= ruleExpr ) ) otherlv_21= 'in' ( (lv_expr2_22_0= ruleExpr ) ) otherlv_23= 'do' ( (lv_commands_24_0= ruleCommands ) ) otherlv_25= 'od'
                    {
                    otherlv_19=(Token)match(input,32,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getCommandAccess().getForeachKeyword_5_0());
                      			
                    }
                    // InternalWhileComp.g:1024:4: ( (lv_expr1_20_0= ruleExpr ) )
                    // InternalWhileComp.g:1025:5: (lv_expr1_20_0= ruleExpr )
                    {
                    // InternalWhileComp.g:1025:5: (lv_expr1_20_0= ruleExpr )
                    // InternalWhileComp.g:1026:6: lv_expr1_20_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getExpr1ExprParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_expr1_20_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"expr1",
                      							lv_expr1_20_0,
                      							"org.xtext.compilation.WhileComp.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,33,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getCommandAccess().getInKeyword_5_2());
                      			
                    }
                    // InternalWhileComp.g:1047:4: ( (lv_expr2_22_0= ruleExpr ) )
                    // InternalWhileComp.g:1048:5: (lv_expr2_22_0= ruleExpr )
                    {
                    // InternalWhileComp.g:1048:5: (lv_expr2_22_0= ruleExpr )
                    // InternalWhileComp.g:1049:6: lv_expr2_22_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getExpr2ExprParserRuleCall_5_3_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_expr2_22_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"expr2",
                      							lv_expr2_22_0,
                      							"org.xtext.compilation.WhileComp.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_23=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getCommandAccess().getDoKeyword_5_4());
                      			
                    }
                    // InternalWhileComp.g:1070:4: ( (lv_commands_24_0= ruleCommands ) )
                    // InternalWhileComp.g:1071:5: (lv_commands_24_0= ruleCommands )
                    {
                    // InternalWhileComp.g:1071:5: (lv_commands_24_0= ruleCommands )
                    // InternalWhileComp.g:1072:6: lv_commands_24_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getCommandsCommandsParserRuleCall_5_5_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_commands_24_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						set(
                      							current,
                      							"commands",
                      							lv_commands_24_0,
                      							"org.xtext.compilation.WhileComp.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getCommandAccess().getOdKeyword_5_6());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleExpr"
    // InternalWhileComp.g:1098:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalWhileComp.g:1098:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalWhileComp.g:1099:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalWhileComp.g:1105:1: ruleExpr returns [EObject current=null] : ( ( ( ( ruleExprSimple ) )=> (lv_exprsimple_0_0= ruleExprSimple ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_exprsimple_0_0 = null;

        EObject lv_exprAnd_1_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:1111:2: ( ( ( ( ( ruleExprSimple ) )=> (lv_exprsimple_0_0= ruleExprSimple ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) ) )
            // InternalWhileComp.g:1112:2: ( ( ( ( ruleExprSimple ) )=> (lv_exprsimple_0_0= ruleExprSimple ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) )
            {
            // InternalWhileComp.g:1112:2: ( ( ( ( ruleExprSimple ) )=> (lv_exprsimple_0_0= ruleExprSimple ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 22:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred2_InternalWhileComp()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VARIABLE:
                {
                int LA10_2 = input.LA(2);

                if ( (synpred2_InternalWhileComp()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYMBOL:
                {
                int LA10_3 = input.LA(2);

                if ( (synpred2_InternalWhileComp()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA10_4 = input.LA(2);

                if ( (synpred2_InternalWhileComp()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt10=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalWhileComp.g:1113:3: ( ( ( ruleExprSimple ) )=> (lv_exprsimple_0_0= ruleExprSimple ) )
                    {
                    // InternalWhileComp.g:1113:3: ( ( ( ruleExprSimple ) )=> (lv_exprsimple_0_0= ruleExprSimple ) )
                    // InternalWhileComp.g:1114:4: ( ( ruleExprSimple ) )=> (lv_exprsimple_0_0= ruleExprSimple )
                    {
                    // InternalWhileComp.g:1118:4: (lv_exprsimple_0_0= ruleExprSimple )
                    // InternalWhileComp.g:1119:5: lv_exprsimple_0_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprsimpleExprSimpleParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprsimple_0_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"exprsimple",
                      						lv_exprsimple_0_0,
                      						"org.xtext.compilation.WhileComp.ExprSimple");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:1137:3: ( (lv_exprAnd_1_0= ruleExprAnd ) )
                    {
                    // InternalWhileComp.g:1137:3: ( (lv_exprAnd_1_0= ruleExprAnd ) )
                    // InternalWhileComp.g:1138:4: (lv_exprAnd_1_0= ruleExprAnd )
                    {
                    // InternalWhileComp.g:1138:4: (lv_exprAnd_1_0= ruleExprAnd )
                    // InternalWhileComp.g:1139:5: lv_exprAnd_1_0= ruleExprAnd
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprAndExprAndParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprAnd_1_0=ruleExprAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"exprAnd",
                      						lv_exprAnd_1_0,
                      						"org.xtext.compilation.WhileComp.ExprAnd");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprAnd"
    // InternalWhileComp.g:1160:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // InternalWhileComp.g:1160:48: (iv_ruleExprAnd= ruleExprAnd EOF )
            // InternalWhileComp.g:1161:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprAnd"


    // $ANTLR start "ruleExprAnd"
    // InternalWhileComp.g:1167:1: ruleExprAnd returns [EObject current=null] : ( ( ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )=> ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) ) ) | ( (lv_exprOr_3_0= ruleExprOr ) ) ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprOr_0_0 = null;

        EObject lv_exprAnd_2_0 = null;

        EObject lv_exprOr_3_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:1173:2: ( ( ( ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )=> ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) ) ) | ( (lv_exprOr_3_0= ruleExprOr ) ) ) )
            // InternalWhileComp.g:1174:2: ( ( ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )=> ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) ) ) | ( (lv_exprOr_3_0= ruleExprOr ) ) )
            {
            // InternalWhileComp.g:1174:2: ( ( ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )=> ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) ) ) | ( (lv_exprOr_3_0= ruleExprOr ) ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA11_1 = input.LA(2);

                if ( (synpred3_InternalWhileComp()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA11_2 = input.LA(2);

                if ( (synpred3_InternalWhileComp()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VARIABLE:
                {
                int LA11_3 = input.LA(2);

                if ( (synpred3_InternalWhileComp()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYMBOL:
                {
                int LA11_4 = input.LA(2);

                if ( (synpred3_InternalWhileComp()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA11_5 = input.LA(2);

                if ( (synpred3_InternalWhileComp()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalWhileComp.g:1175:3: ( ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )=> ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) ) )
                    {
                    // InternalWhileComp.g:1175:3: ( ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )=> ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) ) )
                    // InternalWhileComp.g:1176:4: ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )=> ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) )
                    {
                    // InternalWhileComp.g:1190:4: ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) )
                    // InternalWhileComp.g:1191:5: ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) )
                    {
                    // InternalWhileComp.g:1191:5: ( (lv_exprOr_0_0= ruleExprOr ) )
                    // InternalWhileComp.g:1192:6: (lv_exprOr_0_0= ruleExprOr )
                    {
                    // InternalWhileComp.g:1192:6: (lv_exprOr_0_0= ruleExprOr )
                    // InternalWhileComp.g:1193:7: lv_exprOr_0_0= ruleExprOr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getExprAndAccess().getExprOrExprOrParserRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_24);
                    lv_exprOr_0_0=ruleExprOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getExprAndRule());
                      							}
                      							set(
                      								current,
                      								"exprOr",
                      								lv_exprOr_0_0,
                      								"org.xtext.compilation.WhileComp.ExprOr");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,34,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getExprAndAccess().getAmpersandAmpersandKeyword_0_0_1());
                      				
                    }
                    // InternalWhileComp.g:1214:5: ( (lv_exprAnd_2_0= ruleExprAnd ) )
                    // InternalWhileComp.g:1215:6: (lv_exprAnd_2_0= ruleExprAnd )
                    {
                    // InternalWhileComp.g:1215:6: (lv_exprAnd_2_0= ruleExprAnd )
                    // InternalWhileComp.g:1216:7: lv_exprAnd_2_0= ruleExprAnd
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getExprAndAccess().getExprAndExprAndParserRuleCall_0_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprAnd_2_0=ruleExprAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getExprAndRule());
                      							}
                      							set(
                      								current,
                      								"exprAnd",
                      								lv_exprAnd_2_0,
                      								"org.xtext.compilation.WhileComp.ExprAnd");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:1236:3: ( (lv_exprOr_3_0= ruleExprOr ) )
                    {
                    // InternalWhileComp.g:1236:3: ( (lv_exprOr_3_0= ruleExprOr ) )
                    // InternalWhileComp.g:1237:4: (lv_exprOr_3_0= ruleExprOr )
                    {
                    // InternalWhileComp.g:1237:4: (lv_exprOr_3_0= ruleExprOr )
                    // InternalWhileComp.g:1238:5: lv_exprOr_3_0= ruleExprOr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAndAccess().getExprOrExprOrParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprOr_3_0=ruleExprOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprAndRule());
                      					}
                      					set(
                      						current,
                      						"exprOr",
                      						lv_exprOr_3_0,
                      						"org.xtext.compilation.WhileComp.ExprOr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // InternalWhileComp.g:1259:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // InternalWhileComp.g:1259:47: (iv_ruleExprOr= ruleExprOr EOF )
            // InternalWhileComp.g:1260:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprOr"


    // $ANTLR start "ruleExprOr"
    // InternalWhileComp.g:1266:1: ruleExprOr returns [EObject current=null] : ( ( ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )=> ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) ) ) | ( (lv_exprNot_3_0= ruleExprNot ) ) ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprNot_0_0 = null;

        EObject lv_exprOr_2_0 = null;

        EObject lv_exprNot_3_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:1272:2: ( ( ( ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )=> ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) ) ) | ( (lv_exprNot_3_0= ruleExprNot ) ) ) )
            // InternalWhileComp.g:1273:2: ( ( ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )=> ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) ) ) | ( (lv_exprNot_3_0= ruleExprNot ) ) )
            {
            // InternalWhileComp.g:1273:2: ( ( ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )=> ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) ) ) | ( (lv_exprNot_3_0= ruleExprNot ) ) )
            int alt12=2;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA12_1 = input.LA(2);

                if ( (synpred4_InternalWhileComp()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA12_2 = input.LA(2);

                if ( (synpred4_InternalWhileComp()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VARIABLE:
                {
                int LA12_3 = input.LA(2);

                if ( (synpred4_InternalWhileComp()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYMBOL:
                {
                int LA12_4 = input.LA(2);

                if ( (synpred4_InternalWhileComp()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA12_5 = input.LA(2);

                if ( (synpred4_InternalWhileComp()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalWhileComp.g:1274:3: ( ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )=> ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) ) )
                    {
                    // InternalWhileComp.g:1274:3: ( ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )=> ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) ) )
                    // InternalWhileComp.g:1275:4: ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )=> ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) )
                    {
                    // InternalWhileComp.g:1289:4: ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) )
                    // InternalWhileComp.g:1290:5: ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) )
                    {
                    // InternalWhileComp.g:1290:5: ( (lv_exprNot_0_0= ruleExprNot ) )
                    // InternalWhileComp.g:1291:6: (lv_exprNot_0_0= ruleExprNot )
                    {
                    // InternalWhileComp.g:1291:6: (lv_exprNot_0_0= ruleExprNot )
                    // InternalWhileComp.g:1292:7: lv_exprNot_0_0= ruleExprNot
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getExprOrAccess().getExprNotExprNotParserRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_25);
                    lv_exprNot_0_0=ruleExprNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getExprOrRule());
                      							}
                      							set(
                      								current,
                      								"exprNot",
                      								lv_exprNot_0_0,
                      								"org.xtext.compilation.WhileComp.ExprNot");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,35,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getExprOrAccess().getVerticalLineVerticalLineKeyword_0_0_1());
                      				
                    }
                    // InternalWhileComp.g:1313:5: ( (lv_exprOr_2_0= ruleExprOr ) )
                    // InternalWhileComp.g:1314:6: (lv_exprOr_2_0= ruleExprOr )
                    {
                    // InternalWhileComp.g:1314:6: (lv_exprOr_2_0= ruleExprOr )
                    // InternalWhileComp.g:1315:7: lv_exprOr_2_0= ruleExprOr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getExprOrAccess().getExprOrExprOrParserRuleCall_0_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprOr_2_0=ruleExprOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getExprOrRule());
                      							}
                      							set(
                      								current,
                      								"exprOr",
                      								lv_exprOr_2_0,
                      								"org.xtext.compilation.WhileComp.ExprOr");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:1335:3: ( (lv_exprNot_3_0= ruleExprNot ) )
                    {
                    // InternalWhileComp.g:1335:3: ( (lv_exprNot_3_0= ruleExprNot ) )
                    // InternalWhileComp.g:1336:4: (lv_exprNot_3_0= ruleExprNot )
                    {
                    // InternalWhileComp.g:1336:4: (lv_exprNot_3_0= ruleExprNot )
                    // InternalWhileComp.g:1337:5: lv_exprNot_3_0= ruleExprNot
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprOrAccess().getExprNotExprNotParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprNot_3_0=ruleExprNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprOrRule());
                      					}
                      					set(
                      						current,
                      						"exprNot",
                      						lv_exprNot_3_0,
                      						"org.xtext.compilation.WhileComp.ExprNot");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleExprNot"
    // InternalWhileComp.g:1358:1: entryRuleExprNot returns [EObject current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final EObject entryRuleExprNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprNot = null;


        try {
            // InternalWhileComp.g:1358:48: (iv_ruleExprNot= ruleExprNot EOF )
            // InternalWhileComp.g:1359:2: iv_ruleExprNot= ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprNot=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprNot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprNot"


    // $ANTLR start "ruleExprNot"
    // InternalWhileComp.g:1365:1: ruleExprNot returns [EObject current=null] : ( (otherlv_0= '!' ( (lv_exprEq_1_0= ruleExprEq ) ) ) | ( (lv_exprEq_2_0= ruleExprEq ) ) ) ;
    public final EObject ruleExprNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exprEq_1_0 = null;

        EObject lv_exprEq_2_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:1371:2: ( ( (otherlv_0= '!' ( (lv_exprEq_1_0= ruleExprEq ) ) ) | ( (lv_exprEq_2_0= ruleExprEq ) ) ) )
            // InternalWhileComp.g:1372:2: ( (otherlv_0= '!' ( (lv_exprEq_1_0= ruleExprEq ) ) ) | ( (lv_exprEq_2_0= ruleExprEq ) ) )
            {
            // InternalWhileComp.g:1372:2: ( (otherlv_0= '!' ( (lv_exprEq_1_0= ruleExprEq ) ) ) | ( (lv_exprEq_2_0= ruleExprEq ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_SYMBOL && LA13_0<=RULE_VARIABLE)||LA13_0==22||LA13_0==38) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalWhileComp.g:1373:3: (otherlv_0= '!' ( (lv_exprEq_1_0= ruleExprEq ) ) )
                    {
                    // InternalWhileComp.g:1373:3: (otherlv_0= '!' ( (lv_exprEq_1_0= ruleExprEq ) ) )
                    // InternalWhileComp.g:1374:4: otherlv_0= '!' ( (lv_exprEq_1_0= ruleExprEq ) )
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getExprNotAccess().getExclamationMarkKeyword_0_0());
                      			
                    }
                    // InternalWhileComp.g:1378:4: ( (lv_exprEq_1_0= ruleExprEq ) )
                    // InternalWhileComp.g:1379:5: (lv_exprEq_1_0= ruleExprEq )
                    {
                    // InternalWhileComp.g:1379:5: (lv_exprEq_1_0= ruleExprEq )
                    // InternalWhileComp.g:1380:6: lv_exprEq_1_0= ruleExprEq
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprNotAccess().getExprEqExprEqParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprEq_1_0=ruleExprEq();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprNotRule());
                      						}
                      						set(
                      							current,
                      							"exprEq",
                      							lv_exprEq_1_0,
                      							"org.xtext.compilation.WhileComp.ExprEq");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:1399:3: ( (lv_exprEq_2_0= ruleExprEq ) )
                    {
                    // InternalWhileComp.g:1399:3: ( (lv_exprEq_2_0= ruleExprEq ) )
                    // InternalWhileComp.g:1400:4: (lv_exprEq_2_0= ruleExprEq )
                    {
                    // InternalWhileComp.g:1400:4: (lv_exprEq_2_0= ruleExprEq )
                    // InternalWhileComp.g:1401:5: lv_exprEq_2_0= ruleExprEq
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprNotAccess().getExprEqExprEqParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprEq_2_0=ruleExprEq();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprNotRule());
                      					}
                      					set(
                      						current,
                      						"exprEq",
                      						lv_exprEq_2_0,
                      						"org.xtext.compilation.WhileComp.ExprEq");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprNot"


    // $ANTLR start "entryRuleExprEq"
    // InternalWhileComp.g:1422:1: entryRuleExprEq returns [EObject current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final EObject entryRuleExprEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEq = null;


        try {
            // InternalWhileComp.g:1422:47: (iv_ruleExprEq= ruleExprEq EOF )
            // InternalWhileComp.g:1423:2: iv_ruleExprEq= ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprEq=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEq; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprEq"


    // $ANTLR start "ruleExprEq"
    // InternalWhileComp.g:1429:1: ruleExprEq returns [EObject current=null] : ( ( ( (lv_exprSimple1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimple2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleExprEq() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exprSimple1_0_0 = null;

        EObject lv_exprSimple2_2_0 = null;

        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:1435:2: ( ( ( ( (lv_exprSimple1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimple2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) ) )
            // InternalWhileComp.g:1436:2: ( ( ( (lv_exprSimple1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimple2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) )
            {
            // InternalWhileComp.g:1436:2: ( ( ( (lv_exprSimple1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimple2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_SYMBOL && LA14_0<=RULE_VARIABLE)||LA14_0==22) ) {
                alt14=1;
            }
            else if ( (LA14_0==38) ) {
                switch ( input.LA(2) ) {
                case 40:
                case 41:
                case 42:
                case 43:
                    {
                    alt14=1;
                    }
                    break;
                case RULE_SYMBOL:
                    {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==37||LA14_3==39) ) {
                        alt14=2;
                    }
                    else if ( ((LA14_3>=RULE_SYMBOL && LA14_3<=RULE_VARIABLE)||LA14_3==22||LA14_3==36||LA14_3==38) ) {
                        alt14=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_VARIABLE:
                case 22:
                case 36:
                case 38:
                    {
                    alt14=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalWhileComp.g:1437:3: ( ( (lv_exprSimple1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimple2_2_0= ruleExprSimple ) ) )
                    {
                    // InternalWhileComp.g:1437:3: ( ( (lv_exprSimple1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimple2_2_0= ruleExprSimple ) ) )
                    // InternalWhileComp.g:1438:4: ( (lv_exprSimple1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimple2_2_0= ruleExprSimple ) )
                    {
                    // InternalWhileComp.g:1438:4: ( (lv_exprSimple1_0_0= ruleExprSimple ) )
                    // InternalWhileComp.g:1439:5: (lv_exprSimple1_0_0= ruleExprSimple )
                    {
                    // InternalWhileComp.g:1439:5: (lv_exprSimple1_0_0= ruleExprSimple )
                    // InternalWhileComp.g:1440:6: lv_exprSimple1_0_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprEqAccess().getExprSimple1ExprSimpleParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_exprSimple1_0_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprEqRule());
                      						}
                      						set(
                      							current,
                      							"exprSimple1",
                      							lv_exprSimple1_0_0,
                      							"org.xtext.compilation.WhileComp.ExprSimple");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1());
                      			
                    }
                    // InternalWhileComp.g:1461:4: ( (lv_exprSimple2_2_0= ruleExprSimple ) )
                    // InternalWhileComp.g:1462:5: (lv_exprSimple2_2_0= ruleExprSimple )
                    {
                    // InternalWhileComp.g:1462:5: (lv_exprSimple2_2_0= ruleExprSimple )
                    // InternalWhileComp.g:1463:6: lv_exprSimple2_2_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprEqAccess().getExprSimple2ExprSimpleParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprSimple2_2_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprEqRule());
                      						}
                      						set(
                      							current,
                      							"exprSimple2",
                      							lv_exprSimple2_2_0,
                      							"org.xtext.compilation.WhileComp.ExprSimple");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:1482:3: (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' )
                    {
                    // InternalWhileComp.g:1482:3: (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' )
                    // InternalWhileComp.g:1483:4: otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalWhileComp.g:1487:4: ( (lv_expr_4_0= ruleExpr ) )
                    // InternalWhileComp.g:1488:5: (lv_expr_4_0= ruleExpr )
                    {
                    // InternalWhileComp.g:1488:5: (lv_expr_4_0= ruleExpr )
                    // InternalWhileComp.g:1489:6: lv_expr_4_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprEqAccess().getExprExprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_expr_4_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprEqRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_4_0,
                      							"org.xtext.compilation.WhileComp.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getExprEqAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprEq"


    // $ANTLR start "entryRuleVars"
    // InternalWhileComp.g:1515:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // InternalWhileComp.g:1515:45: (iv_ruleVars= ruleVars EOF )
            // InternalWhileComp.g:1516:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // InternalWhileComp.g:1522:1: ruleVars returns [EObject current=null] : ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_vars_2_0= ruleVars ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;
        Token otherlv_1=null;
        Token lv_variable_3_0=null;
        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:1528:2: ( ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_vars_2_0= ruleVars ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) ) )
            // InternalWhileComp.g:1529:2: ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_vars_2_0= ruleVars ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) )
            {
            // InternalWhileComp.g:1529:2: ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_vars_2_0= ruleVars ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_VARIABLE) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF) ) {
                    alt15=2;
                }
                else if ( (LA15_1==18) ) {
                    alt15=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalWhileComp.g:1530:3: ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_vars_2_0= ruleVars ) ) )
                    {
                    // InternalWhileComp.g:1530:3: ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_vars_2_0= ruleVars ) ) )
                    // InternalWhileComp.g:1531:4: ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_vars_2_0= ruleVars ) )
                    {
                    // InternalWhileComp.g:1531:4: ( (lv_variable_0_0= RULE_VARIABLE ) )
                    // InternalWhileComp.g:1532:5: (lv_variable_0_0= RULE_VARIABLE )
                    {
                    // InternalWhileComp.g:1532:5: (lv_variable_0_0= RULE_VARIABLE )
                    // InternalWhileComp.g:1533:6: lv_variable_0_0= RULE_VARIABLE
                    {
                    lv_variable_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variable_0_0, grammarAccess.getVarsAccess().getVariableVARIABLETerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVarsRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"variable",
                      							lv_variable_0_0,
                      							"org.xtext.compilation.WhileComp.VARIABLE");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_0_1());
                      			
                    }
                    // InternalWhileComp.g:1553:4: ( (lv_vars_2_0= ruleVars ) )
                    // InternalWhileComp.g:1554:5: (lv_vars_2_0= ruleVars )
                    {
                    // InternalWhileComp.g:1554:5: (lv_vars_2_0= ruleVars )
                    // InternalWhileComp.g:1555:6: lv_vars_2_0= ruleVars
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarsAccess().getVarsVarsParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_vars_2_0=ruleVars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarsRule());
                      						}
                      						set(
                      							current,
                      							"vars",
                      							lv_vars_2_0,
                      							"org.xtext.compilation.WhileComp.Vars");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:1574:3: ( (lv_variable_3_0= RULE_VARIABLE ) )
                    {
                    // InternalWhileComp.g:1574:3: ( (lv_variable_3_0= RULE_VARIABLE ) )
                    // InternalWhileComp.g:1575:4: (lv_variable_3_0= RULE_VARIABLE )
                    {
                    // InternalWhileComp.g:1575:4: (lv_variable_3_0= RULE_VARIABLE )
                    // InternalWhileComp.g:1576:5: lv_variable_3_0= RULE_VARIABLE
                    {
                    lv_variable_3_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_variable_3_0, grammarAccess.getVarsAccess().getVariableVARIABLETerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarsRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"variable",
                      						lv_variable_3_0,
                      						"org.xtext.compilation.WhileComp.VARIABLE");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExprs"
    // InternalWhileComp.g:1596:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // InternalWhileComp.g:1596:46: (iv_ruleExprs= ruleExprs EOF )
            // InternalWhileComp.g:1597:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // InternalWhileComp.g:1603:1: ruleExprs returns [EObject current=null] : ( ( ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )=> ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) ) ) | ( (lv_expr_3_0= ruleExpr ) ) ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_0_0 = null;

        EObject lv_exprs_2_0 = null;

        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:1609:2: ( ( ( ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )=> ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) ) ) | ( (lv_expr_3_0= ruleExpr ) ) ) )
            // InternalWhileComp.g:1610:2: ( ( ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )=> ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) ) ) | ( (lv_expr_3_0= ruleExpr ) ) )
            {
            // InternalWhileComp.g:1610:2: ( ( ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )=> ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) ) ) | ( (lv_expr_3_0= ruleExpr ) ) )
            int alt16=2;
            switch ( input.LA(1) ) {
            case 22:
                {
                int LA16_1 = input.LA(2);

                if ( (synpred5_InternalWhileComp()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VARIABLE:
                {
                int LA16_2 = input.LA(2);

                if ( (synpred5_InternalWhileComp()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYMBOL:
                {
                int LA16_3 = input.LA(2);

                if ( (synpred5_InternalWhileComp()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA16_4 = input.LA(2);

                if ( (synpred5_InternalWhileComp()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                int LA16_5 = input.LA(2);

                if ( (synpred5_InternalWhileComp()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalWhileComp.g:1611:3: ( ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )=> ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) ) )
                    {
                    // InternalWhileComp.g:1611:3: ( ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )=> ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) ) )
                    // InternalWhileComp.g:1612:4: ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )=> ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) )
                    {
                    // InternalWhileComp.g:1626:4: ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) )
                    // InternalWhileComp.g:1627:5: ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) )
                    {
                    // InternalWhileComp.g:1627:5: ( (lv_expr_0_0= ruleExpr ) )
                    // InternalWhileComp.g:1628:6: (lv_expr_0_0= ruleExpr )
                    {
                    // InternalWhileComp.g:1628:6: (lv_expr_0_0= ruleExpr )
                    // InternalWhileComp.g:1629:7: lv_expr_0_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getExprsAccess().getExprExprParserRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_14);
                    lv_expr_0_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getExprsRule());
                      							}
                      							set(
                      								current,
                      								"expr",
                      								lv_expr_0_0,
                      								"org.xtext.compilation.WhileComp.Expr");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_0_0_1());
                      				
                    }
                    // InternalWhileComp.g:1650:5: ( (lv_exprs_2_0= ruleExprs ) )
                    // InternalWhileComp.g:1651:6: (lv_exprs_2_0= ruleExprs )
                    {
                    // InternalWhileComp.g:1651:6: (lv_exprs_2_0= ruleExprs )
                    // InternalWhileComp.g:1652:7: lv_exprs_2_0= ruleExprs
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getExprsAccess().getExprsExprsParserRuleCall_0_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprs_2_0=ruleExprs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getExprsRule());
                      							}
                      							set(
                      								current,
                      								"exprs",
                      								lv_exprs_2_0,
                      								"org.xtext.compilation.WhileComp.Exprs");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:1672:3: ( (lv_expr_3_0= ruleExpr ) )
                    {
                    // InternalWhileComp.g:1672:3: ( (lv_expr_3_0= ruleExpr ) )
                    // InternalWhileComp.g:1673:4: (lv_expr_3_0= ruleExpr )
                    {
                    // InternalWhileComp.g:1673:4: (lv_expr_3_0= ruleExpr )
                    // InternalWhileComp.g:1674:5: lv_expr_3_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprsAccess().getExprExprParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_3_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprsRule());
                      					}
                      					set(
                      						current,
                      						"expr",
                      						lv_expr_3_0,
                      						"org.xtext.compilation.WhileComp.Expr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExprSimple"
    // InternalWhileComp.g:1695:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // InternalWhileComp.g:1695:51: (iv_ruleExprSimple= ruleExprSimple EOF )
            // InternalWhileComp.g:1696:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // InternalWhileComp.g:1702:1: ruleExprSimple returns [EObject current=null] : ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_variable_1_0= RULE_VARIABLE ) ) | ( (lv_symbol_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')' ) ) ;
    public final EObject ruleExprSimple() throws RecognitionException {
        EObject current = null;

        Token lv_nil_0_0=null;
        Token lv_variable_1_0=null;
        Token lv_symbol_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_symbol_20_0=null;
        Token otherlv_22=null;
        EObject lv_cons_4_0 = null;

        EObject lv_lexpr_5_0 = null;

        EObject lv_list_8_0 = null;

        EObject lv_lexpr_9_0 = null;

        EObject lv_hd_12_0 = null;

        EObject lv_expr_13_0 = null;

        EObject lv_tl_16_0 = null;

        EObject lv_expr_17_0 = null;

        EObject lv_lexpr_21_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:1708:2: ( ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_variable_1_0= RULE_VARIABLE ) ) | ( (lv_symbol_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')' ) ) )
            // InternalWhileComp.g:1709:2: ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_variable_1_0= RULE_VARIABLE ) ) | ( (lv_symbol_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')' ) )
            {
            // InternalWhileComp.g:1709:2: ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_variable_1_0= RULE_VARIABLE ) ) | ( (lv_symbol_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')' ) )
            int alt17=8;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalWhileComp.g:1710:3: ( (lv_nil_0_0= 'nil' ) )
                    {
                    // InternalWhileComp.g:1710:3: ( (lv_nil_0_0= 'nil' ) )
                    // InternalWhileComp.g:1711:4: (lv_nil_0_0= 'nil' )
                    {
                    // InternalWhileComp.g:1711:4: (lv_nil_0_0= 'nil' )
                    // InternalWhileComp.g:1712:5: lv_nil_0_0= 'nil'
                    {
                    lv_nil_0_0=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_nil_0_0, grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(current, "nil", lv_nil_0_0, "nil");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:1725:3: ( (lv_variable_1_0= RULE_VARIABLE ) )
                    {
                    // InternalWhileComp.g:1725:3: ( (lv_variable_1_0= RULE_VARIABLE ) )
                    // InternalWhileComp.g:1726:4: (lv_variable_1_0= RULE_VARIABLE )
                    {
                    // InternalWhileComp.g:1726:4: (lv_variable_1_0= RULE_VARIABLE )
                    // InternalWhileComp.g:1727:5: lv_variable_1_0= RULE_VARIABLE
                    {
                    lv_variable_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_variable_1_0, grammarAccess.getExprSimpleAccess().getVariableVARIABLETerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"variable",
                      						lv_variable_1_0,
                      						"org.xtext.compilation.WhileComp.VARIABLE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWhileComp.g:1744:3: ( (lv_symbol_2_0= RULE_SYMBOL ) )
                    {
                    // InternalWhileComp.g:1744:3: ( (lv_symbol_2_0= RULE_SYMBOL ) )
                    // InternalWhileComp.g:1745:4: (lv_symbol_2_0= RULE_SYMBOL )
                    {
                    // InternalWhileComp.g:1745:4: (lv_symbol_2_0= RULE_SYMBOL )
                    // InternalWhileComp.g:1746:5: lv_symbol_2_0= RULE_SYMBOL
                    {
                    lv_symbol_2_0=(Token)match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_2_0, grammarAccess.getExprSimpleAccess().getSymbolSYMBOLTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"symbol",
                      						lv_symbol_2_0,
                      						"org.xtext.compilation.WhileComp.SYMBOL");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWhileComp.g:1763:3: (otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' )
                    {
                    // InternalWhileComp.g:1763:3: (otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' )
                    // InternalWhileComp.g:1764:4: otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalWhileComp.g:1768:4: ( (lv_cons_4_0= ruleCons ) )
                    // InternalWhileComp.g:1769:5: (lv_cons_4_0= ruleCons )
                    {
                    // InternalWhileComp.g:1769:5: (lv_cons_4_0= ruleCons )
                    // InternalWhileComp.g:1770:6: lv_cons_4_0= ruleCons
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getConsConsParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_cons_4_0=ruleCons();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"cons",
                      							lv_cons_4_0,
                      							"org.xtext.compilation.WhileComp.Cons");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalWhileComp.g:1787:4: ( (lv_lexpr_5_0= ruleLexpr ) )
                    // InternalWhileComp.g:1788:5: (lv_lexpr_5_0= ruleLexpr )
                    {
                    // InternalWhileComp.g:1788:5: (lv_lexpr_5_0= ruleLexpr )
                    // InternalWhileComp.g:1789:6: lv_lexpr_5_0= ruleLexpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_lexpr_5_0=ruleLexpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"lexpr",
                      							lv_lexpr_5_0,
                      							"org.xtext.compilation.WhileComp.Lexpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalWhileComp.g:1812:3: (otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' )
                    {
                    // InternalWhileComp.g:1812:3: (otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' )
                    // InternalWhileComp.g:1813:4: otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalWhileComp.g:1817:4: ( (lv_list_8_0= ruleList ) )
                    // InternalWhileComp.g:1818:5: (lv_list_8_0= ruleList )
                    {
                    // InternalWhileComp.g:1818:5: (lv_list_8_0= ruleList )
                    // InternalWhileComp.g:1819:6: lv_list_8_0= ruleList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getListListParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_list_8_0=ruleList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"list",
                      							lv_list_8_0,
                      							"org.xtext.compilation.WhileComp.List");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalWhileComp.g:1836:4: ( (lv_lexpr_9_0= ruleLexpr ) )
                    // InternalWhileComp.g:1837:5: (lv_lexpr_9_0= ruleLexpr )
                    {
                    // InternalWhileComp.g:1837:5: (lv_lexpr_9_0= ruleLexpr )
                    // InternalWhileComp.g:1838:6: lv_lexpr_9_0= ruleLexpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_lexpr_9_0=ruleLexpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"lexpr",
                      							lv_lexpr_9_0,
                      							"org.xtext.compilation.WhileComp.Lexpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalWhileComp.g:1861:3: (otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' )
                    {
                    // InternalWhileComp.g:1861:3: (otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' )
                    // InternalWhileComp.g:1862:4: otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')'
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    // InternalWhileComp.g:1866:4: ( (lv_hd_12_0= ruleHd ) )
                    // InternalWhileComp.g:1867:5: (lv_hd_12_0= ruleHd )
                    {
                    // InternalWhileComp.g:1867:5: (lv_hd_12_0= ruleHd )
                    // InternalWhileComp.g:1868:6: lv_hd_12_0= ruleHd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getHdHdParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_hd_12_0=ruleHd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"hd",
                      							lv_hd_12_0,
                      							"org.xtext.compilation.WhileComp.Hd");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalWhileComp.g:1885:4: ( (lv_expr_13_0= ruleExpr ) )
                    // InternalWhileComp.g:1886:5: (lv_expr_13_0= ruleExpr )
                    {
                    // InternalWhileComp.g:1886:5: (lv_expr_13_0= ruleExpr )
                    // InternalWhileComp.g:1887:6: lv_expr_13_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getExprExprParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_expr_13_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_13_0,
                      							"org.xtext.compilation.WhileComp.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalWhileComp.g:1910:3: (otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' )
                    {
                    // InternalWhileComp.g:1910:3: (otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' )
                    // InternalWhileComp.g:1911:4: otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')'
                    {
                    otherlv_15=(Token)match(input,38,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    // InternalWhileComp.g:1915:4: ( (lv_tl_16_0= ruleTl ) )
                    // InternalWhileComp.g:1916:5: (lv_tl_16_0= ruleTl )
                    {
                    // InternalWhileComp.g:1916:5: (lv_tl_16_0= ruleTl )
                    // InternalWhileComp.g:1917:6: lv_tl_16_0= ruleTl
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getTlTlParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_tl_16_0=ruleTl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"tl",
                      							lv_tl_16_0,
                      							"org.xtext.compilation.WhileComp.Tl");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalWhileComp.g:1934:4: ( (lv_expr_17_0= ruleExpr ) )
                    // InternalWhileComp.g:1935:5: (lv_expr_17_0= ruleExpr )
                    {
                    // InternalWhileComp.g:1935:5: (lv_expr_17_0= ruleExpr )
                    // InternalWhileComp.g:1936:6: lv_expr_17_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getExprExprParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_expr_17_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_17_0,
                      							"org.xtext.compilation.WhileComp.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_6_3());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalWhileComp.g:1959:3: (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')' )
                    {
                    // InternalWhileComp.g:1959:3: (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')' )
                    // InternalWhileComp.g:1960:4: otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')'
                    {
                    otherlv_19=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_7_0());
                      			
                    }
                    // InternalWhileComp.g:1964:4: ( (lv_symbol_20_0= RULE_SYMBOL ) )
                    // InternalWhileComp.g:1965:5: (lv_symbol_20_0= RULE_SYMBOL )
                    {
                    // InternalWhileComp.g:1965:5: (lv_symbol_20_0= RULE_SYMBOL )
                    // InternalWhileComp.g:1966:6: lv_symbol_20_0= RULE_SYMBOL
                    {
                    lv_symbol_20_0=(Token)match(input,RULE_SYMBOL,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_symbol_20_0, grammarAccess.getExprSimpleAccess().getSymbolSYMBOLTerminalRuleCall_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprSimpleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"symbol",
                      							lv_symbol_20_0,
                      							"org.xtext.compilation.WhileComp.SYMBOL");
                      					
                    }

                    }


                    }

                    // InternalWhileComp.g:1982:4: ( (lv_lexpr_21_0= ruleLexpr ) )
                    // InternalWhileComp.g:1983:5: (lv_lexpr_21_0= ruleLexpr )
                    {
                    // InternalWhileComp.g:1983:5: (lv_lexpr_21_0= ruleLexpr )
                    // InternalWhileComp.g:1984:6: lv_lexpr_21_0= ruleLexpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_lexpr_21_0=ruleLexpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"lexpr",
                      							lv_lexpr_21_0,
                      							"org.xtext.compilation.WhileComp.Lexpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_7_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleCons"
    // InternalWhileComp.g:2010:1: entryRuleCons returns [EObject current=null] : iv_ruleCons= ruleCons EOF ;
    public final EObject entryRuleCons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCons = null;


        try {
            // InternalWhileComp.g:2010:45: (iv_ruleCons= ruleCons EOF )
            // InternalWhileComp.g:2011:2: iv_ruleCons= ruleCons EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCons=ruleCons();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCons; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCons"


    // $ANTLR start "ruleCons"
    // InternalWhileComp.g:2017:1: ruleCons returns [EObject current=null] : ( (lv_cons_0_0= 'cons' ) ) ;
    public final EObject ruleCons() throws RecognitionException {
        EObject current = null;

        Token lv_cons_0_0=null;


        	enterRule();

        try {
            // InternalWhileComp.g:2023:2: ( ( (lv_cons_0_0= 'cons' ) ) )
            // InternalWhileComp.g:2024:2: ( (lv_cons_0_0= 'cons' ) )
            {
            // InternalWhileComp.g:2024:2: ( (lv_cons_0_0= 'cons' ) )
            // InternalWhileComp.g:2025:3: (lv_cons_0_0= 'cons' )
            {
            // InternalWhileComp.g:2025:3: (lv_cons_0_0= 'cons' )
            // InternalWhileComp.g:2026:4: lv_cons_0_0= 'cons'
            {
            lv_cons_0_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_cons_0_0, grammarAccess.getConsAccess().getConsConsKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getConsRule());
              				}
              				setWithLastConsumed(current, "cons", lv_cons_0_0, "cons");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCons"


    // $ANTLR start "entryRuleList"
    // InternalWhileComp.g:2041:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalWhileComp.g:2041:45: (iv_ruleList= ruleList EOF )
            // InternalWhileComp.g:2042:2: iv_ruleList= ruleList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalWhileComp.g:2048:1: ruleList returns [EObject current=null] : ( (lv_list_0_0= 'list' ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token lv_list_0_0=null;


        	enterRule();

        try {
            // InternalWhileComp.g:2054:2: ( ( (lv_list_0_0= 'list' ) ) )
            // InternalWhileComp.g:2055:2: ( (lv_list_0_0= 'list' ) )
            {
            // InternalWhileComp.g:2055:2: ( (lv_list_0_0= 'list' ) )
            // InternalWhileComp.g:2056:3: (lv_list_0_0= 'list' )
            {
            // InternalWhileComp.g:2056:3: (lv_list_0_0= 'list' )
            // InternalWhileComp.g:2057:4: lv_list_0_0= 'list'
            {
            lv_list_0_0=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_list_0_0, grammarAccess.getListAccess().getListListKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getListRule());
              				}
              				setWithLastConsumed(current, "list", lv_list_0_0, "list");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleHd"
    // InternalWhileComp.g:2072:1: entryRuleHd returns [EObject current=null] : iv_ruleHd= ruleHd EOF ;
    public final EObject entryRuleHd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHd = null;


        try {
            // InternalWhileComp.g:2072:43: (iv_ruleHd= ruleHd EOF )
            // InternalWhileComp.g:2073:2: iv_ruleHd= ruleHd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHdRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHd=ruleHd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHd"


    // $ANTLR start "ruleHd"
    // InternalWhileComp.g:2079:1: ruleHd returns [EObject current=null] : ( (lv_hd_0_0= 'hd' ) ) ;
    public final EObject ruleHd() throws RecognitionException {
        EObject current = null;

        Token lv_hd_0_0=null;


        	enterRule();

        try {
            // InternalWhileComp.g:2085:2: ( ( (lv_hd_0_0= 'hd' ) ) )
            // InternalWhileComp.g:2086:2: ( (lv_hd_0_0= 'hd' ) )
            {
            // InternalWhileComp.g:2086:2: ( (lv_hd_0_0= 'hd' ) )
            // InternalWhileComp.g:2087:3: (lv_hd_0_0= 'hd' )
            {
            // InternalWhileComp.g:2087:3: (lv_hd_0_0= 'hd' )
            // InternalWhileComp.g:2088:4: lv_hd_0_0= 'hd'
            {
            lv_hd_0_0=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_hd_0_0, grammarAccess.getHdAccess().getHdHdKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getHdRule());
              				}
              				setWithLastConsumed(current, "hd", lv_hd_0_0, "hd");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHd"


    // $ANTLR start "entryRuleTl"
    // InternalWhileComp.g:2103:1: entryRuleTl returns [EObject current=null] : iv_ruleTl= ruleTl EOF ;
    public final EObject entryRuleTl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTl = null;


        try {
            // InternalWhileComp.g:2103:43: (iv_ruleTl= ruleTl EOF )
            // InternalWhileComp.g:2104:2: iv_ruleTl= ruleTl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTlRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTl=ruleTl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTl"


    // $ANTLR start "ruleTl"
    // InternalWhileComp.g:2110:1: ruleTl returns [EObject current=null] : ( (lv_tl_0_0= 'tl' ) ) ;
    public final EObject ruleTl() throws RecognitionException {
        EObject current = null;

        Token lv_tl_0_0=null;


        	enterRule();

        try {
            // InternalWhileComp.g:2116:2: ( ( (lv_tl_0_0= 'tl' ) ) )
            // InternalWhileComp.g:2117:2: ( (lv_tl_0_0= 'tl' ) )
            {
            // InternalWhileComp.g:2117:2: ( (lv_tl_0_0= 'tl' ) )
            // InternalWhileComp.g:2118:3: (lv_tl_0_0= 'tl' )
            {
            // InternalWhileComp.g:2118:3: (lv_tl_0_0= 'tl' )
            // InternalWhileComp.g:2119:4: lv_tl_0_0= 'tl'
            {
            lv_tl_0_0=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_tl_0_0, grammarAccess.getTlAccess().getTlTlKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getTlRule());
              				}
              				setWithLastConsumed(current, "tl", lv_tl_0_0, "tl");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTl"


    // $ANTLR start "entryRuleLexpr"
    // InternalWhileComp.g:2134:1: entryRuleLexpr returns [EObject current=null] : iv_ruleLexpr= ruleLexpr EOF ;
    public final EObject entryRuleLexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexpr = null;


        try {
            // InternalWhileComp.g:2134:46: (iv_ruleLexpr= ruleLexpr EOF )
            // InternalWhileComp.g:2135:2: iv_ruleLexpr= ruleLexpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLexprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLexpr=ruleLexpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLexpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexpr"


    // $ANTLR start "ruleLexpr"
    // InternalWhileComp.g:2141:1: ruleLexpr returns [EObject current=null] : ( ( (lv_expr_0_0= ruleExpr ) ) ( (lv_lexpr_1_0= ruleLexpr ) ) ) ;
    public final EObject ruleLexpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;

        EObject lv_lexpr_1_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:2147:2: ( ( ( (lv_expr_0_0= ruleExpr ) ) ( (lv_lexpr_1_0= ruleLexpr ) ) ) )
            // InternalWhileComp.g:2148:2: ( ( (lv_expr_0_0= ruleExpr ) ) ( (lv_lexpr_1_0= ruleLexpr ) ) )
            {
            // InternalWhileComp.g:2148:2: ( ( (lv_expr_0_0= ruleExpr ) ) ( (lv_lexpr_1_0= ruleLexpr ) ) )
            // InternalWhileComp.g:2149:3: ( (lv_expr_0_0= ruleExpr ) ) ( (lv_lexpr_1_0= ruleLexpr ) )
            {
            // InternalWhileComp.g:2149:3: ( (lv_expr_0_0= ruleExpr ) )
            // InternalWhileComp.g:2150:4: (lv_expr_0_0= ruleExpr )
            {
            // InternalWhileComp.g:2150:4: (lv_expr_0_0= ruleExpr )
            // InternalWhileComp.g:2151:5: lv_expr_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLexprAccess().getExprExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_expr_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLexprRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_0_0,
              						"org.xtext.compilation.WhileComp.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhileComp.g:2168:3: ( (lv_lexpr_1_0= ruleLexpr ) )
            // InternalWhileComp.g:2169:4: (lv_lexpr_1_0= ruleLexpr )
            {
            // InternalWhileComp.g:2169:4: (lv_lexpr_1_0= ruleLexpr )
            // InternalWhileComp.g:2170:5: lv_lexpr_1_0= ruleLexpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLexprAccess().getLexprLexprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_lexpr_1_0=ruleLexpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLexprRule());
              					}
              					set(
              						current,
              						"lexpr",
              						lv_lexpr_1_0,
              						"org.xtext.compilation.WhileComp.Lexpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexpr"

    // $ANTLR start synpred1_InternalWhileComp
    public final void synpred1_InternalWhileComp_fragment() throws RecognitionException {   
        // InternalWhileComp.g:699:4: ( ( ( ( ruleCommand ) ) ';' ( ( ruleCommands ) ) ) )
        // InternalWhileComp.g:699:5: ( ( ( ruleCommand ) ) ';' ( ( ruleCommands ) ) )
        {
        // InternalWhileComp.g:699:5: ( ( ( ruleCommand ) ) ';' ( ( ruleCommands ) ) )
        // InternalWhileComp.g:700:5: ( ( ruleCommand ) ) ';' ( ( ruleCommands ) )
        {
        // InternalWhileComp.g:700:5: ( ( ruleCommand ) )
        // InternalWhileComp.g:701:6: ( ruleCommand )
        {
        // InternalWhileComp.g:701:6: ( ruleCommand )
        // InternalWhileComp.g:702:7: ruleCommand
        {
        pushFollow(FOLLOW_15);
        ruleCommand();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,23,FOLLOW_16); if (state.failed) return ;
        // InternalWhileComp.g:706:5: ( ( ruleCommands ) )
        // InternalWhileComp.g:707:6: ( ruleCommands )
        {
        // InternalWhileComp.g:707:6: ( ruleCommands )
        // InternalWhileComp.g:708:7: ruleCommands
        {
        pushFollow(FOLLOW_2);
        ruleCommands();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalWhileComp

    // $ANTLR start synpred2_InternalWhileComp
    public final void synpred2_InternalWhileComp_fragment() throws RecognitionException {   
        // InternalWhileComp.g:1114:4: ( ( ruleExprSimple ) )
        // InternalWhileComp.g:1114:5: ( ruleExprSimple )
        {
        // InternalWhileComp.g:1114:5: ( ruleExprSimple )
        // InternalWhileComp.g:1115:5: ruleExprSimple
        {
        pushFollow(FOLLOW_2);
        ruleExprSimple();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalWhileComp

    // $ANTLR start synpred3_InternalWhileComp
    public final void synpred3_InternalWhileComp_fragment() throws RecognitionException {   
        // InternalWhileComp.g:1176:4: ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )
        // InternalWhileComp.g:1176:5: ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) )
        {
        // InternalWhileComp.g:1176:5: ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) )
        // InternalWhileComp.g:1177:5: ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) )
        {
        // InternalWhileComp.g:1177:5: ( ( ruleExprOr ) )
        // InternalWhileComp.g:1178:6: ( ruleExprOr )
        {
        // InternalWhileComp.g:1178:6: ( ruleExprOr )
        // InternalWhileComp.g:1179:7: ruleExprOr
        {
        pushFollow(FOLLOW_24);
        ruleExprOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,34,FOLLOW_17); if (state.failed) return ;
        // InternalWhileComp.g:1183:5: ( ( ruleExprAnd ) )
        // InternalWhileComp.g:1184:6: ( ruleExprAnd )
        {
        // InternalWhileComp.g:1184:6: ( ruleExprAnd )
        // InternalWhileComp.g:1185:7: ruleExprAnd
        {
        pushFollow(FOLLOW_2);
        ruleExprAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalWhileComp

    // $ANTLR start synpred4_InternalWhileComp
    public final void synpred4_InternalWhileComp_fragment() throws RecognitionException {   
        // InternalWhileComp.g:1275:4: ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )
        // InternalWhileComp.g:1275:5: ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) )
        {
        // InternalWhileComp.g:1275:5: ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) )
        // InternalWhileComp.g:1276:5: ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) )
        {
        // InternalWhileComp.g:1276:5: ( ( ruleExprNot ) )
        // InternalWhileComp.g:1277:6: ( ruleExprNot )
        {
        // InternalWhileComp.g:1277:6: ( ruleExprNot )
        // InternalWhileComp.g:1278:7: ruleExprNot
        {
        pushFollow(FOLLOW_25);
        ruleExprNot();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,35,FOLLOW_17); if (state.failed) return ;
        // InternalWhileComp.g:1282:5: ( ( ruleExprOr ) )
        // InternalWhileComp.g:1283:6: ( ruleExprOr )
        {
        // InternalWhileComp.g:1283:6: ( ruleExprOr )
        // InternalWhileComp.g:1284:7: ruleExprOr
        {
        pushFollow(FOLLOW_2);
        ruleExprOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalWhileComp

    // $ANTLR start synpred5_InternalWhileComp
    public final void synpred5_InternalWhileComp_fragment() throws RecognitionException {   
        // InternalWhileComp.g:1612:4: ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )
        // InternalWhileComp.g:1612:5: ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) )
        {
        // InternalWhileComp.g:1612:5: ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) )
        // InternalWhileComp.g:1613:5: ( ( ruleExpr ) ) ',' ( ( ruleExprs ) )
        {
        // InternalWhileComp.g:1613:5: ( ( ruleExpr ) )
        // InternalWhileComp.g:1614:6: ( ruleExpr )
        {
        // InternalWhileComp.g:1614:6: ( ruleExpr )
        // InternalWhileComp.g:1615:7: ruleExpr
        {
        pushFollow(FOLLOW_14);
        ruleExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,18,FOLLOW_17); if (state.failed) return ;
        // InternalWhileComp.g:1619:5: ( ( ruleExprs ) )
        // InternalWhileComp.g:1620:6: ( ruleExprs )
        {
        // InternalWhileComp.g:1620:6: ( ruleExprs )
        // InternalWhileComp.g:1621:7: ruleExprs
        {
        pushFollow(FOLLOW_2);
        ruleExprs();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalWhileComp

    // Delegated rules

    public final boolean synpred2_InternalWhileComp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalWhileComp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalWhileComp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalWhileComp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalWhileComp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalWhileComp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalWhileComp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalWhileComp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalWhileComp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalWhileComp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\5\uffff";
    static final String dfa_3s = "\1\46\3\uffff\1\53\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\7\1\6\1\5\1\10";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\2\20\uffff\1\1\17\uffff\1\4",
            "",
            "",
            "",
            "\1\11\43\uffff\1\5\1\10\1\7\1\6",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1709:2: ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_variable_1_0= RULE_VARIABLE ) ) | ( (lv_symbol_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000119110020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000119100020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000005000400030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000400030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});

}