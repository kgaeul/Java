package com.kh.classConstant;

public class Constant {

	
		//상수 사용
		final static  int a=1; //더 이상 a의 값을 바꾸지 못하게 잠궈둠
		static final int b=1;//변수값 지정은 실행구문 바깥에서 주로 사용
		public static void main(String[]args) {
		System.out.println("a의 값 : "+a);
		System.out.println("b의 값 : "+b);//static을 사용하지 않아서 에러가 남
		System.out.println("a의 값 : "+a);
		
	}
}
