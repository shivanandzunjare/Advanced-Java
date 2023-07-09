package com.app.DTO;

import javax.validation.constraints.NotBlank;

import com.app.entities.Category;

public class RequestDTO {

	@NotBlank
	private Category category;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "RequestDTO [category=" + category + "]";
	}
	
	

}
