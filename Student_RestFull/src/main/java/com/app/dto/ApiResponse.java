package com.app.dto;

import java.time.LocalDateTime;

public class ApiResponse {

	private LocalDateTime timeStamp;
	private String message;
	
	public ApiResponse() {
		super();
	}
	
	public ApiResponse(String message) {
		super();
		this.message = message;
		this.timeStamp=LocalDateTime.now();
	}
	
		public LocalDateTime getTimeStamp() {
			return timeStamp;
		}
		public String getMessage() {
			return message;
		}
		public void setTimeStamp(LocalDateTime timeStamp) {
			this.timeStamp = timeStamp;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		
		
		
}
	
