package com.kh.practice;

import java.util.Scanner;

public class practice1_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("���ڸ� �Է����ּ��� : ");	
		int num = sc.nextInt();		
		if (num<1) {
			System.out.print("1 �̻��� ���ڸ� �Է����ּ���");
		}else {
			for(int i=1;i<=num;i++)
				System.out.print(i);
		}
	}

}
