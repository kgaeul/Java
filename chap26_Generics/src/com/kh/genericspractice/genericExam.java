package com.kh.genericspractice;

import java.util.ArrayList;
import java.util.List;

public class genericExam {

	public static void main(String[] args) {
		//정수형 데이터를 저장하는 Book 인스턴스 생성
		genericExam ge = new genericExam();
		ge.practice2();

	}
	

	public void practice2() {
		List<Object>box = new ArrayList<>();
		Box<Integer> intBox = new Box<>();
		intBox.put(1,box);
		intBox.put(2,box);
		intBox.put(3,box);
		intBox.put(4,box);
		intBox.put(5,box);
		
		Integer intValue = intBox.get();
		
		Box<String> strBox = new Box<>();
		strBox.put("가",box);
		strBox.put("나",box);
		strBox.put("다",box);
		strBox.put("라",box);
		strBox.put("마",box);
		
		String strValue = strBox.get();
		
		for(Object strB : box) {
			System.out.println("값 : "+strB);
		}
	
	}
}
