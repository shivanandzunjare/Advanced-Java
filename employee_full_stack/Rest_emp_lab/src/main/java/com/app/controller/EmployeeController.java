package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins= "http://locahost:3000")
public class EmployeeController {

	
	@Autowired
	private EmployeeService empService;
		
		public EmployeeController() {
			System.out.println(" in employee controller"+ getClass());
			
		}
		
		@GetMapping
		public List<Employee> listEmps(){
			System.out.println(" in list emp");
			return empService.getAllEmployees();
		}
		
		@PostMapping
		public Employee saveEmpDetails(@RequestBody Employee transientEmp) {
					System.out.println("in save "+ transientEmp);
					return empService.addedmpDetails(transientEmp);

}
}