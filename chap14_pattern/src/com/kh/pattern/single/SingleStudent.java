package com.kh.pattern.single;

public class SingleStudent {
	
	private String name;
	
	public void display() {
		System.out.println("½Ì±ÛÅæ ÇÐ»ýÀÔ´Ï´Ù.");
	}
		
	public static void main(String[] args) {
		SingleStudent st1 =new SingleStudent();
		st1.display();
		
	
	}

}
