package com.app.entities;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student extends BaseEntity {

	@Column(unique = true, name = "student_name")
	private String name;

	@Column(unique = true, name = "email")
	private String email;

	@Column(name = "date_of_birth")
	private LocalDate dob;

	@Column(name = "gender_category")
	private GenderEnum gender;

	public Student() {
		super();
	}

	public Student(String name, String email, LocalDate dob, GenderEnum gender) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
	}

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
		return "Student [name=" + name + ", email=" + email + ", dob=" + dob + ", gender=" + gender + "]";
	}

}
