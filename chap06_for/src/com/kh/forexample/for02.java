package com.kh.forexample;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {

		Scanner sc =new Scanner (System.in);
		/*System.out.print("첫 번째 숫자를 입력하세요 : ");
		int num1 =sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int num2 =sc.nextInt();
		int result =0;
		for (int i=1 ; i<=num2 ; i++) {//for 루프를 사용해서 i변수를 0부터 num2미만까지 반복
			result += num1;			//이 루프는 두번째 숫자인 num2만큼 반복
			//result 변수에 num1값을 더함
			//num2만큼 num1을 더하는 효과를 줌
		
		System.out.println(num1+"x"+ i +"="+result);
		//계산된 결과를 출력 입력받은 두 숫자와 결과 값을 문자열로 결합 출력
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		*/
		int num1; //=sc.nextInt();
		
		//System.out.print("두 번째 숫자를 입력하세요 : ");
		int num2; //=sc.nextInt();
		
		
		
		for (int i2=1 ; i2<10 ; i2++) {
			for (int i=1 ; i<=9 ; i++) {		
				int result =i*i2;				
				System.out.println(i2+"x"+ i +"="+result);
			}
		}
		
		
		
	}	
		
}
