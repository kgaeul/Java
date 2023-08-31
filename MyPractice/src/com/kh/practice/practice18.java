package com.kh.practice;

import java.util.Scanner;

public class practice18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("숫자를 입력해주세요 : ");	
		int num = sc.nextInt();		
		
		for(int i=1;num%2==0&&num%3==0; i++) {
			System.out.print(i);	
		}
	}

}
