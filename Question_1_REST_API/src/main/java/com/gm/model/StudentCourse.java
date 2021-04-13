package com.gm.model;


public class StudentCourse
{
	private int stuId;
	private String studentName;
	private String courseName;
	private int coursePercentage;
	private String stateName;
	private String countryName;
	
	public int getCourdId() {
		return stuId;
	}
	public void setCourdId(int stuId) {
		this.stuId = stuId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCoursePercentage() {
		return coursePercentage;
	}
	public void setCoursePercentage(int coursePercentage) {
		this.coursePercentage = coursePercentage;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "StudentCourse [stuId=" + stuId + ", studentName="
				+ studentName + ", courseName=" + courseName
				+ ", coursePercentage=" + coursePercentage + ", stateName="
				+ stateName + ", countryName=" + countryName + "]";
	}
}
