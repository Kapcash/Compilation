/*
 * generated by Xtext 2.10.0
 */
package esir.compilation.generator

import esir.compilation.whileComp.Affectation
import esir.compilation.whileComp.Command
import esir.compilation.whileComp.Commands
import esir.compilation.whileComp.Expr
import esir.compilation.whileComp.ExprAnd
import esir.compilation.whileComp.ExprEq
import esir.compilation.whileComp.ExprNot
import esir.compilation.whileComp.ExprOr
import esir.compilation.whileComp.ExprSimple
import esir.compilation.whileComp.For
import esir.compilation.whileComp.Foreach
import esir.compilation.whileComp.Function
import esir.compilation.whileComp.If
import esir.compilation.whileComp.Lexpr
import esir.compilation.whileComp.Nop
import esir.compilation.whileComp.Program
import esir.compilation.whileComp.While
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class WhileCompGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(typeof(Program))){
			fsa.generateFile("Result_output.whpp",	e.compile)
		}
	}
	
	def compile (Program p){'''
		�FOR f : p.functions�
		�f.compile�
		�ENDFOR�
		'''
	}
	
	def compile (Function c){'''
		function �c.function�: 
		read �FOR param: c.definition.read.variable SEPARATOR ' ,'��param��ENDFOR�
		%
		�c.definition.commands.compile�
		%
		write �FOR param: c.definition.write.variable SEPARATOR ' ,'��param��ENDFOR�
		'''	
	}
	
	def compile(Commands coms){
		if(coms.commands != null){
			coms.commands.add(0,coms.command)
		}
		else{
			coms.command.compile()
		}
		'''
		�FOR c: (coms.commands) SEPARATOR ' ;'��"	"��c.compile��ENDFOR�
		'''
	}
	
	def compile(Command c){
		'''
		�IF c.command instanceof Affectation�
			�(c.command as Affectation).compile�
		�ENDIF�
		�IF c.command instanceof Nop�
			nop
		�ENDIF�
		�IF c.command instanceof While�
			while �(c.command as While).expr.compile� do
				�(c.command as While).commands.compile�
			�"	"�od
		�ENDIF�
		�IF c.command instanceof For�
			For �(c.command as For).expr.compile� do
				�(c.command as For).commands.compile�
			�"	"�od
		�ENDIF�
		�IF c.command instanceof Foreach�
			foreach �(c.command as Foreach).expr1.compile� in �(c.command as Foreach).expr2.compile� do
				�(c.command as Foreach).commands.compile�
			�"	"�od
		�ENDIF�
		�IF c.command instanceof If�
			if �(c.command as If).expr.compile� then 
				�(c.command as If).commands1.compile�
			�IF (c.command as If).commands2 != null� 
			�"	"�else 
				�(c.command as If).commands2.compile�
			�ENDIF�
			�"	"�fi
 		�ENDIF�
		'''
	}
	
	def compile(Affectation aff){
		'''
		�FOR v: aff.affectations SEPARATOR ' ,'��v��ENDFOR� := �FOR v: aff.valeurs SEPARATOR ' ,'��v��ENDFOR�
		'''	
	}
	
	def compile(Expr expr){
	if (expr.exprAnd != null){
			return (expr.exprAnd.compile)
		}else{
			return (expr.exprsimple.compile)
		}
	}
	
	def compile(ExprAnd expr){
	if (expr.exprAnd == null){
			return (expr.exprOr.compile)
		}else{
			return (expr.exprOr.compile + " && " + expr.exprAnd.compile)
		}
	}
	
	def compile(ExprOr expr){
		if (expr.exprOr == null){
			return (expr.exprNot.compile)
		}else{
			return (expr.exprNot.compile + " || " + expr.exprOr.compile)
		}
	}
	
	def compile(ExprNot expr){
		if (expr.not != null){
			return ("!" + expr.exprEq.compile)
		}else{
			return (expr.exprEq.compile)
		}
	}
	
	def compile(ExprEq expr){
		if (expr.expr != null){
			return (expr.expr.compile())
		}else{
			return (expr.exprSimple1.compile + "=?" +expr.exprSimple2.compile)
		}
	}
	
	def compile(ExprSimple expr){
		if(expr.nil != null){
			return "nil"
		}
		if (expr.variable != null){
			return (expr.variable)
		}
		if(expr.symbol != null && expr.lexpr == null){
			return (expr.symbol)
		}
		if (expr.cons != null){
			return ("(cons " + expr.lexpr.compile +")")
		}
		if (expr.list != null){
			return ("(list " + expr.lexpr.compile +")")
		}
		if (expr.hd != null){
			return ("(hd " + expr.expr.compile +")")
		}
		if (expr.tl != null){
			return ("(tl " + expr.expr.compile +")")
		}
		if (expr.symbol != null){
			return ("( "+expr.symbol + expr.lexpr.compile +")")
		}
		}
		 	
		def compile(Lexpr expr){
		if (expr.lexpr != null){
			return (expr.expr.compile() +" " +expr.lexpr.compile())
		}else{
			return (expr.expr.compile())
		}
		}
}