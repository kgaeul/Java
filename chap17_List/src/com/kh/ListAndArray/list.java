package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {
	public static void main(String[] args) {
		ListArray1();
		list a = new list();
		a.ListArray2();
	}
		public static void ListArray1()	{
			
		Scanner sc =new Scanner(System.in);
		String[]StirngArray= new String[3];
			
			StirngArray[0]="(1) 강아지";
			StirngArray[1]="(2) 고양이";
			StirngArray[2]="(3) 토끼";
			 
			for(String s:StirngArray) {
			System.out.print(s+ " ");
			}
			
			System.out.println();
			System.out.print("번호를 입력해주세요 : ");
			int num=sc.nextInt();
	
			System.out.print("선택한 동물 : ");
			System.out.println(StirngArray[num-1]);
	}
		
		public void ListArray2() {
		System.out.println();
		System.out.println("============두 번 째 동물들=============");
		System.out.println();
		List<String> StringList = new ArrayList<>();
		
		StringList.add("뱀");
		StringList.add("원숭이");
		StringList.add("코끼리");
		StringList.add("고래");
		
		for(String s1:StringList) {
			System.out.print(s1+ " ");
		}
		
	}
}