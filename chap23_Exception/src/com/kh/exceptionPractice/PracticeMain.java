package com.kh.exceptionPractice;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.ArithException();
		pm.NPEException();
		pm.NumFormatException();
		Scanner sc= new Scanner(System.in);
		
	}
	public void ArithException() {
		try {
		int dividend = 100;
		int divisior = 0;
		int num =(dividend/divisior);
		System.out.println(num);
		}catch(ArithmeticException e){
			System.out.println("다시 입력해주세요. "+e.getMessage());
		}
	}
	public void NPEException() {
		try {
		String text ="Hello World";
		String subtext = null;
		int length = text.indexOf(subtext);
		//indexof =>subtext가 들어있는 첫 번째 위치 검색.....!
		//찾는 문자열이 없으면 -1을 리턴
		System.out.println(length);
		}catch(NullPointerException nulltext){
			System.out.println("다시입력해주세요. "+nulltext.getMessage());
		}
		
	}
	public void NumFormatException() {
		
		int num = sc. nextInt();
		
		try {
		String text ="123.45";
		int number = Integer.parseInt(text);
		//부적절한 형식의 문자형인 숫자를 정수로 변환하겠다. 다만 진짜 문자가 들어가면 에러남
		System.out.println(number);
		}catch(NumberFormatException n){
			System.out.println("정수를 입력해주세요. "+n.getMessage());
		}
	}
}
