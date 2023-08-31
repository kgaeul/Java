package com.kh.practice;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		if(num<1) {          
			System.out.println("1 이상의 숫자를 입력해주세요. ");
			} else {
				for(int i=1; i<=num; i--) {
				
				System.out.println(num);
			
			}
		/*
		 사용자로부터 한 개의 값을 입력받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 입력하세요
		 단 입력한 숫자는 1보다 크거나 같아야 합니다.
		 */
		}

	}
}
