package com.kh.whilesample;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		 boolean isChoice = false;
		 while(!isChoice) {
			 System.out.print("계절을 선택해주세요 : ");
			 
			 int month = sc.nextInt();
			 switch(month) {
			
			 case 3: case 4: case 5:
				 System.out.println(" 봄 ");
				 isChoice=true;
				 break;			//break는 case문에서 실행하고자 하는 게 종료된 후 한 번만 사용한다.
			 case 6: case 7: case 8:
				 System.out.println(" 여름 ");
				 isChoice=true;  //위 !느낌표가 있을 경우 참은 거짓으로 변경되고 , 
				 //거짓은 참으로 변경되기 때문에 true로 작성해주어 !를 만나 false로 변경해 while문을 변경해준다.
				 break;
			 case 9: case 10: case 11:
				 System.out.println(" 가을 ");
				 isChoice=true;
				 break;
			 case 1: case 2: case 12:
				 System.out.println(" 겨울 ");	
				 isChoice=true;
				 break;
			default :
				System.out.println("잘못된 선택입니다.");
				
				/*
				나이를 입력받아 성인 청소년 어린이로 분류하고 출력하기
				while switch case 이용해서 출력하기
				case 문을 
				
				 * */
		 
			 }
		 }
		 
		 boolean choice = true;		 	
		 while(choice) {
			 System.out.print("나이를 입력해주세요 :  ");
			 int age=sc.nextInt();	
			 switch(age) {
			 
			 case 19: case 20:
				 System.out.println("성인입니다.");
				 choice = false;
				 break; //switch case 제어
			 case 14: case 15: case 16: case 17: case 18:
				 System.out.println("성인입니다.");
				 choice = false;
				 break;
			 case 10: case 11: case 12: case 13:
				 System.out.println("성인입니다.");
				 choice = false;
				 break;
			 default:
				 System.out.println("다시 입력하세요. ");
				 
			 }
		 }
	}

}
