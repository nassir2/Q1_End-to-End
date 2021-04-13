package com.gm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gm.dao.StudentCourseDAO;
import com.gm.model.StudentCourse;;

@Service
public class StudentCourseserviceimpl implements StudentCourseService
{
	@Autowired
	public StudentCourseDAO studentCrsdao;
	
	@Override
	public StudentCourse getstudentCourseinfo(int stuId) 
	{
		return studentCrsdao.getstudentCourseDetails(stuId);
	}
}
