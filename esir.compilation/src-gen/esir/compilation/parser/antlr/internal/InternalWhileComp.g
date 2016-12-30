/*
 * generated by Xtext 2.10.0
 */
grammar InternalWhileComp;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package esir.compilation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package esir.compilation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import esir.compilation.services.WhileCompGrammarAccess;

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_0());
			}
			lv_functions_0_0=ruleFunction
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getProgramRule());
				}
				add(
					$current,
					"functions",
					lv_functions_0_0,
					"esir.compilation.WhileComp.Function");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='function'
		{
			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
		}
		(
			(
				lv_function_1_0=RULE_SYMBOL
				{
					newLeafNode(lv_function_1_0, grammarAccess.getFunctionAccess().getFunctionSYMBOLTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"function",
						lv_function_1_0,
						"esir.compilation.WhileComp.SYMBOL");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0());
				}
				lv_definition_3_0=ruleDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"definition",
						lv_definition_3_0,
						"esir.compilation.WhileComp.Definition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	iv_ruleDefinition=ruleDefinition
	{ $current=$iv_ruleDefinition.current; }
	EOF;

// Rule Definition
ruleDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getReadReadParserRuleCall_0_0());
				}
				lv_read_0_0=ruleRead
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"read",
						lv_read_0_0,
						"esir.compilation.WhileComp.Read");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='%'
		{
			newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getPercentSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getCommandsCommandsParserRuleCall_2_0());
				}
				lv_commands_2_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"commands",
						lv_commands_2_0,
						"esir.compilation.WhileComp.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='%'
		{
			newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getPercentSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getWriteWriteParserRuleCall_4_0());
				}
				lv_write_4_0=ruleWrite
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"write",
						lv_write_4_0,
						"esir.compilation.WhileComp.Write");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRead
entryRuleRead returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReadRule()); }
	iv_ruleRead=ruleRead
	{ $current=$iv_ruleRead.current; }
	EOF;

// Rule Read
ruleRead returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='read'
		{
			newLeafNode(otherlv_0, grammarAccess.getReadAccess().getReadKeyword_0());
		}
		(
			(
				lv_variable_1_0=RULE_VARIABLE
				{
					newLeafNode(lv_variable_1_0, grammarAccess.getReadAccess().getVariableVARIABLETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReadRule());
					}
					addWithLastConsumed(
						$current,
						"variable",
						lv_variable_1_0,
						"esir.compilation.WhileComp.VARIABLE");
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getReadAccess().getCommaKeyword_2_0());
			}
			(
				(
					lv_variable_3_0=RULE_VARIABLE
					{
						newLeafNode(lv_variable_3_0, grammarAccess.getReadAccess().getVariableVARIABLETerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getReadRule());
						}
						addWithLastConsumed(
							$current,
							"variable",
							lv_variable_3_0,
							"esir.compilation.WhileComp.VARIABLE");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleWrite
entryRuleWrite returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWriteRule()); }
	iv_ruleWrite=ruleWrite
	{ $current=$iv_ruleWrite.current; }
	EOF;

// Rule Write
ruleWrite returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='write'
		{
			newLeafNode(otherlv_0, grammarAccess.getWriteAccess().getWriteKeyword_0());
		}
		(
			(
				lv_variable_1_0=RULE_VARIABLE
				{
					newLeafNode(lv_variable_1_0, grammarAccess.getWriteAccess().getVariableVARIABLETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWriteRule());
					}
					addWithLastConsumed(
						$current,
						"variable",
						lv_variable_1_0,
						"esir.compilation.WhileComp.VARIABLE");
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getWriteAccess().getCommaKeyword_2_0());
			}
			(
				(
					lv_variable_3_0=RULE_VARIABLE
					{
						newLeafNode(lv_variable_3_0, grammarAccess.getWriteAccess().getVariableVARIABLETerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getWriteRule());
						}
						addWithLastConsumed(
							$current,
							"variable",
							lv_variable_3_0,
							"esir.compilation.WhileComp.VARIABLE");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAffectation
entryRuleAffectation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAffectationRule()); }
	iv_ruleAffectation=ruleAffectation
	{ $current=$iv_ruleAffectation.current; }
	EOF;

// Rule Affectation
ruleAffectation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_affectations_0_0=RULE_VARIABLE
				{
					newLeafNode(lv_affectations_0_0, grammarAccess.getAffectationAccess().getAffectationsVARIABLETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAffectationRule());
					}
					addWithLastConsumed(
						$current,
						"affectations",
						lv_affectations_0_0,
						"esir.compilation.WhileComp.VARIABLE");
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getCommaKeyword_1_0());
			}
			(
				(
					lv_affectations_2_0=RULE_VARIABLE
					{
						newLeafNode(lv_affectations_2_0, grammarAccess.getAffectationAccess().getAffectationsVARIABLETerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAffectationRule());
						}
						addWithLastConsumed(
							$current,
							"affectations",
							lv_affectations_2_0,
							"esir.compilation.WhileComp.VARIABLE");
					}
				)
			)
		)*
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getAffectationAccess().getColonEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAffectationAccess().getValeursExprParserRuleCall_3_0());
				}
				lv_valeurs_4_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAffectationRule());
					}
					add(
						$current,
						"valeurs",
						lv_valeurs_4_0,
						"esir.compilation.WhileComp.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getAffectationAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAffectationAccess().getValeursExprParserRuleCall_4_1_0());
					}
					lv_valeurs_6_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAffectationRule());
						}
						add(
							$current,
							"valeurs",
							lv_valeurs_6_0,
							"esir.compilation.WhileComp.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleNop
entryRuleNop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNopRule()); }
	iv_ruleNop=ruleNop
	{ $current=$iv_ruleNop.current; }
	EOF;

// Rule Nop
ruleNop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_nop_0_0='nop'
			{
				newLeafNode(lv_nop_0_0, grammarAccess.getNopAccess().getNopNopKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNopRule());
				}
				setWithLastConsumed($current, "nop", lv_nop_0_0, "nop");
			}
		)
	)
;

// Entry rule entryRuleCommands
entryRuleCommands returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandsRule()); }
	iv_ruleCommands=ruleCommands
	{ $current=$iv_ruleCommands.current; }
	EOF;

// Rule Commands
ruleCommands returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandsAccess().getCommandCommandParserRuleCall_0_0());
				}
				lv_command_0_0=ruleCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandsRule());
					}
					set(
						$current,
						"command",
						lv_command_0_0,
						"esir.compilation.WhileComp.Command");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=';'
			{
				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0());
					}
					lv_commands_2_0=ruleCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCommandsRule());
						}
						add(
							$current,
							"commands",
							lv_commands_2_0,
							"esir.compilation.WhileComp.Command");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCommandNopParserRuleCall_0_0());
				}
				lv_command_0_0=ruleNop
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"command",
						lv_command_0_0,
						"esir.compilation.WhileComp.Nop");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCommandAffectationParserRuleCall_1_0());
				}
				lv_command_1_0=ruleAffectation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"command",
						lv_command_1_0,
						"esir.compilation.WhileComp.Affectation");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCommandWhileParserRuleCall_2_0());
				}
				lv_command_2_0=ruleWhile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"command",
						lv_command_2_0,
						"esir.compilation.WhileComp.While");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCommandForParserRuleCall_3_0());
				}
				lv_command_3_0=ruleFor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"command",
						lv_command_3_0,
						"esir.compilation.WhileComp.For");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCommandIfParserRuleCall_4_0());
				}
				lv_command_4_0=ruleIf
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"command",
						lv_command_4_0,
						"esir.compilation.WhileComp.If");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCommandForeachParserRuleCall_5_0());
				}
				lv_command_5_0=ruleForeach
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"command",
						lv_command_5_0,
						"esir.compilation.WhileComp.Foreach");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleForeach
entryRuleForeach returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForeachRule()); }
	iv_ruleForeach=ruleForeach
	{ $current=$iv_ruleForeach.current; }
	EOF;

// Rule Foreach
ruleForeach returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='foreach'
		{
			newLeafNode(otherlv_0, grammarAccess.getForeachAccess().getForeachKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForeachAccess().getExpr1ExprParserRuleCall_1_0());
				}
				lv_expr1_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForeachRule());
					}
					set(
						$current,
						"expr1",
						lv_expr1_1_0,
						"esir.compilation.WhileComp.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='in'
		{
			newLeafNode(otherlv_2, grammarAccess.getForeachAccess().getInKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForeachAccess().getExpr2ExprParserRuleCall_3_0());
				}
				lv_expr2_3_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForeachRule());
					}
					set(
						$current,
						"expr2",
						lv_expr2_3_0,
						"esir.compilation.WhileComp.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='do'
		{
			newLeafNode(otherlv_4, grammarAccess.getForeachAccess().getDoKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForeachAccess().getCommandsCommandsParserRuleCall_5_0());
				}
				lv_commands_5_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForeachRule());
					}
					set(
						$current,
						"commands",
						lv_commands_5_0,
						"esir.compilation.WhileComp.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='od'
		{
			newLeafNode(otherlv_6, grammarAccess.getForeachAccess().getOdKeyword_6());
		}
	)
;

// Entry rule entryRuleIf
entryRuleIf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfRule()); }
	iv_ruleIf=ruleIf
	{ $current=$iv_ruleIf.current; }
	EOF;

// Rule If
ruleIf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='if'
		{
			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfAccess().getExprExprParserRuleCall_1_0());
				}
				lv_expr_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfRule());
					}
					set(
						$current,
						"expr",
						lv_expr_1_0,
						"esir.compilation.WhileComp.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='then'
		{
			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getThenKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfAccess().getCommands1CommandsParserRuleCall_3_0());
				}
				lv_commands1_3_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfRule());
					}
					set(
						$current,
						"commands1",
						lv_commands1_3_0,
						"esir.compilation.WhileComp.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				('else')=>
				otherlv_4='else'
				{
					newLeafNode(otherlv_4, grammarAccess.getIfAccess().getElseKeyword_4_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getIfAccess().getCommands2CommandsParserRuleCall_4_1_0());
					}
					lv_commands2_5_0=ruleCommands
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfRule());
						}
						set(
							$current,
							"commands2",
							lv_commands2_5_0,
							"esir.compilation.WhileComp.Commands");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='fi'
		{
			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getFiKeyword_5());
		}
	)
;

// Entry rule entryRuleFor
entryRuleFor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForRule()); }
	iv_ruleFor=ruleFor
	{ $current=$iv_ruleFor.current; }
	EOF;

// Rule For
ruleFor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='for'
		{
			newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForAccess().getExprExprParserRuleCall_1_0());
				}
				lv_expr_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForRule());
					}
					set(
						$current,
						"expr",
						lv_expr_1_0,
						"esir.compilation.WhileComp.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='do'
		{
			newLeafNode(otherlv_2, grammarAccess.getForAccess().getDoKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForAccess().getCommandsCommandsParserRuleCall_3_0());
				}
				lv_commands_3_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForRule());
					}
					set(
						$current,
						"commands",
						lv_commands_3_0,
						"esir.compilation.WhileComp.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='od'
		{
			newLeafNode(otherlv_4, grammarAccess.getForAccess().getOdKeyword_4());
		}
	)
;

// Entry rule entryRuleWhile
entryRuleWhile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhileRule()); }
	iv_ruleWhile=ruleWhile
	{ $current=$iv_ruleWhile.current; }
	EOF;

// Rule While
ruleWhile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='while'
		{
			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileAccess().getExprExprParserRuleCall_1_0());
				}
				lv_expr_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileRule());
					}
					set(
						$current,
						"expr",
						lv_expr_1_0,
						"esir.compilation.WhileComp.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='do'
		{
			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getDoKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileAccess().getCommandsCommandsParserRuleCall_3_0());
				}
				lv_commands_3_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileRule());
					}
					set(
						$current,
						"commands",
						lv_commands_3_0,
						"esir.compilation.WhileComp.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='od'
		{
			newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getOdKeyword_4());
		}
	)
;

// Entry rule entryRuleExpr
entryRuleExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprRule()); }
	iv_ruleExpr=ruleExpr
	{ $current=$iv_ruleExpr.current; }
	EOF;

// Rule Expr
ruleExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getExprAccess().getExprsimpleExprSimpleParserRuleCall_0());
			}
			lv_exprsimple_0_0=ruleExprSimple
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getExprRule());
				}
				set(
					$current,
					"exprsimple",
					lv_exprsimple_0_0,
					"esir.compilation.WhileComp.ExprSimple");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleExprSimple
entryRuleExprSimple returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprSimpleRule()); }
	iv_ruleExprSimple=ruleExprSimple
	{ $current=$iv_ruleExprSimple.current; }
	EOF;

// Rule ExprSimple
ruleExprSimple returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_valeur_0_0='nil'
				{
					newLeafNode(lv_valeur_0_0, grammarAccess.getExprSimpleAccess().getValeurNilKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExprSimpleRule());
					}
					setWithLastConsumed($current, "valeur", lv_valeur_0_0, "nil");
				}
			)
		)
		    |
		(
			(
				lv_valeur_1_0=RULE_VARIABLE
				{
					newLeafNode(lv_valeur_1_0, grammarAccess.getExprSimpleAccess().getValeurVARIABLETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExprSimpleRule());
					}
					setWithLastConsumed(
						$current,
						"valeur",
						lv_valeur_1_0,
						"esir.compilation.WhileComp.VARIABLE");
				}
			)
		)
		    |
		(
			(
				lv_valeur_2_0=RULE_SYMBOL
				{
					newLeafNode(lv_valeur_2_0, grammarAccess.getExprSimpleAccess().getValeurSYMBOLTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExprSimpleRule());
					}
					setWithLastConsumed(
						$current,
						"valeur",
						lv_valeur_2_0,
						"esir.compilation.WhileComp.SYMBOL");
				}
			)
		)
		    |
		(
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0());
			}
			(
				(
					lv_ope_4_0='cons'
					{
						newLeafNode(lv_ope_4_0, grammarAccess.getExprSimpleAccess().getOpeConsKeyword_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExprSimpleRule());
						}
						setWithLastConsumed($current, "ope", lv_ope_4_0, "cons");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_3_2_0());
					}
					lv_lexpr_5_0=ruleLexpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprSimpleRule());
						}
						set(
							$current,
							"lexpr",
							lv_lexpr_5_0,
							"esir.compilation.WhileComp.Lexpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3());
			}
		)
		    |
		(
			otherlv_7='('
			{
				newLeafNode(otherlv_7, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0());
			}
			(
				(
					lv_ope_8_0='list'
					{
						newLeafNode(lv_ope_8_0, grammarAccess.getExprSimpleAccess().getOpeListKeyword_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExprSimpleRule());
						}
						setWithLastConsumed($current, "ope", lv_ope_8_0, "list");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_4_2_0());
					}
					lv_lexpr_9_0=ruleLexpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprSimpleRule());
						}
						set(
							$current,
							"lexpr",
							lv_lexpr_9_0,
							"esir.compilation.WhileComp.Lexpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_10=')'
			{
				newLeafNode(otherlv_10, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3());
			}
		)
		    |
		(
			otherlv_11='('
			{
				newLeafNode(otherlv_11, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0());
			}
			(
				(
					lv_ope_12_0='hd'
					{
						newLeafNode(lv_ope_12_0, grammarAccess.getExprSimpleAccess().getOpeHdKeyword_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExprSimpleRule());
						}
						setWithLastConsumed($current, "ope", lv_ope_12_0, "hd");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExprSimpleAccess().getExprExprParserRuleCall_5_2_0());
					}
					lv_expr_13_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprSimpleRule());
						}
						set(
							$current,
							"expr",
							lv_expr_13_0,
							"esir.compilation.WhileComp.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_14=')'
			{
				newLeafNode(otherlv_14, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3());
			}
		)
		    |
		(
			otherlv_15='('
			{
				newLeafNode(otherlv_15, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_6_0());
			}
			(
				(
					lv_ope_16_0='tl'
					{
						newLeafNode(lv_ope_16_0, grammarAccess.getExprSimpleAccess().getOpeTlKeyword_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExprSimpleRule());
						}
						setWithLastConsumed($current, "ope", lv_ope_16_0, "tl");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExprSimpleAccess().getExprExprParserRuleCall_6_2_0());
					}
					lv_expr_17_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprSimpleRule());
						}
						set(
							$current,
							"expr",
							lv_expr_17_0,
							"esir.compilation.WhileComp.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_18=')'
			{
				newLeafNode(otherlv_18, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_6_3());
			}
		)
		    |
		(
			otherlv_19='('
			{
				newLeafNode(otherlv_19, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExprSimpleAccess().getNNotParserRuleCall_7_1_0());
					}
					lv_n_20_0=ruleNot
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprSimpleRule());
						}
						set(
							$current,
							"n",
							lv_n_20_0,
							"esir.compilation.WhileComp.Not");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExprSimpleAccess().getExprExprParserRuleCall_7_2_0());
					}
					lv_expr_21_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprSimpleRule());
						}
						set(
							$current,
							"expr",
							lv_expr_21_0,
							"esir.compilation.WhileComp.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_22=')'
			{
				newLeafNode(otherlv_22, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_7_3());
			}
		)
		    |
		(
			otherlv_23='('
			{
				newLeafNode(otherlv_23, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_8_0());
			}
			(
				(
					lv_valeur_24_0=RULE_SYMBOL
					{
						newLeafNode(lv_valeur_24_0, grammarAccess.getExprSimpleAccess().getValeurSYMBOLTerminalRuleCall_8_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExprSimpleRule());
						}
						setWithLastConsumed(
							$current,
							"valeur",
							lv_valeur_24_0,
							"esir.compilation.WhileComp.SYMBOL");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_8_2_0());
					}
					lv_lexpr_25_0=ruleLexpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprSimpleRule());
						}
						set(
							$current,
							"lexpr",
							lv_lexpr_25_0,
							"esir.compilation.WhileComp.Lexpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_26=')'
			{
				newLeafNode(otherlv_26, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_8_3());
			}
		)
		    |
		(
			otherlv_27='('
			{
				newLeafNode(otherlv_27, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_9_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExprSimpleAccess().getEx1ExprParserRuleCall_9_1_0());
					}
					lv_ex1_28_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprSimpleRule());
						}
						set(
							$current,
							"ex1",
							lv_ex1_28_0,
							"esir.compilation.WhileComp.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					(
						lv_ope_29_1='and'
						{
							newLeafNode(lv_ope_29_1, grammarAccess.getExprSimpleAccess().getOpeAndKeyword_9_2_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExprSimpleRule());
							}
							setWithLastConsumed($current, "ope", lv_ope_29_1, null);
						}
						    |
						lv_ope_29_2='or'
						{
							newLeafNode(lv_ope_29_2, grammarAccess.getExprSimpleAccess().getOpeOrKeyword_9_2_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExprSimpleRule());
							}
							setWithLastConsumed($current, "ope", lv_ope_29_2, null);
						}
						    |
						lv_ope_29_3='=?'
						{
							newLeafNode(lv_ope_29_3, grammarAccess.getExprSimpleAccess().getOpeEqualsSignQuestionMarkKeyword_9_2_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExprSimpleRule());
							}
							setWithLastConsumed($current, "ope", lv_ope_29_3, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExprSimpleAccess().getEx2ExprParserRuleCall_9_3_0());
					}
					lv_ex2_30_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprSimpleRule());
						}
						set(
							$current,
							"ex2",
							lv_ex2_30_0,
							"esir.compilation.WhileComp.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_31=')'
			{
				newLeafNode(otherlv_31, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_9_4());
			}
		)
	)
;

// Entry rule entryRuleLexpr
entryRuleLexpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLexprRule()); }
	iv_ruleLexpr=ruleLexpr
	{ $current=$iv_ruleLexpr.current; }
	EOF;

// Rule Lexpr
ruleLexpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getLexprAccess().getExprExprParserRuleCall_0_0());
				}
				lv_expr_0_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLexprRule());
					}
					set(
						$current,
						"expr",
						lv_expr_0_0,
						"esir.compilation.WhileComp.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getLexprAccess().getLexprLexprParserRuleCall_1_0());
				}
				lv_lexpr_1_0=ruleLexpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLexprRule());
					}
					set(
						$current,
						"lexpr",
						lv_lexpr_1_0,
						"esir.compilation.WhileComp.Lexpr");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleNot
entryRuleNot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNotRule()); }
	iv_ruleNot=ruleNot
	{ $current=$iv_ruleNot.current; }
	EOF;

// Rule Not
ruleNot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_not_0_0='!'
			{
				newLeafNode(lv_not_0_0, grammarAccess.getNotAccess().getNotExclamationMarkKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNotRule());
				}
				setWithLastConsumed($current, "not", lv_not_0_0, "!");
			}
		)
	)
;

RULE_VARIABLE : 'A'..'Z' ('A'..'Z'|'a'..'z')*;

RULE_SYMBOL : 'a'..'z' ('A'..'Z'|'a'..'z'|'0'..'9')* ((('-'|'+'|'.'|'/'|'_'|'&')|'->') ('A'..'Z'|'a'..'z'|'0'..'9')+)* ('!'|'?')?;

RULE_NOMBRE : '1'..'9' ('0'..'9')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
