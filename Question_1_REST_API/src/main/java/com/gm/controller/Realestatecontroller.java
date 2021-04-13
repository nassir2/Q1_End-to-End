package com.gm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gm.model.StudentCourse;
import com.gm.service.StudentCourseService;

@RestController
@RequestMapping("/course")
public class Realestatecontroller 
{
	@Autowired
	public StudentCourseService stuservice ;
	
	@GetMapping(value = "/getstuCourse/{stuId}")
	public StudentCourse getempinfo(@RequestParam (value = "stuId") int stuId)
	{
		StudentCourse studentCourse = stuservice.getstudentCourseinfo(stuId);

		return studentCourse;
	}
}
