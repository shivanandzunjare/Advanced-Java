package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DTO.RequestDTo;
import com.app.DTO.ResponseDTO;
import com.app.custom_exception.ResourceNotFoundException;
import com.app.entities.Course;
import com.app.repo.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	private ModelMapper mapper;
	@Autowired
	private CourseRepository courseRepo;
	
	@Override
	public List<Course> getAllCourse() {
		
		return courseRepo.findAll();
	}

	@Override
	public Course addCourseDetails(Course transientCourse) {
		
		return courseRepo.save(transientCourse);
	}

	@Override
	public Course updateCourse(Course detachedCourse) {
		
		return courseRepo.save(detachedCourse);
	}

	@Override
	public String deleteCourse(Long courseId) {
		String mesg=" invalid id ";
		if(courseRepo.existsById(courseId))
			courseRepo.deleteById(courseId);
		mesg= " course  "+courseId +  " deleted"; 
		return mesg;
	}

	@Override
  public  ResponseDTO getDetailsByName(RequestDTo request) {
	Course cors=courseRepo.getByName(request.getName())
		.orElseThrow(() -> new ResourceNotFoundException(" invalid name"));
	ResponseDTO resDto =mapper.map(cors, ResponseDTO.class);
	return resDto;

	
	}

	

	}
