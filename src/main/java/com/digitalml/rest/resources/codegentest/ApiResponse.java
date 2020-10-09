package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for ApiResponse:
{
  "type": "object",
  "properties": {
    "code": {
      "type": "integer",
      "format": "int32"
    },
    "type": {
      "type": "string"
    },
    "message": {
      "type": "string"
    }
  }
}
*/


public class ApiResponse {

	@Size(max=1)
	private Integer code;

	@Size(max=1)
	private String type;

	@Size(max=1)
	private String message;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    code = null;
	    type = null;
	    message = null;
	}

	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}