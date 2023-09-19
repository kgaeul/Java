package com.kh.stackMain;

import java.util.Stack;

public class stackMain {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		//stack에 값 추가 push();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//stack 값 삭제 pop();
		stack.pop();
	
		//가장 마지막 값 출력
		stack.peek();
		
		//전체 삭제
		stack.clear();
		
		//크기 출력!!!
		stack.size();
		
//		stack empty : 스택이 비어있는 지 체크
//		비어있다면 true 하나라도 들어있다면 false
		stack.empty();
		
		//스택 1이 있는 지 체크 1이 존재한다면 true
		stack.contains(1);
		System.out.println(stack.contains(1));
		/*
		 |			 |
		 |			 |
		 |			 |
		 |	   3	 |
		 |	   2	 |   
		 |_____1_____|
		 */
		

		
	}

}
