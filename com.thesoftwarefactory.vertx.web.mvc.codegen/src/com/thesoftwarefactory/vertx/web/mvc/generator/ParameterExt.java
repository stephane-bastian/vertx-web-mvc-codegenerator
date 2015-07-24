package com.thesoftwarefactory.vertx.web.mvc.generator;

import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue;

public interface ParameterExt {

	public String getName();

	public ParameterDefaultValue getDefaultValue();

	public String getQualifiedType();

	public boolean isPrimitive();
	
	public boolean isDefinedInRouteFile();

}
