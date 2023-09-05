package com.kh.classCircle;

public class Circle {
	//멤버변수
	private  final double PI = 3.14;
	int radius =1;
	
	
	//생성자
	public Circle() {
		//기본 생성자
	}
	//반지름에 대해 출력
	public void in() {
		//반지름 증가 증가시킬 양을 지정할 수 있다.
		radius++;
		System.out.println(radius);
	}
	public void areacircle() {
		double area = PI*radius*radius;
		System.out.println("원의 넓이 : "+area);
	}
	//원의 넓이를 계산하고 출력하는 메소드
	
	public void Sizeofcircle() {
		double size = PI*radius;
		System.out.println("둘레 : "+size);
	}
	
}
