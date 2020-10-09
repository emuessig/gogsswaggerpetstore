package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for User:
{
  "type": "object",
  "properties": {
    "id": {
      "type": "integer",
      "format": "int64"
    },
    "username": {
      "type": "string"
    },
    "firstName": {
      "type": "string"
    },
    "lastName": {
      "type": "string"
    },
    "email": {
      "type": "string"
    },
    "password": {
      "type": "string"
    },
    "phone": {
      "type": "string"
    },
    "userStatus": {
      "description": "User Status",
      "type": "integer",
      "format": "int32"
    }
  }
}
*/


public class User {

	@Size(max=1)
	private Integer id;

	@Size(max=1)
	private String username;

	@Size(max=1)
	private String firstName;

	@Size(max=1)
	private String lastName;

	@Size(max=1)
	private String email;

	@Size(max=1)
	private String password;

	@Size(max=1)
	private String phone;

	@Size(max=1)
	private Integer userStatus;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    id = null;
	    username = null;
	    firstName = null;
	    lastName = null;
	    email = null;
	    password = null;
	    phone = null;
	    userStatus = null;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
@ApiModelProperty(notes = "User Status")
	public Integer getUserStatus() {
		return userStatus;
	}
	
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
}