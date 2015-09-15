/**
 */
package com.thesoftwarefactory.vertx.web.mvc.codegenDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage
 * @generated
 */
public interface CodegenDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CodegenDslFactory eINSTANCE = com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Route</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Route</em>'.
   * @generated
   */
  Route createRoute();

  /**
   * Returns a new object of class '<em>Route Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Route Path</em>'.
   * @generated
   */
  RoutePath createRoutePath();

  /**
   * Returns a new object of class '<em>Route Handler</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Route Handler</em>'.
   * @generated
   */
  RouteHandler createRouteHandler();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Parameter Default Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Default Value</em>'.
   * @generated
   */
  ParameterDefaultValue createParameterDefaultValue();

  /**
   * Returns a new object of class '<em>Route Permission</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Route Permission</em>'.
   * @generated
   */
  RoutePermission createRoutePermission();

  /**
   * Returns a new object of class '<em>Route Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Route Role</em>'.
   * @generated
   */
  RouteRole createRouteRole();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CodegenDslPackage getCodegenDslPackage();

} //CodegenDslFactory
