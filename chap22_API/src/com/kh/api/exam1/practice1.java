package com.kh.api.exam1;

import java.util.Scanner;

public class practice1 {
	Object obj = new Object();
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 글자를 입력해주세요 : ");
		String a = sc.next();
		System.out.print("두 번째 글자를 입력해주세요 : ");
		String b = sc.next();
	
		
		sc.close();
		
		if(a.equals(b)) {
			System.out.print("두 문자는 같습니다.");
		}else {
			System.out.println("두 문자는 다릅니다.");
		
	}
		
		int hashCode1= a.hashCode();
		int hashcode2= b.hashCode();
		
		System.out.println(hashCode1);
		System.out.println(hashcode2);
		
		String aString = a.toString();
		String bString = b.toString();
		
		System.out.println(aString);
		System.out.println(bString);
		
		
		}
}
