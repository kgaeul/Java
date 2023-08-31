package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {

		int sum =0;
		int num =1;
		while(num<=5) {
			System.out.println("num은 : "+num);	
			sum+=num;
			num=num+1;
			//sum의 합계를 주기적으로 보고 싶으면 while문 안에 작성하기	
		}
		System.out.println("num은 : "+sum);
		//while이 종료되었다고 해서 클래스가 종료된것은 아님 while문이 종료된 후 남아있는
		//System.out.println(sum)이 출력됨
	}

}
