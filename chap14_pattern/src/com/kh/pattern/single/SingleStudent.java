package com.kh.pattern.single;

public class SingleStudent {
	
	private String name;
	private SingleStudent() {
		
	}
		
	public void display() {
		System.out.println("�̱��� �л��Դϴ�.");
	}
		
	public static void main(String[] args) {
		SingleStudent st1 =new SingleStudent();
		st1.display();
		
	
	}

}
