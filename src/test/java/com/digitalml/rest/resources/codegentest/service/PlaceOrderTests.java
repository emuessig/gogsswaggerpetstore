package com.digitalml.rest.resources.codegentest.service;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstore.GogsSwaggerPetstoreServiceDefaultImpl;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.PlaceOrderInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.PlaceOrderReturnDTO;
import javax.ws.rs.core.SecurityContext;

public class PlaceOrderTests {

	@Test
	public void testOperationPlaceOrderBasicMapping()  {
		GogsSwaggerPetstoreServiceDefaultImpl serviceDefaultImpl = new GogsSwaggerPetstoreServiceDefaultImpl();
		PlaceOrderInputParametersDTO inputs = new PlaceOrderInputParametersDTO();
		inputs.setBody(new Order());
		PlaceOrderReturnDTO returnValue = serviceDefaultImpl.placeOrder(fullyAutheticatedSecurityContext, inputs);
		
		assertNotNull(returnValue);
		assertNotNull(returnValue.getResponseWrapper200PlaceOrder());				
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