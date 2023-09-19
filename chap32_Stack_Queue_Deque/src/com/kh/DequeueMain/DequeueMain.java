package com.kh.DequeueMain;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueMain {

	/*
	  ` b  
	    |
	    V
	    [first] <-> [second] <-> [third]
	 */
	
	public static void main(String[] args) {

		Deque<String> deque = new LinkedList<>();
		
		deque.addFirst("가");
		deque.addFirst("나");
		deque.addFirst("다");
		
		deque.offerFirst("라");
		
		System.out.println(deque);
		
		
		
	}

}
