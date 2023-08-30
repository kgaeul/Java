package com.kh.switchsample;

public class switchsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch문
		/*
		 특정변수나 표현식의 값에 따라 다양한 경우를 처리하는 제어 구조
		 switch은 일련의 case문과 해당값을 비교하여 일치하는 경우 해당하는 코드블록을 실행
		 각 case문 뒤에는 일치하는 값이나 표현식이 나옴
		  
		  switch 값1 (변수 또는 표현식){
		  case 값1:
		  //값1에 해당하는 코드
		   * break; //해당 블록의 실행을 중단하는 역할
		  case 값2:
		  //값2에 해당하는 코드
		   * break;
		  default : 
		  
		 
		 */
		
		int day = 30;
		switch (day) { //day ==30
			case 1: //case가 30이면 월요일 출력
				System.out.println("월요일");//출력되지 않음
				break; 
			case 2:
				System.out.println("화요일");//출력되지 않음
				break; 
			case 30:
				System.out.println("수요일");
				break; 
			default :
				System.out.println("주말");
		}
		//
		
		
		int coffee = 5;
		
		switch (coffee) {
		case 1: 
			System.out.println("아메리카노 주문완료 되었습니다. ");
			break ;
		case 2:
			System.out.println("자몽허니블랙티 주문완료 되었습니다. ");
			break ;
		case 3:
			System.out.println("카페라테 주문완료 되었습니다. ");
			break ;
		case 4:
			System.out.println("카푸치노 주문완료 되었습니다. ");
			break ;
		default :
			System.out.println("잘못 누르셨습니다. 처음부터 다시 주문해주세요. ");
		}
		
		
		
	}

}
