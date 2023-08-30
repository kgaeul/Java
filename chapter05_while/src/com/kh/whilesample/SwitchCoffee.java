package com.kh.whilesample;

import java.util.Scanner;

public class SwitchCoffee {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int choice;
		boolean ischoice = false;
		
		while(!ischoice) {
			System.out.println("커피 주문해주세요 1. 아메리카노 2. 카페라떼 3. 홍차");
			
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("아메리카노 주문");
				ischoice = true;
				break;
			case 2:
				System.out.println("카페라떼 주문");
				ischoice = true;
				break;
			case 3 :
				System.out.println("홍차 주문");
				ischoice = true;
				break;
			default:
				System.out.println("주문이 잘못되었습니다.");
			
			}
		}
		
	}

}
