package com.kh.practice;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		
		boolean isTrue = true;
		while(isTrue) {
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		if(num<1) {          
			System.out.println("1 이상의 숫자를 입력해주세요. ");
			} else {
				for(int i=num; i>0; i--) {
					isTrue = false;
				System.out.println(i);
			
			}
	
		}
	}
	}
}
