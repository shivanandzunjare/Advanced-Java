package com.app.DTO;

import javax.validation.constraints.NotBlank;

public class RequestDTo {

	@NotBlank
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
