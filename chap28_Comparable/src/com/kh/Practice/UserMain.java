package com.kh.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserMain implements Comparator<String>{

	@Override
	public int compare(String num1, String num2) {
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

		
		List<String> Snack = new ArrayList<>();
		
		Snack.add("빼빼로");
		Snack.add("포카칩");
		Snack.add("프링글스");
		Snack.add("초코송이");
		Snack.add("빈츠");
		
		Collections.sort(Snack,new UserMain());
		
		for(String snack: Snack) {
			System.out.println(snack);
		}
	}



}
