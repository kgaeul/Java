package com.kh.switchsample;

import java.util.Scanner;

public class switchsample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과자를 선택해주세요.") ;
		System.out.println("포카칩") ;
		System.out.println("칸쵸") ;
		System.out.println("프링글스") ;
		System.out.println("썬칩") ;
		
		int snack = sc.nextInt();
		
		switch(snack) {
		case 1:
			System.out.println("포카칩");
			break;
		case 2:
			System.out.println("칸쵸");
			break;
		case 3:
			System.out.println("프링글스");
			break;
		case 4:
			System.out.println("썬칩");
			break;
		default :
			System.out.println("잘못된 선택입니다. 다시 한번 선택해주세요. ");
	}
	}

}
