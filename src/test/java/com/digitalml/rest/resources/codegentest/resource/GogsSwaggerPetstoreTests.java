package com.digitalml.rest.resources.codegentest.resource;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public class GogsSwaggerPetstoreTests {

	@Test
	public void testResourceInitialisation() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		Assert.assertNotNull(resource);
	}

	@Test
	public void testResourcePing() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		Response response = resource.pingGogsSwaggerPetstore();
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationUpdatePetNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.updatePet(new Pet());
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationUpdatePetAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.updatePet(new Pet());
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationAddPetNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.addPet(new Pet());
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationAddPetAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.addPet(new Pet());
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationGetUserByNameNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.getUserByName(org.apache.commons.lang3.StringUtils.EMPTY);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationGetUserByNameAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.getUserByName(org.apache.commons.lang3.StringUtils.EMPTY);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationUpdateUserNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.updateUser(org.apache.commons.lang3.StringUtils.EMPTY, new User());
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationUpdateUserAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.updateUser(org.apache.commons.lang3.StringUtils.EMPTY, new User());
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationDeleteUserNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.deleteUser(org.apache.commons.lang3.StringUtils.EMPTY);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationDeleteUserAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.deleteUser(org.apache.commons.lang3.StringUtils.EMPTY);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationFindPetsByStatusNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.findPetsByStatus(new ArrayList<String>());
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationFindPetsByStatusAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.findPetsByStatus(new ArrayList<String>());
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationCreateUsersWithListInputNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.createUsersWithListInput(new ArrayList<com.digitalml.rest.resources.codegentest.User>());
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationCreateUsersWithListInputAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.createUsersWithListInput(new ArrayList<com.digitalml.rest.resources.codegentest.User>());
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationUploadFileNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.uploadFile(0, null, null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationUploadFileAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.uploadFile(0, null, null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationGetInventoryNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.getInventory();
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationGetInventoryAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.getInventory();
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationLoginUserNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.loginUser(org.apache.commons.lang3.StringUtils.EMPTY, org.apache.commons.lang3.StringUtils.EMPTY);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationLoginUserAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.loginUser(org.apache.commons.lang3.StringUtils.EMPTY, org.apache.commons.lang3.StringUtils.EMPTY);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationCreateUserNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.createUser(new User());
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationCreateUserAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.createUser(new User());
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationCreateUsersWithArrayInputNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.createUsersWithArrayInput(new ArrayList<com.digitalml.rest.resources.codegentest.User>());
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationCreateUsersWithArrayInputAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.createUsersWithArrayInput(new ArrayList<com.digitalml.rest.resources.codegentest.User>());
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationFindPetsByTagsNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.findPetsByTags(new ArrayList<String>());
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationFindPetsByTagsAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.findPetsByTags(new ArrayList<String>());
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationPlaceOrderNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.placeOrder(new Order());
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationPlaceOrderAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.placeOrder(new Order());
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationLogoutUserNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.logoutUser();
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationLogoutUserAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.logoutUser();
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationGetPetByIdNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.getPetById(0);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationGetPetByIdAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.getPetById(0);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationUpdatePetWithFormNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.updatePetWithForm(0, null, null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationUpdatePetWithFormAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.updatePetWithForm(0, null, null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationDeletePetNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.deletePet(0);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationDeletePetAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.deletePet(0);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationGetOrderByIdNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.getOrderById(0);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationGetOrderByIdAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.getOrderById(0);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationDeleteOrderNoSecurity() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(null);

		Response response = resource.deleteOrder(0);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationDeleteOrderAuthorised() {
		GogsSwaggerPetstoreResource resource = new GogsSwaggerPetstoreResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.deleteOrder(0);
		Assert.assertEquals(200, response.getStatus());
	}

	private SecurityContext unautheticatedSecurityContext = new SecurityContext() {

		@Override
		public boolean isUserInRole(String arg0) {
			return false;
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