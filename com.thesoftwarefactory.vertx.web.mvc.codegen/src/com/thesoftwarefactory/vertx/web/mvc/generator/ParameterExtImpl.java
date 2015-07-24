package com.thesoftwarefactory.vertx.web.mvc.generator;

import java.util.Objects;

import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue;

public class ParameterExtImpl implements ParameterExt {

	private String name;
	private boolean definedInRouteFile = false;
	private String qualifiedType;
	private ParameterDefaultValue defaultValue;
	
	public ParameterExtImpl(String name, String qualifiedType) {
		Objects.requireNonNull(name);
		Objects.requireNonNull(qualifiedType);
		
		this.name = name;
		this.qualifiedType = qualifiedType;
	}

	public ParameterDefaultValue getDefaultValue() {
		return defaultValue;
	}

	public String getName() {
		return name;
	}
	
	public String getQualifiedType() {
		return qualifiedType;
	}


	public String getVariableType() {
		String result = getQualifiedType();
		if (result==null) {
			result = "Object /* compilation error */";
		}
		else {
			if (result.startsWith("java.lang.")) {
				result = result.substring(10);
			}
		}
		return result;
	}
	
	public boolean isDefinedInRouteFile() {
		return definedInRouteFile;
	}

	public boolean isPrimitive() {
		return RoutingHelper.isPrimitive(getQualifiedType());
	}

	public void setDefaultValue(ParameterDefaultValue defaultValue) {
		this.defaultValue = defaultValue;
	}

	public void setDefinedInRouteFile(boolean definedInRouteFile) {
		this.definedInRouteFile = definedInRouteFile;
	}

}
