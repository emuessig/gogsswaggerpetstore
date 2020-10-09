package com.digitalml.rest.resources.codegentest.service;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstore.GogsSwaggerPetstoreServiceDefaultImpl;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.UploadFileInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.UploadFileReturnDTO;
import javax.ws.rs.core.SecurityContext;

public class UploadFileTests {

	@Test
	public void testOperationUploadFileBasicMapping()  {
		GogsSwaggerPetstoreServiceDefaultImpl serviceDefaultImpl = new GogsSwaggerPetstoreServiceDefaultImpl();
		UploadFileInputParametersDTO inputs = new UploadFileInputParametersDTO();
		inputs.setPetId(0);
		inputs.setAdditionalMetadata(null);
		inputs.setFile(null);
		UploadFileReturnDTO returnValue = serviceDefaultImpl.uploadFile(fullyAutheticatedSecurityContext, inputs);
		
		assertNotNull(returnValue);
		assertNotNull(returnValue.getResponseWrapper200UploadFile());				
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