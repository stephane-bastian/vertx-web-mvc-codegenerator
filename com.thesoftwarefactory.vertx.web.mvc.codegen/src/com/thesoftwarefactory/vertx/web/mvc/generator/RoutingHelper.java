package com.thesoftwarefactory.vertx.web.mvc.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder;

import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Parameter;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler;

public class RoutingHelper {

	private final static Map<String, String> primitiveToBoxedTypes;
	static {
		primitiveToBoxedTypes  = new HashMap<>();
		primitiveToBoxedTypes.put("boolean", "Boolean");
		primitiveToBoxedTypes.put("byte", "Byte");
		primitiveToBoxedTypes.put("char", "Character");
		primitiveToBoxedTypes.put("double", "Double");
		primitiveToBoxedTypes.put("float", "Float");
		primitiveToBoxedTypes.put("int", "Integer");
		primitiveToBoxedTypes.put("long", "Long");
		primitiveToBoxedTypes.put("short", "Short");
	}
	
	public static String ensureBoxedType(String type) {
		String result = primitiveToBoxedTypes.get(type);
		return result==null ? type : result;
	}
	
	public static String getActionName(Route route) {
		return toFirstUpper(getMethodName(route.getHandler())) + "Action";
	}

	public static String getBinderName(ParameterExt param) {
		return param.getName() + "Binder";
	}

	public static String getBindingInfoName(ParameterExt param) {
		return param.getName() + "BindingInfo";
	}
		
	public static String getClassName(RouteHandler routeHandler) {
		return routeHandler.getName().substring(0, routeHandler.getName().lastIndexOf('.'));
	}

	public static List<ParameterExt> getConstructorParameters(JvmTypeReference typeRef) {
		for (JvmConstructor constructor: getConstructors(typeRef)) {
			return getParametersExt(constructor, new ArrayList<>());
		}
		return new ArrayList<>();
	}
	
	public static List<JvmConstructor> getConstructors(JvmTypeReference typeRef) {
		List<JvmConstructor> result = new ArrayList<>();
		JvmType jvmType = typeRef.getType();
		if (jvmType!=null && jvmType instanceof JvmDeclaredType) {
			JvmDeclaredType jvmDeclaredType = (JvmDeclaredType) jvmType;
			for (JvmMember member : jvmDeclaredType.getMembers()) {
				if (member instanceof JvmConstructor) {
					JvmConstructor constructor = (JvmConstructor) member;
					if (constructor.getVisibility()==JvmVisibility.PUBLIC) {
						result.add(constructor);
					}
				}
			}
		}
		// sort constructors - smaller number of parameters first
		result.sort((method1, method2) -> Integer.compare(method1.getTypeParameters().size(), method2.getTypeParameters().size()));
		return result;
	}
	
	public static String getLastSegment(String fqClassname) {
		String result = null;
		if (fqClassname!=null) {
			int lio = fqClassname.lastIndexOf('.');
			if (lio>0) {
				result = fqClassname.substring(lio+1);
			}
		}
		return result;
	}

	public static JvmOperation getMethod(JvmTypeReference typeRef, String methodName, int minParamCount) {
		if (typeRef!=null  && methodName!=null && minParamCount>=0) {
			JvmType jvmType = typeRef.getType();
			if (jvmType!=null && jvmType instanceof JvmDeclaredType) {
				JvmDeclaredType jvmDeclaredType = (JvmDeclaredType) jvmType;
				for (JvmMember member : jvmDeclaredType.getMembers()) {
					if (member instanceof JvmOperation) {
						JvmOperation jvmOperation = (JvmOperation) member;
						if (methodName.equals(jvmOperation.getSimpleName())) {
						// got a matching method name
						// lets see if the number of parameters matches
							if (jvmOperation.getParameters()!=null && jvmOperation.getParameters().size()>=minParamCount) {
							// we've got a match, get out
								return jvmOperation;
							}
						}
					}
					else if (member instanceof JvmConstructor) {
						
					}
				}
			}
		}
		return null;
	}

	public static String getMethodName(RouteHandler routeHandler) {
		return routeHandler.getName().substring(routeHandler.getName().lastIndexOf('.')+1);
	}

	public static List<ParameterExt> getMethodParameters(RouteHandler routeHandler, JvmTypeReference routeHandlerType) {
		List<Parameter> routeParameters = routeHandler.getParameters();
		String methodName = getMethodName(routeHandler);
		List<JvmOperation> methods = getMethods(routeHandlerType, methodName);
		for (JvmOperation method: methods) {
			if (routeHandler.getParameters().size() <= method.getParameters().size()) {
				return getParametersExt(method, routeParameters);
			}
		}
		return new ArrayList<ParameterExt>();
	}

	public static List<JvmOperation> getMethods(JvmTypeReference typeRef, String methodName) {
		List<JvmOperation> result = new ArrayList<>();
		if (typeRef!=null) {
			JvmType jvmType = typeRef.getType();
			if (jvmType!=null && jvmType instanceof JvmDeclaredType) {
				JvmDeclaredType jvmDeclaredType = (JvmDeclaredType) jvmType;
				for (JvmMember member : jvmDeclaredType.getMembers()) {
					if (member instanceof JvmOperation) {
						JvmOperation jvmOperation = (JvmOperation) member;
						if (methodName.equals(jvmOperation.getSimpleName())) {
						// got a matching method name
						// lets see if the number of parameters matches
							if (jvmOperation.getVisibility()==JvmVisibility.PUBLIC) {
								result.add(jvmOperation);
							}
						}
					}
				}
			}
		}
		// sort methods - smaller number of parameters first
		result.sort((method1, method2) -> Integer.compare(method1.getTypeParameters().size(), method2.getTypeParameters().size()));
		return result;
	}

	public static List<ParameterExt> getParametersExt(JvmExecutable jvmExecutable, List<Parameter> routeParameters) {
		List<ParameterExt> result = new ArrayList<ParameterExt>();
		if (routeParameters!=null && jvmExecutable.getParameters()!=null && jvmExecutable.getParameters().size()>=routeParameters.size()) {
			for (int i=0; i<jvmExecutable.getParameters().size(); i++) {
				JvmFormalParameter jvmFormalParameter = jvmExecutable.getParameters().get(i);
				String parameterName = jvmFormalParameter.getName();
				String parameterType = jvmFormalParameter.getParameterType().getQualifiedName();
				boolean isParameterDefinedInRoute = false;
				ParameterDefaultValue parameterDefaultValue = null;

				if (routeParameters.size()>i) {
					Parameter routeParameter = routeParameters.get(i);
					parameterName = routeParameter.getName();
					parameterDefaultValue = routeParameter.getDefaultValue();
					isParameterDefinedInRoute = true;
				}
				
				ParameterExtImpl parameterExt = new ParameterExtImpl(parameterName, parameterType);
				parameterExt.setDefinedInRouteFile(isParameterDefinedInRoute);
				if (parameterDefaultValue!=null) {
					parameterExt.setDefaultValue(parameterDefaultValue);
				}
				result.add(parameterExt);
			}
		
		}
		else {
		// ERROR add a parameter containing the error in the generated code
			ParameterExt parameterExt = new ParameterExtImpl("error", "java.lang.Object");
			result.add(parameterExt);
		}
		return result;
	}
	
	public static String getTrimPath(Route route) {
		return route.getPath().getValue().trim();
	}
	
	public static String getReverseUrlClassName(Route route) {
		return route.getHandler().getName() + "Url";
	}
	
	public static List<JvmFormalParameter> getRouteHandlerMethodParameters(JvmTypeReference typeRef, String methodName, int paramCount) {
		List<JvmFormalParameter> result = new ArrayList<JvmFormalParameter>();
		JvmOperation method = getMethod(typeRef, methodName, paramCount);
		if (method!=null) {
			result = method.getParameters();
		}
		return result;
	}
	
	public final static JvmTypeReference getRouteHandlerType(RouteHandler routeHandler, JvmTypeReferenceBuilder jvmTypeReferenceBuilder) {
		String routeHandlerClassname = getClassName(routeHandler);
		try {
			return jvmTypeReferenceBuilder.typeRef(routeHandlerClassname, new JvmTypeReference[0]);
		}
		catch (Throwable t) {
			return null;
		}
	}

	public static String getUpToLastSegment(String fqClassname) {
		String result = null;
		if (fqClassname!=null) {
			int lio = fqClassname.lastIndexOf('.');
			if (lio>0) {
				result = fqClassname.substring(0, lio);
			}
		}
		return result;
	}

	public static String getUriBuilderClassName(Route route) {
		return toFirstUpper(RoutingHelper.getMethodName(route.getHandler())) + "UriBuilder";
	}

	public static boolean isGeneric(ParameterExt routeParameter) {
		return routeParameter.getQualifiedType().contains("<");
	}

	public static boolean isOptional(Parameter parameter) {
		return parameter.getDefaultValue()!=null;
	}
	
	public static boolean isOptional(ParameterExt parameter) {
		return parameter.getDefaultValue()!=null;
	}

	public static boolean isPrimitive(String type) {
		return primitiveToBoxedTypes.containsKey(type);
	}

	public final static String toFirstUpper(String value) {
		return Character.toUpperCase(value.charAt(0)) + value.substring(1);
	}
	
	public static String toJavaFilename(String className) {
		String result = className.replaceAll("\\.", "/");
		return result + ".java";
	}

}	
