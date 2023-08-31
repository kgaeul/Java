package com.kh.forexample;

import java.util.Scanner;

public class forexample {

	public static void main(String[] args) {

		Scanner sc =new Scanner (System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int num1 =sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int num2 =sc.nextInt();
		int result =0;
		for (int i=1 ; i<=num2 ; i++) {
			result += num1;			
		
		System.out.println(num1+"x"+ i +"="+result);
	}

}
}
