package com.kh.api.exam1;

public class StringBuilderMain {
/*
 StringBuilder
 문자열을 효율적으로 조작할 수 있게 해주는 클래스
 문자열을 변경할 때마다 새로운 문자열 객체를 생성하는 것이 아니라
 기존 문자열을 수정하는 방식으로 동작
 메모리 사용을 효율적이게 함
 
 */
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello, ");
		sb.append("World");
		
		String result = sb.toString();
		
		System.out.println(result);
		
		//문자열 삽입
		sb.insert(7,"java");//7번째 위치에 자바 삽입한다는 뜻
		System.out.println(sb);
		
		sb.delete(1,7);
		System.out.println(sb);
		
		//문자열 대체
		sb.replace(1,7,"자바최고당");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
