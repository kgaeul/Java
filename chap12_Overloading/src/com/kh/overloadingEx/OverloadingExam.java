package com.kh.overloadingEx;

public class OverloadingExam {

	public int sum(int a,int b) {
		return a+b;
	}
	
	public int sum(int a,int b,int c) {
		return a+b+c;
	}
	
	public double sum(double a, double b,double c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		OverloadingExam obj = new OverloadingExam();
		
		System.out.println("두 정수의 합 : "+obj.sum(10,20));
		System.out.println("세 정수의 합 : "+obj.sum(10,20,30));
		System.out.println("두 실수의 합 : "+obj.sum(0.7,1.8,12.15 ));
	}

}
