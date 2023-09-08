package com.kh.mvc.circle;

public class CircleView {
	public double get1() {
		double num1 = 3.14;
		return num1;
	}
	public double get2() {
		double num2 = 3.14;
		return num2;
	}
	public void result(double CircleNum1,double CircleNum2) {

		System.out.println(CircleNum1);
		System.out.println(CircleNum2);
		System.out.println("≥–¿Ã : "+CircleNum1*CircleNum1*CircleNum2);
		System.out.println("µ—∑π : "+CircleNum1*CircleNum2);

	}

}


