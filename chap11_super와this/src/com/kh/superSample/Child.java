package com.kh.superSample;

public class Child extends Parent{
	//접근제한자가 defult로 변경된 것있분 public이랑 쓰임은 똑같음
	
	public Child(){
		super();//부모 클래스의 기본 생성자 호출
		System.out.println("자식 클래스의 기본 생성자입니다. ");
		
	}
	public Child(String name) {
		super(name); //부모 클래스의 문자열 파라미터 호풀
		System.out.println("부모의 파라미터 생성자를 가져왔습니다.");
	}
	public void display() {
		super.show();//도트(.)는 하위 항목
		System.out.println("자식 클래스의 display 메소드 입니다. ");
	}
	
	
}
