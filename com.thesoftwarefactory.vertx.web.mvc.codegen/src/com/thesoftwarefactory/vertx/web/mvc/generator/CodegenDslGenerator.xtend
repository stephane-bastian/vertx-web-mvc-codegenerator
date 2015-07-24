/*
 * generated by Xtext
 */
package com.thesoftwarefactory.vertx.web.mvc.generator;

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Model

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CodegenDslGenerator implements IGenerator {

	@Inject JvmTypeReferenceBuilder.Factory typeRefBuilderFactory
	@Inject extension GenerateRoutes generateRoutes
	@Inject extension GenerateRouteRegistration generateRouteRegistration
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val model = resource.contents.head as Model;
		val JvmTypeReferenceBuilder typeReferenceBuilder = typeRefBuilderFactory.create(resource.resourceSet);

		generateRoutes.generate(typeReferenceBuilder, model, fsa)
		generateRouteRegistration.generate(resource, fsa)
	}
}
