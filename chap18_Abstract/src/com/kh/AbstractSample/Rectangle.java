package com.kh.AbstractSample;

public class Rectangle extends Shape{
	private double x;
	private double y;
	
	public Rectangle(String color, int x,int y) {
		super(color);
		this.x=x;
		this.y=y;
		
	}
	@Override
	public int RectangleArea() {
		return (int) (x*y);
	
	}
}
