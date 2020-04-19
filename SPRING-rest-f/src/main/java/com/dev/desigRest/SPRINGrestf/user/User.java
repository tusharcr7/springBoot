package com.dev.desigRest.SPRINGrestf.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;*/

/*@ApiModel(description="Skeleton")*/  //uncomment for swagger
public class User {

	private Integer id;
	@Size(min=2,message="Name should have atleast two character")
	private String name;
	
	@Past(message="DOB should be in past date ")
	/* @ApiModelProperty(notes="DOB should be in past date") *///uncomment for swagger
	private Date birthDate;

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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

}
