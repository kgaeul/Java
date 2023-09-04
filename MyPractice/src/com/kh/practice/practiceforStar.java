package com.kh.practice;

import java.util.Scanner;

public class practiceforStar {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		//사각형 출력// 현재 행에서 출력하는 열이 첫번째 열일 경우(j=1)
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=1; j++) {
				if(i==1||i==num||j==num||j==1) {
					System.out.print("*");
					System.out.print(" ");
			}else {
				
					
			}
		}
			
	}

}
}