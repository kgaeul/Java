package com.kh.Operator;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6. 삼항 연산자
		/*
		 조건을 평가하고 세 가지 값 중 하나를 반환합니다.
		 항이 세개
		 조건  ? 값1 : 값2 형태로 사용
		 삼항= 일항? 이항:삼항
		 
		 * */
		//EX) 나이가 20 이상이면 성인인가 미성년자인가
		/*값 1은 조건이 참일 때 출력
		값 2은 조건이 거짓일 때 출력
		*/
		int age = 20; //   조건? 값1(true):값2(false)
		String status = (age>=21)?"성인" : "미성년자";	 
		System.out.println(status);
		
		int score = 85;
		String result = (score>=60)?"합격":"불합격";
		System.out.println(result);
		
		int number =-5;
		String sign = (-5>0) ? "true":"false";
		System.out.println(sign);
		
		int temperature =25;
		String weather = (temperature>25)? "적당한 날씨":"더운 날씨";
	    System.out.println(weather);
	    
	    
	    //숫자 7의 값을 짝수인지 홀수인지 출력
	    
	    int number1 =7;
	    String result1 = (0==(number1%2))?"짝수":"홀수";
	    System.out.println(result1);

	    int number2 = 0;
	    String sign2 = (number2>0)?"양수":(number<0)?"음수":"0";
	    System.out.println(sign2);
		
				

	}

}
