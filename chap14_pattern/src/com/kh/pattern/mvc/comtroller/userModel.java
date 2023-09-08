package com.kh.pattern.mvc.comtroller;

public class userModel {

	private String name;
	 int age;
	 
	 public userModel (String name,int age) {
			this.name=name;
			this.age=age;
	 }
	public void displayinfo(String name,int age) {
		System.out.println("학생 정보");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		
		/*
		 1.학생 정보 표현
		 2.private 이름 나이  
		 3.getter setter 만들기
		  
		  
		 */
	}

}
