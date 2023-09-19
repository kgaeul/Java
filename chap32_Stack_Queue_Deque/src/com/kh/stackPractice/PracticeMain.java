package com.kh.stackPractice;

import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		//스택에 값을 저장하고 삭제하고 초기화등 메서드 사용해보기
		
		Stack<String> stack = new Stack<>();
		
		stack.push("봄");
		stack.push("여름");
		stack.push("가을");
		stack.push("겨울");
		
		stack.peek();
		
		System.out.println(stack.peek());
		
		stack.pop();
		System.out.println(stack.pop());
		

		System.out.println("봄이 있는가? : "+stack.contains("봄"));
		System.out.println("여름이 있는가? : "+stack.contains("여름"));
		System.out.println("가을이 있는가? : "+stack.contains("가을"));
		System.out.println("겨울이 있는가? : "+stack.contains("겨울"));
		
		System.out.println("크기가 몇이야? \n크기는 "+stack.size()+" 야!!!");
		
		stack.clear();
		System.out.println(stack);
		
		System.out.println("비어있습니까? : "+stack.empty());
		
		
		
		
				
				
	}

}
