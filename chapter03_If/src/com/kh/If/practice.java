package com.kh.If;

public class practice {

	public static void main(String[] args) {

		int score1 = 88;
		int score2 = 50;
		int score3= 45;
		
		if((score1+score2+score3)/3<=60) {
			System.out.println("불합격입니다. ");
		} else {
			System.out.println("평균 : "+(score1+score2+score3)/3 +" 축하합니다.합격입니다. ");
		}
		
		
	}


}
