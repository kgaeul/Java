package com.kh.ArrayListSample;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
		//빈 arraylist 생성
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println(fruits);
		
		fruits.add("사과");
		System.out.println(fruits);
		fruits.add("딸기");
		System.out.println(fruits);
		fruits.add("바나나");
		System.out.println(fruits);
		
		int size = fruits.size();
		System.out.println("과일의 크기 : "+size);
		
		String firstFruits=fruits.get(0);
		System.out.println("첫 번째 과일 : "+firstFruits);
		String fourFruits=fruits.get(2);
		System.out.println("첫 번째 과일 : "+fourFruits);
		//요소 수정할 거야
		fruits.set(2, "체리");
		System.out.println("수정"+fruits);
		
		//요소제거
		fruits.remove(1);
		System.out.println("바나나 제거 start"+fruits);
		fruits.clear();
		System.out.println(fruits);
	}

}
