package com.kh.overloadingEx;

public class overloadingSample {
	
	public int sum(int a, int b) {
			return a*b;
	}	

	public int sum(int a, int b,int c)  {
		return a+b+c;
	}	

	public int sum(int a, int b,int c,int d) {
		return a*b*c*d;
	}	
	
	public double sum(double a, double b,double c) {
		return a+b+c;
	}	
	
	public double sum(double a, double b) {
		return a*b;
	}
	
	
		public static void main(String[] args) {
	
			overloadingSample sample = new overloadingSample();
			
			System.out.println("두 정수의 곱 : "+sample.sum(20, 3));
			System.out.println("세 정수의 합 : "+sample.sum(100,41,2));
			System.out.println("네 정수의 곱 : "+sample.sum(20, 3,11,70));
			System.out.println("세 실수의 합 : "+sample.sum(1.7,2.3,5.1));
			System.out.println("두 실수의 곱 : "+sample.sum(-0.5, -0.3));
			
		}
	
	}
