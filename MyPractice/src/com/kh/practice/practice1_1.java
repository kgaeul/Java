package com.kh.practice;

import java.util.Scanner;

public class practice1_1 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 System.out.print("글자를 입력해주세요 : ");
	        String str = sc.next();
	        System.out.print("숫자를 입력해주세요 : ");
	        int n = sc.nextInt();
	        
	        for(int i=0;i<n;i++){
	            System.out.print(str);
	        }
	}

}
