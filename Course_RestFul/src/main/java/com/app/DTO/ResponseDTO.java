package com.app.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.app.entities.Category;

public class ResponseDTO {

	


	
	
	private LocalDate start_date;
	

	private LocalDate end_date;
	
	private double fee;
	
	private LocalDateTime updatedatetime;

	

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


	
	

}
