/**
 */
package org.nasdanika.models.lifecycle;

import java.util.Date;

import org.nasdanika.models.iam.Subject;

import org.nasdanika.models.seal.SealedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sojourn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Occupancy (the record side) ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.lifecycle.Sojourn#getStage <em>Stage</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.Sojourn#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.Sojourn#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.Sojourn#getBy <em>By</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.Sojourn#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getSojourn()
 * @model
 * @generated
 */
public interface Sojourn extends SealedElement {
	/**
	 * Returns the value of the '<em><b>Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' reference.
	 * @see #setStage(Stage)
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getSojourn_Stage()
	 * @model
	 * @generated
	 */
	Stage getStage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.lifecycle.Sojourn#getStage <em>Stage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' reference.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(Stage value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getSojourn_Start()
	 * @model unique="false"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.lifecycle.Sojourn#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Unset while the element remains in the stage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getSojourn_End()
	 * @model unique="false"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.lifecycle.Sojourn#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Who moved the element in: a person, a service account, an agent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>By</em>' reference.
	 * @see #setBy(Subject)
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getSojourn_By()
	 * @model
	 * @generated
	 */
	Subject getBy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.lifecycle.Sojourn#getBy <em>By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By</em>' reference.
	 * @see #getBy()
	 * @generated
	 */
	void setBy(Subject value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Markdown rationale or note.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.nasdanika.models.lifecycle.LifecyclePackage#getSojourn_Comment()
	 * @model unique="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.lifecycle.Sojourn#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // Sojourn
