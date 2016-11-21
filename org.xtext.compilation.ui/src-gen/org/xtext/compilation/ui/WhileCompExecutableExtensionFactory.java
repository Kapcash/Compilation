/*
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.compilation.ui.internal.CompilationActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class WhileCompExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CompilationActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CompilationActivator.getInstance().getInjector(CompilationActivator.ORG_XTEXT_COMPILATION_WHILECOMP);
	}
	
}