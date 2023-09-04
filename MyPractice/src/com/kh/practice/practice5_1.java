package com.kh.practice;

import java.util.Scanner;

public class practice5_1 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		
		
		boolean checknum = true;
		
		
			int num = sc.nextInt();//숫자 num 입력
			if(num<2) {//숫자 num이 2보다 작을 경우
				System.out.println("잘못 입력하셨습니다. 1 이상의 숫자를 입력해주세요. ");
				
				
			}else {//num이 2 보다 클 경우
				int count=0; 
				for(int i=1;i<=num;i++) {//1부터 num까지
					if(num%i==0) {//1부터 num까지 나눴을 때 나누어떨어지는 경우
						count++;
					}	
					
				}
					
					if(count>2) {//나머지가 2보다 클경우
						System.out.println(num+"는 소수가 아닙니다.");
				
					}else {//나머지가 2보다 작을 경우
						System.out.println(num+"는 소수입니다.");
						
						
					
				}
		}
	}
}
