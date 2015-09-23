/**
 * generated by Xtext
 */
package com.thesoftwarefactory.vertx.web.mvc.generator;

import com.google.inject.Inject;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Model;
import com.thesoftwarefactory.vertx.web.mvc.generator.GenerateRegisterRoutes;
import com.thesoftwarefactory.vertx.web.mvc.generator.GenerateReverseRoutes;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class CodegenDslGenerator implements IGenerator {
  @Inject
  private JvmTypeReferenceBuilder.Factory typeRefBuilderFactory;
  
  @Inject
  @Extension
  private GenerateReverseRoutes generateReverseRoutes;
  
  @Inject
  @Extension
  private GenerateRegisterRoutes generateRegisterRoutes;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Model model = ((Model) _head);
    ResourceSet _resourceSet = resource.getResourceSet();
    final JvmTypeReferenceBuilder typeReferenceBuilder = this.typeRefBuilderFactory.create(_resourceSet);
    this.generateReverseRoutes.generate(typeReferenceBuilder, model, fsa);
    this.generateRegisterRoutes.generate(resource, fsa);
  }
}
