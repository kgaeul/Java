package com.kh.Inheritance.animal;

public class Rabbit extends Animal{

	public Rabbit(String name,int age) {
		super(name, age);
		
	}
	public void speak () {
		System.out.println("±øÃÑ±øÃÑ!!");
	}
	
	@Override
	public void sleep() {
		System.out.println("¿ì¸® "+getName()+" ÀáÀ» ¾ÈÀÚ°í ´«ÀÌ ¸»¶Ë¸»¶Ë ÇÕ´Ï´Ù.");
	}
}
