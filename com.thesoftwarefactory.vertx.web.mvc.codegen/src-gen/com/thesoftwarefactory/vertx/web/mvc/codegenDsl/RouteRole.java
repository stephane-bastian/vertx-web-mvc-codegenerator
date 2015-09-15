/**
 */
package com.thesoftwarefactory.vertx.web.mvc.codegenDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteRole#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage#getRouteRole()
 * @model
 * @generated
 */
public interface RouteRole extends EObject
{
  /**
   * Returns the value of the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' attribute.
   * @see #setRole(String)
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage#getRouteRole_Role()
   * @model
   * @generated
   */
  String getRole();

  /**
   * Sets the value of the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteRole#getRole <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' attribute.
   * @see #getRole()
   * @generated
   */
  void setRole(String value);

} // RouteRole
