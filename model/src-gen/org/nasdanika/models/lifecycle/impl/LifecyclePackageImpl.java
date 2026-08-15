/**
 */
package org.nasdanika.models.lifecycle.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.iam.IamPackage;

import org.nasdanika.models.lifecycle.Lifecycle;
import org.nasdanika.models.lifecycle.LifecycleFactory;
import org.nasdanika.models.lifecycle.LifecyclePackage;
import org.nasdanika.models.lifecycle.Sojourn;
import org.nasdanika.models.lifecycle.Stage;
import org.nasdanika.models.lifecycle.Staged;
import org.nasdanika.models.lifecycle.Transition;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.role.RolePackage;

import org.nasdanika.models.seal.SealPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LifecyclePackageImpl extends EPackageImpl implements LifecyclePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifecycleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sojournEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stagedEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LifecyclePackageImpl() {
		super(eNS_URI, LifecycleFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LifecyclePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LifecyclePackage init() {
		if (isInited) return (LifecyclePackage)EPackage.Registry.INSTANCE.getEPackage(LifecyclePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLifecyclePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LifecyclePackageImpl theLifecyclePackage = registeredLifecyclePackage instanceof LifecyclePackageImpl ? (LifecyclePackageImpl)registeredLifecyclePackage : new LifecyclePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		SealPackage.eINSTANCE.eClass();
		IamPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		NxcorePackage.eINSTANCE.eClass();
		RolePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLifecyclePackage.createPackageContents();

		// Initialize created meta-data
		theLifecyclePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLifecyclePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LifecyclePackage.eNS_URI, theLifecyclePackage);
		return theLifecyclePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLifecycle() {
		return lifecycleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLifecycle_Stages() {
		return (EReference)lifecycleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLifecycle_Transitions() {
		return (EReference)lifecycleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLifecycle_Initial() {
		return (EReference)lifecycleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStage() {
		return stageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStage_Children() {
		return (EReference)stageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_From() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_To() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Guard() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSojourn() {
		return sojournEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSojourn_Stage() {
		return (EReference)sojournEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSojourn_Start() {
		return (EAttribute)sojournEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSojourn_End() {
		return (EAttribute)sojournEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSojourn_By() {
		return (EReference)sojournEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSojourn_Comment() {
		return (EAttribute)sojournEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaged() {
		return stagedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaged_Lifecycles() {
		return (EReference)stagedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaged_Sojourns() {
		return (EReference)stagedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaged_Current() {
		return (EReference)stagedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LifecycleFactory getLifecycleFactory() {
		return (LifecycleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		lifecycleEClass = createEClass(LIFECYCLE);
		createEReference(lifecycleEClass, LIFECYCLE__STAGES);
		createEReference(lifecycleEClass, LIFECYCLE__TRANSITIONS);
		createEReference(lifecycleEClass, LIFECYCLE__INITIAL);

		stageEClass = createEClass(STAGE);
		createEReference(stageEClass, STAGE__CHILDREN);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__FROM);
		createEReference(transitionEClass, TRANSITION__TO);
		createEAttribute(transitionEClass, TRANSITION__GUARD);

		sojournEClass = createEClass(SOJOURN);
		createEReference(sojournEClass, SOJOURN__STAGE);
		createEAttribute(sojournEClass, SOJOURN__START);
		createEAttribute(sojournEClass, SOJOURN__END);
		createEReference(sojournEClass, SOJOURN__BY);
		createEAttribute(sojournEClass, SOJOURN__COMMENT);

		stagedEClass = createEClass(STAGED);
		createEReference(stagedEClass, STAGED__LIFECYCLES);
		createEReference(stagedEClass, STAGED__SOJOURNS);
		createEReference(stagedEClass, STAGED__CURRENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SealPackage theSealPackage = (SealPackage)EPackage.Registry.INSTANCE.getEPackage(SealPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		IamPackage theIamPackage = (IamPackage)EPackage.Registry.INSTANCE.getEPackage(IamPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lifecycleEClass.getESuperTypes().add(theSealPackage.getSealedElement());
		stageEClass.getESuperTypes().add(theSealPackage.getSealedElement());
		transitionEClass.getESuperTypes().add(theSealPackage.getSealedElement());
		sojournEClass.getESuperTypes().add(theSealPackage.getSealedElement());
		stagedEClass.getESuperTypes().add(theSealPackage.getSealedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(lifecycleEClass, Lifecycle.class, "Lifecycle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLifecycle_Stages(), this.getStage(), null, "stages", null, 0, -1, Lifecycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLifecycle_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, Lifecycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLifecycle_Initial(), this.getStage(), null, "initial", null, 0, -1, Lifecycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageEClass, Stage.class, "Stage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStage_Children(), this.getStage(), null, "children", null, 0, -1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_From(), this.getStage(), null, "from", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_To(), this.getStage(), null, "to", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Guard(), theEcorePackage.getEString(), "guard", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sojournEClass, Sojourn.class, "Sojourn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSojourn_Stage(), this.getStage(), null, "stage", null, 0, 1, Sojourn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSojourn_Start(), theEcorePackage.getEDate(), "start", null, 0, 1, Sojourn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSojourn_End(), theEcorePackage.getEDate(), "end", null, 0, 1, Sojourn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSojourn_By(), theIamPackage.getSubject(), null, "by", null, 0, 1, Sojourn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSojourn_Comment(), theEcorePackage.getEString(), "comment", null, 0, 1, Sojourn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stagedEClass, Staged.class, "Staged", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaged_Lifecycles(), this.getLifecycle(), null, "lifecycles", null, 0, -1, Staged.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaged_Sojourns(), this.getSojourn(), null, "sojourns", null, 0, -1, Staged.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaged_Current(), this.getStage(), null, "current", null, 0, -1, Staged.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (lifecycleEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Definitions (the workflow side) ----"
		   });
		addAnnotation
		  (getLifecycle_Initial(),
		   source,
		   new String[] {
			   "documentation", " Stages a new participant may enter directly (the Jira \"create\" transition targets)."
		   });
		addAnnotation
		  (stageEClass,
		   source,
		   new String[] {
			   "documentation", "A stage definition. Hierarchical: a parent stage is a category\n(Jira\'s To Do / In Progress / Done, generalized), so queries, access\nconditions, and reports can bind at category level while sojourns\nrecord the leaf."
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[] {
			   "documentation", "A permitted move between stages. An empty `from` makes the transition\nglobal: available from any stage of the lifecycle. Guards are String\nexpressions over the element, the acting subject, and the environment;\na guard may demand signatures on the entering sojourn (\"signed by a\nsubject engaged as approver\"), which is the typed seam between this\nmodel and seal."
		   });
		addAnnotation
		  (getTransition_From(),
		   source,
		   new String[] {
			   "documentation", " Source stages; empty means any stage (global transition)."
		   });
		addAnnotation
		  (getTransition_Guard(),
		   source,
		   new String[] {
			   "documentation", " Boolean expression; empty means unguarded."
		   });
		addAnnotation
		  (sojournEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Occupancy (the record side) ----"
		   });
		addAnnotation
		  (getSojourn_End(),
		   source,
		   new String[] {
			   "documentation", " Unset while the element remains in the stage."
		   });
		addAnnotation
		  (getSojourn_By(),
		   source,
		   new String[] {
			   "documentation", " Who moved the element in: a person, a service account, an agent."
		   });
		addAnnotation
		  (getSojourn_Comment(),
		   source,
		   new String[] {
			   "documentation", " Markdown rationale or note."
		   });
		addAnnotation
		  (stagedEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Staged elements ----"
		   });
		addAnnotation
		  (getStaged_Lifecycles(),
		   source,
		   new String[] {
			   "documentation", " The lifecycles this element participates in."
		   });
		addAnnotation
		  (getStaged_Current(),
		   source,
		   new String[] {
			   "get", "return null;"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //LifecyclePackageImpl
