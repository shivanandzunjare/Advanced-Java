package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name=" rail")

public class Rail extends BaseEntity  {

	//cat enum express stahbdi merti,Ac
//	start tome 
	
//	end time source desc destn freq
	
	@Enumerated(EnumType.STRING)
	private Category category;
	
	@Column(name=" startTime",nullable = false )
	private LocalDate start_time;
	
	@Column(name=" endTime",nullable = false )
	private LocalDate end_time;
	
	@Column(name="source", length=30,nullable = false )
	private String source;
	
	@Column(name="destination", length=30,nullable = false )
	private String destination;
	
	@Column(name="distance", length=30,nullable = false )
	private double distance;
	
	@Column(name="frequency", length=30,nullable = false )
	private int frequency;
	
	public Rail() {
		// TODO Auto-generated constructor stub
	}

	public Rail(Category category, LocalDate start_time, LocalDate end_time, String source, String destination,
			double distance, int frequency) {
		super();
		this.category = category;
		this.start_time = start_time;
		this.end_time = end_time;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.frequency = frequency;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDate getStart_time() {
		return start_time;
	}

	public void setStart_time(LocalDate start_time) {
		this.start_time = start_time;
	}

	public LocalDate getEnd_time() {
		return end_time;
	}

	public void setEnd_time(LocalDate end_time) {
		this.end_time = end_time;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Rail [category=" + category + ", start_time=" + start_time + ", end_time=" + end_time + ", source="
				+ source + ", destination=" + destination + ", distance=" + distance + ", frequency=" + frequency + "]";
	}

}
