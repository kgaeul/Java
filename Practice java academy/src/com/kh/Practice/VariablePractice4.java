package com.kh.Practice;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System. in);
		
		System.out.println("문자열을 입력해주세요 : ");
		String abc =sc.next();
		char a = abc.charAt(0);
		System.out.println("index 첫 번째 자리 : " + a);
		char b = abc.charAt(1);
		System.out.println("index 두 번째 자리 : " + b);
		String c = abc.substring(0,4); //substring은 시작과 끝을 정해야 함!! (a,b)
										//안그러면 끝까지 다 출력함
		System.out.println("index 세 번째 자리 : " + c);
		char d = abc.charAt(3);
		System.out.println("index 네 번째 자리 : " + d);
		char e = abc.charAt(4);
		System.out.println("index 다섯번 번째 자리 : " + e);
			
	
	}
}
