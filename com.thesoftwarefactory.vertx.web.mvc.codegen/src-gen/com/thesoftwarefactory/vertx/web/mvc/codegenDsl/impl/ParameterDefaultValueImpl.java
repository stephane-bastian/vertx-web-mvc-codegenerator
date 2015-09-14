/**
 */
package com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl;

import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslPackage;
import com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Default Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ParameterDefaultValueImpl#isNew <em>New</em>}</li>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ParameterDefaultValueImpl#isNull <em>Null</em>}</li>
 *   <li>{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ParameterDefaultValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterDefaultValueImpl extends MinimalEObjectImpl.Container implements ParameterDefaultValue
{
  /**
   * The default value of the '{@link #isNew() <em>New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNew()
   * @generated
   * @ordered
   */
  protected static final boolean NEW_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNew() <em>New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNew()
   * @generated
   * @ordered
   */
  protected boolean new_ = NEW_EDEFAULT;

  /**
   * The default value of the '{@link #isNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNull()
   * @generated
   * @ordered
   */
  protected static final boolean NULL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNull()
   * @generated
   * @ordered
   */
  protected boolean null_ = NULL_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterDefaultValueImpl()
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
    return CodegenDslPackage.Literals.PARAMETER_DEFAULT_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNew()
  {
    return new_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNew(boolean newNew)
  {
    boolean oldNew = new_;
    new_ = newNew;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodegenDslPackage.PARAMETER_DEFAULT_VALUE__NEW, oldNew, new_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNull()
  {
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNull(boolean newNull)
  {
    boolean oldNull = null_;
    null_ = newNull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodegenDslPackage.PARAMETER_DEFAULT_VALUE__NULL, oldNull, null_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodegenDslPackage.PARAMETER_DEFAULT_VALUE__VALUE, oldValue, value));
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
      case CodegenDslPackage.PARAMETER_DEFAULT_VALUE__NEW:
        return isNew();
      case CodegenDslPackage.PARAMETER_DEFAULT_VALUE__NULL:
        return isNull();
      case CodegenDslPackage.PARAMETER_DEFAULT_VALUE__VALUE:
        return getValue();
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
      case CodegenDslPackage.PARAMETER_DEFAULT_VALUE__NEW:
        setNew((Boolean)newValue);
        return;
      case CodegenDslPackage.PARAMETER_DEFAULT_VALUE__NULL:
        setNull((Boolean)newValue);
        return;
      case CodegenDslPackage.PARAMETER_DEFAULT_VALUE__VALUE:
        setValue((String)newValue);
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
      case CodegenDslPackage.PARAMETER_DEFAULT_VALUE__NEW:
        setNew(NEW_EDEFAULT);
        return;
      case CodegenDslPackage.PARAMETER_DEFAULT_VALUE__NULL:
        setNull(NULL_EDEFAULT);
        return;
      case CodegenDslPackage.PARAMETER_DEFAULT_VALUE__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case CodegenDslPackage.PARAMETER_DEFAULT_VALUE__NEW:
        return new_ != NEW_EDEFAULT;
      case CodegenDslPackage.PARAMETER_DEFAULT_VALUE__NULL:
        return null_ != NULL_EDEFAULT;
      case CodegenDslPackage.PARAMETER_DEFAULT_VALUE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (new: ");
    result.append(new_);
    result.append(", null: ");
    result.append(null_);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //ParameterDefaultValueImpl
