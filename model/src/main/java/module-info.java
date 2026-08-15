import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.lifecycle.capability.LifecycleEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.lifecycle.capability.LifecycleResourceFactoryCapabilityFactory;

module org.nasdanika.models.lifecycle {
	
	exports org.nasdanika.models.lifecycle;
	exports org.nasdanika.models.lifecycle.impl;
	exports org.nasdanika.models.lifecycle.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.seal;
	
	provides CapabilityFactory with 
		LifecycleEPackageResourceSetCapabilityFactory,
		LifecycleResourceFactoryCapabilityFactory;
	
}