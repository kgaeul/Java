package com.kh.calculatorMVC;

import java.util.Scanner;

public class CalculatorModel {

	Scanner sc =new Scanner(System.in);

	int num1 =sc.nextInt();
		
	int num2 =sc.nextInt();

	public int getNum1() {
		return num1;
	}

	public void setNum(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	

}
