package com.digitalml.rest.resources.codegentest.service;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstore.GogsSwaggerPetstoreServiceDefaultImpl;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeleteOrderInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeleteOrderReturnDTO;
import javax.ws.rs.core.SecurityContext;

public class DeleteOrderTests {

	@Test
	public void testOperationDeleteOrderBasicMapping()  {
		GogsSwaggerPetstoreServiceDefaultImpl serviceDefaultImpl = new GogsSwaggerPetstoreServiceDefaultImpl();
		DeleteOrderInputParametersDTO inputs = new DeleteOrderInputParametersDTO();
		inputs.setOrderId(0);
		DeleteOrderReturnDTO returnValue = serviceDefaultImpl.deleteOrder(fullyAutheticatedSecurityContext, inputs);
		
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