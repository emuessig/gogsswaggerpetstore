package com.digitalml.rest.resources.codegentest.service;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstore.GogsSwaggerPetstoreServiceDefaultImpl;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.CreateUsersWithArrayInputInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.CreateUsersWithArrayInputReturnDTO;
import javax.ws.rs.core.SecurityContext;

public class CreateUsersWithArrayInputTests {

	@Test
	public void testOperationCreateUsersWithArrayInputBasicMapping()  {
		GogsSwaggerPetstoreServiceDefaultImpl serviceDefaultImpl = new GogsSwaggerPetstoreServiceDefaultImpl();
		CreateUsersWithArrayInputInputParametersDTO inputs = new CreateUsersWithArrayInputInputParametersDTO();
		inputs.setBody(new ArrayList<com.digitalml.rest.resources.codegentest.User>());
		CreateUsersWithArrayInputReturnDTO returnValue = serviceDefaultImpl.createUsersWithArrayInput(fullyAutheticatedSecurityContext, inputs);
		
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