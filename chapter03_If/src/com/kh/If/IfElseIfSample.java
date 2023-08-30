package com.kh.If;

public class IfElseIfSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if else if else
		
		/*여러 개의 조건을 연속적으로 평가
		그 중 첫 번째 참인 조건에 해당하는 코드 블록을 실행하는 구조
		만약 if나 else의 조건도 참이 아니라면 마지맏 else 블록 실행
		
		if (조건1) {
		//조건 1이 참일 때 실행코드
		 } else if (조건2) {
		 조건 2이 참일 때 실행코드
		 } else {
		 위의 모든 조건이 거짓일 때 실행되는 코드 
		 }
		
		*/
		
		int age =20;
		if(age==20){
		 System.out.println("해외여행을 갈거야");
		}else if(age>=20) {
		System.out.println("세계여행을 갈거야");
		}else{
		System.out.println("집에 있을거야");
		}

		int score =85;
		if(score==90){
		 System.out.println("B+");
		}else if(score>90) {
		System.out.println("A");
		}else{
		System.out.println("B");
		}

		int Age =15;
		if(Age>19) {
		System.out.println("청소년");
		}else if(Age==15) {	
		System.out.println("청소년"); 
		}else {
		System.out.println("어린이입니다.")	;
		}
		
		int month =8;
		if (month ==1||month==2||month==12) {
			System.out.println("겨울");
		}else if(month >=3 && month <=5) {
			System.out.println("봄");
		}else if(month>=6&&month<=8) {
			System.out.println("여름");
		}else {
			System.out.println("가을");	
		}
		
	}
	
}


		
			
		
	


