/**
 */
package com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl;

import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePath;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePermission;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteRole;
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
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RouteImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RouteImpl#getRole <em>Role</em>}</li>
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
   * The cached value of the '{@link #getPermission() <em>Permission</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermission()
   * @generated
   * @ordered
   */
  protected RoutePermission permission;

  /**
   * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected RouteRole role;

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
  public RoutePermission getPermission()
  {
    return permission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPermission(RoutePermission newPermission, NotificationChain msgs)
  {
    RoutePermission oldPermission = permission;
    permission = newPermission;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenDslPackage.ROUTE__PERMISSION, oldPermission, newPermission);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPermission(RoutePermission newPermission)
  {
    if (newPermission != permission)
    {
      NotificationChain msgs = null;
      if (permission != null)
        msgs = ((InternalEObject)permission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenDslPackage.ROUTE__PERMISSION, null, msgs);
      if (newPermission != null)
        msgs = ((InternalEObject)newPermission).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenDslPackage.ROUTE__PERMISSION, null, msgs);
      msgs = basicSetPermission(newPermission, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodegenDslPackage.ROUTE__PERMISSION, newPermission, newPermission));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RouteRole getRole()
  {
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRole(RouteRole newRole, NotificationChain msgs)
  {
    RouteRole oldRole = role;
    role = newRole;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenDslPackage.ROUTE__ROLE, oldRole, newRole);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRole(RouteRole newRole)
  {
    if (newRole != role)
    {
      NotificationChain msgs = null;
      if (role != null)
        msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenDslPackage.ROUTE__ROLE, null, msgs);
      if (newRole != null)
        msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenDslPackage.ROUTE__ROLE, null, msgs);
      msgs = basicSetRole(newRole, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodegenDslPackage.ROUTE__ROLE, newRole, newRole));
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
      case CodegenDslPackage.ROUTE__PERMISSION:
        return basicSetPermission(null, msgs);
      case CodegenDslPackage.ROUTE__ROLE:
        return basicSetRole(null, msgs);
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
      case CodegenDslPackage.ROUTE__PERMISSION:
        return getPermission();
      case CodegenDslPackage.ROUTE__ROLE:
        return getRole();
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
      case CodegenDslPackage.ROUTE__PERMISSION:
        setPermission((RoutePermission)newValue);
        return;
      case CodegenDslPackage.ROUTE__ROLE:
        setRole((RouteRole)newValue);
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
      case CodegenDslPackage.ROUTE__PERMISSION:
        setPermission((RoutePermission)null);
        return;
      case CodegenDslPackage.ROUTE__ROLE:
        setRole((RouteRole)null);
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
      case CodegenDslPackage.ROUTE__PERMISSION:
        return permission != null;
      case CodegenDslPackage.ROUTE__ROLE:
        return role != null;
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
