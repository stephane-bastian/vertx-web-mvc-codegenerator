package com.thesoftwarefactory.vertx.web.mvc.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;

import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route;

public class RouteMethodHandler {

	enum RouteType {
		ACTION_RESULT,
		FUTURE,
		COMPLETABLE_FUTURE,
		UKNOWN
	}

	private List<ParameterExt> methodParameters;
	private List<ParameterExt> routeParameters;
	private List<String> pathParameterNames;
	private List<ParameterExt> optionalRouteParameters;
	private List<ParameterExt> constructorParameters;
	private List<ParameterExt> requiredRouteParameters;
	private RouteType type;
	private Route route;
	private JvmTypeReference routeHandlerTypeReference;
	private JvmOperation method;
	
	public List<ParameterExt> getConstructorParameters() {
		if (constructorParameters==null) {
			constructorParameters = RoutingHelper.getConstructorParameters(routeHandlerTypeReference);
		}
		return constructorParameters;
	}

	public RouteMethodHandler(Route route, JvmTypeReference routeHandlerTypeReference) {
		Objects.requireNonNull(route);
		Objects.requireNonNull(routeHandlerTypeReference);
		
		this.route = route;
		this.routeHandlerTypeReference = routeHandlerTypeReference;
		this.method = RoutingHelper.getMethod(route.getHandler(), routeHandlerTypeReference);
	}

	public List<ParameterExt> getMethodParameters() {
		if (methodParameters==null) {
			methodParameters = RoutingHelper.getParametersExt(method, route.getHandler().getParameters());
		}
		return methodParameters;
	}
	
	public List<String> getPathParameterNames() {
		if (pathParameterNames==null) {
			pathParameterNames = new ArrayList<>();
			for (String pathSegment: route.getPath().getValue().split("/")) {
				if (pathSegment.startsWith(":")) {
					String parameterName = pathSegment.substring(1).trim();
					pathParameterNames.add(parameterName);
				}
			}
		}
		return pathParameterNames;
	}
	
	public List<ParameterExt> getRouteParameters() {
		if (routeParameters==null) {
			routeParameters = getMethodParameters().stream().filter(parameter -> parameter.isDefinedInRouteFile()).collect(Collectors.toList());
		}
		return routeParameters;
	}

	public List<ParameterExt> getOptionalRouteParameters() {
		if (optionalRouteParameters==null) {
			optionalRouteParameters = getRouteParameters().stream().filter(parameter -> RoutingHelper.isOptional(parameter)).collect(Collectors.toList());
		}
		return optionalRouteParameters;
	}

	public List<ParameterExt> getRequiredRouteParameters() {
		if (requiredRouteParameters==null) {
			requiredRouteParameters = getRouteParameters().stream().filter(parameter -> !RoutingHelper.isOptional(parameter)).collect(Collectors.toList());
		}
		return requiredRouteParameters;
	}

	private String getGenericReturnType() {
		return method.getReturnType().getQualifiedName('.');
	}
	
	public RouteType getType() {
		if (type==null) {
			if ("io.vertx.core.Future<com.thesoftwarefactory.vertx.web.mvc.ActionResult>".equals(getGenericReturnType())) {
				type = RouteType.FUTURE;
			}
			else if ("java.util.concurrent.CompletableFuture<com.thesoftwarefactory.vertx.web.mvc.ActionResult>".equals(getGenericReturnType())) {
				type = RouteType.COMPLETABLE_FUTURE;
			}
			else if ("com.thesoftwarefactory.vertx.web.mvc.ActionResult".equals(getGenericReturnType())) {
				type = RouteType.ACTION_RESULT;
			}
			else {
				type = RouteType.UKNOWN;
			}
		}
		return type;
	}

	

}
