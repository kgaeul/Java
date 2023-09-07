package com.kh.ArrayList;

public class ArrayList {

	public static void main(String[] args) {

		String[]ss= {"banana","apple","cherry","lemon"};
		String longss =" ";
		for(String str : ss) {
			if(str.length()>longss.length()) {
				longss=str;
			}
		}
	System.out.println(longss);
	}

}
