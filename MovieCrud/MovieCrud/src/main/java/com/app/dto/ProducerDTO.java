package com.app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class ProducerDTO {

	public ProducerDTO() {
		System.out.println("in ProducerDTO");
	}

	private String pName;

	private String city;

	public String getPName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCity() {
		// TODO Auto-generated method stub
		return null;
	}

}
