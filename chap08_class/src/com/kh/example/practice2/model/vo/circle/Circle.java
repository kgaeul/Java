package com.kh.example.practice2.model.vo.circle;

public class Circle {

	double PI=3.14;
	int radius=1;
	
	public Circle() {
	
		}
		public  void incrementRadius() {
			System.out.println("지름 : "+radius++);
		
		}
		public  void getAreaOfCircle() {
			System.out.println(PI);
			System.out.println(radius);
			System.out.println("넓이 : "+PI*radius*radius);
		double area = PI*radius*radius;
		}
		public  void getSizeOfCircle() {
			System.out.println("원의 반지름 : "+radius);
		
		}
}
