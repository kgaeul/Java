package com.kh.Array;

public class Array02 {

	public static void main(String[] args) {

		
		int[]num = new int[10];
		
		for(int i=0;i<num.length;i++) {
			num[i] =i+1;
			System.out.println(num[i]);
		}
		//순서대로 배열 인덱스에 그 값을 출력
		
		for(int i =1; i<num.length;i++) {
			System.out.println("num: "+num[i]);
		}
		
		//길이가 10인 배열 선언
		//역순으로 출력
		for(int i =0; i<num.length; i++) {
			num[i]=num.length-i;
			System.out.println("num["+i+"]="+num[i]);
			
	}
		//길이가 5인 String 배열 선언하고 사과 귤 포도 복숭아 참외로 초기화한 후 배열 인덱스로 귤 출력
		String[]fruit = {"사과","귤","포도","복숭아","참외"};
			System.out.println(fruit[1]);
		
	}
}
