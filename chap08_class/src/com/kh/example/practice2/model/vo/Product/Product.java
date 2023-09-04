package com.kh.example.practice2.model.vo.Product;

public class Product {

/*	1.멤버 변수 만들기
 	pname : String
	brand :String
	price : int*/
	String pname;
	int price;
	String brand;
	
	//2.생성자 this를 사용해서 만들어야함
	//+Product()
	
	public Product(String pname,int price,String brand) {
		this.pname=pname;
		this.price=price;
		this.brand=brand;
		
	}
	 
	//3.정보출력 메소드 만들기
	//+information():void */
	public void information() {
		System.out.println("상품명 : "+pname);
		System.out.println("가격 : "+price+"원");
		System.out.println("브랜드명 : "+brand);
	}
	
	
	
}
