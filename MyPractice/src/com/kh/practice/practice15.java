package com.kh.practice;

import java.util.Scanner;

public class practice15 {

	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
	System.out.print("숫자를 입력해주세요 : ");	
	int num = sc.nextInt();		
	
	int count=0;
	for(int i=1; i<=num ; i++) {
		if(num%i==0) {
			count++;
			System.out.println("약수 : "+i);
		}else if(num<2){
			System.out.println("다시 입력해주세요");
			
		}
	}
		if(count>2) {
			System.out.println(num+"은 소수가 아닙니다.");
			System.out.println(num+"의 약수의 개수는 "+count+"개 입니다.");
			}else if(count<3){
				System.out.println("소수입니다.");
				}else{
		}
	}    
}

