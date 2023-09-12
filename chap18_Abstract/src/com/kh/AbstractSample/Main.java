package com.kh.AbstractSample;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle("red",5.0);
		
		System.out.println(circle.getColor());
		System.out.println(circle.calculateArea());
		
		Rectangle r  = new Rectangle("yellow",2,4);
		System.out.println("도형의 넓이는 "+r.RectangleArea()+"입니다.");
		System.out.println("색깔은 "+r.getColor()+"입니다.");
		
	}

}
