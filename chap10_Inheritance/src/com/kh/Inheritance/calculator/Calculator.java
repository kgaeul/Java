package com.kh.Inheritance.calculator;

public class Calculator {
//	계산기 
	
	int num1;
	int num2;
//	1. 더하기 
	public int add(int num1,int num2) {//매개 변수 == 파라미터 숫자 두개 넣기
		return num1+num2;
	}
//	2. 빼기 
	public int substruct(int num1,int num2) {//매개 변수 == 파라미터 숫자 두개 넣기
		return num1-num2;
	}
//	3. 곱하기 
	public int multifly(int num1,int num2) {//매개 변수 == 파라미터 숫자 두개 넣기
		return num1*num2;
	}
//	4. 나누기
	public int divide (int num1,int num2) {//매개 변수 == 파라미터 숫자 두개 넣기
		return num1/num2;
	}
	public int mod (int num1,int num2) {//매개 변수 == 파라미터 숫자 두개 넣기
		return num1%num2;
	}
}
