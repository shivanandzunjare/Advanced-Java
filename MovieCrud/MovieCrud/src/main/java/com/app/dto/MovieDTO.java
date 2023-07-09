package com.app.dto;

import java.time.LocalDate;

import com.app.entities.Producer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {

	private String mName;
	private LocalDate releaseDate;
	private long producerId;
	public String getMName() {
		// TODO Auto-generated method stub
		return null;
	}
	public LocalDate getReleaseDate() {
		// TODO Auto-generated method stub
		return null;
	}
	public Long getProducerId() {
		// TODO Auto-generated method stub
		return null;
	}
}
