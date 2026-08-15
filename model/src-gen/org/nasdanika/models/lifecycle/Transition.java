/**
 */
package org.nasdanika.models.lifecycle;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.seal.SealedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A permitted move between stages. An empty `from` makes the transition
 * global: available from any stage of the lifecycle. Guards are String
 * expressions over the element, the acting subject, and the environment;
 * a guard may demand signatures on the entering sojourn ("signed by a
 * subject engaged as approver"), which is the typed seam between this
 * model and seal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.lifecycle.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.Transition#getTo <em>To</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.Transition#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends SealedElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.lifecycle.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Source stages; empty means any stage (global transition).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getTransition_From()
	 * @model
	 * @generated
	 */
	EList<Stage> getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Stage)
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getTransition_To()
	 * @model
	 * @generated
	 */
	Stage getTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.lifecycle.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Stage value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Boolean expression; empty means unguarded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard</em>' attribute.
	 * @see #setGuard(String)
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getTransition_Guard()
	 * @model unique="false"
	 * @generated
	 */
	String getGuard();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.lifecycle.Transition#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(String value);

} // Transition
