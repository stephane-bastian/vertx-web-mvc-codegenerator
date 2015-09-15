/**
 */
package com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl;

import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePermission;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RoutePermissionImpl#getPermission <em>Permission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoutePermissionImpl extends MinimalEObjectImpl.Container implements RoutePermission
{
  /**
   * The default value of the '{@link #getPermission() <em>Permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermission()
   * @generated
   * @ordered
   */
  protected static final String PERMISSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPermission() <em>Permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermission()
   * @generated
   * @ordered
   */
  protected String permission = PERMISSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoutePermissionImpl()
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
    return CodegenDslPackage.Literals.ROUTE_PERMISSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPermission()
  {
    return permission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPermission(String newPermission)
  {
    String oldPermission = permission;
    permission = newPermission;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodegenDslPackage.ROUTE_PERMISSION__PERMISSION, oldPermission, permission));
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
      case CodegenDslPackage.ROUTE_PERMISSION__PERMISSION:
        return getPermission();
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
      case CodegenDslPackage.ROUTE_PERMISSION__PERMISSION:
        setPermission((String)newValue);
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
      case CodegenDslPackage.ROUTE_PERMISSION__PERMISSION:
        setPermission(PERMISSION_EDEFAULT);
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
      case CodegenDslPackage.ROUTE_PERMISSION__PERMISSION:
        return PERMISSION_EDEFAULT == null ? permission != null : !PERMISSION_EDEFAULT.equals(permission);
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
    result.append(" (permission: ");
    result.append(permission);
    result.append(')');
    return result.toString();
  }

} //RoutePermissionImpl
