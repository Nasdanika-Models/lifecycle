/**
 */
package org.nasdanika.models.lifecycle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.lifecycle.Lifecycle;
import org.nasdanika.models.lifecycle.LifecyclePackage;
import org.nasdanika.models.lifecycle.Sojourn;
import org.nasdanika.models.lifecycle.Stage;
import org.nasdanika.models.lifecycle.Staged;

import org.nasdanika.models.seal.impl.SealedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staged</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.lifecycle.impl.StagedImpl#getLifecycles <em>Lifecycles</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.impl.StagedImpl#getSojourns <em>Sojourns</em>}</li>
 *   <li>{@link org.nasdanika.models.lifecycle.impl.StagedImpl#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StagedImpl extends SealedElementImpl implements Staged {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StagedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LifecyclePackage.Literals.STAGED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Lifecycle> getLifecycles() {
		return (EList<Lifecycle>)eDynamicGet(LifecyclePackage.STAGED__LIFECYCLES, LifecyclePackage.Literals.STAGED__LIFECYCLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Sojourn> getSojourns() {
		return (EList<Sojourn>)eDynamicGet(LifecyclePackage.STAGED__SOJOURNS, LifecyclePackage.Literals.STAGED__SOJOURNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stage> getCurrent() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LifecyclePackage.STAGED__SOJOURNS:
				return ((InternalEList<?>)getSojourns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LifecyclePackage.STAGED__LIFECYCLES:
				return getLifecycles();
			case LifecyclePackage.STAGED__SOJOURNS:
				return getSojourns();
			case LifecyclePackage.STAGED__CURRENT:
				return getCurrent();
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
			case LifecyclePackage.STAGED__LIFECYCLES:
				getLifecycles().clear();
				getLifecycles().addAll((Collection<? extends Lifecycle>)newValue);
				return;
			case LifecyclePackage.STAGED__SOJOURNS:
				getSojourns().clear();
				getSojourns().addAll((Collection<? extends Sojourn>)newValue);
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
			case LifecyclePackage.STAGED__LIFECYCLES:
				getLifecycles().clear();
				return;
			case LifecyclePackage.STAGED__SOJOURNS:
				getSojourns().clear();
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
			case LifecyclePackage.STAGED__LIFECYCLES:
				return !getLifecycles().isEmpty();
			case LifecyclePackage.STAGED__SOJOURNS:
				return !getSojourns().isEmpty();
			case LifecyclePackage.STAGED__CURRENT:
				return !getCurrent().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StagedImpl
