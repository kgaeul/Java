package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain Exception = new ExceptionMain();
		Exception.Exception1();
		Exception.Exception2();
		Exception.Exception3();
		Exception.Exception4();
		Exception.Exception5();
	}
	public void Exception1() {
		try {
		int result = 10/0;
		System.out.println("Result : " + result);
		}catch(ArithmeticException e){
			/*
			 ArithmeticException =>수학적인 계산과저에서 발생하는 오류
			 ArithmeticException e => 우리가 지정한 변수명
			 e로 지정한 변수로 메세지를 getMessage()로 전달받는다.
			 */
			System.out.println("산수연산으로 발생한 에러 : " +e.getMessage());
		}
	}
	public void Exception2() {
		String text = "ㅇㅇ";
		int length = text.length();
		System.out.println("문자열 길이 : " + length);
		
	}
	public void Exception3() {
		try {
			String text = null;
			int length = text.length();
		}catch(NullPointerException Null) {
			System.out.println("전화번호가 입력되지 않았습니다.번호 좀 입력하세요 ");
		}
	}
	public void Exception4() {
		
		try {
			String jumin = "팔오공팔904";
		int number = Integer.parseInt(jumin);
		System.out.println(number);//문자가 들어있어 실행이 되지 않음
		}catch(NumberFormatException Null) {
			System.out.println("뭐하는 짓이에오 다시 입력하세요!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+Null.getMessage());
		}
	}
	public void Exception5() {
		try {
		int[]numbers = {1,2,3,4,5};
		int index = 7;
		int result = numbers[index];
		System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException e) {
			//배열인덱스가 범위를 벗어났을 때 발생하는 예외처리
			System.out.println("배열인덱스가 범위를 벗어나 예외가 발생");
		}catch(Exception e) {
			//다른 예외를 처리할 수 있는 예외처리
			System.out.println("일반적인 예외");
		}finally { //항상 실행되는 블록
			System.out.println(" 등장!! ");
		}
		System.out.println("프로그램이 종료되었습니다. ");
	}
}
