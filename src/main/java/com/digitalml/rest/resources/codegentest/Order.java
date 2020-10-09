package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Order:
{
  "type": "object",
  "properties": {
    "id": {
      "type": "integer",
      "format": "int64"
    },
    "petId": {
      "type": "integer",
      "format": "int64"
    },
    "quantity": {
      "type": "integer",
      "format": "int32"
    },
    "shipDate": {
      "type": "string",
      "format": "date-time"
    },
    "status": {
      "enum": [
        "placed",
        "approved",
        "delivered"
      ],
      "description": "Order Status",
      "type": "string"
    },
    "complete": {
      "type": "boolean",
      "default": false
    }
  }
}
*/


public class Order {
	public enum Status {
		placed,approved,delivered
	}

	@Size(max=1)
	private Integer id;

	@Size(max=1)
	private Integer petId;

	@Size(max=1)
	private Integer quantity;

	@Size(max=1)
	private Date shipDate;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Order.Status status;

	@Size(max=1)
	private boolean complete;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    id = null;
	    petId = null;
	    quantity = null;
	    
	    status = null;
	    
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPetId() {
		return petId;
	}
	
	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getShipDate() {
		return shipDate;
	}
	
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
@ApiModelProperty(notes = "Order Status")
	public com.digitalml.rest.resources.codegentest.Order.Status getStatus() {
		return status;
	}
	
	public void setStatus(com.digitalml.rest.resources.codegentest.Order.Status status) {
		this.status = status;
	}

	public boolean getComplete() {
		return complete;
	}
	
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
}