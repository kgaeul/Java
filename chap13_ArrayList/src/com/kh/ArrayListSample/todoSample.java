package com.kh.ArrayListSample;

import java.util.ArrayList;

public class todoSample {

	public static void main(String[] args) {

		ArrayList<String> todo = new ArrayList<>();
		todo.add("숙제하기");
		System.out.println(todo);
		todo.add("청소하기");
		System.out.println(todo                                                                                                                                                                                                                                                                                                                                                                                                                                                                );
		todo.add("게임하기");
		System.out.println(todo);
		
		String firsttodo=todo.get(0);
		System.out.println("첫 번째 할일 : "+firsttodo);
		String secondtodo=todo.get(2);
		System.out.println("세 번째 할일 : "+secondtodo);
		
		todo.set(1, "산책하기");
		System.out.println("[청소하기] => ["+todo.get(1)+"]로 변경하기");
		todo.set(0, "운동하기");
		System.out.println("[숙제하기] => ["+todo.get(0)+"]로 변경하기");
		
		todo.remove(2);
		System.out.println("[게임하기] 제거 start "+todo);
		
		System.out.println("=======모든 할일 목록======");
		//우리가 정할 변수명// 목록이 들어있는 변수명
		for (String todos:todo) {
			System.out.println("["+todos+"]");
		}
		
		todo.clear();
		System.out.println(todo+" => 모두 삭제되었습니다.");
		
	}

}
