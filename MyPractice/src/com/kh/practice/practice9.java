package com.kh.practice;

import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num>9) {
			System.out.println(" 9 이하의 숫자를 입력하세요");
			 }else{
				 for (int i2=num ; i2<10 ; i2++) { 
					 for (int i=1 ; i<10 ; i++) { 
								System.out.println(i2+"x"+ i +"="+(i2*i)); {
								}	
			}
			}
		}
	}
	
}