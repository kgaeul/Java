package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

public class Order implements FoodStore{

	
	private List<Menu> OrderMenus;
	
	public Order() {
		OrderMenus = new ArrayList<>();
		
	}

	@Override
	public void addMenu(String menu) {
		Menu menuA=new Menu(menu);//파라미터 값이 같으면 에러 뜸~~
		OrderMenus.add(menuA);
	}

	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
		
	}
	
	@Override
	public void printMenu( ) {
		System.out.println("<<주문내역은 다음과 같습니다.>> ");
		for(Menu MenuA:OrderMenus)
			System.out.println(MenuA.getItem());
	}

}
