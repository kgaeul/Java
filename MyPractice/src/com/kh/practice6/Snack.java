package com.kh.practice6;

public class Snack {

	String kind;
	String name;
	String flavor;
	int numOf;
	int price;
	
	public Snack(String kind,String name,String flavor,int numOf,int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void information(){ 
		System.out.println("종류 : "+kind);
		System.out.println("이름 : "+name);
		System.out.println("맛: "+flavor);
		System.out.println("순위 : "+numOf);
		System.out.println("가격 : "+price);
		
	}
	
	
	
}
