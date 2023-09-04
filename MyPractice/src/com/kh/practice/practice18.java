package com.kh.practice;

import java.util.Scanner;

public class practice18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("숫자를 입력해주세요 : ");	
		int num = sc.nextInt();		
		
		int count=0;
				int sum=0;
				int sum2=0;
				for(int i=1;i<=num/2;i++) {
					sum+=i*2;
					
					System.out.print(i*2);	
					}
				for(int i=1;i<=num/3;i++) {
					sum2+=i*3;
					
					System.out.print(i*3);
				}
	
	}	
}
	


