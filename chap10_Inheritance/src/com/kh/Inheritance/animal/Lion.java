package com.kh.Inheritance.animal;

public class Lion extends Animal {

	public Lion(String name,int age) {
		super(name, age);
		
	}
	@Override
	public void eat() {//animal에 적혀있는 eat을 고양이 안에서만 재정의
		System.out.println("우리 "+getName()+" 고기만 먹어요.... ");
	}
}
