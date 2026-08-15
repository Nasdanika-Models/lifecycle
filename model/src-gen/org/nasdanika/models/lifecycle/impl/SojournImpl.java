/**
 */
package org.nasdanika.models.lifecycle.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.iam.Subject;

import org.nasdanika.models.lifecycle.LifecyclePackage;
import org.nasdanika.models.lifecycle.Sojourn;
import org.nasdanika.models.lifecycle.Stage;

import org.nasdanika.models.seal.impl.SealedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sojourn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.lifecycle.impl.SojournImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.impl.SojournImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.impl.SojournImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.impl.SojournImpl#getBy <em>By</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.impl.SojournImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SojournImpl extends SealedElementImpl implements Sojourn {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SojournImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LifecyclePackage.Literals.SOJOURN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stage getStage() {
		return (Stage)eDynamicGet(LifecyclePackage.SOJOURN__STAGE, LifecyclePackage.Literals.SOJOURN__STAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage basicGetStage() {
		return (Stage)eDynamicGet(LifecyclePackage.SOJOURN__STAGE, LifecyclePackage.Literals.SOJOURN__STAGE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStage(Stage newStage) {
		eDynamicSet(LifecyclePackage.SOJOURN__STAGE, LifecyclePackage.Literals.SOJOURN__STAGE, newStage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStart() {
		return (Date)eDynamicGet(LifecyclePackage.SOJOURN__START, LifecyclePackage.Literals.SOJOURN__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Date newStart) {
		eDynamicSet(LifecyclePackage.SOJOURN__START, LifecyclePackage.Literals.SOJOURN__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEnd() {
		return (Date)eDynamicGet(LifecyclePackage.SOJOURN__END, LifecyclePackage.Literals.SOJOURN__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Date newEnd) {
		eDynamicSet(LifecyclePackage.SOJOURN__END, LifecyclePackage.Literals.SOJOURN__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subject getBy() {
		return (Subject)eDynamicGet(LifecyclePackage.SOJOURN__BY, LifecyclePackage.Literals.SOJOURN__BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subject basicGetBy() {
		return (Subject)eDynamicGet(LifecyclePackage.SOJOURN__BY, LifecyclePackage.Literals.SOJOURN__BY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBy(Subject newBy) {
		eDynamicSet(LifecyclePackage.SOJOURN__BY, LifecyclePackage.Literals.SOJOURN__BY, newBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return (String)eDynamicGet(LifecyclePackage.SOJOURN__COMMENT, LifecyclePackage.Literals.SOJOURN__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		eDynamicSet(LifecyclePackage.SOJOURN__COMMENT, LifecyclePackage.Literals.SOJOURN__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LifecyclePackage.SOJOURN__STAGE:
				if (resolve) return getStage();
				return basicGetStage();
			case LifecyclePackage.SOJOURN__START:
				return getStart();
			case LifecyclePackage.SOJOURN__END:
				return getEnd();
			case LifecyclePackage.SOJOURN__BY:
				if (resolve) return getBy();
				return basicGetBy();
			case LifecyclePackage.SOJOURN__COMMENT:
				return getComment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LifecyclePackage.SOJOURN__STAGE:
				setStage((Stage)newValue);
				return;
			case LifecyclePackage.SOJOURN__START:
				setStart((Date)newValue);
				return;
			case LifecyclePackage.SOJOURN__END:
				setEnd((Date)newValue);
				return;
			case LifecyclePackage.SOJOURN__BY:
				setBy((Subject)newValue);
				return;
			case LifecyclePackage.SOJOURN__COMMENT:
				setComment((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case LifecyclePackage.SOJOURN__STAGE:
				setStage((Stage)null);
				return;
			case LifecyclePackage.SOJOURN__START:
				setStart(START_EDEFAULT);
				return;
			case LifecyclePackage.SOJOURN__END:
				setEnd(END_EDEFAULT);
				return;
			case LifecyclePackage.SOJOURN__BY:
				setBy((Subject)null);
				return;
			case LifecyclePackage.SOJOURN__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LifecyclePackage.SOJOURN__STAGE:
				return basicGetStage() != null;
			case LifecyclePackage.SOJOURN__START:
				return START_EDEFAULT == null ? getStart() != null : !START_EDEFAULT.equals(getStart());
			case LifecyclePackage.SOJOURN__END:
				return END_EDEFAULT == null ? getEnd() != null : !END_EDEFAULT.equals(getEnd());
			case LifecyclePackage.SOJOURN__BY:
				return basicGetBy() != null;
			case LifecyclePackage.SOJOURN__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
		}
		return super.eIsSet(featureID);
	}

} //SojournImpl
