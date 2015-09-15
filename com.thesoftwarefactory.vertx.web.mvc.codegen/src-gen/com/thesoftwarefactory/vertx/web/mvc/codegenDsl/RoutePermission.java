/**
 */
package com.thesoftwarefactory.vertx.web.mvc.codegenDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePermission#getPermission <em>Permission</em>}</li>
 * </ul>
 *
 * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage#getRoutePermission()
 * @model
 * @generated
 */
public interface RoutePermission extends EObject
{
  /**
   * Returns the value of the '<em><b>Permission</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Permission</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permission</em>' attribute.
   * @see #setPermission(String)
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage#getRoutePermission_Permission()
   * @model
   * @generated
   */
  String getPermission();

  /**
   * Sets the value of the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePermission#getPermission <em>Permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Permission</em>' attribute.
   * @see #getPermission()
   * @generated
   */
  void setPermission(String value);

} // RoutePermission
