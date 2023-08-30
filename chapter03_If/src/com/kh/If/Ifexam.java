package com.kh.If;

public class Ifexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 if(조건식1){
 	if(조건식2){
 		if(조건식3){
 			수행될 문장;
 		}else if(조건식 4){
 			수행될 문장;
 			}else{
 			수행될 문장;
 			}
 			}else{
 			수행될 문장;
 			}
 			}else{
 			
 			}
 			수행될 문장;
 			
 			//날씨에 따른 경보!

  */
		int month =9;
		int temp = -10;
		if(month==1||month==2||month==12) {
			System.out.println("겨울");
		if(temp <=-15) {
			System.out.println("한파경보");
		}else if(temp <=-12) {
			System.out.println("한파주의보");
		}
	}else if(month>=3&&month<=5) {
		System.out.println("봄");
	}else if(month>=6&&month<=8) {
		System.out.println("여름");
	} else {
		System.out.println("가을");
	}
	}
}
