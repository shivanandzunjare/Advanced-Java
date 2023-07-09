package com.app.service;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.dto.StudentDto;
import com.app.entities.Student;
import com.app.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Autowired
	private ModelMapper mapper;

	@Override
	public String addNewStudent(StudentDto student) {
		Student persistentStudent = studentRepo.save((mapper.map(student, Student.class)));
		return persistentStudent.getName() + "Student added successfully...!!!";

	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

}
