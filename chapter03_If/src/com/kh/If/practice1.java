package com.kh.If;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴번호를 입력하세요 : ");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1 :
		System.out.println("입력");
		break;
		case 2 :
		System.out.println("수정");
		break;
		case 3 :
		System.out.println("조회");
		break;
		case 4 :
		System.out.println("삭제");
		break;
		default:
		System.out.println("프로그램이 종료됩니다. ");
		
		}
		
	}

}
