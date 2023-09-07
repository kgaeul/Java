package com.kh.superSample;
		//상속 받아서 super() super. 차이점 확인
		//super = 부모클래스의 변수나 메소드에 접근하기 위해 사용
//		super()=부모 클래스의 생성자를 호출하기 위해 사용
//				서브클래스의 생성자에서 첫 번째 줄에 호출되어야 함

public class Parent {
	String name;
		
	Parent(){
		System.out.println("부모클래스의 기본 생성자 입니다.");
	}
		Parent(String name){
			this.name=name;
			System.out.print("울 가족의 이름 : ");
			System.out.println(name);
		}
		public void show() {
			System.out.println("울 가족이 좋아하는 것");
	}

}
