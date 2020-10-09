package com.digitalml.rest.resources.codegentest.service;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstore.GogsSwaggerPetstoreServiceDefaultImpl;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeleteUserInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeleteUserReturnDTO;
import javax.ws.rs.core.SecurityContext;

public class DeleteUserTests {

	@Test
	public void testOperationDeleteUserBasicMapping()  {
		GogsSwaggerPetstoreServiceDefaultImpl serviceDefaultImpl = new GogsSwaggerPetstoreServiceDefaultImpl();
		DeleteUserInputParametersDTO inputs = new DeleteUserInputParametersDTO();
		inputs.setUsername(org.apache.commons.lang3.StringUtils.EMPTY);
		DeleteUserReturnDTO returnValue = serviceDefaultImpl.deleteUser(fullyAutheticatedSecurityContext, inputs);
		
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