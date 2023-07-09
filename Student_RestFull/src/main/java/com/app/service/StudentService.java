package com.app.service;

import java.util.List;

import com.app.dto.StudentDto;
import com.app.entities.Student;

public interface StudentService {

	String addNewStudent(StudentDto student);

	List<Student> getAllStudent();
}
