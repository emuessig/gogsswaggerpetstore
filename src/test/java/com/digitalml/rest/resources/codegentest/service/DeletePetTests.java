package com.digitalml.rest.resources.codegentest.service;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstore.GogsSwaggerPetstoreServiceDefaultImpl;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeletePetInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeletePetReturnDTO;
import javax.ws.rs.core.SecurityContext;

public class DeletePetTests {

	@Test
	public void testOperationDeletePetBasicMapping()  {
		GogsSwaggerPetstoreServiceDefaultImpl serviceDefaultImpl = new GogsSwaggerPetstoreServiceDefaultImpl();
		DeletePetInputParametersDTO inputs = new DeletePetInputParametersDTO();
		inputs.setPetId(0);
		DeletePetReturnDTO returnValue = serviceDefaultImpl.deletePet(fullyAutheticatedSecurityContext, inputs);
		
		assertNotNull(returnValue);				
	}
	

	private SecurityContext fullyAutheticatedSecurityContext = new SecurityContext() {

		@Override
		public boolean isUserInRole(String arg0) {
			return true;
		}

		@Override
		public boolean isSecure() {
			return false;
		}

		@Override
		public Principal getUserPrincipal() {
			return null;
		}

		@Override
		public String getAuthenticationScheme() {
			return null;
		}
	};
}