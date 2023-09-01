package com.kh.Array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		
		/*
		 문자열을 입력받아 문자 하나하나 배열에 넣고 검색할 문자가 문자열에 
		 몇개 들어가 있는 지 개수와 
		 몇 번째 인덱스에 위치하는 지 출력하기
		 
		 
		 1.	 문자열을 입력받아
			 문자 하나하나 배여렝 넣고
		     검색할 문자 scanner
			 문자열에 몇개 들어가 있는지 개수와
			 몇번째 인덱스에 위치하는 지 인덱스 출력하기
		 
		 
		 
		 2.  문자 하나하나 배열에 넣는다.
			 string 안에 있는 문자들을 배열로 담는다.
			 char로 문자를 만들어서 만든 문자들을 배열에 넣는다.
			 string 안에 char배열로 만들어주는 녀석 => tochararray
			 
		 */
		
		Scanner sc =new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		
		String inputString = sc.next();
		System.out.print("검색할 문자를 입력하세요 : ");
		
		char searchChar = sc.next().charAt(0);
		//문자열을 문자로 반환
		//안녕하세요 -> 안 녕 하 세 요
		
		//toCharArray -> 문자열을 문자배열로 변환하는 역할
		char[]charString = inputString.toCharArray();
		
		int count =0;
		int charCount =charString.length;
			System.out.print(inputString+"에"+searchChar+"가 존재하는 위치");
		//만약에 내가 이 문자를 검색했을 때 이 문자는 몇번 째 인덱스에 위치하는 지 인덱스 출력하기
		for(int i=0; i<charCount; i++){
			//반복문 사용해서 위치찾기
			if(charString[i]==searchChar){
				System.out.print(i);
				/*고정값이 아니라 i값이 되야 하는이유*/
				
			}
			count++;
		}
				
	}

}
