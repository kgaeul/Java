package com.kh.queueMain;

import java.util.LinkedList;
import java.util.Queue;
//큐는 맛집 웨이팅 같은 느낌 ~~
public class QueueMain {
	
	public static void main(String[] args) {
	//큐 생성
	Queue <String> queue = new LinkedList<>();
	
	/* front              real(tail)
	 *   |         |         |
	 *   V         V         V
	   +---+     +---+     +---+
	   | 1 | <-  | 2 |  <- | 3 |
	   +---+     +---+     +---+
	 
	 */
	//큐에 요소 추가
	queue.offer("사과");
	queue.offer("바나나");
	queue.offer("체리");
	
	//큐에서 요소 추출 및 출력(FIFO 순서대로 출력됨)
	String removeElement = queue.poll(); //queue에서 apple 제거하고 반환
	System.out.println(removeElement+" 지울게요");
	
//	removeElement = queue.poll();
	
	//제거하지 않고 확인만
	String fontElement = queue.peek();
	System.out.println(queue.peek());
	
	int size = queue.size();
	System.out.println("사이즈는 : "+size);
	System.out.println(queue);
	
//	while(!queue.isEmpty()) {
//		String element = queue.poll();
//		System.out.println(element);
//		}
	}
}
