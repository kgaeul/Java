package com.kh.Inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator{

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt();
		
		int results1 = cal.add(num1,num2);
		int results2 = cal.substruct(num1,num2);
		int results3 = cal.multifly(num1,num2);
		int results4 = cal.divide(num1,num2);
		int results5 = cal.mod(num1,num2);
		
		System.out.println("�� : "+results1);
		System.out.println("�� : "+results2);
		System.out.println("�� : "+results3);
		System.out.println("�� : "+results4);
		System.out.println("������ : "+results5);
	}

}
