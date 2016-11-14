/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.test.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.test.myDsl.Classe

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	for (e : resource.allContents.toIterable.filter(typeof(Classe))){
		fsa.generateFile(
		"entities/" + e.name + ".java",
		e.compile)
}
	}
	def compile (Classe c){'''
		public interface �c.name� {
			�FOR f : c.attributs�
				void set �f.name�;
				�f.name� get�f.name.toFirstUpper�();
			�ENDFOR�
		}
	'''
		
	}
}
