package com.digitalml.rest.resources.codegentest.service;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstore.GogsSwaggerPetstoreServiceDefaultImpl;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetPetByIdInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetPetByIdReturnDTO;
import javax.ws.rs.core.SecurityContext;

public class GetPetByIdTests {

	@Test
	public void testOperationGetPetByIdBasicMapping()  {
		GogsSwaggerPetstoreServiceDefaultImpl serviceDefaultImpl = new GogsSwaggerPetstoreServiceDefaultImpl();
		GetPetByIdInputParametersDTO inputs = new GetPetByIdInputParametersDTO();
		inputs.setPetId(0);
		GetPetByIdReturnDTO returnValue = serviceDefaultImpl.getPetById(fullyAutheticatedSecurityContext, inputs);
		
		assertNotNull(returnValue);
		assertNotNull(returnValue.getResponseWrapper200GetPetById());				
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