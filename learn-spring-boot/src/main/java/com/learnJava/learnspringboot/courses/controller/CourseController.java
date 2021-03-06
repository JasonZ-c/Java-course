package com.learnJava.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnJava.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {
	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1,"learn java111","jason"),new Course(2,"full stack web","andy"));
	}
	
	// http://localhost:8080/courses/1
	@GetMapping("/courses/1")
	public Course getCoursesDetail(){
		return new Course(1,"learn java","jason");
	}

}
