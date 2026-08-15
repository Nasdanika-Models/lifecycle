/**
 */
package org.nasdanika.models.lifecycle.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.lifecycle.LifecyclePackage;
import org.nasdanika.models.lifecycle.Stage;
import org.nasdanika.models.lifecycle.Transition;

import org.nasdanika.models.seal.impl.SealedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.lifecycle.impl.TransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.impl.TransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends SealedElementImpl implements Transition {
	/**
	 * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LifecyclePackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Stage> getFrom() {
		return (EList<Stage>)eDynamicGet(LifecyclePackage.TRANSITION__FROM, LifecyclePackage.Literals.TRANSITION__FROM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stage getTo() {
		return (Stage)eDynamicGet(LifecyclePackage.TRANSITION__TO, LifecyclePackage.Literals.TRANSITION__TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage basicGetTo() {
		return (Stage)eDynamicGet(LifecyclePackage.TRANSITION__TO, LifecyclePackage.Literals.TRANSITION__TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(Stage newTo) {
		eDynamicSet(LifecyclePackage.TRANSITION__TO, LifecyclePackage.Literals.TRANSITION__TO, newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGuard() {
		return (String)eDynamicGet(LifecyclePackage.TRANSITION__GUARD, LifecyclePackage.Literals.TRANSITION__GUARD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuard(String newGuard) {
		eDynamicSet(LifecyclePackage.TRANSITION__GUARD, LifecyclePackage.Literals.TRANSITION__GUARD, newGuard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LifecyclePackage.TRANSITION__FROM:
				return getFrom();
			case LifecyclePackage.TRANSITION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case LifecyclePackage.TRANSITION__GUARD:
				return getGuard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LifecyclePackage.TRANSITION__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends Stage>)newValue);
				return;
			case LifecyclePackage.TRANSITION__TO:
				setTo((Stage)newValue);
				return;
			case LifecyclePackage.TRANSITION__GUARD:
				setGuard((String)newValue);
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
			case LifecyclePackage.TRANSITION__FROM:
				getFrom().clear();
				return;
			case LifecyclePackage.TRANSITION__TO:
				setTo((Stage)null);
				return;
			case LifecyclePackage.TRANSITION__GUARD:
				setGuard(GUARD_EDEFAULT);
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
			case LifecyclePackage.TRANSITION__FROM:
				return !getFrom().isEmpty();
			case LifecyclePackage.TRANSITION__TO:
				return basicGetTo() != null;
			case LifecyclePackage.TRANSITION__GUARD:
				return GUARD_EDEFAULT == null ? getGuard() != null : !GUARD_EDEFAULT.equals(getGuard());
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
