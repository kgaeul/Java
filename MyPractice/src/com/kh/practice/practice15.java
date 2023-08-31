package com.kh.practice;

import java.util.Scanner;

public class practice15 {

	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
	System.out.print("숫자를 입력해주세요 : ");	
	int num = sc.nextInt();		
	if(num%2==0&&num>0){
		System.out.print("소수가 아닙니다.");
			
	}else if(num%3==0&&num>3) {
			System.out.print("소수가 아닙니다.");
			
	}else if (num%5==0&&num>5) {                         
			System.out.print("소수가 아닙니다.");
			
	}else if (num<2){
			System.out.println("잘못입력하셨습니다. ");
			
		}else{
			System.out.print("소수입니다. ");
		
			}
		}    
	}

