package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Pet:
{
  "required": [
    "name",
    "photoUrls"
  ],
  "type": "object",
  "properties": {
    "id": {
      "type": "integer",
      "format": "int64"
    },
    "category": {
      "$ref": "Category"
    },
    "name": {
      "type": "string"
    },
    "photoUrls": {
      "minItems": 1,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "tags": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "Tag"
      }
    },
    "status": {
      "enum": [
        "available",
        "pending",
        "sold"
      ],
      "description": "pet status in the store",
      "type": "string"
    }
  }
}
*/


public class Pet {
	public enum Status {
		available,pending,sold
	}

	@Size(max=1)
	private Integer id;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Category category;

	@Size(max=1)
	@NotNull
	private String name;

	private List<String> photoUrls;

	@Size(max=1)
	private List<com.digitalml.rest.resources.codegentest.Tag> tags;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Pet.Status status;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    id = null;
	    category = null;
	    name = org.apache.commons.lang3.StringUtils.EMPTY;
	    photoUrls = new ArrayList<String>();
	    tags = new ArrayList<com.digitalml.rest.resources.codegentest.Tag>();
	    status = null;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public com.digitalml.rest.resources.codegentest.Category getCategory() {
		return category;
	}
	
	public void setCategory(com.digitalml.rest.resources.codegentest.Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhotoUrls() {
		return photoUrls;
	}
	
	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}

	public List<com.digitalml.rest.resources.codegentest.Tag> getTags() {
		return tags;
	}
	
	public void setTags(List<com.digitalml.rest.resources.codegentest.Tag> tags) {
		this.tags = tags;
	}
@ApiModelProperty(notes = "pet status in the store")
	public com.digitalml.rest.resources.codegentest.Pet.Status getStatus() {
		return status;
	}
	
	public void setStatus(com.digitalml.rest.resources.codegentest.Pet.Status status) {
		this.status = status;
	}
}