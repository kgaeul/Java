package com.kh.Inheritance.animal;

public class Cat extends Animal  {

	public Cat(String name,int age) {
		super(name,age);//상위 클래스(Animal)의 멤버변수(파라미터)에 접근하는 데 사용
	
	}
	@Override
	public void eat() {//animal에 적혀있는 eat을 고양이 안에서만 재정의
		System.out.println("우리 "+getName()+" 생선을 먹어요 ");
	}
	
}
