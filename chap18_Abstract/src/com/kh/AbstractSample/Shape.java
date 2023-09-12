package com.kh.AbstractSample;
//추상 클래스 정의 
abstract class Shape {//접근제한자로 public 안씀
//일반필드
	
	private String color;
	
	//추상 메서드(하위클래스에서 구현해야함)

	abstract double calculateArea();
	
	abstract int RectangleArea();
	
	public  Shape (String c) {
		this.color = c;
	}
	
	public void setColor (String color) {
		this.color =color;
		
	}
	public String getColor () {
		return color;
		
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
