/**
 */
package com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl;

import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodegenDslFactoryImpl extends EFactoryImpl implements CodegenDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CodegenDslFactory init()
  {
    try
    {
      CodegenDslFactory theCodegenDslFactory = (CodegenDslFactory)EPackage.Registry.INSTANCE.getEFactory(CodegenDslPackage.eNS_URI);
      if (theCodegenDslFactory != null)
      {
        return theCodegenDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CodegenDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodegenDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CodegenDslPackage.MODEL: return createModel();
      case CodegenDslPackage.ROUTE: return createRoute();
      case CodegenDslPackage.ROUTE_PATH: return createRoutePath();
      case CodegenDslPackage.ROUTE_HANDLER: return createRouteHandler();
      case CodegenDslPackage.PARAMETER: return createParameter();
      case CodegenDslPackage.PARAMETER_DEFAULT_VALUE: return createParameterDefaultValue();
      case CodegenDslPackage.ROUTE_PERMISSION: return createRoutePermission();
      case CodegenDslPackage.ROUTE_ROLE: return createRouteRole();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CodegenDslPackage.ROUTE_VERB:
        return createRouteVerbFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CodegenDslPackage.ROUTE_VERB:
        return convertRouteVerbToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Route createRoute()
  {
    RouteImpl route = new RouteImpl();
    return route;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoutePath createRoutePath()
  {
    RoutePathImpl routePath = new RoutePathImpl();
    return routePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RouteHandler createRouteHandler()
  {
    RouteHandlerImpl routeHandler = new RouteHandlerImpl();
    return routeHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDefaultValue createParameterDefaultValue()
  {
    ParameterDefaultValueImpl parameterDefaultValue = new ParameterDefaultValueImpl();
    return parameterDefaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoutePermission createRoutePermission()
  {
    RoutePermissionImpl routePermission = new RoutePermissionImpl();
    return routePermission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RouteRole createRouteRole()
  {
    RouteRoleImpl routeRole = new RouteRoleImpl();
    return routeRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RouteVerb createRouteVerbFromString(EDataType eDataType, String initialValue)
  {
    RouteVerb result = RouteVerb.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRouteVerbToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodegenDslPackage getCodegenDslPackage()
  {
    return (CodegenDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CodegenDslPackage getPackage()
  {
    return CodegenDslPackage.eINSTANCE;
  }

} //CodegenDslFactoryImpl
