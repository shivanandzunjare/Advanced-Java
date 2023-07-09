package com.app.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name=" course")

public class Course extends BaseEntity
{
//nm category   start date end date fee updatwe datetime
	
	@Column(name=" name" , nullable = false, unique = true)
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Category category;
	
	@Column(name= " start_date" , nullable =  false)
	private LocalDate start_date;
	
	@Column(name= " end_date" )
	private LocalDate end_date;
	@Column(name= "fee" )
	private double fee;
	@Column(name= " updatedatetime" )
	private LocalDateTime updatedatetime;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDate getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}

	public LocalDate getEnd_date() {
		return end_date;
	}

	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public LocalDateTime getUpdatedatetime() {
		return updatedatetime;
	}

	public void setUpdatedatetime(LocalDateTime updatedatetime) {
		this.updatedatetime = updatedatetime;
	}

	public Course(String name, Category category, LocalDate start_date, LocalDate end_date, double fee,
			LocalDateTime updatedatetime) {
		super();
		this.name = name;
		this.category = category;
		this.start_date = start_date;
		this.end_date = end_date;
		this.fee = fee;
		this.updatedatetime = updatedatetime;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", start_date=" + start_date + ", end_date="
				+ end_date + ", fee=" + fee + ", updatedatetime=" + updatedatetime + "]";
	}

	
	
	

}
