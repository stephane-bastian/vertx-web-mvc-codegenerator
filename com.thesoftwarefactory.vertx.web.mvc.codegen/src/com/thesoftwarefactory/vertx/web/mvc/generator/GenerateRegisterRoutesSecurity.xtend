package com.thesoftwarefactory.vertx.web.mvc.generator;

import org.eclipse.xtext.generator.IFileSystemAccess
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route
import static extension com.thesoftwarefactory.vertx.web.mvc.generator.RoutingHelper.*;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Model
import org.eclipse.emf.ecore.resource.Resource

class GenerateRegisterRoutesSecurity {

	def void generate(Resource resource, IFileSystemAccess fsa) {
		val model = resource.contents.head as Model;
		val uriWithoutExtension = resource.URI.trimFileExtension

		val className = "routes." + uriWithoutExtension.segment(uriWithoutExtension.segmentCount-1).toFirstUpper + "RoutesSecurity";
		val filename = toJavaFilename(className);
		fsa.generateFile(filename, toJavaCode(model, className))
	}

	def private toJavaCode(Model model, String className) {
		val packageName = RoutingHelper::getUpToLastSegment(className);
		val simpleClassName = RoutingHelper::getLastSegment(className);
		
		'''
		package «packageName»;

		import java.util.function.Function;
		import java.util.Objects;

		import io.vertx.ext.web.handler.AuthHandler;
		import io.vertx.ext.web.Router;

		public class «simpleClassName» {
			
			public final static void register(Router router, Function<String, AuthHandler> authHandlerCreator) {
				Objects.requireNonNull(router);
				Objects.requireNonNull(authHandlerCreator);
				
				«FOR route: model.routes»
					«IF route.permission!=null»
						router.«route.routerVerb»("«route.trimPath»").handler(authHandlerCreator.apply("«route.permission.value»"));
					«ENDIF»
					«IF route.role!=null»
						router.«route.routerVerb»("«route.trimPath»").handler(authHandlerCreator.apply("role:«route.role.value»"));
					«ENDIF»
				«ENDFOR»
			}
		}
		'''
	}

	def private static String routerVerb(Route route) {
		return route.verb.toString.toLowerCase;
	}
		
}
