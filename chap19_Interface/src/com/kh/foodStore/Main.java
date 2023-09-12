package com.kh.foodStore;

import com.kh.InterfaceSample.order2;

public class Main {

	public static void main(String[] args) {
		FoodStore order = new Order();
		
		order.addMenu("[Â«»Í] ÁÖ¹®");
		order.addMenu("[Â¥Àå¸é] ÁÖ¹®");
		order.addMenu("[ÅÁ¼öÀ°] ÁÖ¹®");
		order.addMenu("[ººÀ½¹ä] ÁÖ¹®");
		order.printMenu();
		
		
		
		System.out.println("===========ÇÑ½Ä=========");
		FoodStore order3 = new order2();
		
		
		order3.addMenu("[±èÄ¡Âî°³] ÁÖ¹®");
		order3.addMenu("[µÈÀåÂî°³] ÁÖ¹®");
		order3.addMenu("[ºÎ´ëÂî°³] ÁÖ¹®");
		order3.addMenu("[¼³··ÅÁ] ÁÖ¹®");
		order3.printMenu();

		
	}
}
