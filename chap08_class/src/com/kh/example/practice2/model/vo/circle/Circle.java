package com.kh.example.practice2.model.vo.circle;

public class Circle {

	double PI;
	int radius;
	
	public Circle(double PI,int radius) {
		this.PI=3.14;
		this.radius=1;
		}
		public  void incrementRadius() {
			System.out.println("반지름 : "+radius++);
			radius++;
		}
		public  void getAreaOfCircle() {
			System.out.println("넓이 : "+PI*radius*radius);
		double area = PI*radius*radius;
		}
		public  void getSizeOfCircle() {
			System.out.println("원의 반지름 : "+radius);
		
		}
}
