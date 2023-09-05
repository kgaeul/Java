package com.kh.example.practice2.Product;

public class Product {

	 private String pName;
	 private int price;
	 private String brand;
	
	public Product (String pName,int price,String brand) {
		this.pName=pName;
		this.price=price;
		this.brand=brand;
	}
	
	 public void information() {
		System.out.println("상품명 : "+pName);
		System.out.println("가격 : "+price);
		System.out.println("브랜드명 : "+brand);
	}
	
	
	
}
