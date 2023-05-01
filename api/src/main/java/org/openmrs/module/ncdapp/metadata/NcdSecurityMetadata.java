package org.openmrs.module.ncdapp.metadata;

import org.openmrs.module.metadatadeploy.bundle.AbstractMetadataBundle;
import org.openmrs.module.metadatadeploy.bundle.Requires;
import org.springframework.stereotype.Component;

import static org.openmrs.module.metadatadeploy.bundle.CoreConstructors.*;

/**
 * Implementation of access control to the app.
 */
@Component
public class NcdSecurityMetadata extends AbstractMetadataBundle {
	
	public static class _Privilege {
		
		public static final String APP_NCD_ADMIN = "App: ncd.app.home";
	}
	
	public static final class _Role {
		
		public static final String APPLICATION_NCD_ADMIN = "ncd app administration";
		
		public static final String API_PRIVILEGES_VIEW_AND_EDIT = "API Privileges (View and Edit)";
		
	}
	
	/**
	 * @see AbstractMetadataBundle#install()
	 */
	@Override
	public void install() {
		
		install(privilege(_Privilege.APP_NCD_ADMIN, "Able to assess ncd for a patient"));
		install(role(_Role.APPLICATION_NCD_ADMIN, "Can access ncd app",
				idSet(_Role.API_PRIVILEGES_VIEW_AND_EDIT),
		        idSet(_Privilege.APP_NCD_ADMIN)));
	}
}
