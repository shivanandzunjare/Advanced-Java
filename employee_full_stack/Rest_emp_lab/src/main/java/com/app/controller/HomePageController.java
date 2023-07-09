package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

	public HomePageController() {
		System.out.println(" in home page constr"+ getClass());
		
		
	}
	@GetMapping("/")
	public List<Integer> getNumberList(){
		System.out.println(" in get number list");
		 return Arrays.asList(11,22,33,44,55);
	}

}
