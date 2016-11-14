package org.xtext.example.test.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.test.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Class'", "'{'", "'}'", "'int'", "'float'", "'boolean'", "'char'", "'String'", "';'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_classes_0_0= ruleClasse ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_classes_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_classes_0_0= ruleClasse ) )* )
            // InternalMyDsl.g:78:2: ( (lv_classes_0_0= ruleClasse ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_classes_0_0= ruleClasse ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_classes_0_0= ruleClasse )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_classes_0_0= ruleClasse )
            	    // InternalMyDsl.g:80:4: lv_classes_0_0= ruleClasse
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getClassesClasseParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_classes_0_0=ruleClasse();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"classes",
            	    					lv_classes_0_0,
            	    					"org.xtext.example.test.MyDsl.Classe");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleClasse"
    // InternalMyDsl.g:100:1: entryRuleClasse returns [EObject current=null] : iv_ruleClasse= ruleClasse EOF ;
    public final EObject entryRuleClasse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClasse = null;


        try {
            // InternalMyDsl.g:100:47: (iv_ruleClasse= ruleClasse EOF )
            // InternalMyDsl.g:101:2: iv_ruleClasse= ruleClasse EOF
            {
             newCompositeNode(grammarAccess.getClasseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClasse=ruleClasse();

            state._fsp--;

             current =iv_ruleClasse; 
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
    // $ANTLR end "entryRuleClasse"


    // $ANTLR start "ruleClasse"
    // InternalMyDsl.g:107:1: ruleClasse returns [EObject current=null] : (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributs_3_0= ruleAttribut ) )* otherlv_4= '}' ) ;
    public final EObject ruleClasse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributs_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributs_3_0= ruleAttribut ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributs_3_0= ruleAttribut ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributs_3_0= ruleAttribut ) )* otherlv_4= '}' )
            // InternalMyDsl.g:115:3: otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributs_3_0= ruleAttribut ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClasseAccess().getClassKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClasseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClasseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:141:3: ( (lv_attributs_3_0= ruleAttribut ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:142:4: (lv_attributs_3_0= ruleAttribut )
            	    {
            	    // InternalMyDsl.g:142:4: (lv_attributs_3_0= ruleAttribut )
            	    // InternalMyDsl.g:143:5: lv_attributs_3_0= ruleAttribut
            	    {

            	    					newCompositeNode(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_attributs_3_0=ruleAttribut();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClasseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributs",
            	    						lv_attributs_3_0,
            	    						"org.xtext.example.test.MyDsl.Attribut");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleClasse"


    // $ANTLR start "entryRuleAttribut"
    // InternalMyDsl.g:168:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalMyDsl.g:168:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalMyDsl.g:169:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
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
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalMyDsl.g:175:1: ruleAttribut returns [EObject current=null] : ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'float' | lv_type_0_3= 'boolean' | lv_type_0_4= 'char' | lv_type_0_5= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:181:2: ( ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'float' | lv_type_0_3= 'boolean' | lv_type_0_4= 'char' | lv_type_0_5= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:182:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'float' | lv_type_0_3= 'boolean' | lv_type_0_4= 'char' | lv_type_0_5= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:182:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'float' | lv_type_0_3= 'boolean' | lv_type_0_4= 'char' | lv_type_0_5= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMyDsl.g:183:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'float' | lv_type_0_3= 'boolean' | lv_type_0_4= 'char' | lv_type_0_5= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalMyDsl.g:183:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'float' | lv_type_0_3= 'boolean' | lv_type_0_4= 'char' | lv_type_0_5= 'String' ) ) )
            // InternalMyDsl.g:184:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'float' | lv_type_0_3= 'boolean' | lv_type_0_4= 'char' | lv_type_0_5= 'String' ) )
            {
            // InternalMyDsl.g:184:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'float' | lv_type_0_3= 'boolean' | lv_type_0_4= 'char' | lv_type_0_5= 'String' ) )
            // InternalMyDsl.g:185:5: (lv_type_0_1= 'int' | lv_type_0_2= 'float' | lv_type_0_3= 'boolean' | lv_type_0_4= 'char' | lv_type_0_5= 'String' )
            {
            // InternalMyDsl.g:185:5: (lv_type_0_1= 'int' | lv_type_0_2= 'float' | lv_type_0_3= 'boolean' | lv_type_0_4= 'char' | lv_type_0_5= 'String' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:186:6: lv_type_0_1= 'int'
                    {
                    lv_type_0_1=(Token)match(input,14,FOLLOW_4); 

                    						newLeafNode(lv_type_0_1, grammarAccess.getAttributAccess().getTypeIntKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:197:6: lv_type_0_2= 'float'
                    {
                    lv_type_0_2=(Token)match(input,15,FOLLOW_4); 

                    						newLeafNode(lv_type_0_2, grammarAccess.getAttributAccess().getTypeFloatKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:208:6: lv_type_0_3= 'boolean'
                    {
                    lv_type_0_3=(Token)match(input,16,FOLLOW_4); 

                    						newLeafNode(lv_type_0_3, grammarAccess.getAttributAccess().getTypeBooleanKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:219:6: lv_type_0_4= 'char'
                    {
                    lv_type_0_4=(Token)match(input,17,FOLLOW_4); 

                    						newLeafNode(lv_type_0_4, grammarAccess.getAttributAccess().getTypeCharKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:230:6: lv_type_0_5= 'String'
                    {
                    lv_type_0_5=(Token)match(input,18,FOLLOW_4); 

                    						newLeafNode(lv_type_0_5, grammarAccess.getAttributAccess().getTypeStringKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_5, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:243:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:244:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:244:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:245:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleAttribut"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});

}