package com.kh.example.practice4.model.vo;

public class Student {

	 int grade;
	 int classroom;
	 String name;
	 double height;
	 char gender;
	 
	 
	public Student(int grade, int classroom,String name,double height,char gender) {
		
		this.grade=1;
		this.classroom=2;
		this.name="아무개";
		this.height=170;
		this.gender='남';
		
	}
	
	public void information() {
		System.out.println("학년 : "+grade+"학년");
		System.out.println("반 : "+classroom+"반");
		System.out.println("이름 : "+name);
		System.out.println("키 : "+height+"cm");
		System.out.println("성별 : "+gender+"성");
		
		
	}
}
