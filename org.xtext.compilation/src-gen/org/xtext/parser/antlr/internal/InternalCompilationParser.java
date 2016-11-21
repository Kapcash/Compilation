package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.CompilationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCompilationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'%'", "'read'", "','", "'write'", "'nop'", "':='"
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


        public InternalCompilationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCompilationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCompilationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCompilation.g"; }



     	private CompilationGrammarAccess grammarAccess;

        public InternalCompilationParser(TokenStream input, CompilationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected CompilationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalCompilation.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalCompilation.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalCompilation.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCompilation.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_functions_0_0= ruleFunction ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;



        	enterRule();

        try {
            // InternalCompilation.g:77:2: ( ( (lv_functions_0_0= ruleFunction ) )* )
            // InternalCompilation.g:78:2: ( (lv_functions_0_0= ruleFunction ) )*
            {
            // InternalCompilation.g:78:2: ( (lv_functions_0_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCompilation.g:79:3: (lv_functions_0_0= ruleFunction )
            	    {
            	    // InternalCompilation.g:79:3: (lv_functions_0_0= ruleFunction )
            	    // InternalCompilation.g:80:4: lv_functions_0_0= ruleFunction
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_functions_0_0=ruleFunction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"functions",
            	    					lv_functions_0_0,
            	    					"org.xtext.Compilation.Function");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

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
    // InternalCompilation.g:100:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalCompilation.g:100:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalCompilation.g:101:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCompilation.g:107:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_reads_3_0= ruleRead ) ) otherlv_4= '%' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '%' ( (lv_writes_7_0= ruleWrite ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_reads_3_0 = null;

        EObject lv_commands_5_0 = null;

        EObject lv_writes_7_0 = null;



        	enterRule();

        try {
            // InternalCompilation.g:113:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_reads_3_0= ruleRead ) ) otherlv_4= '%' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '%' ( (lv_writes_7_0= ruleWrite ) ) ) )
            // InternalCompilation.g:114:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_reads_3_0= ruleRead ) ) otherlv_4= '%' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '%' ( (lv_writes_7_0= ruleWrite ) ) )
            {
            // InternalCompilation.g:114:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_reads_3_0= ruleRead ) ) otherlv_4= '%' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '%' ( (lv_writes_7_0= ruleWrite ) ) )
            // InternalCompilation.g:115:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_reads_3_0= ruleRead ) ) otherlv_4= '%' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '%' ( (lv_writes_7_0= ruleWrite ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalCompilation.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCompilation.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCompilation.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalCompilation.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
            		
            // InternalCompilation.g:141:3: ( (lv_reads_3_0= ruleRead ) )
            // InternalCompilation.g:142:4: (lv_reads_3_0= ruleRead )
            {
            // InternalCompilation.g:142:4: (lv_reads_3_0= ruleRead )
            // InternalCompilation.g:143:5: lv_reads_3_0= ruleRead
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getReadsReadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_reads_3_0=ruleRead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					add(
            						current,
            						"reads",
            						lv_reads_3_0,
            						"org.xtext.Compilation.Read");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getPercentSignKeyword_4());
            		
            // InternalCompilation.g:164:3: ( (lv_commands_5_0= ruleCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCompilation.g:165:4: (lv_commands_5_0= ruleCommand )
            	    {
            	    // InternalCompilation.g:165:4: (lv_commands_5_0= ruleCommand )
            	    // InternalCompilation.g:166:5: lv_commands_5_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionAccess().getCommandsCommandParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_commands_5_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_5_0,
            	    						"org.xtext.Compilation.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getPercentSignKeyword_6());
            		
            // InternalCompilation.g:187:3: ( (lv_writes_7_0= ruleWrite ) )
            // InternalCompilation.g:188:4: (lv_writes_7_0= ruleWrite )
            {
            // InternalCompilation.g:188:4: (lv_writes_7_0= ruleWrite )
            // InternalCompilation.g:189:5: lv_writes_7_0= ruleWrite
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getWritesWriteParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_writes_7_0=ruleWrite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					add(
            						current,
            						"writes",
            						lv_writes_7_0,
            						"org.xtext.Compilation.Write");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleRead"
    // InternalCompilation.g:210:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalCompilation.g:210:45: (iv_ruleRead= ruleRead EOF )
            // InternalCompilation.g:211:2: iv_ruleRead= ruleRead EOF
            {
             newCompositeNode(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRead=ruleRead();

            state._fsp--;

             current =iv_ruleRead; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCompilation.g:217:1: ruleRead returns [EObject current=null] : (otherlv_0= 'read' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalCompilation.g:223:2: ( (otherlv_0= 'read' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* ) )
            // InternalCompilation.g:224:2: (otherlv_0= 'read' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* )
            {
            // InternalCompilation.g:224:2: (otherlv_0= 'read' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* )
            // InternalCompilation.g:225:3: otherlv_0= 'read' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReadAccess().getReadKeyword_0());
            		
            // InternalCompilation.g:229:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCompilation.g:230:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCompilation.g:230:4: (lv_name_1_0= RULE_ID )
            // InternalCompilation.g:231:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReadAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadRule());
            					}
            					addWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCompilation.g:247:3: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCompilation.g:248:4: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getReadAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalCompilation.g:252:4: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalCompilation.g:253:5: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalCompilation.g:253:5: (lv_name_3_0= RULE_ID )
            	    // InternalCompilation.g:254:6: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_3_0, grammarAccess.getReadAccess().getNameIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getReadRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

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


            	leaveRule();

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
    // InternalCompilation.g:275:1: entryRuleWrite returns [EObject current=null] : iv_ruleWrite= ruleWrite EOF ;
    public final EObject entryRuleWrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrite = null;


        try {
            // InternalCompilation.g:275:46: (iv_ruleWrite= ruleWrite EOF )
            // InternalCompilation.g:276:2: iv_ruleWrite= ruleWrite EOF
            {
             newCompositeNode(grammarAccess.getWriteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWrite=ruleWrite();

            state._fsp--;

             current =iv_ruleWrite; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCompilation.g:282:1: ruleWrite returns [EObject current=null] : (otherlv_0= 'write' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleWrite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalCompilation.g:288:2: ( (otherlv_0= 'write' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* ) )
            // InternalCompilation.g:289:2: (otherlv_0= 'write' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* )
            {
            // InternalCompilation.g:289:2: (otherlv_0= 'write' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* )
            // InternalCompilation.g:290:3: otherlv_0= 'write' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWriteAccess().getWriteKeyword_0());
            		
            // InternalCompilation.g:294:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCompilation.g:295:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCompilation.g:295:4: (lv_name_1_0= RULE_ID )
            // InternalCompilation.g:296:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWriteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWriteRule());
            					}
            					addWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCompilation.g:312:3: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCompilation.g:313:4: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWriteAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalCompilation.g:317:4: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalCompilation.g:318:5: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalCompilation.g:318:5: (lv_name_3_0= RULE_ID )
            	    // InternalCompilation.g:319:6: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_name_3_0, grammarAccess.getWriteAccess().getNameIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getWriteRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

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


            	leaveRule();

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


    // $ANTLR start "entryRuleCommand"
    // InternalCompilation.g:340:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalCompilation.g:340:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalCompilation.g:341:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCompilation.g:347:1: ruleCommand returns [EObject current=null] : (this_Nop_0= ruleNop | this_Affectation_1= ruleAffectation ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Nop_0 = null;

        EObject this_Affectation_1 = null;



        	enterRule();

        try {
            // InternalCompilation.g:353:2: ( (this_Nop_0= ruleNop | this_Affectation_1= ruleAffectation ) )
            // InternalCompilation.g:354:2: (this_Nop_0= ruleNop | this_Affectation_1= ruleAffectation )
            {
            // InternalCompilation.g:354:2: (this_Nop_0= ruleNop | this_Affectation_1= ruleAffectation )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCompilation.g:355:3: this_Nop_0= ruleNop
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getNopParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Nop_0=ruleNop();

                    state._fsp--;


                    			current = this_Nop_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCompilation.g:364:3: this_Affectation_1= ruleAffectation
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getAffectationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Affectation_1=ruleAffectation();

                    state._fsp--;


                    			current = this_Affectation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleNop"
    // InternalCompilation.g:376:1: entryRuleNop returns [EObject current=null] : iv_ruleNop= ruleNop EOF ;
    public final EObject entryRuleNop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNop = null;


        try {
            // InternalCompilation.g:376:44: (iv_ruleNop= ruleNop EOF )
            // InternalCompilation.g:377:2: iv_ruleNop= ruleNop EOF
            {
             newCompositeNode(grammarAccess.getNopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNop=ruleNop();

            state._fsp--;

             current =iv_ruleNop; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCompilation.g:383:1: ruleNop returns [EObject current=null] : ( (lv_name_0_0= 'nop' ) ) ;
    public final EObject ruleNop() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompilation.g:389:2: ( ( (lv_name_0_0= 'nop' ) ) )
            // InternalCompilation.g:390:2: ( (lv_name_0_0= 'nop' ) )
            {
            // InternalCompilation.g:390:2: ( (lv_name_0_0= 'nop' ) )
            // InternalCompilation.g:391:3: (lv_name_0_0= 'nop' )
            {
            // InternalCompilation.g:391:3: (lv_name_0_0= 'nop' )
            // InternalCompilation.g:392:4: lv_name_0_0= 'nop'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getNopAccess().getNameNopKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNopRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "nop");
            			

            }


            }


            }


            	leaveRule();

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
    // InternalCompilation.g:407:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // InternalCompilation.g:407:52: (iv_ruleAffectation= ruleAffectation EOF )
            // InternalCompilation.g:408:2: iv_ruleAffectation= ruleAffectation EOF
            {
             newCompositeNode(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;

             current =iv_ruleAffectation; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCompilation.g:414:1: ruleAffectation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_valeur_2_0= RULE_INT ) ) ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_valeur_2_0=null;


        	enterRule();

        try {
            // InternalCompilation.g:420:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_valeur_2_0= RULE_INT ) ) ) )
            // InternalCompilation.g:421:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_valeur_2_0= RULE_INT ) ) )
            {
            // InternalCompilation.g:421:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_valeur_2_0= RULE_INT ) ) )
            // InternalCompilation.g:422:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_valeur_2_0= RULE_INT ) )
            {
            // InternalCompilation.g:422:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompilation.g:423:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCompilation.g:423:4: (lv_name_0_0= RULE_ID )
            // InternalCompilation.g:424:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAffectationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAffectationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getColonEqualsSignKeyword_1());
            		
            // InternalCompilation.g:444:3: ( (lv_valeur_2_0= RULE_INT ) )
            // InternalCompilation.g:445:4: (lv_valeur_2_0= RULE_INT )
            {
            // InternalCompilation.g:445:4: (lv_valeur_2_0= RULE_INT )
            // InternalCompilation.g:446:5: lv_valeur_2_0= RULE_INT
            {
            lv_valeur_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_valeur_2_0, grammarAccess.getAffectationAccess().getValeurINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAffectationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valeur",
            						lv_valeur_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000022010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});

}