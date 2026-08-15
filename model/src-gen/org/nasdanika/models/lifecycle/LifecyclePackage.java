/**
 */
package org.nasdanika.models.lifecycle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.seal.SealPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.lifecycle.LifecycleFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface LifecyclePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lifecycle";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://lifecycle.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.lifecycle";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LifecyclePackage eINSTANCE = org.nasdanika.models.lifecycle.impl.LifecyclePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.lifecycle.impl.LifecycleImpl <em>Lifecycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.lifecycle.impl.LifecycleImpl
	 * @see org.nasdanika.models.lifecycle.impl.LifecyclePackageImpl#getLifecycle()
	 * @generated
	 */
	int LIFECYCLE = 0;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE__ACCESS_CONTROL = SealPackage.SEALED_ELEMENT__ACCESS_CONTROL;

	/**
	 * The feature id for the '<em><b>Encrypted Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE__ENCRYPTED_FEATURES = SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES;

	/**
	 * The feature id for the '<em><b>Variant Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE__VARIANT_FEATURES = SealPackage.SEALED_ELEMENT__VARIANT_FEATURES;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE__SIGNATURES = SealPackage.SEALED_ELEMENT__SIGNATURES;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE__STAGES = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE__TRANSITIONS = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE__INITIAL = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lifecycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_FEATURE_COUNT = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Lifecycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_OPERATION_COUNT = SealPackage.SEALED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.lifecycle.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.lifecycle.impl.StageImpl
	 * @see org.nasdanika.models.lifecycle.impl.LifecyclePackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 1;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__ACCESS_CONTROL = SealPackage.SEALED_ELEMENT__ACCESS_CONTROL;

	/**
	 * The feature id for the '<em><b>Encrypted Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__ENCRYPTED_FEATURES = SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES;

	/**
	 * The feature id for the '<em><b>Variant Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__VARIANT_FEATURES = SealPackage.SEALED_ELEMENT__VARIANT_FEATURES;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__SIGNATURES = SealPackage.SEALED_ELEMENT__SIGNATURES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__CHILDREN = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = SealPackage.SEALED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.lifecycle.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.lifecycle.impl.TransitionImpl
	 * @see org.nasdanika.models.lifecycle.impl.LifecyclePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACCESS_CONTROL = SealPackage.SEALED_ELEMENT__ACCESS_CONTROL;

	/**
	 * The feature id for the '<em><b>Encrypted Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ENCRYPTED_FEATURES = SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES;

	/**
	 * The feature id for the '<em><b>Variant Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__VARIANT_FEATURES = SealPackage.SEALED_ELEMENT__VARIANT_FEATURES;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SIGNATURES = SealPackage.SEALED_ELEMENT__SIGNATURES;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = SealPackage.SEALED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.lifecycle.impl.SojournImpl <em>Sojourn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.lifecycle.impl.SojournImpl
	 * @see org.nasdanika.models.lifecycle.impl.LifecyclePackageImpl#getSojourn()
	 * @generated
	 */
	int SOJOURN = 3;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOJOURN__ACCESS_CONTROL = SealPackage.SEALED_ELEMENT__ACCESS_CONTROL;

	/**
	 * The feature id for the '<em><b>Encrypted Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOJOURN__ENCRYPTED_FEATURES = SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES;

	/**
	 * The feature id for the '<em><b>Variant Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOJOURN__VARIANT_FEATURES = SealPackage.SEALED_ELEMENT__VARIANT_FEATURES;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOJOURN__SIGNATURES = SealPackage.SEALED_ELEMENT__SIGNATURES;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOJOURN__STAGE = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOJOURN__START = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOJOURN__END = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOJOURN__BY = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOJOURN__COMMENT = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sojourn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOJOURN_FEATURE_COUNT = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sojourn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOJOURN_OPERATION_COUNT = SealPackage.SEALED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.lifecycle.impl.StagedImpl <em>Staged</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.lifecycle.impl.StagedImpl
	 * @see org.nasdanika.models.lifecycle.impl.LifecyclePackageImpl#getStaged()
	 * @generated
	 */
	int STAGED = 4;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGED__ACCESS_CONTROL = SealPackage.SEALED_ELEMENT__ACCESS_CONTROL;

	/**
	 * The feature id for the '<em><b>Encrypted Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGED__ENCRYPTED_FEATURES = SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES;

	/**
	 * The feature id for the '<em><b>Variant Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGED__VARIANT_FEATURES = SealPackage.SEALED_ELEMENT__VARIANT_FEATURES;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGED__SIGNATURES = SealPackage.SEALED_ELEMENT__SIGNATURES;

	/**
	 * The feature id for the '<em><b>Lifecycles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGED__LIFECYCLES = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sojourns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGED__SOJOURNS = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGED__CURRENT = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Staged</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGED_FEATURE_COUNT = SealPackage.SEALED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Staged</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGED_OPERATION_COUNT = SealPackage.SEALED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.lifecycle.Lifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifecycle</em>'.
	 * @see org.nasdanika.models.lifecycle.Lifecycle
	 * @generated
	 */
	EClass getLifecycle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.lifecycle.Lifecycle#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see org.nasdanika.models.lifecycle.Lifecycle#getStages()
	 * @see #getLifecycle()
	 * @generated
	 */
	EReference getLifecycle_Stages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.lifecycle.Lifecycle#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.nasdanika.models.lifecycle.Lifecycle#getTransitions()
	 * @see #getLifecycle()
	 * @generated
	 */
	EReference getLifecycle_Transitions();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.lifecycle.Lifecycle#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Initial</em>'.
	 * @see org.nasdanika.models.lifecycle.Lifecycle#getInitial()
	 * @see #getLifecycle()
	 * @generated
	 */
	EReference getLifecycle_Initial();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.lifecycle.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see org.nasdanika.models.lifecycle.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.lifecycle.Stage#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.lifecycle.Stage#getChildren()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.lifecycle.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.nasdanika.models.lifecycle.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.lifecycle.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see org.nasdanika.models.lifecycle.Transition#getFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_From();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.lifecycle.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.nasdanika.models.lifecycle.Transition#getTo()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_To();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.lifecycle.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see org.nasdanika.models.lifecycle.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Guard();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.lifecycle.Sojourn <em>Sojourn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sojourn</em>'.
	 * @see org.nasdanika.models.lifecycle.Sojourn
	 * @generated
	 */
	EClass getSojourn();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.lifecycle.Sojourn#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stage</em>'.
	 * @see org.nasdanika.models.lifecycle.Sojourn#getStage()
	 * @see #getSojourn()
	 * @generated
	 */
	EReference getSojourn_Stage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.lifecycle.Sojourn#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.nasdanika.models.lifecycle.Sojourn#getStart()
	 * @see #getSojourn()
	 * @generated
	 */
	EAttribute getSojourn_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.lifecycle.Sojourn#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.nasdanika.models.lifecycle.Sojourn#getEnd()
	 * @see #getSojourn()
	 * @generated
	 */
	EAttribute getSojourn_End();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.lifecycle.Sojourn#getBy <em>By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>By</em>'.
	 * @see org.nasdanika.models.lifecycle.Sojourn#getBy()
	 * @see #getSojourn()
	 * @generated
	 */
	EReference getSojourn_By();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.lifecycle.Sojourn#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.models.lifecycle.Sojourn#getComment()
	 * @see #getSojourn()
	 * @generated
	 */
	EAttribute getSojourn_Comment();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.lifecycle.Staged <em>Staged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staged</em>'.
	 * @see org.nasdanika.models.lifecycle.Staged
	 * @generated
	 */
	EClass getStaged();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.lifecycle.Staged#getLifecycles <em>Lifecycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lifecycles</em>'.
	 * @see org.nasdanika.models.lifecycle.Staged#getLifecycles()
	 * @see #getStaged()
	 * @generated
	 */
	EReference getStaged_Lifecycles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.lifecycle.Staged#getSojourns <em>Sojourns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sojourns</em>'.
	 * @see org.nasdanika.models.lifecycle.Staged#getSojourns()
	 * @see #getStaged()
	 * @generated
	 */
	EReference getStaged_Sojourns();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.lifecycle.Staged#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Current</em>'.
	 * @see org.nasdanika.models.lifecycle.Staged#getCurrent()
	 * @see #getStaged()
	 * @generated
	 */
	EReference getStaged_Current();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LifecycleFactory getLifecycleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.lifecycle.impl.LifecycleImpl <em>Lifecycle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.lifecycle.impl.LifecycleImpl
		 * @see org.nasdanika.models.lifecycle.impl.LifecyclePackageImpl#getLifecycle()
		 * @generated
		 */
		EClass LIFECYCLE = eINSTANCE.getLifecycle();

		/**
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFECYCLE__STAGES = eINSTANCE.getLifecycle_Stages();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFECYCLE__TRANSITIONS = eINSTANCE.getLifecycle_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFECYCLE__INITIAL = eINSTANCE.getLifecycle_Initial();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.lifecycle.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.lifecycle.impl.StageImpl
		 * @see org.nasdanika.models.lifecycle.impl.LifecyclePackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__CHILDREN = eINSTANCE.getStage_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.lifecycle.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.lifecycle.impl.TransitionImpl
		 * @see org.nasdanika.models.lifecycle.impl.LifecyclePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FROM = eINSTANCE.getTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO = eINSTANCE.getTransition_To();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.lifecycle.impl.SojournImpl <em>Sojourn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.lifecycle.impl.SojournImpl
		 * @see org.nasdanika.models.lifecycle.impl.LifecyclePackageImpl#getSojourn()
		 * @generated
		 */
		EClass SOJOURN = eINSTANCE.getSojourn();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOJOURN__STAGE = eINSTANCE.getSojourn_Stage();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOJOURN__START = eINSTANCE.getSojourn_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOJOURN__END = eINSTANCE.getSojourn_End();

		/**
		 * The meta object literal for the '<em><b>By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOJOURN__BY = eINSTANCE.getSojourn_By();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOJOURN__COMMENT = eINSTANCE.getSojourn_Comment();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.lifecycle.impl.StagedImpl <em>Staged</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.lifecycle.impl.StagedImpl
		 * @see org.nasdanika.models.lifecycle.impl.LifecyclePackageImpl#getStaged()
		 * @generated
		 */
		EClass STAGED = eINSTANCE.getStaged();

		/**
		 * The meta object literal for the '<em><b>Lifecycles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGED__LIFECYCLES = eINSTANCE.getStaged_Lifecycles();

		/**
		 * The meta object literal for the '<em><b>Sojourns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGED__SOJOURNS = eINSTANCE.getStaged_Sojourns();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGED__CURRENT = eINSTANCE.getStaged_Current();

	}

} //LifecyclePackage
