package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	String name;
	int age;
	int height;
	int weight;
	int grade;
	String major;
	Scanner sc = new Scanner(System.in);
	PersonController pc =new PersonController();
	
	
	public void mainMenu() {
	while(true){
		System.out.print("번호를 입력해주세요 : ");
		int num=sc.nextInt();
		if(num==1) {
			studentMenu();
			break;
		}else if(num==2) {
			employeeMenu();
			break;
		}else if(num==9) {
			System.out.print("종료합니다.");
			break;
		}else{
			System.out.print("잘못입력하셨습니다. 다시 입력해주세요");
		}
	}
}

	public void studentMenu() {
		while(true){
			System.out.print("번호를 입력해주세요 : ");
			int num=sc.nextInt();
			if(num==1) {
				insertStudent();
				break;
			}else if(num==2) {
				printStudent();
				break;
			}else if(num==9) {
				System.out.print("메인으로 돌아갑니다.");
				break;
			}else{
				System.out.print("잘못입력하셨습니다. 다시 입력해주세요");
			}
		}
			 
	 }
	public void employeeMenu() {
		while(true){
			System.out.print("번호를 입력해주세요 : ");
			int num=sc.nextInt();
			if(num==1) {
				insertEmployee();
				break;
			}else if(num==2) {
				printEmployee();
				break;
			}else if(num==9) {
				System.out.print("메인으로 돌아갑니다.");
				break;
			}else{
				System.out.print("잘못입력하셨습니다. 다시 입력해주세요");
			}
		}
			 
	}
	
	public void insertStudent() {
		System.out.println("정보를 입력해주세요. ");
		name = sc.next();
		age = sc.nextInt();
		height = sc.nextInt();
		weight = sc.nextInt();
		grade = sc.nextInt();
		major = sc.next();
	//	System.out.println(name+height+weight+grade+major);
		
	}
	public void printStudent() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age+ "세");
		System.out.println("키 : "+height+"cm");
		System.out.println("몸무게 : "+weight+"kg");
		System.out.println("학년 : "+grade+"학년");
		System.out.println("전공 : "+major);
		
		
				
	}
	public void insertEmployee() {
		 
	}
	public void printEmployee() {
		 
	}

}
