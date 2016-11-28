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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_NOMBRE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'%'", "'read'", "','", "'write'", "'nop'", "':='", "'nil'", "';'", "'foreach'", "'in'", "'do'", "'od'", "'if'", "'then'", "'else'", "'fi'", "'for'", "'while'", "'&&'", "'||'", "'=?'", "'('", "')'", "'!'", "'cons'", "'list'", "'hd'", "'tl'"
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
    // InternalWhileComp.g:171:1: ruleDefinition returns [EObject current=null] : ( ( (lv_read_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '%' ( (lv_write_4_0= ruleWrite ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_read_0_0 = null;

        EObject lv_commands_2_0 = null;

        EObject lv_write_4_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:177:2: ( ( ( (lv_read_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '%' ( (lv_write_4_0= ruleWrite ) ) ) )
            // InternalWhileComp.g:178:2: ( ( (lv_read_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '%' ( (lv_write_4_0= ruleWrite ) ) )
            {
            // InternalWhileComp.g:178:2: ( ( (lv_read_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '%' ( (lv_write_4_0= ruleWrite ) ) )
            // InternalWhileComp.g:179:3: ( (lv_read_0_0= ruleRead ) ) otherlv_1= '%' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '%' ( (lv_write_4_0= ruleWrite ) )
            {
            // InternalWhileComp.g:179:3: ( (lv_read_0_0= ruleRead ) )
            // InternalWhileComp.g:180:4: (lv_read_0_0= ruleRead )
            {
            // InternalWhileComp.g:180:4: (lv_read_0_0= ruleRead )
            // InternalWhileComp.g:181:5: lv_read_0_0= ruleRead
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getReadReadParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_read_0_0=ruleRead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"read",
              						lv_read_0_0,
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

                if ( (LA2_0==RULE_VARIABLE||LA2_0==20||LA2_0==24||LA2_0==28||(LA2_0>=32 && LA2_0<=33)) ) {
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
            // InternalWhileComp.g:225:3: ( (lv_write_4_0= ruleWrite ) )
            // InternalWhileComp.g:226:4: (lv_write_4_0= ruleWrite )
            {
            // InternalWhileComp.g:226:4: (lv_write_4_0= ruleWrite )
            // InternalWhileComp.g:227:5: lv_write_4_0= ruleWrite
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getWriteWriteParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_write_4_0=ruleWrite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"write",
              						lv_write_4_0,
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


    // $ANTLR start "entryRuleCommands"
    // InternalWhileComp.g:521:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalWhileComp.g:521:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalWhileComp.g:522:2: iv_ruleCommands= ruleCommands EOF
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
    // InternalWhileComp.g:528:1: ruleCommands returns [EObject current=null] : ( ( (lv_command_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_command_0_0 = null;

        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:534:2: ( ( ( (lv_command_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) )
            // InternalWhileComp.g:535:2: ( ( (lv_command_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            {
            // InternalWhileComp.g:535:2: ( ( (lv_command_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            // InternalWhileComp.g:536:3: ( (lv_command_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            {
            // InternalWhileComp.g:536:3: ( (lv_command_0_0= ruleCommand ) )
            // InternalWhileComp.g:537:4: (lv_command_0_0= ruleCommand )
            {
            // InternalWhileComp.g:537:4: (lv_command_0_0= ruleCommand )
            // InternalWhileComp.g:538:5: lv_command_0_0= ruleCommand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCommandsAccess().getCommandCommandParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            // InternalWhileComp.g:555:3: (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWhileComp.g:556:4: otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalWhileComp.g:560:4: ( (lv_commands_2_0= ruleCommand ) )
            	    // InternalWhileComp.g:561:5: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalWhileComp.g:561:5: (lv_commands_2_0= ruleCommand )
            	    // InternalWhileComp.g:562:6: lv_commands_2_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCommandsRule());
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


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // InternalWhileComp.g:584:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalWhileComp.g:584:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalWhileComp.g:585:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalWhileComp.g:591:1: ruleCommand returns [EObject current=null] : ( ( (lv_command_0_0= ruleNop ) ) | ( (lv_command_1_0= ruleAffectation ) ) | ( (lv_command_2_0= ruleWhile ) ) | ( (lv_command_3_0= ruleFor ) ) | ( (lv_command_4_0= ruleIf ) ) | ( (lv_command_5_0= ruleForeach ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject lv_command_0_0 = null;

        EObject lv_command_1_0 = null;

        EObject lv_command_2_0 = null;

        EObject lv_command_3_0 = null;

        EObject lv_command_4_0 = null;

        EObject lv_command_5_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:597:2: ( ( ( (lv_command_0_0= ruleNop ) ) | ( (lv_command_1_0= ruleAffectation ) ) | ( (lv_command_2_0= ruleWhile ) ) | ( (lv_command_3_0= ruleFor ) ) | ( (lv_command_4_0= ruleIf ) ) | ( (lv_command_5_0= ruleForeach ) ) ) )
            // InternalWhileComp.g:598:2: ( ( (lv_command_0_0= ruleNop ) ) | ( (lv_command_1_0= ruleAffectation ) ) | ( (lv_command_2_0= ruleWhile ) ) | ( (lv_command_3_0= ruleFor ) ) | ( (lv_command_4_0= ruleIf ) ) | ( (lv_command_5_0= ruleForeach ) ) )
            {
            // InternalWhileComp.g:598:2: ( ( (lv_command_0_0= ruleNop ) ) | ( (lv_command_1_0= ruleAffectation ) ) | ( (lv_command_2_0= ruleWhile ) ) | ( (lv_command_3_0= ruleFor ) ) | ( (lv_command_4_0= ruleIf ) ) | ( (lv_command_5_0= ruleForeach ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 32:
                {
                alt7=4;
                }
                break;
            case 28:
                {
                alt7=5;
                }
                break;
            case 24:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalWhileComp.g:599:3: ( (lv_command_0_0= ruleNop ) )
                    {
                    // InternalWhileComp.g:599:3: ( (lv_command_0_0= ruleNop ) )
                    // InternalWhileComp.g:600:4: (lv_command_0_0= ruleNop )
                    {
                    // InternalWhileComp.g:600:4: (lv_command_0_0= ruleNop )
                    // InternalWhileComp.g:601:5: lv_command_0_0= ruleNop
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
                    // InternalWhileComp.g:619:3: ( (lv_command_1_0= ruleAffectation ) )
                    {
                    // InternalWhileComp.g:619:3: ( (lv_command_1_0= ruleAffectation ) )
                    // InternalWhileComp.g:620:4: (lv_command_1_0= ruleAffectation )
                    {
                    // InternalWhileComp.g:620:4: (lv_command_1_0= ruleAffectation )
                    // InternalWhileComp.g:621:5: lv_command_1_0= ruleAffectation
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
                    // InternalWhileComp.g:639:3: ( (lv_command_2_0= ruleWhile ) )
                    {
                    // InternalWhileComp.g:639:3: ( (lv_command_2_0= ruleWhile ) )
                    // InternalWhileComp.g:640:4: (lv_command_2_0= ruleWhile )
                    {
                    // InternalWhileComp.g:640:4: (lv_command_2_0= ruleWhile )
                    // InternalWhileComp.g:641:5: lv_command_2_0= ruleWhile
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCommandWhileParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_command_2_0=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"command",
                      						lv_command_2_0,
                      						"org.xtext.compilation.WhileComp.While");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWhileComp.g:659:3: ( (lv_command_3_0= ruleFor ) )
                    {
                    // InternalWhileComp.g:659:3: ( (lv_command_3_0= ruleFor ) )
                    // InternalWhileComp.g:660:4: (lv_command_3_0= ruleFor )
                    {
                    // InternalWhileComp.g:660:4: (lv_command_3_0= ruleFor )
                    // InternalWhileComp.g:661:5: lv_command_3_0= ruleFor
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCommandForParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_command_3_0=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"command",
                      						lv_command_3_0,
                      						"org.xtext.compilation.WhileComp.For");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalWhileComp.g:679:3: ( (lv_command_4_0= ruleIf ) )
                    {
                    // InternalWhileComp.g:679:3: ( (lv_command_4_0= ruleIf ) )
                    // InternalWhileComp.g:680:4: (lv_command_4_0= ruleIf )
                    {
                    // InternalWhileComp.g:680:4: (lv_command_4_0= ruleIf )
                    // InternalWhileComp.g:681:5: lv_command_4_0= ruleIf
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCommandIfParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_command_4_0=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"command",
                      						lv_command_4_0,
                      						"org.xtext.compilation.WhileComp.If");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalWhileComp.g:699:3: ( (lv_command_5_0= ruleForeach ) )
                    {
                    // InternalWhileComp.g:699:3: ( (lv_command_5_0= ruleForeach ) )
                    // InternalWhileComp.g:700:4: (lv_command_5_0= ruleForeach )
                    {
                    // InternalWhileComp.g:700:4: (lv_command_5_0= ruleForeach )
                    // InternalWhileComp.g:701:5: lv_command_5_0= ruleForeach
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCommandForeachParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_command_5_0=ruleForeach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"command",
                      						lv_command_5_0,
                      						"org.xtext.compilation.WhileComp.Foreach");
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleForeach"
    // InternalWhileComp.g:722:1: entryRuleForeach returns [EObject current=null] : iv_ruleForeach= ruleForeach EOF ;
    public final EObject entryRuleForeach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeach = null;


        try {
            // InternalWhileComp.g:722:48: (iv_ruleForeach= ruleForeach EOF )
            // InternalWhileComp.g:723:2: iv_ruleForeach= ruleForeach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForeach=ruleForeach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeach; 
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
    // $ANTLR end "entryRuleForeach"


    // $ANTLR start "ruleForeach"
    // InternalWhileComp.g:729:1: ruleForeach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) ;
    public final EObject ruleForeach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expr1_1_0 = null;

        EObject lv_expr2_3_0 = null;

        EObject lv_commands_5_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:735:2: ( (otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) )
            // InternalWhileComp.g:736:2: (otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' )
            {
            // InternalWhileComp.g:736:2: (otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' )
            // InternalWhileComp.g:737:3: otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForeachAccess().getForeachKeyword_0());
              		
            }
            // InternalWhileComp.g:741:3: ( (lv_expr1_1_0= ruleExpr ) )
            // InternalWhileComp.g:742:4: (lv_expr1_1_0= ruleExpr )
            {
            // InternalWhileComp.g:742:4: (lv_expr1_1_0= ruleExpr )
            // InternalWhileComp.g:743:5: lv_expr1_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachAccess().getExpr1ExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_expr1_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachRule());
              					}
              					set(
              						current,
              						"expr1",
              						lv_expr1_1_0,
              						"org.xtext.compilation.WhileComp.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForeachAccess().getInKeyword_2());
              		
            }
            // InternalWhileComp.g:764:3: ( (lv_expr2_3_0= ruleExpr ) )
            // InternalWhileComp.g:765:4: (lv_expr2_3_0= ruleExpr )
            {
            // InternalWhileComp.g:765:4: (lv_expr2_3_0= ruleExpr )
            // InternalWhileComp.g:766:5: lv_expr2_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachAccess().getExpr2ExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_expr2_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachRule());
              					}
              					set(
              						current,
              						"expr2",
              						lv_expr2_3_0,
              						"org.xtext.compilation.WhileComp.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForeachAccess().getDoKeyword_4());
              		
            }
            // InternalWhileComp.g:787:3: ( (lv_commands_5_0= ruleCommands ) )
            // InternalWhileComp.g:788:4: (lv_commands_5_0= ruleCommands )
            {
            // InternalWhileComp.g:788:4: (lv_commands_5_0= ruleCommands )
            // InternalWhileComp.g:789:5: lv_commands_5_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachAccess().getCommandsCommandsParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_commands_5_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachRule());
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

            otherlv_6=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getForeachAccess().getOdKeyword_6());
              		
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
    // $ANTLR end "ruleForeach"


    // $ANTLR start "entryRuleIf"
    // InternalWhileComp.g:814:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalWhileComp.g:814:43: (iv_ruleIf= ruleIf EOF )
            // InternalWhileComp.g:815:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalWhileComp.g:821:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands1_3_0 = null;

        EObject lv_commands2_5_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:827:2: ( (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) )
            // InternalWhileComp.g:828:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            {
            // InternalWhileComp.g:828:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            // InternalWhileComp.g:829:3: otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            // InternalWhileComp.g:833:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWhileComp.g:834:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWhileComp.g:834:4: (lv_expr_1_0= ruleExpr )
            // InternalWhileComp.g:835:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.xtext.compilation.WhileComp.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getThenKeyword_2());
              		
            }
            // InternalWhileComp.g:856:3: ( (lv_commands1_3_0= ruleCommands ) )
            // InternalWhileComp.g:857:4: (lv_commands1_3_0= ruleCommands )
            {
            // InternalWhileComp.g:857:4: (lv_commands1_3_0= ruleCommands )
            // InternalWhileComp.g:858:5: lv_commands1_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getCommands1CommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_commands1_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"commands1",
              						lv_commands1_3_0,
              						"org.xtext.compilation.WhileComp.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhileComp.g:875:3: ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_commands2_5_0= ruleCommands ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) && (synpred1_InternalWhileComp())) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalWhileComp.g:876:4: ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_commands2_5_0= ruleCommands ) )
                    {
                    // InternalWhileComp.g:876:4: ( ( 'else' )=>otherlv_4= 'else' )
                    // InternalWhileComp.g:877:5: ( 'else' )=>otherlv_4= 'else'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getIfAccess().getElseKeyword_4_0());
                      				
                    }

                    }

                    // InternalWhileComp.g:883:4: ( (lv_commands2_5_0= ruleCommands ) )
                    // InternalWhileComp.g:884:5: (lv_commands2_5_0= ruleCommands )
                    {
                    // InternalWhileComp.g:884:5: (lv_commands2_5_0= ruleCommands )
                    // InternalWhileComp.g:885:6: lv_commands2_5_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfAccess().getCommands2CommandsParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_commands2_5_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfRule());
                      						}
                      						set(
                      							current,
                      							"commands2",
                      							lv_commands2_5_0,
                      							"org.xtext.compilation.WhileComp.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getFiKeyword_5());
              		
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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleFor"
    // InternalWhileComp.g:911:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalWhileComp.g:911:44: (iv_ruleFor= ruleFor EOF )
            // InternalWhileComp.g:912:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalWhileComp.g:918:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:924:2: ( (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalWhileComp.g:925:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalWhileComp.g:925:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalWhileComp.g:926:3: otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
              		
            }
            // InternalWhileComp.g:930:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWhileComp.g:931:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWhileComp.g:931:4: (lv_expr_1_0= ruleExpr )
            // InternalWhileComp.g:932:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.xtext.compilation.WhileComp.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForAccess().getDoKeyword_2());
              		
            }
            // InternalWhileComp.g:953:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalWhileComp.g:954:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalWhileComp.g:954:4: (lv_commands_3_0= ruleCommands )
            // InternalWhileComp.g:955:5: lv_commands_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getCommandsCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_commands_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"commands",
              						lv_commands_3_0,
              						"org.xtext.compilation.WhileComp.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForAccess().getOdKeyword_4());
              		
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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleWhile"
    // InternalWhileComp.g:980:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalWhileComp.g:980:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalWhileComp.g:981:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalWhileComp.g:987:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:993:2: ( (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalWhileComp.g:994:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalWhileComp.g:994:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalWhileComp.g:995:3: otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            // InternalWhileComp.g:999:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWhileComp.g:1000:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWhileComp.g:1000:4: (lv_expr_1_0= ruleExpr )
            // InternalWhileComp.g:1001:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.xtext.compilation.WhileComp.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getDoKeyword_2());
              		
            }
            // InternalWhileComp.g:1022:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalWhileComp.g:1023:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalWhileComp.g:1023:4: (lv_commands_3_0= ruleCommands )
            // InternalWhileComp.g:1024:5: lv_commands_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getCommandsCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_commands_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"commands",
              						lv_commands_3_0,
              						"org.xtext.compilation.WhileComp.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getOdKeyword_4());
              		
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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleExpr"
    // InternalWhileComp.g:1049:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalWhileComp.g:1049:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalWhileComp.g:1050:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalWhileComp.g:1056:1: ruleExpr returns [EObject current=null] : ( ( ( ( ruleExprSimple ) )=> (lv_exprsimple_0_0= ruleExprSimple ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_exprsimple_0_0 = null;

        EObject lv_exprAnd_1_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:1062:2: ( ( ( ( ( ruleExprSimple ) )=> (lv_exprsimple_0_0= ruleExprSimple ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) ) )
            // InternalWhileComp.g:1063:2: ( ( ( ( ruleExprSimple ) )=> (lv_exprsimple_0_0= ruleExprSimple ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) )
            {
            // InternalWhileComp.g:1063:2: ( ( ( ( ruleExprSimple ) )=> (lv_exprsimple_0_0= ruleExprSimple ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case 22:
                {
                int LA9_1 = input.LA(2);

                if ( (synpred2_InternalWhileComp()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VARIABLE:
                {
                int LA9_2 = input.LA(2);

                if ( (synpred2_InternalWhileComp()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYMBOL:
                {
                int LA9_3 = input.LA(2);

                if ( (synpred2_InternalWhileComp()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA9_4 = input.LA(2);

                if ( (synpred2_InternalWhileComp()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                alt9=2;
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
                    // InternalWhileComp.g:1064:3: ( ( ( ruleExprSimple ) )=> (lv_exprsimple_0_0= ruleExprSimple ) )
                    {
                    // InternalWhileComp.g:1064:3: ( ( ( ruleExprSimple ) )=> (lv_exprsimple_0_0= ruleExprSimple ) )
                    // InternalWhileComp.g:1065:4: ( ( ruleExprSimple ) )=> (lv_exprsimple_0_0= ruleExprSimple )
                    {
                    // InternalWhileComp.g:1069:4: (lv_exprsimple_0_0= ruleExprSimple )
                    // InternalWhileComp.g:1070:5: lv_exprsimple_0_0= ruleExprSimple
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
                    // InternalWhileComp.g:1088:3: ( (lv_exprAnd_1_0= ruleExprAnd ) )
                    {
                    // InternalWhileComp.g:1088:3: ( (lv_exprAnd_1_0= ruleExprAnd ) )
                    // InternalWhileComp.g:1089:4: (lv_exprAnd_1_0= ruleExprAnd )
                    {
                    // InternalWhileComp.g:1089:4: (lv_exprAnd_1_0= ruleExprAnd )
                    // InternalWhileComp.g:1090:5: lv_exprAnd_1_0= ruleExprAnd
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
    // InternalWhileComp.g:1111:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // InternalWhileComp.g:1111:48: (iv_ruleExprAnd= ruleExprAnd EOF )
            // InternalWhileComp.g:1112:2: iv_ruleExprAnd= ruleExprAnd EOF
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
    // InternalWhileComp.g:1118:1: ruleExprAnd returns [EObject current=null] : ( ( ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )=> ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) ) ) | ( (lv_exprOr_3_0= ruleExprOr ) ) ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprOr_0_0 = null;

        EObject lv_exprAnd_2_0 = null;

        EObject lv_exprOr_3_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:1124:2: ( ( ( ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )=> ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) ) ) | ( (lv_exprOr_3_0= ruleExprOr ) ) ) )
            // InternalWhileComp.g:1125:2: ( ( ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )=> ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) ) ) | ( (lv_exprOr_3_0= ruleExprOr ) ) )
            {
            // InternalWhileComp.g:1125:2: ( ( ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )=> ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) ) ) | ( (lv_exprOr_3_0= ruleExprOr ) ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 39:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred3_InternalWhileComp()) ) {
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
            case 22:
                {
                int LA10_2 = input.LA(2);

                if ( (synpred3_InternalWhileComp()) ) {
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
            case RULE_VARIABLE:
                {
                int LA10_3 = input.LA(2);

                if ( (synpred3_InternalWhileComp()) ) {
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
            case RULE_SYMBOL:
                {
                int LA10_4 = input.LA(2);

                if ( (synpred3_InternalWhileComp()) ) {
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
            case 37:
                {
                int LA10_5 = input.LA(2);

                if ( (synpred3_InternalWhileComp()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 5, input);

                    throw nvae;
                }
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
                    // InternalWhileComp.g:1126:3: ( ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )=> ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) ) )
                    {
                    // InternalWhileComp.g:1126:3: ( ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )=> ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) ) )
                    // InternalWhileComp.g:1127:4: ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )=> ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) )
                    {
                    // InternalWhileComp.g:1141:4: ( ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) ) )
                    // InternalWhileComp.g:1142:5: ( (lv_exprOr_0_0= ruleExprOr ) ) otherlv_1= '&&' ( (lv_exprAnd_2_0= ruleExprAnd ) )
                    {
                    // InternalWhileComp.g:1142:5: ( (lv_exprOr_0_0= ruleExprOr ) )
                    // InternalWhileComp.g:1143:6: (lv_exprOr_0_0= ruleExprOr )
                    {
                    // InternalWhileComp.g:1143:6: (lv_exprOr_0_0= ruleExprOr )
                    // InternalWhileComp.g:1144:7: lv_exprOr_0_0= ruleExprOr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getExprAndAccess().getExprOrExprOrParserRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
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

                    otherlv_1=(Token)match(input,34,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getExprAndAccess().getAmpersandAmpersandKeyword_0_0_1());
                      				
                    }
                    // InternalWhileComp.g:1165:5: ( (lv_exprAnd_2_0= ruleExprAnd ) )
                    // InternalWhileComp.g:1166:6: (lv_exprAnd_2_0= ruleExprAnd )
                    {
                    // InternalWhileComp.g:1166:6: (lv_exprAnd_2_0= ruleExprAnd )
                    // InternalWhileComp.g:1167:7: lv_exprAnd_2_0= ruleExprAnd
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
                    // InternalWhileComp.g:1187:3: ( (lv_exprOr_3_0= ruleExprOr ) )
                    {
                    // InternalWhileComp.g:1187:3: ( (lv_exprOr_3_0= ruleExprOr ) )
                    // InternalWhileComp.g:1188:4: (lv_exprOr_3_0= ruleExprOr )
                    {
                    // InternalWhileComp.g:1188:4: (lv_exprOr_3_0= ruleExprOr )
                    // InternalWhileComp.g:1189:5: lv_exprOr_3_0= ruleExprOr
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
    // InternalWhileComp.g:1210:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // InternalWhileComp.g:1210:47: (iv_ruleExprOr= ruleExprOr EOF )
            // InternalWhileComp.g:1211:2: iv_ruleExprOr= ruleExprOr EOF
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
    // InternalWhileComp.g:1217:1: ruleExprOr returns [EObject current=null] : ( ( ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )=> ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) ) ) | ( (lv_exprNot_3_0= ruleExprNot ) ) ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprNot_0_0 = null;

        EObject lv_exprOr_2_0 = null;

        EObject lv_exprNot_3_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:1223:2: ( ( ( ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )=> ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) ) ) | ( (lv_exprNot_3_0= ruleExprNot ) ) ) )
            // InternalWhileComp.g:1224:2: ( ( ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )=> ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) ) ) | ( (lv_exprNot_3_0= ruleExprNot ) ) )
            {
            // InternalWhileComp.g:1224:2: ( ( ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )=> ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) ) ) | ( (lv_exprNot_3_0= ruleExprNot ) ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 39:
                {
                int LA11_1 = input.LA(2);

                if ( (synpred4_InternalWhileComp()) ) {
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

                if ( (synpred4_InternalWhileComp()) ) {
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

                if ( (synpred4_InternalWhileComp()) ) {
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

                if ( (synpred4_InternalWhileComp()) ) {
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
            case 37:
                {
                int LA11_5 = input.LA(2);

                if ( (synpred4_InternalWhileComp()) ) {
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
                    // InternalWhileComp.g:1225:3: ( ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )=> ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) ) )
                    {
                    // InternalWhileComp.g:1225:3: ( ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )=> ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) ) )
                    // InternalWhileComp.g:1226:4: ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )=> ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) )
                    {
                    // InternalWhileComp.g:1240:4: ( ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) ) )
                    // InternalWhileComp.g:1241:5: ( (lv_exprNot_0_0= ruleExprNot ) ) otherlv_1= '||' ( (lv_exprOr_2_0= ruleExprOr ) )
                    {
                    // InternalWhileComp.g:1241:5: ( (lv_exprNot_0_0= ruleExprNot ) )
                    // InternalWhileComp.g:1242:6: (lv_exprNot_0_0= ruleExprNot )
                    {
                    // InternalWhileComp.g:1242:6: (lv_exprNot_0_0= ruleExprNot )
                    // InternalWhileComp.g:1243:7: lv_exprNot_0_0= ruleExprNot
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getExprOrAccess().getExprNotExprNotParserRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_24);
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

                    otherlv_1=(Token)match(input,35,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getExprOrAccess().getVerticalLineVerticalLineKeyword_0_0_1());
                      				
                    }
                    // InternalWhileComp.g:1264:5: ( (lv_exprOr_2_0= ruleExprOr ) )
                    // InternalWhileComp.g:1265:6: (lv_exprOr_2_0= ruleExprOr )
                    {
                    // InternalWhileComp.g:1265:6: (lv_exprOr_2_0= ruleExprOr )
                    // InternalWhileComp.g:1266:7: lv_exprOr_2_0= ruleExprOr
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
                    // InternalWhileComp.g:1286:3: ( (lv_exprNot_3_0= ruleExprNot ) )
                    {
                    // InternalWhileComp.g:1286:3: ( (lv_exprNot_3_0= ruleExprNot ) )
                    // InternalWhileComp.g:1287:4: (lv_exprNot_3_0= ruleExprNot )
                    {
                    // InternalWhileComp.g:1287:4: (lv_exprNot_3_0= ruleExprNot )
                    // InternalWhileComp.g:1288:5: lv_exprNot_3_0= ruleExprNot
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
    // InternalWhileComp.g:1309:1: entryRuleExprNot returns [EObject current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final EObject entryRuleExprNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprNot = null;


        try {
            // InternalWhileComp.g:1309:48: (iv_ruleExprNot= ruleExprNot EOF )
            // InternalWhileComp.g:1310:2: iv_ruleExprNot= ruleExprNot EOF
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
    // InternalWhileComp.g:1316:1: ruleExprNot returns [EObject current=null] : ( ( ( (lv_not_0_0= ruleNot ) ) ( (lv_exprEq_1_0= ruleExprEq ) ) ) | ( (lv_exprEq_2_0= ruleExprEq ) ) ) ;
    public final EObject ruleExprNot() throws RecognitionException {
        EObject current = null;

        EObject lv_not_0_0 = null;

        EObject lv_exprEq_1_0 = null;

        EObject lv_exprEq_2_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:1322:2: ( ( ( ( (lv_not_0_0= ruleNot ) ) ( (lv_exprEq_1_0= ruleExprEq ) ) ) | ( (lv_exprEq_2_0= ruleExprEq ) ) ) )
            // InternalWhileComp.g:1323:2: ( ( ( (lv_not_0_0= ruleNot ) ) ( (lv_exprEq_1_0= ruleExprEq ) ) ) | ( (lv_exprEq_2_0= ruleExprEq ) ) )
            {
            // InternalWhileComp.g:1323:2: ( ( ( (lv_not_0_0= ruleNot ) ) ( (lv_exprEq_1_0= ruleExprEq ) ) ) | ( (lv_exprEq_2_0= ruleExprEq ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_SYMBOL && LA12_0<=RULE_VARIABLE)||LA12_0==22||LA12_0==37) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalWhileComp.g:1324:3: ( ( (lv_not_0_0= ruleNot ) ) ( (lv_exprEq_1_0= ruleExprEq ) ) )
                    {
                    // InternalWhileComp.g:1324:3: ( ( (lv_not_0_0= ruleNot ) ) ( (lv_exprEq_1_0= ruleExprEq ) ) )
                    // InternalWhileComp.g:1325:4: ( (lv_not_0_0= ruleNot ) ) ( (lv_exprEq_1_0= ruleExprEq ) )
                    {
                    // InternalWhileComp.g:1325:4: ( (lv_not_0_0= ruleNot ) )
                    // InternalWhileComp.g:1326:5: (lv_not_0_0= ruleNot )
                    {
                    // InternalWhileComp.g:1326:5: (lv_not_0_0= ruleNot )
                    // InternalWhileComp.g:1327:6: lv_not_0_0= ruleNot
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprNotAccess().getNotNotParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_not_0_0=ruleNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprNotRule());
                      						}
                      						set(
                      							current,
                      							"not",
                      							lv_not_0_0,
                      							"org.xtext.compilation.WhileComp.Not");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalWhileComp.g:1344:4: ( (lv_exprEq_1_0= ruleExprEq ) )
                    // InternalWhileComp.g:1345:5: (lv_exprEq_1_0= ruleExprEq )
                    {
                    // InternalWhileComp.g:1345:5: (lv_exprEq_1_0= ruleExprEq )
                    // InternalWhileComp.g:1346:6: lv_exprEq_1_0= ruleExprEq
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
                    // InternalWhileComp.g:1365:3: ( (lv_exprEq_2_0= ruleExprEq ) )
                    {
                    // InternalWhileComp.g:1365:3: ( (lv_exprEq_2_0= ruleExprEq ) )
                    // InternalWhileComp.g:1366:4: (lv_exprEq_2_0= ruleExprEq )
                    {
                    // InternalWhileComp.g:1366:4: (lv_exprEq_2_0= ruleExprEq )
                    // InternalWhileComp.g:1367:5: lv_exprEq_2_0= ruleExprEq
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
    // InternalWhileComp.g:1388:1: entryRuleExprEq returns [EObject current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final EObject entryRuleExprEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEq = null;


        try {
            // InternalWhileComp.g:1388:47: (iv_ruleExprEq= ruleExprEq EOF )
            // InternalWhileComp.g:1389:2: iv_ruleExprEq= ruleExprEq EOF
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
    // InternalWhileComp.g:1395:1: ruleExprEq returns [EObject current=null] : ( ( ( (lv_exprSimple1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimple2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) ) ;
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
            // InternalWhileComp.g:1401:2: ( ( ( ( (lv_exprSimple1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimple2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) ) )
            // InternalWhileComp.g:1402:2: ( ( ( (lv_exprSimple1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimple2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) )
            {
            // InternalWhileComp.g:1402:2: ( ( ( (lv_exprSimple1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimple2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_SYMBOL && LA13_0<=RULE_VARIABLE)||LA13_0==22) ) {
                alt13=1;
            }
            else if ( (LA13_0==37) ) {
                switch ( input.LA(2) ) {
                case 40:
                case 41:
                case 42:
                case 43:
                    {
                    alt13=1;
                    }
                    break;
                case RULE_SYMBOL:
                    {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==36||LA13_3==38) ) {
                        alt13=2;
                    }
                    else if ( ((LA13_3>=RULE_SYMBOL && LA13_3<=RULE_VARIABLE)||LA13_3==22||LA13_3==37||LA13_3==39) ) {
                        alt13=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_VARIABLE:
                case 22:
                case 37:
                case 39:
                    {
                    alt13=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalWhileComp.g:1403:3: ( ( (lv_exprSimple1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimple2_2_0= ruleExprSimple ) ) )
                    {
                    // InternalWhileComp.g:1403:3: ( ( (lv_exprSimple1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimple2_2_0= ruleExprSimple ) ) )
                    // InternalWhileComp.g:1404:4: ( (lv_exprSimple1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimple2_2_0= ruleExprSimple ) )
                    {
                    // InternalWhileComp.g:1404:4: ( (lv_exprSimple1_0_0= ruleExprSimple ) )
                    // InternalWhileComp.g:1405:5: (lv_exprSimple1_0_0= ruleExprSimple )
                    {
                    // InternalWhileComp.g:1405:5: (lv_exprSimple1_0_0= ruleExprSimple )
                    // InternalWhileComp.g:1406:6: lv_exprSimple1_0_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprEqAccess().getExprSimple1ExprSimpleParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
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

                    otherlv_1=(Token)match(input,36,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1());
                      			
                    }
                    // InternalWhileComp.g:1427:4: ( (lv_exprSimple2_2_0= ruleExprSimple ) )
                    // InternalWhileComp.g:1428:5: (lv_exprSimple2_2_0= ruleExprSimple )
                    {
                    // InternalWhileComp.g:1428:5: (lv_exprSimple2_2_0= ruleExprSimple )
                    // InternalWhileComp.g:1429:6: lv_exprSimple2_2_0= ruleExprSimple
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
                    // InternalWhileComp.g:1448:3: (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' )
                    {
                    // InternalWhileComp.g:1448:3: (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' )
                    // InternalWhileComp.g:1449:4: otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalWhileComp.g:1453:4: ( (lv_expr_4_0= ruleExpr ) )
                    // InternalWhileComp.g:1454:5: (lv_expr_4_0= ruleExpr )
                    {
                    // InternalWhileComp.g:1454:5: (lv_expr_4_0= ruleExpr )
                    // InternalWhileComp.g:1455:6: lv_expr_4_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprEqAccess().getExprExprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
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

                    otherlv_5=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // InternalWhileComp.g:1481:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // InternalWhileComp.g:1481:45: (iv_ruleVars= ruleVars EOF )
            // InternalWhileComp.g:1482:2: iv_ruleVars= ruleVars EOF
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
    // InternalWhileComp.g:1488:1: ruleVars returns [EObject current=null] : ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_vars_2_0= ruleVars ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;
        Token otherlv_1=null;
        Token lv_variable_3_0=null;
        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:1494:2: ( ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_vars_2_0= ruleVars ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) ) )
            // InternalWhileComp.g:1495:2: ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_vars_2_0= ruleVars ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) )
            {
            // InternalWhileComp.g:1495:2: ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_vars_2_0= ruleVars ) ) ) | ( (lv_variable_3_0= RULE_VARIABLE ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_VARIABLE) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF) ) {
                    alt14=2;
                }
                else if ( (LA14_1==18) ) {
                    alt14=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

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
                    // InternalWhileComp.g:1496:3: ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_vars_2_0= ruleVars ) ) )
                    {
                    // InternalWhileComp.g:1496:3: ( ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_vars_2_0= ruleVars ) ) )
                    // InternalWhileComp.g:1497:4: ( (lv_variable_0_0= RULE_VARIABLE ) ) otherlv_1= ',' ( (lv_vars_2_0= ruleVars ) )
                    {
                    // InternalWhileComp.g:1497:4: ( (lv_variable_0_0= RULE_VARIABLE ) )
                    // InternalWhileComp.g:1498:5: (lv_variable_0_0= RULE_VARIABLE )
                    {
                    // InternalWhileComp.g:1498:5: (lv_variable_0_0= RULE_VARIABLE )
                    // InternalWhileComp.g:1499:6: lv_variable_0_0= RULE_VARIABLE
                    {
                    lv_variable_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_28); if (state.failed) return current;
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
                    // InternalWhileComp.g:1519:4: ( (lv_vars_2_0= ruleVars ) )
                    // InternalWhileComp.g:1520:5: (lv_vars_2_0= ruleVars )
                    {
                    // InternalWhileComp.g:1520:5: (lv_vars_2_0= ruleVars )
                    // InternalWhileComp.g:1521:6: lv_vars_2_0= ruleVars
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
                    // InternalWhileComp.g:1540:3: ( (lv_variable_3_0= RULE_VARIABLE ) )
                    {
                    // InternalWhileComp.g:1540:3: ( (lv_variable_3_0= RULE_VARIABLE ) )
                    // InternalWhileComp.g:1541:4: (lv_variable_3_0= RULE_VARIABLE )
                    {
                    // InternalWhileComp.g:1541:4: (lv_variable_3_0= RULE_VARIABLE )
                    // InternalWhileComp.g:1542:5: lv_variable_3_0= RULE_VARIABLE
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
    // InternalWhileComp.g:1562:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // InternalWhileComp.g:1562:46: (iv_ruleExprs= ruleExprs EOF )
            // InternalWhileComp.g:1563:2: iv_ruleExprs= ruleExprs EOF
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
    // InternalWhileComp.g:1569:1: ruleExprs returns [EObject current=null] : ( ( ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )=> ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) ) ) | ( (lv_expr_3_0= ruleExpr ) ) ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_0_0 = null;

        EObject lv_exprs_2_0 = null;

        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:1575:2: ( ( ( ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )=> ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) ) ) | ( (lv_expr_3_0= ruleExpr ) ) ) )
            // InternalWhileComp.g:1576:2: ( ( ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )=> ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) ) ) | ( (lv_expr_3_0= ruleExpr ) ) )
            {
            // InternalWhileComp.g:1576:2: ( ( ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )=> ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) ) ) | ( (lv_expr_3_0= ruleExpr ) ) )
            int alt15=2;
            switch ( input.LA(1) ) {
            case 22:
                {
                int LA15_1 = input.LA(2);

                if ( (synpred5_InternalWhileComp()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VARIABLE:
                {
                int LA15_2 = input.LA(2);

                if ( (synpred5_InternalWhileComp()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYMBOL:
                {
                int LA15_3 = input.LA(2);

                if ( (synpred5_InternalWhileComp()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA15_4 = input.LA(2);

                if ( (synpred5_InternalWhileComp()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 4, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                int LA15_5 = input.LA(2);

                if ( (synpred5_InternalWhileComp()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalWhileComp.g:1577:3: ( ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )=> ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) ) )
                    {
                    // InternalWhileComp.g:1577:3: ( ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )=> ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) ) )
                    // InternalWhileComp.g:1578:4: ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )=> ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) )
                    {
                    // InternalWhileComp.g:1592:4: ( ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) ) )
                    // InternalWhileComp.g:1593:5: ( (lv_expr_0_0= ruleExpr ) ) otherlv_1= ',' ( (lv_exprs_2_0= ruleExprs ) )
                    {
                    // InternalWhileComp.g:1593:5: ( (lv_expr_0_0= ruleExpr ) )
                    // InternalWhileComp.g:1594:6: (lv_expr_0_0= ruleExpr )
                    {
                    // InternalWhileComp.g:1594:6: (lv_expr_0_0= ruleExpr )
                    // InternalWhileComp.g:1595:7: lv_expr_0_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getExprsAccess().getExprExprParserRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_28);
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

                    otherlv_1=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_0_0_1());
                      				
                    }
                    // InternalWhileComp.g:1616:5: ( (lv_exprs_2_0= ruleExprs ) )
                    // InternalWhileComp.g:1617:6: (lv_exprs_2_0= ruleExprs )
                    {
                    // InternalWhileComp.g:1617:6: (lv_exprs_2_0= ruleExprs )
                    // InternalWhileComp.g:1618:7: lv_exprs_2_0= ruleExprs
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
                    // InternalWhileComp.g:1638:3: ( (lv_expr_3_0= ruleExpr ) )
                    {
                    // InternalWhileComp.g:1638:3: ( (lv_expr_3_0= ruleExpr ) )
                    // InternalWhileComp.g:1639:4: (lv_expr_3_0= ruleExpr )
                    {
                    // InternalWhileComp.g:1639:4: (lv_expr_3_0= ruleExpr )
                    // InternalWhileComp.g:1640:5: lv_expr_3_0= ruleExpr
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
    // InternalWhileComp.g:1661:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // InternalWhileComp.g:1661:51: (iv_ruleExprSimple= ruleExprSimple EOF )
            // InternalWhileComp.g:1662:2: iv_ruleExprSimple= ruleExprSimple EOF
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
    // InternalWhileComp.g:1668:1: ruleExprSimple returns [EObject current=null] : ( ( (lv_nil_0_0= ruleNil2 ) ) | ( (lv_variable_1_0= RULE_VARIABLE ) ) | ( (lv_symbol_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')' ) ) ;
    public final EObject ruleExprSimple() throws RecognitionException {
        EObject current = null;

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
        EObject lv_nil_0_0 = null;

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
            // InternalWhileComp.g:1674:2: ( ( ( (lv_nil_0_0= ruleNil2 ) ) | ( (lv_variable_1_0= RULE_VARIABLE ) ) | ( (lv_symbol_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')' ) ) )
            // InternalWhileComp.g:1675:2: ( ( (lv_nil_0_0= ruleNil2 ) ) | ( (lv_variable_1_0= RULE_VARIABLE ) ) | ( (lv_symbol_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')' ) )
            {
            // InternalWhileComp.g:1675:2: ( ( (lv_nil_0_0= ruleNil2 ) ) | ( (lv_variable_1_0= RULE_VARIABLE ) ) | ( (lv_symbol_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')' ) )
            int alt16=8;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalWhileComp.g:1676:3: ( (lv_nil_0_0= ruleNil2 ) )
                    {
                    // InternalWhileComp.g:1676:3: ( (lv_nil_0_0= ruleNil2 ) )
                    // InternalWhileComp.g:1677:4: (lv_nil_0_0= ruleNil2 )
                    {
                    // InternalWhileComp.g:1677:4: (lv_nil_0_0= ruleNil2 )
                    // InternalWhileComp.g:1678:5: lv_nil_0_0= ruleNil2
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprSimpleAccess().getNilNil2ParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_nil_0_0=ruleNil2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      					}
                      					set(
                      						current,
                      						"nil",
                      						lv_nil_0_0,
                      						"org.xtext.compilation.WhileComp.Nil2");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileComp.g:1696:3: ( (lv_variable_1_0= RULE_VARIABLE ) )
                    {
                    // InternalWhileComp.g:1696:3: ( (lv_variable_1_0= RULE_VARIABLE ) )
                    // InternalWhileComp.g:1697:4: (lv_variable_1_0= RULE_VARIABLE )
                    {
                    // InternalWhileComp.g:1697:4: (lv_variable_1_0= RULE_VARIABLE )
                    // InternalWhileComp.g:1698:5: lv_variable_1_0= RULE_VARIABLE
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
                    // InternalWhileComp.g:1715:3: ( (lv_symbol_2_0= RULE_SYMBOL ) )
                    {
                    // InternalWhileComp.g:1715:3: ( (lv_symbol_2_0= RULE_SYMBOL ) )
                    // InternalWhileComp.g:1716:4: (lv_symbol_2_0= RULE_SYMBOL )
                    {
                    // InternalWhileComp.g:1716:4: (lv_symbol_2_0= RULE_SYMBOL )
                    // InternalWhileComp.g:1717:5: lv_symbol_2_0= RULE_SYMBOL
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
                    // InternalWhileComp.g:1734:3: (otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' )
                    {
                    // InternalWhileComp.g:1734:3: (otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' )
                    // InternalWhileComp.g:1735:4: otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalWhileComp.g:1739:4: ( (lv_cons_4_0= ruleCons ) )
                    // InternalWhileComp.g:1740:5: (lv_cons_4_0= ruleCons )
                    {
                    // InternalWhileComp.g:1740:5: (lv_cons_4_0= ruleCons )
                    // InternalWhileComp.g:1741:6: lv_cons_4_0= ruleCons
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getConsConsParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
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

                    // InternalWhileComp.g:1758:4: ( (lv_lexpr_5_0= ruleLexpr ) )
                    // InternalWhileComp.g:1759:5: (lv_lexpr_5_0= ruleLexpr )
                    {
                    // InternalWhileComp.g:1759:5: (lv_lexpr_5_0= ruleLexpr )
                    // InternalWhileComp.g:1760:6: lv_lexpr_5_0= ruleLexpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
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

                    otherlv_6=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalWhileComp.g:1783:3: (otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' )
                    {
                    // InternalWhileComp.g:1783:3: (otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' )
                    // InternalWhileComp.g:1784:4: otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalWhileComp.g:1788:4: ( (lv_list_8_0= ruleList ) )
                    // InternalWhileComp.g:1789:5: (lv_list_8_0= ruleList )
                    {
                    // InternalWhileComp.g:1789:5: (lv_list_8_0= ruleList )
                    // InternalWhileComp.g:1790:6: lv_list_8_0= ruleList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getListListParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
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

                    // InternalWhileComp.g:1807:4: ( (lv_lexpr_9_0= ruleLexpr ) )
                    // InternalWhileComp.g:1808:5: (lv_lexpr_9_0= ruleLexpr )
                    {
                    // InternalWhileComp.g:1808:5: (lv_lexpr_9_0= ruleLexpr )
                    // InternalWhileComp.g:1809:6: lv_lexpr_9_0= ruleLexpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
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

                    otherlv_10=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalWhileComp.g:1832:3: (otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' )
                    {
                    // InternalWhileComp.g:1832:3: (otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' )
                    // InternalWhileComp.g:1833:4: otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')'
                    {
                    otherlv_11=(Token)match(input,37,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    // InternalWhileComp.g:1837:4: ( (lv_hd_12_0= ruleHd ) )
                    // InternalWhileComp.g:1838:5: (lv_hd_12_0= ruleHd )
                    {
                    // InternalWhileComp.g:1838:5: (lv_hd_12_0= ruleHd )
                    // InternalWhileComp.g:1839:6: lv_hd_12_0= ruleHd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getHdHdParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
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

                    // InternalWhileComp.g:1856:4: ( (lv_expr_13_0= ruleExpr ) )
                    // InternalWhileComp.g:1857:5: (lv_expr_13_0= ruleExpr )
                    {
                    // InternalWhileComp.g:1857:5: (lv_expr_13_0= ruleExpr )
                    // InternalWhileComp.g:1858:6: lv_expr_13_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getExprExprParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
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

                    otherlv_14=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalWhileComp.g:1881:3: (otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' )
                    {
                    // InternalWhileComp.g:1881:3: (otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' )
                    // InternalWhileComp.g:1882:4: otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')'
                    {
                    otherlv_15=(Token)match(input,37,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    // InternalWhileComp.g:1886:4: ( (lv_tl_16_0= ruleTl ) )
                    // InternalWhileComp.g:1887:5: (lv_tl_16_0= ruleTl )
                    {
                    // InternalWhileComp.g:1887:5: (lv_tl_16_0= ruleTl )
                    // InternalWhileComp.g:1888:6: lv_tl_16_0= ruleTl
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getTlTlParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
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

                    // InternalWhileComp.g:1905:4: ( (lv_expr_17_0= ruleExpr ) )
                    // InternalWhileComp.g:1906:5: (lv_expr_17_0= ruleExpr )
                    {
                    // InternalWhileComp.g:1906:5: (lv_expr_17_0= ruleExpr )
                    // InternalWhileComp.g:1907:6: lv_expr_17_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getExprExprParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
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

                    otherlv_18=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_6_3());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalWhileComp.g:1930:3: (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')' )
                    {
                    // InternalWhileComp.g:1930:3: (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')' )
                    // InternalWhileComp.g:1931:4: otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')'
                    {
                    otherlv_19=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_7_0());
                      			
                    }
                    // InternalWhileComp.g:1935:4: ( (lv_symbol_20_0= RULE_SYMBOL ) )
                    // InternalWhileComp.g:1936:5: (lv_symbol_20_0= RULE_SYMBOL )
                    {
                    // InternalWhileComp.g:1936:5: (lv_symbol_20_0= RULE_SYMBOL )
                    // InternalWhileComp.g:1937:6: lv_symbol_20_0= RULE_SYMBOL
                    {
                    lv_symbol_20_0=(Token)match(input,RULE_SYMBOL,FOLLOW_16); if (state.failed) return current;
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

                    // InternalWhileComp.g:1953:4: ( (lv_lexpr_21_0= ruleLexpr ) )
                    // InternalWhileComp.g:1954:5: (lv_lexpr_21_0= ruleLexpr )
                    {
                    // InternalWhileComp.g:1954:5: (lv_lexpr_21_0= ruleLexpr )
                    // InternalWhileComp.g:1955:6: lv_lexpr_21_0= ruleLexpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
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

                    otherlv_22=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleNot"
    // InternalWhileComp.g:1981:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalWhileComp.g:1981:44: (iv_ruleNot= ruleNot EOF )
            // InternalWhileComp.g:1982:2: iv_ruleNot= ruleNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNot; 
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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalWhileComp.g:1988:1: ruleNot returns [EObject current=null] : ( (lv_not_0_0= '!' ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;


        	enterRule();

        try {
            // InternalWhileComp.g:1994:2: ( ( (lv_not_0_0= '!' ) ) )
            // InternalWhileComp.g:1995:2: ( (lv_not_0_0= '!' ) )
            {
            // InternalWhileComp.g:1995:2: ( (lv_not_0_0= '!' ) )
            // InternalWhileComp.g:1996:3: (lv_not_0_0= '!' )
            {
            // InternalWhileComp.g:1996:3: (lv_not_0_0= '!' )
            // InternalWhileComp.g:1997:4: lv_not_0_0= '!'
            {
            lv_not_0_0=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_not_0_0, grammarAccess.getNotAccess().getNotExclamationMarkKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNotRule());
              				}
              				setWithLastConsumed(current, "not", lv_not_0_0, "!");
              			
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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleCons"
    // InternalWhileComp.g:2012:1: entryRuleCons returns [EObject current=null] : iv_ruleCons= ruleCons EOF ;
    public final EObject entryRuleCons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCons = null;


        try {
            // InternalWhileComp.g:2012:45: (iv_ruleCons= ruleCons EOF )
            // InternalWhileComp.g:2013:2: iv_ruleCons= ruleCons EOF
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
    // InternalWhileComp.g:2019:1: ruleCons returns [EObject current=null] : ( (lv_cons_0_0= 'cons' ) ) ;
    public final EObject ruleCons() throws RecognitionException {
        EObject current = null;

        Token lv_cons_0_0=null;


        	enterRule();

        try {
            // InternalWhileComp.g:2025:2: ( ( (lv_cons_0_0= 'cons' ) ) )
            // InternalWhileComp.g:2026:2: ( (lv_cons_0_0= 'cons' ) )
            {
            // InternalWhileComp.g:2026:2: ( (lv_cons_0_0= 'cons' ) )
            // InternalWhileComp.g:2027:3: (lv_cons_0_0= 'cons' )
            {
            // InternalWhileComp.g:2027:3: (lv_cons_0_0= 'cons' )
            // InternalWhileComp.g:2028:4: lv_cons_0_0= 'cons'
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
    // InternalWhileComp.g:2043:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalWhileComp.g:2043:45: (iv_ruleList= ruleList EOF )
            // InternalWhileComp.g:2044:2: iv_ruleList= ruleList EOF
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
    // InternalWhileComp.g:2050:1: ruleList returns [EObject current=null] : ( (lv_list_0_0= 'list' ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token lv_list_0_0=null;


        	enterRule();

        try {
            // InternalWhileComp.g:2056:2: ( ( (lv_list_0_0= 'list' ) ) )
            // InternalWhileComp.g:2057:2: ( (lv_list_0_0= 'list' ) )
            {
            // InternalWhileComp.g:2057:2: ( (lv_list_0_0= 'list' ) )
            // InternalWhileComp.g:2058:3: (lv_list_0_0= 'list' )
            {
            // InternalWhileComp.g:2058:3: (lv_list_0_0= 'list' )
            // InternalWhileComp.g:2059:4: lv_list_0_0= 'list'
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
    // InternalWhileComp.g:2074:1: entryRuleHd returns [EObject current=null] : iv_ruleHd= ruleHd EOF ;
    public final EObject entryRuleHd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHd = null;


        try {
            // InternalWhileComp.g:2074:43: (iv_ruleHd= ruleHd EOF )
            // InternalWhileComp.g:2075:2: iv_ruleHd= ruleHd EOF
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
    // InternalWhileComp.g:2081:1: ruleHd returns [EObject current=null] : ( (lv_hd_0_0= 'hd' ) ) ;
    public final EObject ruleHd() throws RecognitionException {
        EObject current = null;

        Token lv_hd_0_0=null;


        	enterRule();

        try {
            // InternalWhileComp.g:2087:2: ( ( (lv_hd_0_0= 'hd' ) ) )
            // InternalWhileComp.g:2088:2: ( (lv_hd_0_0= 'hd' ) )
            {
            // InternalWhileComp.g:2088:2: ( (lv_hd_0_0= 'hd' ) )
            // InternalWhileComp.g:2089:3: (lv_hd_0_0= 'hd' )
            {
            // InternalWhileComp.g:2089:3: (lv_hd_0_0= 'hd' )
            // InternalWhileComp.g:2090:4: lv_hd_0_0= 'hd'
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
    // InternalWhileComp.g:2105:1: entryRuleTl returns [EObject current=null] : iv_ruleTl= ruleTl EOF ;
    public final EObject entryRuleTl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTl = null;


        try {
            // InternalWhileComp.g:2105:43: (iv_ruleTl= ruleTl EOF )
            // InternalWhileComp.g:2106:2: iv_ruleTl= ruleTl EOF
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
    // InternalWhileComp.g:2112:1: ruleTl returns [EObject current=null] : ( (lv_tl_0_0= 'tl' ) ) ;
    public final EObject ruleTl() throws RecognitionException {
        EObject current = null;

        Token lv_tl_0_0=null;


        	enterRule();

        try {
            // InternalWhileComp.g:2118:2: ( ( (lv_tl_0_0= 'tl' ) ) )
            // InternalWhileComp.g:2119:2: ( (lv_tl_0_0= 'tl' ) )
            {
            // InternalWhileComp.g:2119:2: ( (lv_tl_0_0= 'tl' ) )
            // InternalWhileComp.g:2120:3: (lv_tl_0_0= 'tl' )
            {
            // InternalWhileComp.g:2120:3: (lv_tl_0_0= 'tl' )
            // InternalWhileComp.g:2121:4: lv_tl_0_0= 'tl'
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
    // InternalWhileComp.g:2136:1: entryRuleLexpr returns [EObject current=null] : iv_ruleLexpr= ruleLexpr EOF ;
    public final EObject entryRuleLexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexpr = null;


        try {
            // InternalWhileComp.g:2136:46: (iv_ruleLexpr= ruleLexpr EOF )
            // InternalWhileComp.g:2137:2: iv_ruleLexpr= ruleLexpr EOF
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
    // InternalWhileComp.g:2143:1: ruleLexpr returns [EObject current=null] : ( ( (lv_expr_0_0= ruleExpr ) ) ( (lv_lexpr_1_0= ruleLexpr ) ) ) ;
    public final EObject ruleLexpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;

        EObject lv_lexpr_1_0 = null;



        	enterRule();

        try {
            // InternalWhileComp.g:2149:2: ( ( ( (lv_expr_0_0= ruleExpr ) ) ( (lv_lexpr_1_0= ruleLexpr ) ) ) )
            // InternalWhileComp.g:2150:2: ( ( (lv_expr_0_0= ruleExpr ) ) ( (lv_lexpr_1_0= ruleLexpr ) ) )
            {
            // InternalWhileComp.g:2150:2: ( ( (lv_expr_0_0= ruleExpr ) ) ( (lv_lexpr_1_0= ruleLexpr ) ) )
            // InternalWhileComp.g:2151:3: ( (lv_expr_0_0= ruleExpr ) ) ( (lv_lexpr_1_0= ruleLexpr ) )
            {
            // InternalWhileComp.g:2151:3: ( (lv_expr_0_0= ruleExpr ) )
            // InternalWhileComp.g:2152:4: (lv_expr_0_0= ruleExpr )
            {
            // InternalWhileComp.g:2152:4: (lv_expr_0_0= ruleExpr )
            // InternalWhileComp.g:2153:5: lv_expr_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLexprAccess().getExprExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            // InternalWhileComp.g:2170:3: ( (lv_lexpr_1_0= ruleLexpr ) )
            // InternalWhileComp.g:2171:4: (lv_lexpr_1_0= ruleLexpr )
            {
            // InternalWhileComp.g:2171:4: (lv_lexpr_1_0= ruleLexpr )
            // InternalWhileComp.g:2172:5: lv_lexpr_1_0= ruleLexpr
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
        // InternalWhileComp.g:877:5: ( 'else' )
        // InternalWhileComp.g:877:6: 'else'
        {
        match(input,30,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalWhileComp

    // $ANTLR start synpred2_InternalWhileComp
    public final void synpred2_InternalWhileComp_fragment() throws RecognitionException {   
        // InternalWhileComp.g:1065:4: ( ( ruleExprSimple ) )
        // InternalWhileComp.g:1065:5: ( ruleExprSimple )
        {
        // InternalWhileComp.g:1065:5: ( ruleExprSimple )
        // InternalWhileComp.g:1066:5: ruleExprSimple
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
        // InternalWhileComp.g:1127:4: ( ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) ) )
        // InternalWhileComp.g:1127:5: ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) )
        {
        // InternalWhileComp.g:1127:5: ( ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) ) )
        // InternalWhileComp.g:1128:5: ( ( ruleExprOr ) ) '&&' ( ( ruleExprAnd ) )
        {
        // InternalWhileComp.g:1128:5: ( ( ruleExprOr ) )
        // InternalWhileComp.g:1129:6: ( ruleExprOr )
        {
        // InternalWhileComp.g:1129:6: ( ruleExprOr )
        // InternalWhileComp.g:1130:7: ruleExprOr
        {
        pushFollow(FOLLOW_23);
        ruleExprOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,34,FOLLOW_16); if (state.failed) return ;
        // InternalWhileComp.g:1134:5: ( ( ruleExprAnd ) )
        // InternalWhileComp.g:1135:6: ( ruleExprAnd )
        {
        // InternalWhileComp.g:1135:6: ( ruleExprAnd )
        // InternalWhileComp.g:1136:7: ruleExprAnd
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
        // InternalWhileComp.g:1226:4: ( ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) ) )
        // InternalWhileComp.g:1226:5: ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) )
        {
        // InternalWhileComp.g:1226:5: ( ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) ) )
        // InternalWhileComp.g:1227:5: ( ( ruleExprNot ) ) '||' ( ( ruleExprOr ) )
        {
        // InternalWhileComp.g:1227:5: ( ( ruleExprNot ) )
        // InternalWhileComp.g:1228:6: ( ruleExprNot )
        {
        // InternalWhileComp.g:1228:6: ( ruleExprNot )
        // InternalWhileComp.g:1229:7: ruleExprNot
        {
        pushFollow(FOLLOW_24);
        ruleExprNot();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,35,FOLLOW_16); if (state.failed) return ;
        // InternalWhileComp.g:1233:5: ( ( ruleExprOr ) )
        // InternalWhileComp.g:1234:6: ( ruleExprOr )
        {
        // InternalWhileComp.g:1234:6: ( ruleExprOr )
        // InternalWhileComp.g:1235:7: ruleExprOr
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
        // InternalWhileComp.g:1578:4: ( ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) ) )
        // InternalWhileComp.g:1578:5: ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) )
        {
        // InternalWhileComp.g:1578:5: ( ( ( ruleExpr ) ) ',' ( ( ruleExprs ) ) )
        // InternalWhileComp.g:1579:5: ( ( ruleExpr ) ) ',' ( ( ruleExprs ) )
        {
        // InternalWhileComp.g:1579:5: ( ( ruleExpr ) )
        // InternalWhileComp.g:1580:6: ( ruleExpr )
        {
        // InternalWhileComp.g:1580:6: ( ruleExpr )
        // InternalWhileComp.g:1581:7: ruleExpr
        {
        pushFollow(FOLLOW_28);
        ruleExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,18,FOLLOW_16); if (state.failed) return ;
        // InternalWhileComp.g:1585:5: ( ( ruleExprs ) )
        // InternalWhileComp.g:1586:6: ( ruleExprs )
        {
        // InternalWhileComp.g:1586:6: ( ruleExprs )
        // InternalWhileComp.g:1587:7: ruleExprs
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


    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\5\uffff";
    static final String dfa_3s = "\1\45\3\uffff\1\53\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\7\1\6\1\5\1\10";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\2\20\uffff\1\1\16\uffff\1\4",
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

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1675:2: ( ( (lv_nil_0_0= ruleNil2 ) ) | ( (lv_variable_1_0= RULE_VARIABLE ) ) | ( (lv_symbol_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_cons_4_0= ruleCons ) ) ( (lv_lexpr_5_0= ruleLexpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_list_8_0= ruleList ) ) ( (lv_lexpr_9_0= ruleLexpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_hd_12_0= ruleHd ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_tl_16_0= ruleTl ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLexpr ) ) otherlv_22= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000311110020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000311100020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000A000400030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000400030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});

}