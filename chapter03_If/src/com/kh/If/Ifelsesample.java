package com.kh.If;

public class Ifelsesample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if else
		/*
		 프로그램 조건에 따라 두 가지 서로 다른 코드 블록 중 하나를 실행하는 구조
		 만약에 if문의 조건이 참이면 if 내에 있는 블록이 실행이 되고 조건이 거짓이면 else블록이 실행
		 이를 통해 두 가지 상황에 따라 다른 동작을 실행할 수 있다.
		 if (조건) {
		 //조건이 참일 때 실행되는 코드
		 } else {
		 //조건이 거짓일 때 실행되는 코드
		 }
		 
		 */
		
		
		int age = 24;
		if (age>=60) {
			System.out.println("환갑잔치를 할 거야");//60보다 크거나 같으면 실행
		}else {
			System.out.println("왕창놀아야지~!");//60보다 적으면 실행
		}
		
		
	int temp =30;
	if (temp>=25 ) {
		System.out.println("날씨 조심하세요");
	}else{
		System.out.println("날씨가 좋네요~");
		
		
	 int score = 50;
	 if (score>=80) {
		 System.out.println("B등급");
	 } else {
		 System.out.println("B등급");
	 }
	}
	}

}
