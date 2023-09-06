package com.kh.Inheritance.animal;

public class Monkey extends Animal {

	public Monkey(String name,int age) {
		super(name, age);
		
	}
	@Override
	public void eat() {//animal에 적혀있는 eat을 고양이 안에서만 재정의
		System.out.println("우리 "+getName()+" 바나나를 먹어요 ~");
	}
	
}
