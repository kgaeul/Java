package com.kh.practice;

import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("주민등록번호를 입력해주세요 : ");
		String num =sc.next();
		
		char[]numArray= num.toCharArray();
		
		
		numArray[6]='-';
		numArray[8]='*';
		numArray[9]='*';
		numArray[10]='*';
		numArray[11]='*';
		numArray[12]='*';
		numArray[13]='*';
		
		for(int i=8;i<numArray.length;i++) {
		
		
		}
		System.out.print(numArray);

	}

}
