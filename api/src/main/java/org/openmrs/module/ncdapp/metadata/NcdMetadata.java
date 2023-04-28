/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.ncdapp.metadata;

import org.openmrs.module.metadatadeploy.bundle.AbstractMetadataBundle;
import org.springframework.stereotype.Component;

import static org.openmrs.module.metadatadeploy.bundle.CoreConstructors.encounterType;
import static org.openmrs.module.metadatadeploy.bundle.CoreConstructors.form;

/**
 * Metadata constants
 */
@Component
public class NcdMetadata extends AbstractMetadataBundle {
	
	public static final class _EncounterType {
		
		public static final String NCD_ASSESSMENT = "2e19c856-e420-11ed-b5ea-0242ac120002";
	}
	
	public static final class _Form {
		
		public static final String NCD_ASSESSMENT_FORM = "2e19c856-e420-11ed-b5ea-0242ac120002";
	}
	
	@Override
	public void install() throws Exception {
		
		install(encounterType("NCD Assessment Encounter",
		    "A visit encounter that provides assessment questions for ncd conditions and treatment",
		    _EncounterType.NCD_ASSESSMENT));
		
		install(form("NCD Assessment form", null, _EncounterType.NCD_ASSESSMENT, "1",
		    _Form.NCD_ASSESSMENT_FORM));
	}
	
}
