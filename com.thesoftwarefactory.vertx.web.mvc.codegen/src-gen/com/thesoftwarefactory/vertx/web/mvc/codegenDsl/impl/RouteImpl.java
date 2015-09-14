/**
 */
package com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl;

import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePath;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteVerb;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RouteImpl#getVerb <em>Verb</em>}</li>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RouteImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RouteImpl#getHandler <em>Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteImpl extends MinimalEObjectImpl.Container implements Route
{
  /**
   * The default value of the '{@link #getVerb() <em>Verb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerb()
   * @generated
   * @ordered
   */
  protected static final RouteVerb VERB_EDEFAULT = RouteVerb.GET;

  /**
   * The cached value of the '{@link #getVerb() <em>Verb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerb()
   * @generated
   * @ordered
   */
  protected RouteVerb verb = VERB_EDEFAULT;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected RoutePath path;

  /**
   * The cached value of the '{@link #getHandler() <em>Handler</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandler()
   * @generated
   * @ordered
   */
  protected RouteHandler handler;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RouteImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CodegenDslPackage.Literals.ROUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RouteVerb getVerb()
  {
    return verb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerb(RouteVerb newVerb)
  {
    RouteVerb oldVerb = verb;
    verb = newVerb == null ? VERB_EDEFAULT : newVerb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodegenDslPackage.ROUTE__VERB, oldVerb, verb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoutePath getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPath(RoutePath newPath, NotificationChain msgs)
  {
    RoutePath oldPath = path;
    path = newPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenDslPackage.ROUTE__PATH, oldPath, newPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(RoutePath newPath)
  {
    if (newPath != path)
    {
      NotificationChain msgs = null;
      if (path != null)
        msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenDslPackage.ROUTE__PATH, null, msgs);
      if (newPath != null)
        msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenDslPackage.ROUTE__PATH, null, msgs);
      msgs = basicSetPath(newPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodegenDslPackage.ROUTE__PATH, newPath, newPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RouteHandler getHandler()
  {
    return handler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHandler(RouteHandler newHandler, NotificationChain msgs)
  {
    RouteHandler oldHandler = handler;
    handler = newHandler;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenDslPackage.ROUTE__HANDLER, oldHandler, newHandler);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHandler(RouteHandler newHandler)
  {
    if (newHandler != handler)
    {
      NotificationChain msgs = null;
      if (handler != null)
        msgs = ((InternalEObject)handler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenDslPackage.ROUTE__HANDLER, null, msgs);
      if (newHandler != null)
        msgs = ((InternalEObject)newHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenDslPackage.ROUTE__HANDLER, null, msgs);
      msgs = basicSetHandler(newHandler, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodegenDslPackage.ROUTE__HANDLER, newHandler, newHandler));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CodegenDslPackage.ROUTE__PATH:
        return basicSetPath(null, msgs);
      case CodegenDslPackage.ROUTE__HANDLER:
        return basicSetHandler(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CodegenDslPackage.ROUTE__VERB:
        return getVerb();
      case CodegenDslPackage.ROUTE__PATH:
        return getPath();
      case CodegenDslPackage.ROUTE__HANDLER:
        return getHandler();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CodegenDslPackage.ROUTE__VERB:
        setVerb((RouteVerb)newValue);
        return;
      case CodegenDslPackage.ROUTE__PATH:
        setPath((RoutePath)newValue);
        return;
      case CodegenDslPackage.ROUTE__HANDLER:
        setHandler((RouteHandler)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CodegenDslPackage.ROUTE__VERB:
        setVerb(VERB_EDEFAULT);
        return;
      case CodegenDslPackage.ROUTE__PATH:
        setPath((RoutePath)null);
        return;
      case CodegenDslPackage.ROUTE__HANDLER:
        setHandler((RouteHandler)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CodegenDslPackage.ROUTE__VERB:
        return verb != VERB_EDEFAULT;
      case CodegenDslPackage.ROUTE__PATH:
        return path != null;
      case CodegenDslPackage.ROUTE__HANDLER:
        return handler != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (verb: ");
    result.append(verb);
    result.append(')');
    return result.toString();
  }

} //RouteImpl
