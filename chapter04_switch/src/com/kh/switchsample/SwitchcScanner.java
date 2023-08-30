package com.kh.switchsample;

import java.util.Scanner;

public class SwitchcScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하실 번호를 선택해주세요. ");
		
		System.out.println("1. 아메리카노");
		System.out.println("2. 카라멜 마끼야또");
		System.out.println("3. 카페라떼");
		System.out.println("4. 카푸치노");
		
		boolean isChoice =false;
		int choice = sc.nextInt();
		while(isChoice) {
		
		switch (choice) {
		case 1:
			System.out.println("아메리카노 주문 완료되었습니다.");
			break;
		case 2:
			System.out.println("카라멜 마끼야또 주문 완료되었습니다.");
			break;
		case 3:
			System.out.println("카페라떼 주문 완료되었습니다.");
			break;
		case 4:
			System.out.println("카푸치노 주문 완료되었습니다.");
			break;
		default :
			System.out.println("잘못된 선택입니다. 다시 한번 선택해주세요. ");
			
			
		}	
			
		}
	}
}

