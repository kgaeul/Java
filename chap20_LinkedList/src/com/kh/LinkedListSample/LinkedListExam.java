package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {

		List<String> LinkedList = new LinkedList<>();
		
		LinkedList.add("빨간색");
		LinkedList.add("주황색");
		LinkedList.add("노란색");
		LinkedList.add("초록색");
		
		System.out.println(LinkedList);
		
		LinkedList.remove(2);
		
		System.out.println("삭제 후 : "+LinkedList);
		
		LinkedList<Integer> LinkedList2 = new LinkedList<>();
		
		LinkedList2.add(1);
		LinkedList2.add(2);
		LinkedList2.add(3);
		LinkedList2.add(4);
		LinkedList2.add(5);
		
		System.out.println(LinkedList);
		
		LinkedList2.remove(2);
		
		System.out.println("삭제 후 : "+LinkedList2);
		
		
	}

}
