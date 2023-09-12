package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListandArrayList {

	public static void main(String[] args) {

		int[] myArray = new int[5];
		myArray[0]=10;//첫 번째 요소에 값을 전달
		 
		List<Integer>myList = new ArrayList();
		myList.add(10);
		int value = myList.get(0); //첫 번째 요소 추가
		myList.remove(0);//첫 번째 요소 삭제
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("첫 번째");
		arrayList.add("두 번째");
		
		String value2 = arrayList.get(0);//첫번 째 요소
		arrayList.remove(1);//두 번째 요소 삭제
		
		
		
		
		
	}

}
