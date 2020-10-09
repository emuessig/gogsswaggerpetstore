package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Tag:
{
  "type": "object",
  "properties": {
    "id": {
      "type": "integer",
      "format": "int64"
    },
    "name": {
      "type": "string"
    }
  }
}
*/


public class Tag {

	@Size(max=1)
	private Integer id;

	@Size(max=1)
	private String name;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    id = null;
	    name = null;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}