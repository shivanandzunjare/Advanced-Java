package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTO.ApiResponse;
import com.app.DTO.RequestDTo;
import com.app.DTO.ResponseDTO;
import com.app.entities.Course;
import com.app.service.CourseService;

import net.bytebuddy.asm.Advice.Return;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;
	public CourseController() {
		System.out.println(" in def cntor " + getClass());
	}

	@GetMapping
	public List<Course> listCourse(){
		return  courseService.getAllCourse();
	}
	
	@PostMapping
	
	ResponseEntity<?> saveCourseDetails( @RequestBody Course transientCourse){
		return new ResponseEntity<>( courseService.addCourseDetails(transientCourse), HttpStatus.CREATED);
	}
	
	@PutMapping
	public Course updateCourseDetails( @RequestBody Course detachedCourse) {
		return courseService.updateCourse(detachedCourse);
	}
	
	@DeleteMapping("{courseId}")
	public ApiResponse deleteCourse(@PathVariable Long courseId) {
		return new  ApiResponse(courseService.deleteCourse(courseId));
		
	}
	
	@GetMapping("/{name}")
	public ResponseDTO getByName(@Valid RequestDTo request) {
		return courseService.getDetailsByName(request);
	}
}
