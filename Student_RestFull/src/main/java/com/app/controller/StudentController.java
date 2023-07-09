package com.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.dto.ApiResponse;
import com.app.dto.StudentDto;
import com.app.entities.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService stuService;

	@PostMapping
	public ResponseEntity<?> addStudent(@RequestBody StudentDto student) {
		try {
			System.out.println("in add student " + student);
			return new ResponseEntity<>(new ApiResponse(stuService.addNewStudent(student)), HttpStatus.CREATED);
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(e.getMessage()));
		}
	}

	@GetMapping
	public List<Student> getAllStudentDetails() {
		System.out.println("in get Student");
		return stuService.getAllStudent();
	}

}
