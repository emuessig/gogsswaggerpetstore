package com.digitalml.rest.resources.codegentest.resource;
        	
import java.lang.IllegalArgumentException;
import java.security.AccessControlException;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.Object;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
	
// Customer specific imports

// Service specific imports
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService;
	
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.UpdatePetReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.UpdatePetReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.UpdatePetInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.AddPetReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.AddPetReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.AddPetInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetUserByNameReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetUserByNameReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetUserByNameInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.UpdateUserReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.UpdateUserReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.UpdateUserInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeleteUserReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeleteUserReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeleteUserInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.FindPetsByStatusReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.FindPetsByStatusReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.FindPetsByStatusInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.CreateUsersWithListInputReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.CreateUsersWithListInputReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.CreateUsersWithListInputInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.UploadFileReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.UploadFileReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.UploadFileInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetInventoryReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetInventoryReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetInventoryInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.LoginUserReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.LoginUserReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.LoginUserInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.CreateUserReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.CreateUserReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.CreateUserInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.CreateUsersWithArrayInputReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.CreateUsersWithArrayInputReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.CreateUsersWithArrayInputInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.FindPetsByTagsReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.FindPetsByTagsReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.FindPetsByTagsInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.PlaceOrderReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.PlaceOrderReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.PlaceOrderInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.LogoutUserReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.LogoutUserReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.LogoutUserInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetPetByIdReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetPetByIdReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetPetByIdInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.UpdatePetWithFormReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.UpdatePetWithFormReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.UpdatePetWithFormInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeletePetReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeletePetReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeletePetInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetOrderByIdReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetOrderByIdReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.GetOrderByIdInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeleteOrderReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeleteOrderReturnDTO;
import com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstoreService.DeleteOrderInputParametersDTO;
	
import com.digitalml.rest.resources.codegentest.*;
	
	/**
	 * Service: Gogs Swagger Petstore
	 * GOGS: This is a sample server Petstore server.  You can find out more about Swagger at
[http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you
can use the api key &#x60;special-key&#x60; to test the authorization filters.
	 *
	 * @author Group1
	 * @version 1.0.2
	 *
	 */
	
	@Produces({ MediaType.TEXT_PLAIN })
	public class GogsSwaggerPetstoreResource {
		
	private static final Logger LOGGER = LoggerFactory.getLogger(GogsSwaggerPetstoreResource.class);
	
	@Context
	private SecurityContext securityContext;

	@Context
	private javax.ws.rs.core.Request request;

	@Context
	private HttpServletRequest httpRequest;

	private GogsSwaggerPetstoreService delegateService;

	private String implementationClass = "com.digitalml.rest.resources.codegentest.service.GogsSwaggerPetstore.GogsSwaggerPetstoreServiceDefaultImpl";

	public void setImplementationClass(String className) {
		implementationClass = className;
	}

	public void setImplementationClass(Class clazz) {
		if (clazz == null)
			throw new IllegalArgumentException("Parameter clazz cannot be null");

		implementationClass = clazz.getName();
	}
		
	private GogsSwaggerPetstoreService getCurrentImplementation() {

		Object object = null;
		try {
			Class c = Class.forName(implementationClass, true, Thread.currentThread().getContextClassLoader());
			object = c.newInstance();

		} catch (ClassNotFoundException exc) {
			LOGGER.error(implementationClass + " not found");
			return null;

		} catch (IllegalAccessException exc) {
			LOGGER.error("Cannot access " + implementationClass);
			return null;

		} catch (InstantiationException exc) {
			LOGGER.error("Cannot instantiate " + implementationClass);
			return null;
		}

		if (!(object instanceof GogsSwaggerPetstoreService)) {
			LOGGER.error(implementationClass + " is not an instance of " + GogsSwaggerPetstoreService.class.getName());
			return null;
		}

		return (GogsSwaggerPetstoreService)object;
	}
	
	{
		delegateService = getCurrentImplementation();
	}
	
	public void setSecurityContext(SecurityContext securityContext) {
		this.securityContext = securityContext;
	}


	/**
	Method: updatePet
	*/
	
	@ApiOperation(nickname = "updatePet", httpMethod = "PUT", value = "updatePet")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@PUT
	public javax.ws.rs.core.Response updatePet(
		 com.digitalml.rest.resources.codegentest.Pet body) {

		UpdatePetInputParametersDTO inputs = new GogsSwaggerPetstoreService.UpdatePetInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setBody(body);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			UpdatePetReturnDTO returnValue = delegateService.updatePet(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: addPet
	*/
	
	@ApiOperation(nickname = "addPet", httpMethod = "POST", value = "addPet")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@POST
	public javax.ws.rs.core.Response addPet(
		 com.digitalml.rest.resources.codegentest.Pet body) {

		AddPetInputParametersDTO inputs = new GogsSwaggerPetstoreService.AddPetInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setBody(body);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			AddPetReturnDTO returnValue = delegateService.addPet(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: getUserByName
	*/
	
	@ApiOperation(nickname = "getUserByName", httpMethod = "GET", value = "getUserByName")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response getUserByName(
		@QueryParam("username") String username) {

		GetUserByNameInputParametersDTO inputs = new GogsSwaggerPetstoreService.GetUserByNameInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setUsername(username);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			GetUserByNameReturnDTO returnValue = delegateService.getUserByName(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: updateUser
		This can only be done by the logged in user.
	*/
	
	@ApiOperation(nickname = "updateUser", httpMethod = "PUT", value = "updateUser" , notes = "This can only be done by the logged in user.")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@PUT
	public javax.ws.rs.core.Response updateUser(
		@QueryParam("username") String username,
		 com.digitalml.rest.resources.codegentest.User body) {

		UpdateUserInputParametersDTO inputs = new GogsSwaggerPetstoreService.UpdateUserInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setUsername(username);
		inputs.setBody(body);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			UpdateUserReturnDTO returnValue = delegateService.updateUser(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: deleteUser
		This can only be done by the logged in user.
	*/
	
	@ApiOperation(nickname = "deleteUser", httpMethod = "DELETE", value = "deleteUser" , notes = "This can only be done by the logged in user.")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@DELETE
	public javax.ws.rs.core.Response deleteUser(
		@QueryParam("username") String username) {

		DeleteUserInputParametersDTO inputs = new GogsSwaggerPetstoreService.DeleteUserInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setUsername(username);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			DeleteUserReturnDTO returnValue = delegateService.deleteUser(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: findPetsByStatus
		Multiple status values can be provided with comma separated strings
	*/
	
	@ApiOperation(nickname = "findPetsByStatus", httpMethod = "GET", value = "findPetsByStatus" , notes = "Multiple status values can be provided with comma separated strings")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response findPetsByStatus(
		 List<String> status) {

		FindPetsByStatusInputParametersDTO inputs = new GogsSwaggerPetstoreService.FindPetsByStatusInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setStatus(status);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			FindPetsByStatusReturnDTO returnValue = delegateService.findPetsByStatus(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: createUsersWithListInput
	*/
	
	@ApiOperation(nickname = "createUsersWithListInput", httpMethod = "POST", value = "createUsersWithListInput")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@POST
	public javax.ws.rs.core.Response createUsersWithListInput(
		 List<com.digitalml.rest.resources.codegentest.User> body) {

		CreateUsersWithListInputInputParametersDTO inputs = new GogsSwaggerPetstoreService.CreateUsersWithListInputInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setBody(body);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			CreateUsersWithListInputReturnDTO returnValue = delegateService.createUsersWithListInput(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: uploadFile
	*/
	
	@ApiOperation(nickname = "uploadFile", httpMethod = "POST", value = "uploadFile")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@POST
	public javax.ws.rs.core.Response uploadFile(
		@QueryParam("petId") int petId,
		@QueryParam("additionalMetadata") String additionalMetadata,
		@QueryParam("file") String file) {

		UploadFileInputParametersDTO inputs = new GogsSwaggerPetstoreService.UploadFileInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setPetId(petId);
		inputs.setAdditionalMetadata(additionalMetadata);
		inputs.setFile(file);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			UploadFileReturnDTO returnValue = delegateService.uploadFile(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: getInventory
		Returns a map of status codes to quantities
	*/
	
	@ApiOperation(nickname = "getInventory", httpMethod = "GET", value = "getInventory" , notes = "Returns a map of status codes to quantities")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response getInventory() {

		GetInventoryInputParametersDTO inputs = new GogsSwaggerPetstoreService.GetInventoryInputParametersDTO();
		// Prepare and check all input parameters


		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			GetInventoryReturnDTO returnValue = delegateService.getInventory(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: loginUser
	*/
	
	@ApiOperation(nickname = "loginUser", httpMethod = "GET", value = "loginUser")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response loginUser(
		@QueryParam("username") String username,
		@QueryParam("password") String password) {

		LoginUserInputParametersDTO inputs = new GogsSwaggerPetstoreService.LoginUserInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setUsername(username);
		inputs.setPassword(password);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			LoginUserReturnDTO returnValue = delegateService.loginUser(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: createUser
		This can only be done by the logged in user.
	*/
	
	@ApiOperation(nickname = "createUser", httpMethod = "POST", value = "createUser" , notes = "This can only be done by the logged in user.")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@POST
	public javax.ws.rs.core.Response createUser(
		 com.digitalml.rest.resources.codegentest.User body) {

		CreateUserInputParametersDTO inputs = new GogsSwaggerPetstoreService.CreateUserInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setBody(body);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			CreateUserReturnDTO returnValue = delegateService.createUser(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: createUsersWithArrayInput
	*/
	
	@ApiOperation(nickname = "createUsersWithArrayInput", httpMethod = "POST", value = "createUsersWithArrayInput")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@POST
	public javax.ws.rs.core.Response createUsersWithArrayInput(
		 List<com.digitalml.rest.resources.codegentest.User> body) {

		CreateUsersWithArrayInputInputParametersDTO inputs = new GogsSwaggerPetstoreService.CreateUsersWithArrayInputInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setBody(body);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			CreateUsersWithArrayInputReturnDTO returnValue = delegateService.createUsersWithArrayInput(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: findPetsByTags
		Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3
for testing.
	*/
	
	@ApiOperation(nickname = "findPetsByTags", httpMethod = "GET", value = "findPetsByTags" , notes = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response findPetsByTags(
		 List<String> tags) {

		FindPetsByTagsInputParametersDTO inputs = new GogsSwaggerPetstoreService.FindPetsByTagsInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setTags(tags);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			FindPetsByTagsReturnDTO returnValue = delegateService.findPetsByTags(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: placeOrder
	*/
	
	@ApiOperation(nickname = "placeOrder", httpMethod = "POST", value = "placeOrder")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@POST
	public javax.ws.rs.core.Response placeOrder(
		 com.digitalml.rest.resources.codegentest.Order body) {

		PlaceOrderInputParametersDTO inputs = new GogsSwaggerPetstoreService.PlaceOrderInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setBody(body);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			PlaceOrderReturnDTO returnValue = delegateService.placeOrder(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: logoutUser
	*/
	
	@ApiOperation(nickname = "logoutUser", httpMethod = "GET", value = "logoutUser")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response logoutUser() {

		LogoutUserInputParametersDTO inputs = new GogsSwaggerPetstoreService.LogoutUserInputParametersDTO();
		// Prepare and check all input parameters


		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			LogoutUserReturnDTO returnValue = delegateService.logoutUser(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: getPetById
		Returns a single pet
	*/
	
	@ApiOperation(nickname = "getPetById", httpMethod = "GET", value = "getPetById" , notes = "Returns a single pet")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response getPetById(
		@QueryParam("petId") int petId) {

		GetPetByIdInputParametersDTO inputs = new GogsSwaggerPetstoreService.GetPetByIdInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setPetId(petId);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			GetPetByIdReturnDTO returnValue = delegateService.getPetById(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: updatePetWithForm
	*/
	
	@ApiOperation(nickname = "updatePetWithForm", httpMethod = "POST", value = "updatePetWithForm")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@POST
	public javax.ws.rs.core.Response updatePetWithForm(
		@QueryParam("petId") int petId,
		@QueryParam("name") String name,
		@QueryParam("status") String status) {

		UpdatePetWithFormInputParametersDTO inputs = new GogsSwaggerPetstoreService.UpdatePetWithFormInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setPetId(petId);
		inputs.setName(name);
		inputs.setStatus(status);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			UpdatePetWithFormReturnDTO returnValue = delegateService.updatePetWithForm(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: deletePet
	*/
	
	@ApiOperation(nickname = "deletePet", httpMethod = "DELETE", value = "deletePet")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@DELETE
	public javax.ws.rs.core.Response deletePet(
		@QueryParam("petId") int petId) {

		DeletePetInputParametersDTO inputs = new GogsSwaggerPetstoreService.DeletePetInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setPetId(petId);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			DeletePetReturnDTO returnValue = delegateService.deletePet(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: getOrderById
		For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10. Other values will
generated exceptions
	*/
	
	@ApiOperation(nickname = "getOrderById", httpMethod = "GET", value = "getOrderById" , notes = "For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10. Other values will generated exceptions")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response getOrderById(
		@QueryParam("orderId") int orderId) {

		GetOrderByIdInputParametersDTO inputs = new GogsSwaggerPetstoreService.GetOrderByIdInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setOrderId(orderId);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			GetOrderByIdReturnDTO returnValue = delegateService.getOrderById(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: deleteOrder
		For valid response try integer IDs with positive integer value. Negative or
non-integer values will generate API errors
	*/
	
	@ApiOperation(nickname = "deleteOrder", httpMethod = "DELETE", value = "deleteOrder" , notes = "For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@DELETE
	public javax.ws.rs.core.Response deleteOrder(
		@QueryParam("orderId") int orderId) {

		DeleteOrderInputParametersDTO inputs = new GogsSwaggerPetstoreService.DeleteOrderInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setOrderId(orderId);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			DeleteOrderReturnDTO returnValue = delegateService.deleteOrder(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	

	/**
	* Generic ping method to allow callers to check if the service is up and running.
	*/
	@ApiResponses({ @ApiResponse(code = 200, message = "I'm alive!") })
	@GET
	@Path("/ping")
	public javax.ws.rs.core.Response pingGogsSwaggerPetstore() {
		javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok();
		return builder.build();
	}
}