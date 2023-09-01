package com.kh.practice;

import java.util.Scanner;

public class practice16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		boolean isTrue = true;
		
		while(isTrue) {
		System.out.print("숫자를 입력해주세요 : ");	
		int num = sc.nextInt();		
		if(num%2==0&&num>2){
			System.out.print("소수가 아닙니다.");
				isTrue = false;
		}else if(num%3==0&&num>3) {
				System.out.print("소수가 아닙니다.");
				isTrue = false;
		}else if (num%5==0&&num>5) {                         
				System.out.print("소수가 아닙니다.");
				isTrue = false;
		}else if (num<2){
				System.out.println("잘못입력하셨습니다. ");
				
			}else{
				System.out.print("소수입니다. ");
				isTrue = false;
				}
			}    
	}

}
