package com.kh.whilesample;

import java.util.Scanner;

public class while05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("5이상의 정수로 입력해주세요 : ");
		int sum = 0;
		int num = sc.nextInt();
		
		while(sum<=10) {
			sum+=num;
			num=num+1;
			System.out.println("num : "+num);
			System.out.println("sum : "+sum);
		}
		
		
	}

}
