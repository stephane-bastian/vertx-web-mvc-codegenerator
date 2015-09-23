package com.thesoftwarefactory.vertx.web.mvc.generator;

import org.eclipse.xtext.generator.IFileSystemAccess
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route
import static extension com.thesoftwarefactory.vertx.web.mvc.generator.RoutingHelper.*;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Model
import org.eclipse.emf.ecore.resource.Resource

class GenerateRegisterRoutes {

	def void generate(Resource resource, IFileSystemAccess fsa) {
		val model = resource.contents.head as Model;
		val uriWithoutExtension = resource.URI.trimFileExtension

		val className = "routes." + uriWithoutExtension.segment(uriWithoutExtension.segmentCount-1).toFirstUpper + "Routes";
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
		import java.util.ArrayList;
		import java.util.Collections;
		import java.util.LinkedHashMap;
		import java.util.List;
		import java.util.Map;

		import io.vertx.ext.web.handler.AuthHandler;
		import io.vertx.core.Handler;
		import io.vertx.ext.web.Router;
		import io.vertx.ext.web.RoutingContext;

		public class «simpleClassName» {
			private final static «simpleClassName» instance = new «simpleClassName»();
			public final static String PROPERTY_METHOD = "method";
			public final static String PROPERTY_PATH = "path";
			public final static String PROPERTY_HANDLER = "handler";
			public final static String PROPERTY_PERMISSION = "permission";
			public final static String PROPERTY_ROLE = "role";

			private List<Map<String, Object>> _routes;
			
			// private constructor
			private «simpleClassName»() {
				// lets use a LinkedHashMap to preserve insertion order
				_routes = new ArrayList<>();
				Map<String, Object> route;
				«FOR route: model.routes »
					«addRoute(route)»
				«ENDFOR»
				// make the list read-only
				_routes = Collections.unmodifiableList(_routes);
			}
			
			@SuppressWarnings("unchecked")
			public «simpleClassName» registerHandlers(Router router) {
				Objects.requireNonNull(router);
		
				for (Map<String, Object> route: _routes) {
					router.get((String) route.get(PROPERTY_PATH)).handler((Handler<RoutingContext>) route.get(PROPERTY_HANDLER));
				}
				return this;
			}

			public final «simpleClassName» registerAuthorisationHandlers(Router router, Function<String, AuthHandler> authHandlerCreator) {
				Objects.requireNonNull(router);
				Objects.requireNonNull(authHandlerCreator);
				
				for (Map<String, Object> route: _routes) {
					String permission = (String) route.get(PROPERTY_PERMISSION);
					if (permission!=null) {
						router.get((String) route.get(PROPERTY_PATH)).handler(authHandlerCreator.apply(permission)); 
					}
					String role = (String) route.get(PROPERTY_ROLE);
					if (role!=null) {
						router.get((String) route.get(PROPERTY_PATH)).handler(authHandlerCreator.apply("role:" + role)); 
					}
				}
				return this;
			}
			
			public List<Map<String, Object>> routes() {
				return _routes;
			}
			
			public final static «simpleClassName» instance() {
				return instance;
			}
			
		}
		'''
	}

	def private addRoute(Route route) {
		'''
			// «route.verb» 		«route.trimPath»
			route = new LinkedHashMap<>();
			route.put(PROPERTY_METHOD, "«route.verb»");
			route.put(PROPERTY_PATH, "«route.trimPath»");
			route.put(PROPERTY_HANDLER, routes.«RoutingHelper.getClassName(route.handler)».«route.actionHandlerMethodName»());
			«IF route.permission!=null»
				route.put(PROPERTY_PERMISSION, "«route.permission.value»");
			«ENDIF»
			«IF route.role!=null»
				route.put(PROPERTY_ROLE, "«route.role.value»");
			«ENDIF»
			_routes.add(route);
			
		'''
	}
		
}
