package com.app.DTO;

import java.time.LocalDateTime;

public class ApiResponse {

	private String message;
	private LocalDateTime time_stamp;
	public ApiResponse(String message) {
		super();
		this.message = message;
		this.time_stamp = time_stamp;
	}
	

}
