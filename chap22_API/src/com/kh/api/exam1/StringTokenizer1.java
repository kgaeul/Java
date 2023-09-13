package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizer1 {
	public static void main(String[]args) {
		
		StringTokenizer1 stm = new StringTokenizer1();
		stm.STExam();
		stm.STExam2();
		stm.STExam3();
		stm.STExam4();
		stm.stringtoMath();
	}
	
	public void STExam() {
		
		String text = "apple banana grape orange";
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	
	public void STExam2	() {
		String text = "푸바오-아이바오-러바오";
		StringTokenizer tokenizer = new StringTokenizer(text , "-");
		
		while(tokenizer.hasMoreTokens()) {
			String panda = tokenizer.nextToken();
			System.out.println(panda);
		}
		
		
				
	}
	public void STExam3	() {
		
		String text="this is a test .But not a real one";
		
		StringTokenizer tokenizer  = new StringTokenizer(text , ".");
		
		while(tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			if(!word.equals("test")) {
			System.out.println(word);
			}
		}
	}

	public void STExam4	() {
		String date = "2023|09|23";
		StringTokenizer tokenizer  = new StringTokenizer(date , "|");
		int year = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
	}
	public void stringtoMath() {
		String text = "thie price is $15.99";
		StringTokenizer tokenizer  = new StringTokenizer(text , " $.");
		
		while(tokenizer.hasMoreTokens()) {
		String token = tokenizer.nextToken();
		if(token.matches("\\d+(\\.\\d)+?")) {
			
		}
		System.out.println(token);
		}
	}

}