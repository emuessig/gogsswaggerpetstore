package com.digitalml.rest.resources.codegentest.service;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstore.GogsSwaggerPetstoreServiceDefaultImpl;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetOrderByIdInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetOrderByIdReturnDTO;
import javax.ws.rs.core.SecurityContext;

public class GetOrderByIdTests {

	@Test
	public void testOperationGetOrderByIdBasicMapping()  {
		GogsSwaggerPetstoreServiceDefaultImpl serviceDefaultImpl = new GogsSwaggerPetstoreServiceDefaultImpl();
		GetOrderByIdInputParametersDTO inputs = new GetOrderByIdInputParametersDTO();
		inputs.setOrderId(0);
		GetOrderByIdReturnDTO returnValue = serviceDefaultImpl.getOrderById(fullyAutheticatedSecurityContext, inputs);
		
		assertNotNull(returnValue);
		assertNotNull(returnValue.getResponseWrapper200GetOrderById());				
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