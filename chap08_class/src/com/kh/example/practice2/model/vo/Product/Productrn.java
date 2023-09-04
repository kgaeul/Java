package com.kh.example.practice2.model.vo.Product;

public class Productrn {

	public static void main(String[] args) {
		Product product1=new Product("과자",3000,"가");
		Product product2=new Product("음료수",2000,"나");
		Product product3=new Product("젤리",3500,"다");
		
		product1.information();
		product2.information();
		product3.information();

		
	}

}
