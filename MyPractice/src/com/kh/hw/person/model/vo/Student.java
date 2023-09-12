package com.kh.hw.person.model.vo;

public class Student {

	int grade;
	String major;
	
	public Student() {
		
	}
	public Student(String name,int age,double height,double weight,int grade,String major) {
		
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getMajor() {
		return major;
	}

}
