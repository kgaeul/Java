package com.kh.example.practice2.model.vo.circle;

public class Circle {

	double PI;
	int radius;
	
	public Circle(double PI,int radius) {
		this.PI=3.14;
		this.radius=1;
		}
		public  void incrementRadius() {
			System.out.println("������ : "+radius++);
			radius++;
		}
		public  void getAreaOfCircle() {
			System.out.println("���� : "+PI*radius*radius);
		double area = PI*radius*radius;
		}
		public  void getSizeOfCircle() {
			System.out.println("���� ������ : "+radius);
		
		}
}
