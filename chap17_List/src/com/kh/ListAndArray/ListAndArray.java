package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		// array 예제
		
//		int[] intArray = new int[2];
//		intArray[0]=1;
//		intArray[1]=2;
//		
//		
//		System.out.println("Array 요소 : ");
//		
//		for(int i=0;i<intArray.length;i++) {
//			System.out.print(intArray[i]+" ");
//		}
//		
//		System.out.println();
//		
//		//list 예제
//		
//		List<Integer> intList = new ArrayList<>(); //Integer객체를 저장하는 ArrayList 생성
//		
//		intList.add(1);
//		intList.add(2);
//		intList.add(3);
//		intList.add(4);
//		
//		System.out.println("List 요소 "+intList);
//		
//		for( int num : intList){
//			System.out.print(num+" ");
//		}
		
		String[]StirngArray= new String[3];
		
		StirngArray[0]="강아지";
		StirngArray[1]="고양이";
		StirngArray[2]="토끼";
	
		
		for(String s:StirngArray) {
			System.out.print(s+ " ");
		}

		List<Integer> StringList = new ArrayList<>();
		
		StringList.add(1);
		StringList.add(2);
		StringList.add(3);
		StringList.add(4);
		
		for(Integer s1:StringList) {
			System.out.print(s1+ " ");
		}
	}

}
