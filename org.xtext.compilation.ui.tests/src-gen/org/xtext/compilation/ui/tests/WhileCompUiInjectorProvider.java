/*
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.xtext.compilation.ui.internal.CompilationActivator;

public class WhileCompUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CompilationActivator.getInstance().getInjector("org.xtext.compilation.WhileComp");
	}

}