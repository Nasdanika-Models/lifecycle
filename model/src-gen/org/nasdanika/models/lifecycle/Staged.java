/**
 */
package org.nasdanika.models.lifecycle;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.seal.SealedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staged</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Staged elements ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.lifecycle.Staged#getLifecycles <em>Lifecycles</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.Staged#getSojourns <em>Sojourns</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.Staged#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getStaged()
 * @model abstract="true"
 * @generated
 */
public interface Staged extends SealedElement {
	/**
	 * Returns the value of the '<em><b>Lifecycles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.lifecycle.Lifecycle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The lifecycles this element participates in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifecycles</em>' reference list.
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getStaged_Lifecycles()
	 * @model
	 * @generated
	 */
	EList<Lifecycle> getLifecycles();

	/**
	 * Returns the value of the '<em><b>Sojourns</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.lifecycle.Sojourn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sojourns</em>' containment reference list.
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getStaged_Sojourns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sojourn> getSojourns();

	/**
	 * Returns the value of the '<em><b>Current</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.lifecycle.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' reference list.
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getStaged_Current()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Stage> getCurrent();

} // Staged
