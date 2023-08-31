package com.kh.If;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("국어점수를 입력해주세요 :  ");
		int score1 = sc.nextInt();
		System.out.print("수학점수를 입력해주세요 :  ");
		int score2 = sc.nextInt();
		System.out.print("영어점수를 입력해주세요 :  ");
		int score3 = sc.nextInt();
		
		
		if((score1+score2+score3)/3<=60) {
			System.out.println("불합격입니다. ");
		} else {
			System.out.println("평균 : "+(score1+score2+score3)/3 +"점입니다. 축하합니다.합격입니다. ");
		}
		
		
	}


}
