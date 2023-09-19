package com.kh.Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {

		PracticeMain pm = new PracticeMain();
		pm.PracticeQueue();
		pm.PracticeStack();
		
	}
	public void PracticeQueue() {
		Queue<String> snackqueue = new LinkedList<>();
		System.out.println("==================Queue=================");
		snackqueue.offer("빼빼로");
		snackqueue.offer("포카칩");
		snackqueue.offer("프링글스");
		snackqueue.offer("초코송이");
		snackqueue.offer("허니버터칩");
		snackqueue.offer("칸쵸");
		
		System.out.println(snackqueue);
		
		System.out.println(snackqueue.poll());
		
		System.out.println(snackqueue.peek());
		
		System.out.println(snackqueue.size());
	
		System.out.println(snackqueue.contains("초코송이"));
		
		while(!snackqueue.isEmpty()) {
			String element = snackqueue.poll();
			System.out.println(element);
		}
		System.out.println("==================Stack=================");
		
	}
	public void PracticeStack() {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("빨강");
		stack.push("주황");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("남색");
		stack.push("보라");
	
		System.out.println(stack);
		
		System.out.println(stack.pop()+" 삭제할게");
		
		System.out.println(stack.peek()+ " <- 얘가 마지막이란다.");
		
		System.out.println("크기가 "+stack.size()+"입니다.");

		System.out.println("Q) 보라 있어요 ? ");
		if(stack.contains("보라")==true) {
			System.out.println("A) 보라 있는데요 ");
		}else if(stack.contains("보라")==false) {
			System.out.println("A) 엥 보라 없는데요?");
		}
		
		System.out.println("현재 남은 색 :"+stack);
		
		if(stack.empty()==true) {
			System.out.println("다 삭제되었습니다. ");
		}else if(stack.empty()==false) {
			System.out.println("엥 아직 있는데요?");
		}
		
		stack.clear();
		
		if(stack.empty()==true) {
			System.out.println("다 삭제되었습니다. ");
		}else if(stack.empty()==false) {
			System.out.println("엥 아직 있는데요?");
		}
		
	}
}
