/**
 */
package com.thesoftwarefactory.vertx.web.mvc.codegenDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler#getName <em>Name</em>}</li>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage#getRouteHandler()
 * @model
 * @generated
 */
public interface RouteHandler extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage#getRouteHandler_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage#getRouteHandler_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

} // RouteHandler
