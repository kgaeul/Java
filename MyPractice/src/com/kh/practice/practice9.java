package com.kh.practice;

import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		if(num>9) {
			System.out.println("9 이하의 숫자를 입력하세요");
		} else if(num2>9) {
						System.out.println("9 이하의 숫자를 입력하세요");
			 }else{
				 for (int i2=1 ; i2<=num ; i2++) { 
						for (int i=1 ; i<=num2; i++) { 
							int result =i*i2;			
							System.out.println(i+"x"+ i2 +"="+result); {
							}	
							}
					
					
				
				
				
				
			}
			}
		}
	}
	
