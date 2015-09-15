package com.thesoftwarefactory.vertx.web.mvc.generator;

import com.google.common.base.Objects;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Model;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler;
import com.thesoftwarefactory.vertx.web.mvc.generator.ParameterExt;
import com.thesoftwarefactory.vertx.web.mvc.generator.RouteMethodHandler;
import com.thesoftwarefactory.vertx.web.mvc.generator.RoutingHelper;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GenerateRoutes {
  public void generate(final JvmTypeReferenceBuilder typeReferenceBuilder, final String routeHandlerClassname, final Collection<Route> routes, final IFileSystemAccess fsa) {
    final String routeClassName = ("routes." + routeHandlerClassname);
    final String filename = RoutingHelper.toJavaFilename(routeClassName);
    CharSequence _javaCode = this.toJavaCode(typeReferenceBuilder, routes, routeClassName);
    fsa.generateFile(filename, _javaCode);
  }
  
  public void generate(final JvmTypeReferenceBuilder typeReferenceBuilder, final Model model, final IFileSystemAccess fsa) {
    EList<Route> _routes = model.getRoutes();
    final Function1<Route, String> _function = (Route it) -> {
      RouteHandler _handler = it.getHandler();
      return RoutingHelper.getClassName(_handler);
    };
    final Map<String, List<Route>> groupedRoutes = IterableExtensions.<String, Route>groupBy(_routes, _function);
    final BiConsumer<String, List<Route>> _function_1 = (String k, List<Route> v) -> {
      this.generate(typeReferenceBuilder, k, v, fsa);
    };
    groupedRoutes.forEach(_function_1);
  }
  
  private CharSequence toJavaCode(final JvmTypeReferenceBuilder typeReferenceBuilder, final Collection<Route> routes, final String className) {
    CharSequence _xblockexpression = null;
    {
      final String packageName = RoutingHelper.getUpToLastSegment(className);
      final String simpleClassName = RoutingHelper.getLastSegment(className);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      _builder.append(packageName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import com.thesoftwarefactory.reflection.type.TypeToken;");
      _builder.newLine();
      _builder.append("import com.thesoftwarefactory.vertx.web.bind.UriBuilder;");
      _builder.newLine();
      _builder.append("import com.thesoftwarefactory.vertx.web.bind.Binder;");
      _builder.newLine();
      _builder.append("import com.thesoftwarefactory.vertx.web.bind.Binders;");
      _builder.newLine();
      _builder.append("import com.thesoftwarefactory.vertx.web.bind.BindingInfo;");
      _builder.newLine();
      _builder.append("import com.thesoftwarefactory.vertx.web.bind.BindingInfo.DefaultValueType;");
      _builder.newLine();
      _builder.append("import com.thesoftwarefactory.vertx.web.bind.impl.BindingInfoImpl;");
      _builder.newLine();
      _builder.append("import com.thesoftwarefactory.vertx.web.mvc.ActionResult;");
      _builder.newLine();
      _builder.append("import com.thesoftwarefactory.vertx.web.mvc.MvcService;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import java.util.Objects;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import io.vertx.core.Future;");
      _builder.newLine();
      _builder.append("import io.vertx.core.Handler;");
      _builder.newLine();
      _builder.append("import io.vertx.ext.web.RoutingContext;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class ");
      _builder.append(simpleClassName, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      {
        for(final Route route : routes) {
          _builder.append("\t");
          final RouteMethodHandler methodHandler = RoutingHelper.getMethodHandler(route, typeReferenceBuilder);
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public static class ");
          String _actionHandlerClassName = RoutingHelper.getActionHandlerClassName(route);
          _builder.append(_actionHandlerClassName, "\t");
          _builder.append(" implements Handler<RoutingContext> {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("// constructor bindings");
          _builder.newLine();
          {
            List<ParameterExt> _constructorParameters = methodHandler.getConstructorParameters();
            for(final ParameterExt constructorParameter : _constructorParameters) {
              {
                boolean _isGeneric = RoutingHelper.isGeneric(constructorParameter);
                if (_isGeneric) {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("private final static Binder<");
                  String _qualifiedType = constructorParameter.getQualifiedType();
                  String _ensureBoxedType = RoutingHelper.ensureBoxedType(_qualifiedType);
                  _builder.append(_ensureBoxedType, "\t\t");
                  _builder.append("> ");
                  String _binderName = RoutingHelper.getBinderName(constructorParameter);
                  _builder.append(_binderName, "\t\t");
                  _builder.append(" = Binders.instance.getBinderByType(new TypeToken<");
                  String _qualifiedType_1 = constructorParameter.getQualifiedType();
                  _builder.append(_qualifiedType_1, "\t\t");
                  _builder.append(">() {}.type());");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("private final static Binder<");
                  String _qualifiedType_2 = constructorParameter.getQualifiedType();
                  String _ensureBoxedType_1 = RoutingHelper.ensureBoxedType(_qualifiedType_2);
                  _builder.append(_ensureBoxedType_1, "\t\t");
                  _builder.append("> ");
                  String _binderName_1 = RoutingHelper.getBinderName(constructorParameter);
                  _builder.append(_binderName_1, "\t\t");
                  _builder.append(" = Binders.instance.getBinderByType(");
                  String _qualifiedType_3 = constructorParameter.getQualifiedType();
                  _builder.append(_qualifiedType_3, "\t\t");
                  _builder.append(".class);");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            List<ParameterExt> _constructorParameters_1 = methodHandler.getConstructorParameters();
            for(final ParameterExt constructorParameter_1 : _constructorParameters_1) {
              _builder.append("\t");
              _builder.append("\t");
              String _generateBindingInfo = this.generateBindingInfo(constructorParameter_1);
              _builder.append(_generateBindingInfo, "\t\t");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("// action bindings");
          _builder.newLine();
          {
            List<ParameterExt> _methodParameters = methodHandler.getMethodParameters();
            for(final ParameterExt routeParameter : _methodParameters) {
              {
                boolean _isGeneric_1 = RoutingHelper.isGeneric(routeParameter);
                if (_isGeneric_1) {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("private final static Binder<");
                  String _qualifiedType_4 = routeParameter.getQualifiedType();
                  String _ensureBoxedType_2 = RoutingHelper.ensureBoxedType(_qualifiedType_4);
                  _builder.append(_ensureBoxedType_2, "\t\t");
                  _builder.append("> ");
                  String _binderName_2 = RoutingHelper.getBinderName(routeParameter);
                  _builder.append(_binderName_2, "\t\t");
                  _builder.append(" = Binders.instance.getBinderByType(new TypeToken<");
                  String _qualifiedType_5 = routeParameter.getQualifiedType();
                  _builder.append(_qualifiedType_5, "\t\t");
                  _builder.append(">() {}.type());");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("private final static Binder<");
                  String _qualifiedType_6 = routeParameter.getQualifiedType();
                  String _ensureBoxedType_3 = RoutingHelper.ensureBoxedType(_qualifiedType_6);
                  _builder.append(_ensureBoxedType_3, "\t\t");
                  _builder.append("> ");
                  String _binderName_3 = RoutingHelper.getBinderName(routeParameter);
                  _builder.append(_binderName_3, "\t\t");
                  _builder.append(" = Binders.instance.getBinderByType(");
                  String _qualifiedType_7 = routeParameter.getQualifiedType();
                  _builder.append(_qualifiedType_7, "\t\t");
                  _builder.append(".class);");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            List<ParameterExt> _methodParameters_1 = methodHandler.getMethodParameters();
            for(final ParameterExt routeParameter_1 : _methodParameters_1) {
              _builder.append("\t");
              _builder.append("\t");
              String _generateBindingInfo_1 = this.generateBindingInfo(routeParameter_1);
              _builder.append(_generateBindingInfo_1, "\t\t");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("// cache the controller so it\'s instantiated only once");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("private ");
          RouteHandler _handler = route.getHandler();
          String _className = RoutingHelper.getClassName(_handler);
          _builder.append(_className, "\t\t");
          _builder.append(" controller;");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("private ");
          RouteHandler _handler_1 = route.getHandler();
          String _className_1 = RoutingHelper.getClassName(_handler_1);
          _builder.append(_className_1, "\t\t");
          _builder.append(" instantiateController(RoutingContext context) {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("return new ");
          RouteHandler _handler_2 = route.getHandler();
          String _className_2 = RoutingHelper.getClassName(_handler_2);
          _builder.append(_className_2, "\t\t\t");
          _builder.append("(");
          _builder.newLineIfNotEmpty();
          {
            List<ParameterExt> _constructorParameters_2 = methodHandler.getConstructorParameters();
            boolean _hasElements = false;
            for(final ParameterExt constructorParameter_2 : _constructorParameters_2) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder.appendImmediate(", ", "\t\t\t\t\t\t");
              }
              _builder.append("\t");
              _builder.append("\t\t\t\t\t");
              String _binderName_4 = RoutingHelper.getBinderName(constructorParameter_2);
              _builder.append(_binderName_4, "\t\t\t\t\t\t");
              _builder.append(".bindFromContext(");
              String _bindingInfoName = RoutingHelper.getBindingInfoName(constructorParameter_2);
              _builder.append(_bindingInfoName, "\t\t\t\t\t\t");
              _builder.append(", context)");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("\t\t\t\t");
          _builder.append(");");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("private ");
          RouteHandler _handler_3 = route.getHandler();
          String _className_3 = RoutingHelper.getClassName(_handler_3);
          _builder.append(_className_3, "\t\t");
          _builder.append(" getController(RoutingContext context) {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("if (controller==null) {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t\t");
          _builder.append("controller = instantiateController(context);");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("return controller;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("public void handle(RoutingContext context) {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("try {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t\t");
          _builder.append("MvcService.get(context).handle(");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t\t\t\t");
          String _generateController = this.generateController(route, methodHandler);
          _builder.append(_generateController, "\t\t\t\t\t\t");
          _builder.append(", context);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("catch (Throwable t) {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t\t");
          _builder.append("throw new RuntimeException(t);");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public final static ");
          String _actionHandlerClassName_1 = RoutingHelper.getActionHandlerClassName(route);
          _builder.append(_actionHandlerClassName_1, "\t");
          _builder.append(" ");
          String _actionHandlerMethodName = RoutingHelper.getActionHandlerMethodName(route);
          _builder.append(_actionHandlerMethodName, "\t");
          _builder.append("() {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return new ");
          String _actionHandlerClassName_2 = RoutingHelper.getActionHandlerClassName(route);
          _builder.append(_actionHandlerClassName_2, "\t\t");
          _builder.append("();");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      {
        for(final Route route_1 : routes) {
          _builder.append("\t");
          final RouteMethodHandler methodHandler_1 = RoutingHelper.getMethodHandler(route_1, typeReferenceBuilder);
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public static class ");
          RouteHandler _handler_4 = route_1.getHandler();
          String _methodName = RoutingHelper.getMethodName(_handler_4);
          String _firstUpper = RoutingHelper.toFirstUpper(_methodName);
          _builder.append(_firstUpper, "\t");
          _builder.append("UriBuilder {");
          _builder.newLineIfNotEmpty();
          {
            List<ParameterExt> _routeParameters = methodHandler_1.getRouteParameters();
            for(final ParameterExt routeParameter_2 : _routeParameters) {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("private ");
              String _qualifiedType_8 = routeParameter_2.getQualifiedType();
              _builder.append(_qualifiedType_8, "\t\t");
              _builder.append(" ");
              String _name = routeParameter_2.getName();
              _builder.append(_name, "\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("public ");
          String _uriBuilderClassName = RoutingHelper.getUriBuilderClassName(route_1);
          _builder.append(_uriBuilderClassName, "\t\t");
          _builder.append("(");
          {
            List<ParameterExt> _requiredRouteParameters = methodHandler_1.getRequiredRouteParameters();
            boolean _hasElements_1 = false;
            for(final ParameterExt routeParameter_3 : _requiredRouteParameters) {
              if (!_hasElements_1) {
                _hasElements_1 = true;
              } else {
                _builder.appendImmediate(", ", "\t\t");
              }
              String _qualifiedType_9 = routeParameter_3.getQualifiedType();
              _builder.append(_qualifiedType_9, "\t\t");
              _builder.append(" ");
              String _name_1 = routeParameter_3.getName();
              _builder.append(_name_1, "\t\t");
            }
          }
          _builder.append(") {");
          _builder.newLineIfNotEmpty();
          {
            List<ParameterExt> _requiredRouteParameters_1 = methodHandler_1.getRequiredRouteParameters();
            for(final ParameterExt routeParameter_4 : _requiredRouteParameters_1) {
              _builder.append("\t");
              _builder.append("\t\t");
              _builder.append("Objects.requireNonNull(");
              String _name_2 = routeParameter_4.getName();
              _builder.append(_name_2, "\t\t\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.newLine();
          {
            List<ParameterExt> _requiredRouteParameters_2 = methodHandler_1.getRequiredRouteParameters();
            for(final ParameterExt routeParameter_5 : _requiredRouteParameters_2) {
              _builder.append("\t");
              _builder.append("\t\t");
              _builder.append("this.");
              String _name_3 = routeParameter_5.getName();
              _builder.append(_name_3, "\t\t\t");
              _builder.append(" = ");
              String _name_4 = routeParameter_5.getName();
              _builder.append(_name_4, "\t\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("public String build() {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("UriBuilder result = new UriBuilder().setPath(path());");
          _builder.newLine();
          {
            List<ParameterExt> _routeParameters_1 = methodHandler_1.getRouteParameters();
            for(final ParameterExt routeParameter_6 : _routeParameters_1) {
              {
                boolean _isPrimitive = routeParameter_6.isPrimitive();
                boolean _not = (!_isPrimitive);
                if (_not) {
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("if (");
                  String _name_5 = routeParameter_6.getName();
                  _builder.append(_name_5, "\t\t\t");
                  _builder.append("!=null) {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("\t");
                  String _actionHandlerClassName_3 = RoutingHelper.getActionHandlerClassName(route_1);
                  _builder.append(_actionHandlerClassName_3, "\t\t\t\t");
                  _builder.append(".");
                  String _binderName_5 = RoutingHelper.getBinderName(routeParameter_6);
                  _builder.append(_binderName_5, "\t\t\t\t");
                  _builder.append(".bindToUrl(");
                  String _actionHandlerClassName_4 = RoutingHelper.getActionHandlerClassName(route_1);
                  _builder.append(_actionHandlerClassName_4, "\t\t\t\t");
                  _builder.append(".");
                  String _bindingInfoName_1 = RoutingHelper.getBindingInfoName(routeParameter_6);
                  _builder.append(_bindingInfoName_1, "\t\t\t\t");
                  _builder.append(", ");
                  String _name_6 = routeParameter_6.getName();
                  _builder.append(_name_6, "\t\t\t\t");
                  _builder.append(", result);");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("}");
                  _builder.newLine();
                }
              }
            }
          }
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("return result.toString();");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("private String path() {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("return \"");
          String _trimPath = RoutingHelper.getTrimPath(route_1);
          _builder.append(_trimPath, "\t\t\t");
          _builder.append("\"");
          {
            List<ParameterExt> _routeParameters_2 = methodHandler_1.getRouteParameters();
            for(final ParameterExt routeParameter_7 : _routeParameters_2) {
              {
                String _trimPath_1 = RoutingHelper.getTrimPath(route_1);
                String _name_7 = routeParameter_7.getName();
                String _plus = ("/:" + _name_7);
                boolean _contains = _trimPath_1.contains(_plus);
                if (_contains) {
                  _builder.append(".replace");
                  _builder.append("(\"/:");
                  String _name_8 = routeParameter_7.getName();
                  _builder.append(_name_8, "\t\t\t");
                  _builder.append("\", \"/\" + ");
                  String _name_9 = routeParameter_7.getName();
                  _builder.append(_name_9, "\t\t\t");
                  _builder.append(".toString())");
                }
              }
            }
          }
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.newLine();
          {
            List<ParameterExt> _optionalRouteParameters = methodHandler_1.getOptionalRouteParameters();
            for(final ParameterExt routeParameter_8 : _optionalRouteParameters) {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("public ");
              String _uriBuilderClassName_1 = RoutingHelper.getUriBuilderClassName(route_1);
              _builder.append(_uriBuilderClassName_1, "\t\t");
              _builder.append(" set");
              String _name_10 = routeParameter_8.getName();
              String _firstUpper_1 = RoutingHelper.toFirstUpper(_name_10);
              _builder.append(_firstUpper_1, "\t\t");
              _builder.append("(");
              String _qualifiedType_10 = routeParameter_8.getQualifiedType();
              _builder.append(_qualifiedType_10, "\t\t");
              _builder.append(" ");
              String _name_11 = routeParameter_8.getName();
              _builder.append(_name_11, "\t\t");
              _builder.append(") {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("Objects.requireNonNull(");
              String _name_12 = routeParameter_8.getName();
              _builder.append(_name_12, "\t\t\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
              _builder.newLine();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("this.");
              String _name_13 = routeParameter_8.getName();
              _builder.append(_name_13, "\t\t\t");
              _builder.append(" = ");
              String _name_14 = routeParameter_8.getName();
              _builder.append(_name_14, "\t\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("return this;");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("}");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("\t");
              _builder.newLine();
            }
          }
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.newLine();
      {
        for(final Route route_2 : routes) {
          _builder.append("\t");
          final RouteMethodHandler methodHandler_2 = RoutingHelper.getMethodHandler(route_2, typeReferenceBuilder);
          _builder.newLineIfNotEmpty();
          {
            List<ParameterExt> _optionalRouteParameters_1 = methodHandler_2.getOptionalRouteParameters();
            int _size = _optionalRouteParameters_1.size();
            boolean _greaterThan = (_size > 0);
            if (_greaterThan) {
              _builder.append("\t");
              _builder.append("public final static ");
              String _uriBuilderClassName_2 = RoutingHelper.getUriBuilderClassName(route_2);
              _builder.append(_uriBuilderClassName_2, "\t");
              _builder.append(" ");
              RouteHandler _handler_5 = route_2.getHandler();
              String _methodName_1 = RoutingHelper.getMethodName(_handler_5);
              _builder.append(_methodName_1, "\t");
              _builder.append("Url(");
              {
                List<ParameterExt> _requiredRouteParameters_3 = methodHandler_2.getRequiredRouteParameters();
                boolean _hasElements_2 = false;
                for(final ParameterExt routeParameter_9 : _requiredRouteParameters_3) {
                  if (!_hasElements_2) {
                    _hasElements_2 = true;
                  } else {
                    _builder.appendImmediate(", ", "\t");
                  }
                  String _qualifiedType_11 = routeParameter_9.getQualifiedType();
                  _builder.append(_qualifiedType_11, "\t");
                  _builder.append(" ");
                  String _name_15 = routeParameter_9.getName();
                  _builder.append(_name_15, "\t");
                }
              }
              _builder.append(") {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("return new ");
              String _uriBuilderClassName_3 = RoutingHelper.getUriBuilderClassName(route_2);
              _builder.append(_uriBuilderClassName_3, "\t\t");
              _builder.append("(");
              {
                List<ParameterExt> _requiredRouteParameters_4 = methodHandler_2.getRequiredRouteParameters();
                boolean _hasElements_3 = false;
                for(final ParameterExt routeParameter_10 : _requiredRouteParameters_4) {
                  if (!_hasElements_3) {
                    _hasElements_3 = true;
                  } else {
                    _builder.appendImmediate(", ", "\t\t");
                  }
                  String _name_16 = routeParameter_10.getName();
                  _builder.append(_name_16, "\t\t");
                }
              }
              _builder.append(");");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("}");
              _builder.newLine();
            } else {
              _builder.append("\t");
              _builder.append("public final static String ");
              RouteHandler _handler_6 = route_2.getHandler();
              String _methodName_2 = RoutingHelper.getMethodName(_handler_6);
              _builder.append(_methodName_2, "\t");
              _builder.append("Url(");
              {
                List<ParameterExt> _requiredRouteParameters_5 = methodHandler_2.getRequiredRouteParameters();
                boolean _hasElements_4 = false;
                for(final ParameterExt routeParameter_11 : _requiredRouteParameters_5) {
                  if (!_hasElements_4) {
                    _hasElements_4 = true;
                  } else {
                    _builder.appendImmediate(", ", "\t");
                  }
                  String _qualifiedType_12 = routeParameter_11.getQualifiedType();
                  _builder.append(_qualifiedType_12, "\t");
                  _builder.append(" ");
                  String _name_17 = routeParameter_11.getName();
                  _builder.append(_name_17, "\t");
                }
              }
              _builder.append(") {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("return new ");
              String _uriBuilderClassName_4 = RoutingHelper.getUriBuilderClassName(route_2);
              _builder.append(_uriBuilderClassName_4, "\t\t");
              _builder.append("(");
              {
                List<ParameterExt> _requiredRouteParameters_6 = methodHandler_2.getRequiredRouteParameters();
                boolean _hasElements_5 = false;
                for(final ParameterExt routeParameter_12 : _requiredRouteParameters_6) {
                  if (!_hasElements_5) {
                    _hasElements_5 = true;
                  } else {
                    _builder.appendImmediate(", ", "\t\t");
                  }
                  String _name_18 = routeParameter_12.getName();
                  _builder.append(_name_18, "\t\t");
                }
              }
              _builder.append(").build();");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("}");
              _builder.newLine();
            }
          }
          _builder.append("\t");
          _builder.newLine();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private String generateController(final Route route, final RouteMethodHandler routeMethodHandler) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("getController(context)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".");
    RouteHandler _handler = route.getHandler();
    String _methodName = RoutingHelper.getMethodName(_handler);
    _builder.append(_methodName, "\t");
    _builder.append("(");
    _builder.newLineIfNotEmpty();
    {
      List<ParameterExt> _methodParameters = routeMethodHandler.getMethodParameters();
      boolean _hasElements = false;
      for(final ParameterExt routeParameter : _methodParameters) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "\t\t");
        }
        _builder.append("\t\t");
        String _binderName = RoutingHelper.getBinderName(routeParameter);
        _builder.append(_binderName, "\t\t");
        _builder.append(".bindFromContext(");
        String _bindingInfoName = RoutingHelper.getBindingInfoName(routeParameter);
        _builder.append(_bindingInfoName, "\t\t");
        _builder.append(", context)");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append(")");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String generateBindingInfo(final ParameterExt routeParameter) {
    String _bindingInfoName = RoutingHelper.getBindingInfoName(routeParameter);
    String _plus = ("private final static BindingInfo " + _bindingInfoName);
    String _plus_1 = (_plus + " = new BindingInfoImpl(\"");
    String _name = routeParameter.getName();
    String _plus_2 = (_plus_1 + _name);
    String result = (_plus_2 + "\")");
    ParameterDefaultValue _defaultValue = routeParameter.getDefaultValue();
    boolean _equals = Objects.equal(_defaultValue, null);
    if (_equals) {
      String _result = result;
      result = (_result + ";");
    } else {
      ParameterDefaultValue _defaultValue_1 = routeParameter.getDefaultValue();
      boolean _isNew = _defaultValue_1.isNew();
      if (_isNew) {
        String _result_1 = result;
        result = (_result_1 + ".defaultValueType(DefaultValueType.NEW);");
      } else {
        ParameterDefaultValue _defaultValue_2 = routeParameter.getDefaultValue();
        boolean _isNull = _defaultValue_2.isNull();
        if (_isNull) {
          String _result_2 = result;
          result = (_result_2 + ".defaultValueType(DefaultValueType.NULL);");
        } else {
          String _result_3 = result;
          ParameterDefaultValue _defaultValue_3 = routeParameter.getDefaultValue();
          String _value = _defaultValue_3.getValue();
          String _plus_3 = (".defaultValue(\"" + _value);
          String _plus_4 = (_plus_3 + "\");");
          result = (_result_3 + _plus_4);
        }
      }
    }
    return result;
  }
}
