package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Employee;
import com.app.repo.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	@Override
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}

	@Override
	public Employee addedmpDetails(Employee transientEmp)
	{
		return empRepo.save(transientEmp);
	}
	
}
