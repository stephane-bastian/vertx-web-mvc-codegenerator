package com.thesoftwarefactory.vertx.web.mvc.generator;

import com.google.common.base.Objects;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Model;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePermission;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteRole;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteVerb;
import com.thesoftwarefactory.vertx.web.mvc.generator.RoutingHelper;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GenerateRegisterRoutesSecurity {
  public void generate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Model model = ((Model) _head);
    URI _uRI = resource.getURI();
    final URI uriWithoutExtension = _uRI.trimFileExtension();
    int _segmentCount = uriWithoutExtension.segmentCount();
    int _minus = (_segmentCount - 1);
    String _segment = uriWithoutExtension.segment(_minus);
    String _firstUpper = RoutingHelper.toFirstUpper(_segment);
    String _plus = ("routes." + _firstUpper);
    final String className = (_plus + "RoutesSecurity");
    final String filename = RoutingHelper.toJavaFilename(className);
    CharSequence _javaCode = this.toJavaCode(model, className);
    fsa.generateFile(filename, _javaCode);
  }
  
  private CharSequence toJavaCode(final Model model, final String className) {
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
      _builder.append("import java.util.function.Function;");
      _builder.newLine();
      _builder.append("import java.util.Objects;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import io.vertx.ext.web.handler.AuthHandler;");
      _builder.newLine();
      _builder.append("import io.vertx.ext.web.Router;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class ");
      _builder.append(simpleClassName, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public final static void register(Router router, Function<String, AuthHandler> authHandlerCreator) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Objects.requireNonNull(router);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Objects.requireNonNull(authHandlerCreator);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      {
        EList<Route> _routes = model.getRoutes();
        for(final Route route : _routes) {
          {
            RoutePermission _permission = route.getPermission();
            boolean _notEquals = (!Objects.equal(_permission, null));
            if (_notEquals) {
              _builder.append("\t\t");
              _builder.append("router.");
              String _routerVerb = GenerateRegisterRoutesSecurity.routerVerb(route);
              _builder.append(_routerVerb, "\t\t");
              _builder.append("(\"");
              String _trimPath = RoutingHelper.getTrimPath(route);
              _builder.append(_trimPath, "\t\t");
              _builder.append("\").handler(authHandlerCreator.apply(\"");
              RoutePermission _permission_1 = route.getPermission();
              String _value = _permission_1.getValue();
              _builder.append(_value, "\t\t");
              _builder.append("\"));");
              _builder.newLineIfNotEmpty();
            }
          }
          {
            RouteRole _role = route.getRole();
            boolean _notEquals_1 = (!Objects.equal(_role, null));
            if (_notEquals_1) {
              _builder.append("\t\t");
              _builder.append("router.");
              String _routerVerb_1 = GenerateRegisterRoutesSecurity.routerVerb(route);
              _builder.append(_routerVerb_1, "\t\t");
              _builder.append("(\"");
              String _trimPath_1 = RoutingHelper.getTrimPath(route);
              _builder.append(_trimPath_1, "\t\t");
              _builder.append("\").handler(authHandlerCreator.apply(\"role:");
              RouteRole _role_1 = route.getRole();
              String _value_1 = _role_1.getValue();
              _builder.append(_value_1, "\t\t");
              _builder.append("\"));");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private static String routerVerb(final Route route) {
    RouteVerb _verb = route.getVerb();
    String _string = _verb.toString();
    return _string.toLowerCase();
  }
}
