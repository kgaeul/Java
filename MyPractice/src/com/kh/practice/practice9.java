package com.kh.practice;

import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		if(num>9) {
			System.out.println("9 ������ ���ڸ� �Է��ϼ���");
		} else if(num2>9) {
						System.out.println("9 ������ ���ڸ� �Է��ϼ���");
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
	
