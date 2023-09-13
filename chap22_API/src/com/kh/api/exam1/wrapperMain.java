package com.kh.api.exam1;

public class wrapperMain {
//wrapper 기본 데이터 유형을 객체로 래핑
//	객체로 작업할 때 유용
//	클래스로는 Integar , double , boolean 등이 있다
	public static void main(String[] args) {

		Integer num = 40;
		System.out.println(num);
		
		
		int intValue = num.intValue();
		System.out.println(intValue);
		
		double pi = 3.14159265369;
		double radius =5;
		double area = pi*Math.pow(radius, 2);
		System.out.println(area);
		
		//문자열을 실수로 변환
		String  numStr = "3.14";
		Double parsedDouble = Double.parseDouble(numStr);
		
		//문자열 데이터를 정수, 소수로 변환하겠다.
		System.out.println(parsedDouble);
		
		
		//boolean Wrapper 클래스 만들기
		Boolean isJavaFun = true;
		
		if(isJavaFun) {
			System.out.println("자바는 재밌습니다. ");
		}else {
			System.out.println("자바는 재미없습니다. ");
		}
		
		String boolStr = "true";
		
		Boolean parseBool = Boolean.parseBoolean(boolStr);
		System.out.println(parseBool);
		
	}
}
