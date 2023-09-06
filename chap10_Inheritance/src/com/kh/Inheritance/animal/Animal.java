package com.kh.Inheritance.animal;

public class Animal {

	private String name;
	private int age;
	
	public Animal(String name,int age){//int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void information() {
		System.out.println("동물 이름 : "+name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {
			System.out.println("우리 "+name+" 먹이를 먹습니다.");
		}
	public void sleep() {
		System.out.println("우리 "+name+" 잠을 잡니다.");
	}

	public void age() {
		System.out.println("우리 "+name+"는 "+age+"살입니다.");
	}
}
