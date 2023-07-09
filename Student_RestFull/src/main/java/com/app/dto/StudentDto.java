package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import com.app.entities.GenderEnum;

public class StudentDto {

	@NotBlank(message = "name cannot be blank")
	private String name;

	@NotBlank(message = "email cannot be blank")
	private String email;

	@NotBlank(message = "date of birth cannot be blank")
	private LocalDate dob;

	private GenderEnum gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public GenderEnum getGender() {
		return gender;
	}

	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", email=" + email + ", dob=" + dob + ", gender=" + gender + "]";
	}

}
