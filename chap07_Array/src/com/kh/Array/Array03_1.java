package com.kh.Array;

import java.util.Scanner;

public class Array03_1 {

	public static void main(String[] args) {
		
		/*문자열을 입력받아 문자 하나하나 배열에 넣고 검색할 문자가 문자열에 
		 몇개 들어가 있는 지 개수와 
		 몇 번째 인덱스에 위치하는 지 출력하기
		 */
		Scanner sc =new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");//문자열을 입력받아
		String inputString = sc.next();
		
		System.out.print("검색할 문자를 입력하세요 : ");
		char searchChar = sc.next().charAt(0); //검색할 문자 scanner
		char[]charString = inputString.toCharArray(); // 문자 하나하나 배열에 넣고
		
		int count =0; //0부터 시작
		int charCount =charString.length; // 문자열 길이 확인
			System.out.println("<"+inputString+">에서 "+searchChar+"의 위치 : ");
			
		for(int i=0; i<charCount; i++){ //0번째 자리부터 맨 끝자리까지의 
			if(charString[i]==searchChar){ //몇번째 인덱스에 위치하는 지 인덱스 출력하기
				count++;//몇개인지 갯수 확인하기
				System.out.println(i+"번 째 자리");
			}
			
		}
		System.out.println("문장 속 '"+searchChar+ "'의 개수는 총 "+count+"개 입니다. ");
		if(count>5) {
			System.out.println("문자가 거의 일치합니다.");
		}else {
			System.out.println("문자가 일치하지 않습니다.");
		}
	}

}
