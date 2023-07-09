package com.app.DTO;

import java.time.LocalDate;

import javax.persistence.Column;

import com.app.entities.Category;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ResponseDTO {

     private Category category;
	
	private LocalDate start_time;
	
	private LocalDate end_time;
	
	private String source;
	
	private String destination;
		
	private double distance;
	
	private int frequency;

}
