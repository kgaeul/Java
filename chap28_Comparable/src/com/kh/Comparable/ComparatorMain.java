package com.kh.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain implements Comparator<String>{

	@Override
	public int compare (String num1,String num2) {
		//길이가 같으면 0 반환
		
		if(num1.length()==num2.length()) {
			return 0;
		}
		//num1이 num2 보다 길면 양수 반환
		else if(num1.length()>num2.length()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public static void main(String[] args) {

		List<String> str = new ArrayList<>();
		str.add("apple");
		str.add("banana");
		str.add("cherry");
		str.add("add");
		str.add("abcdefg");
		str.add("bcdefg");
		str.add("b");
		str.add("d");
		str.add("D");
		str.add("가");
		//한글 소문자 대문자
		
		//Comparator 사용하여 문자열을 정렬하기
		Collections.sort(str,new ComparatorMain());
		
		for(String s:str) {
			System.out.println(s);
		}
	}

}
