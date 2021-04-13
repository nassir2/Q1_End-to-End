package com.gm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.gm.model.StudentCourse;

@Repository
public class StudentCoursedaoimpl implements StudentCourseDAO
{
	public static final String EMP_SELECT_QRY = "select stuid,studentName,courseName,coursePercentage,stateName,countryName from studentCourse where stuid = ?";
	
	@Autowired
	public JdbcTemplate jdbcTem;
	
	@Override
	public StudentCourse getstudentCourseDetails(int stuId) 
	{
		StudentCourse studentCourse =  jdbcTem.queryForObject(EMP_SELECT_QRY, new StudentCourseRowmapper(), stuId);
	
		System.out.println("studentCourse {} :::" + studentCourse);	
		
		return studentCourse;
	}
	
	public class StudentCourseRowmapper implements RowMapper<StudentCourse>
	{
		public StudentCourse mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			System.out.println("row no :::" + rs.getRow());
			StudentCourse studentCourse = new StudentCourse();
			studentCourse.setCourdId(rs.getInt(0));
			studentCourse.setStudentName(rs.getString(1));
			studentCourse.setCourseName(rs.getString(2));
			studentCourse.setCoursePercentage(rs.getInt(3));
			studentCourse.setStateName(rs.getString(4));
			studentCourse.setCountryName(rs.getString(5));
				
			return studentCourse;
		}
	}
}
