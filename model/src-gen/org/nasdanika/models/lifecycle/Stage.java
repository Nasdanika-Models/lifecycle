/**
 */
package org.nasdanika.models.lifecycle;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.seal.SealedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A stage definition. Hierarchical: a parent stage is a category
 * (Jira's To Do / In Progress / Done, generalized), so queries, access
 * conditions, and reports can bind at category level while sojourns
 * record the leaf.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.lifecycle.Stage#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getStage()
 * @model
 * @generated
 */
public interface Stage extends SealedElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.lifecycle.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getStage_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stage> getChildren();

} // Stage
