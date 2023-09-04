package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product.Product;
//import = 최초 1회만 가져옴
public class Productrun {

	public static void main(String[] args) {

		
		Product product1=new Product("과자",3000,"가랜드");
		Product product2=new Product("음료수",2000,"나랜드");
		Product product3=new Product("젤리",3500,"다랜드");

		product1.information();
		product2.information();
		product3.information();
		
		/*
		 com.kh.example.practice3.model.vo. 
		 클래스 : circle
		 
		 필드 (멤버변수)
		pi double=3.14
		radius :int=1
		
		생성자
		+Circle()
		
		메소드
		+incrementRadius():void
		+getAreaOfCircle():void
		+getSizeOfCircle():void
		
		
		
*/
	}

}
