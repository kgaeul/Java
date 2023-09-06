package com.kh.Inheritance.animal;

public class Dog extends Animal {//자바는 단일 상속, 다른 언어는 이중상속 가능

	public Dog(String name,int age) {
		super(name, age);//상위 클래스(Animal)의 멤버변수(파라미터)에 접근하는 데 사용
	
	}
	
	public void speak() {
		System.out.println(getName()+" : 멍멍(주인이 짖네;;)");
		
		
	}
	
	public void eat() {
		System.out.println("우리 "+getName()+" 개껌을 먹습니다.");
		
		
	}
}
