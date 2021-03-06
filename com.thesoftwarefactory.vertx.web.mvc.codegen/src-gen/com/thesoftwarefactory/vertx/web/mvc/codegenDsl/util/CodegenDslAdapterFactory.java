/**
 */
package com.thesoftwarefactory.vertx.web.mvc.codegenDsl.util;

import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage
 * @generated
 */
public class CodegenDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CodegenDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodegenDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CodegenDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CodegenDslSwitch<Adapter> modelSwitch =
    new CodegenDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseRoute(Route object)
      {
        return createRouteAdapter();
      }
      @Override
      public Adapter caseRoutePath(RoutePath object)
      {
        return createRoutePathAdapter();
      }
      @Override
      public Adapter caseRouteHandler(RouteHandler object)
      {
        return createRouteHandlerAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseParameterDefaultValue(ParameterDefaultValue object)
      {
        return createParameterDefaultValueAdapter();
      }
      @Override
      public Adapter caseRoutePermission(RoutePermission object)
      {
        return createRoutePermissionAdapter();
      }
      @Override
      public Adapter caseRouteRole(RouteRole object)
      {
        return createRouteRoleAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route <em>Route</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route
   * @generated
   */
  public Adapter createRouteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePath <em>Route Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePath
   * @generated
   */
  public Adapter createRoutePathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler <em>Route Handler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler
   * @generated
   */
  public Adapter createRouteHandlerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue <em>Parameter Default Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue
   * @generated
   */
  public Adapter createParameterDefaultValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePermission <em>Route Permission</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePermission
   * @generated
   */
  public Adapter createRoutePermissionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteRole <em>Route Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteRole
   * @generated
   */
  public Adapter createRouteRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CodegenDslAdapterFactory
