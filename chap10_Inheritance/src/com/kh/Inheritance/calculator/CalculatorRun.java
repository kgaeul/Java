package com.kh.Inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator{

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자 2 : ");
		int num2 = sc.nextInt();
		//내가 쓴 코드를 문장으로 말하는거!
		Calculator cal = new Calculator();	
		int results1 = cal.add();
		int results2 = cal.substruct();
		int results3 = cal.multifly();
		int results4 = cal.divide();
		int results5 = cal.mod(num1,num2);
		
		System.out.println("합 : "+results1);
		System.out.println("차 : "+results2);
		System.out.println("곱 : "+results3);
		System.out.println("몫 : "+results4);
		System.out.println("나머지 : "+results5);
	}

}
