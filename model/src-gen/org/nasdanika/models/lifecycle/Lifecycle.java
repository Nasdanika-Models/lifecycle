/**
 */
package org.nasdanika.models.lifecycle;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.seal.SealedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifecycle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Definitions (the workflow side) ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.lifecycle.Lifecycle#getStages <em>Stages</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.Lifecycle#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.Lifecycle#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getLifecycle()
 * @model
 * @generated
 */
public interface Lifecycle extends SealedElement {
	/**
	 * Returns the value of the '<em><b>Stages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.lifecycle.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stages</em>' containment reference list.
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getLifecycle_Stages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stage> getStages();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.lifecycle.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getLifecycle_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.lifecycle.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Stages a new participant may enter directly (the Jira "create" transition targets).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial</em>' reference list.
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getLifecycle_Initial()
	 * @model
	 * @generated
	 */
	EList<Stage> getInitial();

} // Lifecycle
