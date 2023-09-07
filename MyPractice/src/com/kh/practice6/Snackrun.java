package com.kh.practice6;

import java.util.Scanner;

public class Snackrun {

	public static void main(String[] args) {

		Snack snack = new Snack("빵","케이크","블루베리",1,15000);
		Scanner sc =new Scanner(System.in);
		System.out.print("빵종류을 입력해주세요 : ");
		String bread=sc.next();
		System.out.print("빵이름을 입력해주세요 : ");
		String name=sc.next();
		System.out.print("맛을 입력해주세요 : ");
		String flavor=sc.next();
		System.out.print("순위를 입력해주세요 : ");
		int numOf=sc.nextInt();
		System.out.print("가격을 입력해주세요 : ");
		int price=sc.nextInt();
		
		Snack snack2 = new Snack(bread,name,flavor,numOf,price);
		snack.information();
		snack2.information();
			}

}
