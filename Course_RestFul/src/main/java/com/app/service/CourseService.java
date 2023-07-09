package com.app.service;

import java.util.List;

import com.app.DTO.RequestDTo;
import com.app.DTO.ResponseDTO;
import com.app.entities.Course;

public interface CourseService {

	List<Course> getAllCourse();
	
	Course addCourseDetails( Course transientCourse);
	
	Course updateCourse(Course detachedCourse);
	
	String deleteCourse(Long courseId );

	ResponseDTO getDetailsByName(RequestDTo request); 
}
