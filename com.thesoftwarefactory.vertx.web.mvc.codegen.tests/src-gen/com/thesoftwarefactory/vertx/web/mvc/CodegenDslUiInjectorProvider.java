/*
 * generated by Xtext
 */
package com.thesoftwarefactory.vertx.web.mvc;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class CodegenDslUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return com.thesoftwarefactory.vertx.web.mvc.ui.internal.CodegenDslActivator.getInstance().getInjector("com.thesoftwarefactory.vertx.web.mvc.CodegenDsl");
	}
	
}
