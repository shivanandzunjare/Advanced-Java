package com.app.service;

import java.util.List;

import com.app.entities.Employee;

public interface EmployeeService {

	
		List<Employee> getAllEmployees();
		
	Employee addedmpDetails(Employee transientEmp);
	

}
