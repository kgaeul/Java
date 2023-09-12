package com.kh.ArrayList;
import java.util.ArrayList;
public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated m
		
		

		ArrayList<String> colors = new ArrayList<>();
		
		
		colors.add("빨");
		colors.add("주");
		colors.add("노");
		colors.add("초");
		colors.add("파");
		colors.add("남");
		colors.add("보");
		System.out.println(colors);
		
		colors.set(1,"블랙");
		colors.set(3,"브라운");
		colors.set(4,"그린");
		System.out.println(colors);
		
		
		colors.add(2,"옐로우");
		colors.add(5,"연한파랑");
		System.out.println(colors);
		
		System.out.println(colors.get(6));
		colors.remove(1);
		colors.remove(1);
		colors.remove(1);
		colors.remove(1);
		colors.remove(2);
		colors.remove(2);

		System.out.println(colors);
		
		for(String color:colors) {
			System.out.print(color);
			System.out.println(" ");
		}
		
		
	}

}
