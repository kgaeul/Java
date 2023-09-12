package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {

	public static void main(String[]args){
		
		
		List<String> LinkedList = new LinkedList<>();
		List<String> LinkedList2 = new LinkedList<>();

		LinkedList<String> LinkedList3 = new LinkedList<>();
		
		
		LinkedList.add("첫 번째");
		LinkedList.add("두 번째");
		LinkedList.add("세 번째");
		System.out.println(LinkedList);
		
		LinkedList.remove(2);
		System.out.println("삭제 후 : "+LinkedList);
		
		boolean isTrue = LinkedList.contains("세 번째");
		
		System.out.println(isTrue);
		
		int size = LinkedList.size();
		System.out.println("배열의 크기 : "+size);
		
		LinkedList3.add("토끼");
		LinkedList3.add("거북이");
		LinkedList3.add("호랑이");
		LinkedList3.add("여우");
		
		System.out.println(LinkedList3);
		
		
		
	}
	
}
