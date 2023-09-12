package com.kh.ArrayList;

import java.util.Scanner;

public class class3 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("정수 다섯개를 입력해주세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		int[]numbers={num1,num2,num3,num4,num5};
		
		System.out.print("입력한 다섯개의 정수 확인 : ");
		
		for(int number : numbers) {
			System.out.print(number);
			System.out.print(" ");
		}
			int sum=0;
			for(int i=0;i<numbers.length;i++) {
				sum+=numbers[i];
			}
			System.out.println();
			System.out.println("정수 5개의 합 : "+sum);
			
	}

}
