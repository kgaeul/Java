package com.kh.InterfaceSample;

import java.util.List;

import com.kh.foodStore.FoodStore;
import com.kh.foodStore.Menu;

public class order2 implements FoodStore{

	private List<Menu> OrderMenus;
	
	@Override
	public void addMenu(String menu) {
		Menu menu2=new Menu(menu);//파라미터 값이 같으면 에러 뜸~~
		OrderMenus.add(menu2);
	}

	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
		
	}
	
	@Override
	public void printMenu( ) {
		System.out.println("<<주문내역은 다음과 같습니다.>> ");
		for(Menu Menu2:OrderMenus)
			System.out.println(Menu2.getItem());
	}
	
	
}
