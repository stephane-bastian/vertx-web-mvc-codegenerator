/**
 */
package com.thesoftwarefactory.vertx.web.mvc.codegenDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.CodegenDslFactory
 * @model kind="package"
 * @generated
 */
public interface CodegenDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "codegenDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.thesoftwarefactory.com/vertx/web/mvc/CodegenDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "codegenDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CodegenDslPackage eINSTANCE = com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ModelImpl
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Routes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ROUTES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RouteImpl <em>Route</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RouteImpl
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl#getRoute()
   * @generated
   */
  int ROUTE = 1;

  /**
   * The feature id for the '<em><b>Verb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE__VERB = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE__PATH = 1;

  /**
   * The feature id for the '<em><b>Handler</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE__HANDLER = 2;

  /**
   * The number of structural features of the '<em>Route</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RoutePathImpl <em>Route Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RoutePathImpl
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl#getRoutePath()
   * @generated
   */
  int ROUTE_PATH = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE_PATH__VALUE = 0;

  /**
   * The number of structural features of the '<em>Route Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE_PATH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RouteHandlerImpl <em>Route Handler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RouteHandlerImpl
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl#getRouteHandler()
   * @generated
   */
  int ROUTE_HANDLER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE_HANDLER__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE_HANDLER__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Route Handler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE_HANDLER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ParameterImpl
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DEFAULT_VALUE = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ParameterDefaultValueImpl <em>Parameter Default Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ParameterDefaultValueImpl
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl#getParameterDefaultValue()
   * @generated
   */
  int PARAMETER_DEFAULT_VALUE = 5;

  /**
   * The feature id for the '<em><b>New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEFAULT_VALUE__NEW = 0;

  /**
   * The feature id for the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEFAULT_VALUE__NULL = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEFAULT_VALUE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Parameter Default Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEFAULT_VALUE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteVerb <em>Route Verb</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteVerb
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl#getRouteVerb()
   * @generated
   */
  int ROUTE_VERB = 6;


  /**
   * Returns the meta object for class '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Model#getRoutes <em>Routes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Routes</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Model#getRoutes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Routes();

  /**
   * Returns the meta object for class '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route <em>Route</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Route</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route
   * @generated
   */
  EClass getRoute();

  /**
   * Returns the meta object for the attribute '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route#getVerb <em>Verb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verb</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route#getVerb()
   * @see #getRoute()
   * @generated
   */
  EAttribute getRoute_Verb();

  /**
   * Returns the meta object for the containment reference '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route#getPath()
   * @see #getRoute()
   * @generated
   */
  EReference getRoute_Path();

  /**
   * Returns the meta object for the containment reference '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route#getHandler <em>Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Handler</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Route#getHandler()
   * @see #getRoute()
   * @generated
   */
  EReference getRoute_Handler();

  /**
   * Returns the meta object for class '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePath <em>Route Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Route Path</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePath
   * @generated
   */
  EClass getRoutePath();

  /**
   * Returns the meta object for the attribute '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePath#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RoutePath#getValue()
   * @see #getRoutePath()
   * @generated
   */
  EAttribute getRoutePath_Value();

  /**
   * Returns the meta object for class '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler <em>Route Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Route Handler</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler
   * @generated
   */
  EClass getRouteHandler();

  /**
   * Returns the meta object for the attribute '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler#getName()
   * @see #getRouteHandler()
   * @generated
   */
  EAttribute getRouteHandler_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteHandler#getParameters()
   * @see #getRouteHandler()
   * @generated
   */
  EReference getRouteHandler_Parameters();

  /**
   * Returns the meta object for class '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Parameter#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.Parameter#getDefaultValue()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue <em>Parameter Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Default Value</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue
   * @generated
   */
  EClass getParameterDefaultValue();

  /**
   * Returns the meta object for the attribute '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue#isNew <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue#isNew()
   * @see #getParameterDefaultValue()
   * @generated
   */
  EAttribute getParameterDefaultValue_New();

  /**
   * Returns the meta object for the attribute '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue#isNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue#isNull()
   * @see #getParameterDefaultValue()
   * @generated
   */
  EAttribute getParameterDefaultValue_Null();

  /**
   * Returns the meta object for the attribute '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.ParameterDefaultValue#getValue()
   * @see #getParameterDefaultValue()
   * @generated
   */
  EAttribute getParameterDefaultValue_Value();

  /**
   * Returns the meta object for enum '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteVerb <em>Route Verb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Route Verb</em>'.
   * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteVerb
   * @generated
   */
  EEnum getRouteVerb();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CodegenDslFactory getCodegenDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ModelImpl
     * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ROUTES = eINSTANCE.getModel_Routes();

    /**
     * The meta object literal for the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RouteImpl <em>Route</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RouteImpl
     * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl#getRoute()
     * @generated
     */
    EClass ROUTE = eINSTANCE.getRoute();

    /**
     * The meta object literal for the '<em><b>Verb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROUTE__VERB = eINSTANCE.getRoute_Verb();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUTE__PATH = eINSTANCE.getRoute_Path();

    /**
     * The meta object literal for the '<em><b>Handler</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUTE__HANDLER = eINSTANCE.getRoute_Handler();

    /**
     * The meta object literal for the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RoutePathImpl <em>Route Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RoutePathImpl
     * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl#getRoutePath()
     * @generated
     */
    EClass ROUTE_PATH = eINSTANCE.getRoutePath();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROUTE_PATH__VALUE = eINSTANCE.getRoutePath_Value();

    /**
     * The meta object literal for the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RouteHandlerImpl <em>Route Handler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.RouteHandlerImpl
     * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl#getRouteHandler()
     * @generated
     */
    EClass ROUTE_HANDLER = eINSTANCE.getRouteHandler();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROUTE_HANDLER__NAME = eINSTANCE.getRouteHandler_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUTE_HANDLER__PARAMETERS = eINSTANCE.getRouteHandler_Parameters();

    /**
     * The meta object literal for the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ParameterImpl
     * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__DEFAULT_VALUE = eINSTANCE.getParameter_DefaultValue();

    /**
     * The meta object literal for the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ParameterDefaultValueImpl <em>Parameter Default Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.ParameterDefaultValueImpl
     * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl#getParameterDefaultValue()
     * @generated
     */
    EClass PARAMETER_DEFAULT_VALUE = eINSTANCE.getParameterDefaultValue();

    /**
     * The meta object literal for the '<em><b>New</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DEFAULT_VALUE__NEW = eINSTANCE.getParameterDefaultValue_New();

    /**
     * The meta object literal for the '<em><b>Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DEFAULT_VALUE__NULL = eINSTANCE.getParameterDefaultValue_Null();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DEFAULT_VALUE__VALUE = eINSTANCE.getParameterDefaultValue_Value();

    /**
     * The meta object literal for the '{@link com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteVerb <em>Route Verb</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.RouteVerb
     * @see com.thesoftwarefactory.vertx.web.mvc.codegenDsl.impl.CodegenDslPackageImpl#getRouteVerb()
     * @generated
     */
    EEnum ROUTE_VERB = eINSTANCE.getRouteVerb();

  }

} //CodegenDslPackage
