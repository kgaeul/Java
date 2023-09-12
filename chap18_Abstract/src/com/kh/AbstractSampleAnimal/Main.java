package com.kh.AbstractSampleAnimal;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Animal rabbit= new Animal("[Åä³¢]","±øÃÑ±øÃÑ","´ç±Ù",5);
		Animal monkey= new Animal("[¿ø¼þÀÌ]","¿ì³¢³¢","¹Ù³ª³ª",7);
		Animal lion= new Animal("[»çÀÚ]","À¸¸£··","°í±â",9);
		
		Dog d = new Dog("[°­¾ÆÁö]","¸Û¸Û","»À´Ù±¸",3);

		System.out.println(rabbit.infor());
		System.out.println(d.infor());
		System.out.println(monkey.infor());
		System.out.println(lion.infor());
		
		System.out.println("================================");	

		List<String>Animal= new ArrayList<>();
		
		Animal.add("[Åä³¢]");
		Animal.add("[¿ø¼þÀÌ]");
		Animal.add("[»çÀÚ]");

								
		for(String Animals : Animal) {
			System.out.print(Animals+" ");
		}
	}

	
}


