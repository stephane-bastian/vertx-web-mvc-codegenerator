/**
 */
package com.thesoftwarefactory.vertx.web.mvc.codegenDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route#getVerb <em>Verb</em>}</li>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route#getPath <em>Path</em>}</li>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route#getHandler <em>Handler</em>}</li>
 * </ul>
 *
 * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject
{
  /**
   * Returns the value of the '<em><b>Verb</b></em>' attribute.
   * The literals are from the enumeration {@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteVerb}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verb</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verb</em>' attribute.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteVerb
   * @see #setVerb(RouteVerb)
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage#getRoute_Verb()
   * @model
   * @generated
   */
  RouteVerb getVerb();

  /**
   * Sets the value of the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route#getVerb <em>Verb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verb</em>' attribute.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteVerb
   * @see #getVerb()
   * @generated
   */
  void setVerb(RouteVerb value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(RoutePath)
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage#getRoute_Path()
   * @model containment="true"
   * @generated
   */
  RoutePath getPath();

  /**
   * Sets the value of the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(RoutePath value);

  /**
   * Returns the value of the '<em><b>Handler</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handler</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handler</em>' containment reference.
   * @see #setHandler(RouteHandler)
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage#getRoute_Handler()
   * @model containment="true"
   * @generated
   */
  RouteHandler getHandler();

  /**
   * Sets the value of the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route#getHandler <em>Handler</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Handler</em>' containment reference.
   * @see #getHandler()
   * @generated
   */
  void setHandler(RouteHandler value);

} // Route
