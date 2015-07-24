package com.thesoftwarefactory.vertx.web.mvc.generator;

import org.eclipse.xtext.generator.IFileSystemAccess
import java.util.Collection
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder 
import static extension com.thesoftwarefactory.vertx.web.mvc.generator.RoutingHelper.*;
import java.util.stream.Collectors
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Model
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route

class GenerateRoutes {
	
	def void generate(JvmTypeReferenceBuilder typeReferenceBuilder, String routeHandlerClassname, Collection<Route> routes, IFileSystemAccess fsa) {
		val routeClassName = "routes." + routeHandlerClassname
		val filename = RoutingHelper::toJavaFilename(routeClassName);
		fsa.generateFile(filename, toJavaCode(typeReferenceBuilder, routes, routeClassName))
	}

	def void generate(JvmTypeReferenceBuilder typeReferenceBuilder, Model model, IFileSystemAccess fsa) {
		val groupedRoutes = model.routes.groupBy[RoutingHelper.getClassName(handler)]
		groupedRoutes.forEach[k, v | generate(typeReferenceBuilder, k, v, fsa)]
	}

	def private toJavaCode(JvmTypeReferenceBuilder typeReferenceBuilder, Collection<Route> routes, String className) {
		val packageName = RoutingHelper::getUpToLastSegment(className);
		val simpleClassName = RoutingHelper::getLastSegment(className);
		
		'''
		package «packageName»;

		import com.thesoftwarefactory.reflection.type.TypeToken;
		import com.thesoftwarefactory.vertx.web.bind.UriBuilder;
		import com.thesoftwarefactory.vertx.web.bind.Binder;
		import com.thesoftwarefactory.vertx.web.bind.Binders;
		import com.thesoftwarefactory.vertx.web.bind.BindingInfo;
		import com.thesoftwarefactory.vertx.web.bind.BindingInfo.DefaultValueType;
		import com.thesoftwarefactory.vertx.web.bind.impl.BindingInfoImpl;
		import com.thesoftwarefactory.vertx.web.mvc.ActionResult;
		import com.thesoftwarefactory.vertx.web.mvc.MvcService;

		import java.util.Objects;

		import io.vertx.core.Future;
		import io.vertx.core.Handler;
		import io.vertx.ext.web.RoutingContext;

		public class «simpleClassName» {
			«FOR route: routes»
				«val routeParameters = RoutingHelper::getMethodParameters(route.handler, getRouteHandlerType(route.handler, typeReferenceBuilder))»
				«val constructorParameters = getConstructorParameters(getRouteHandlerType(route.handler, typeReferenceBuilder))»
				
				public static class «route.actionName» implements Handler<RoutingContext> {
					// constructor bindings
					«FOR constructorParameter: constructorParameters»
						«IF constructorParameter.isGeneric»
							private final static Binder<«constructorParameter.qualifiedType.ensureBoxedType»> «constructorParameter.binderName» = Binders.instance.getBinderByType(new TypeToken<«constructorParameter.qualifiedType»>() {}.type());
						«ELSE»
							private final static Binder<«constructorParameter.qualifiedType.ensureBoxedType»> «constructorParameter.binderName» = Binders.instance.getBinderByType(«constructorParameter.qualifiedType».class);
						«ENDIF»
					«ENDFOR»
					«FOR constructorParameter: constructorParameters»
						«constructorParameter.generateBindingInfo»
					«ENDFOR»
					// action bindings
					«FOR routeParameter: routeParameters»
						«IF routeParameter.isGeneric»
							private final static Binder<«routeParameter.qualifiedType.ensureBoxedType»> «routeParameter.binderName» = Binders.instance.getBinderByType(new TypeToken<«routeParameter.qualifiedType»>() {}.type());
						«ELSE»
							private final static Binder<«routeParameter.qualifiedType.ensureBoxedType»> «routeParameter.binderName» = Binders.instance.getBinderByType(«routeParameter.qualifiedType».class);
						«ENDIF»
					«ENDFOR»
					«FOR routeParameter: routeParameters»
						«routeParameter.generateBindingInfo»
					«ENDFOR»
					// cache the controller so it's instantiated only once
					private «RoutingHelper.getClassName(route.handler)» controller;

					private «RoutingHelper.getClassName(route.handler)» instantiateController(RoutingContext context) {
						return new «RoutingHelper.getClassName(route.handler)»(
									«FOR constructorParameter: constructorParameters SEPARATOR ', '»
										«constructorParameter.binderName».bindFromContext(«constructorParameter.bindingInfoName», context)
									«ENDFOR»
								);
					}
					
					private «RoutingHelper.getClassName(route.handler)» getController(RoutingContext context) {
						if (controller==null) {
							controller = instantiateController(context);
						}
						return controller;
					}

					@Override
					public void handle(RoutingContext context) {
						getController(context)
							.«RoutingHelper.getMethodName(route.handler)»(
								«FOR routeParameter: routeParameters SEPARATOR ', '»
									«routeParameter.binderName».bindFromContext(«routeParameter.bindingInfoName», context)
								«ENDFOR»
							)
							.setHandler(res -> { 
								MvcService.get(context).handle(res, context);
							});
					}
				
				}
			«ENDFOR»
			
			«FOR route: routes»
				«val routeParameters = RoutingHelper::getMethodParameters(route.handler, getRouteHandlerType(route.handler, typeReferenceBuilder)).stream().filter(parameter | parameter.definedInRouteFile).collect(Collectors.toList())»
				«val requiredRouteParameters = routeParameters.stream().filter(parameter | !isOptional(parameter)).collect(Collectors.toList())»
				«val optionalRouteParameters = routeParameters.stream().filter(parameter | isOptional(parameter)).collect(Collectors.toList())»
				
				public static class «RoutingHelper.getMethodName(route.handler).toFirstUpper»UriBuilder {
					«FOR routeParameter: routeParameters»
						private «routeParameter.qualifiedType» «routeParameter.name»;
					«ENDFOR»
					
					public «route.uriBuilderClassName»(«FOR routeParameter: requiredRouteParameters SEPARATOR ', '»« routeParameter.qualifiedType» «routeParameter.name»«ENDFOR») {
						«FOR routeParameter: requiredRouteParameters»
							Objects.requireNonNull(«routeParameter.name»);
						«ENDFOR»
						
						«FOR routeParameter: requiredRouteParameters»
							this.«routeParameter.name» = «routeParameter.name»;
						«ENDFOR»
					}
					
					public String build() {
						UriBuilder result = new UriBuilder().setPath(path());
						«FOR routeParameter: routeParameters»
							«IF !routeParameter.primitive»
								if («routeParameter.name»!=null) {
									«route.actionName».«routeParameter.binderName».bindToUrl(«route.actionName».«routeParameter.bindingInfoName», «routeParameter.name», result);
								}
							«ENDIF»
						«ENDFOR»
						return result.toString();
					}
					
					private String path() {
						return "«route.trimPath»"«FOR routeParameter: routeParameters»«IF route.trimPath.contains("/:" + routeParameter.name)».replace("/:«routeParameter.name»", «routeParameter.name».toString())«ENDIF»«ENDFOR»;
					}
					
					«FOR routeParameter: optionalRouteParameters»
						public «route.uriBuilderClassName» set«routeParameter.name.toFirstUpper»(«routeParameter.qualifiedType» «routeParameter.name») {
							Objects.requireNonNull(«routeParameter.name»);

							this.«routeParameter.name» = «routeParameter.name»;
							return this;
						}
						
					«ENDFOR»
				}
			«ENDFOR»

			«FOR route: routes»
				«val routeParameters = RoutingHelper::getMethodParameters(route.handler, getRouteHandlerType(route.handler, typeReferenceBuilder)).stream().filter(parameter | parameter.definedInRouteFile).collect(Collectors.toList())»
				«val requiredRouteParameters = routeParameters.stream().filter(parameter | !isOptional(parameter)).collect(Collectors.toList())»
				«val optionalRouteParameters = routeParameters.stream().filter(parameter | isOptional(parameter)).collect(Collectors.toList())»
				«IF optionalRouteParameters.size>0»
					public final static «route.uriBuilderClassName» «RoutingHelper.getMethodName(route.handler)»Url(«FOR routeParameter: requiredRouteParameters SEPARATOR ', '»«routeParameter.qualifiedType» «routeParameter.name»«ENDFOR») {
						return new «route.uriBuilderClassName»(«FOR routeParameter: requiredRouteParameters SEPARATOR ', '»«routeParameter.name»«ENDFOR»);
					}
				«ELSE»
					public final static String «RoutingHelper.getMethodName(route.handler)»Url(«FOR routeParameter: requiredRouteParameters SEPARATOR ', '»«routeParameter.qualifiedType» «routeParameter.name»«ENDFOR») {
						return new «route.uriBuilderClassName»(«FOR routeParameter: requiredRouteParameters SEPARATOR ', '»«routeParameter.name»«ENDFOR»).build();
					}
				«ENDIF»
				
			«ENDFOR»
		}
		'''
	}
	
	def private String generateBindingInfo(ParameterExt routeParameter) {
		var result = "private final static BindingInfo " + routeParameter.bindingInfoName + " = new BindingInfoImpl(\"" + routeParameter.name + "\")";
 		if (routeParameter.defaultValue==null) {
			result += ";";
		}
		else if (routeParameter.defaultValue.^new) {
				result += ".defaultValueType(DefaultValueType.NEW);";
		}
		else if (routeParameter.defaultValue.^null) {
			result += ".defaultValueType(DefaultValueType.NULL);";
		}
		else {
			result += ".defaultValue(\"" + routeParameter.defaultValue.value + "\");"
		}
		return result;
	}
		
}
