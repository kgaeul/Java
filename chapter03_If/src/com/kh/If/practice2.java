package com.kh.If;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int number = sc.nextInt();
		
		if((number>0)&&(number%2)==0) {
			System.out.println("짝수다");
		}else if ((number>0)&&(number%2)==1) {
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요");
		}
	}

}
