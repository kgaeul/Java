package com.kh.ClassSample;

public class Student {

	String name;
	int age;
	String grade;
	
	//생성자는 메소드 중 일부//
	public Student(String name,int age, String grade) {
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
		public void displayInfo() {
			System.out.println("학생 이름 : "+name);
			System.out.println("나이 : "+age);
			System.out.println("학년 : "+grade);
		
	}
}
