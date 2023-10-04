package chap37_ToDoList;

import java.util.*;
import java.util.Map.Entry;

public class ToDoList_case {

	public static void main(String[] args) {

		Map<Integer,String> todoMap = new HashMap<>();
		int taskNum =1;
		Scanner sc = new Scanner(System.in);
		//할일 목록을 적자
		while(true) {
			System.out.println("할일 목록 : ");
			for(Map.Entry<Integer,String> entry : todoMap.entrySet()) {
				System.out.println(entry.getKey()+"번 : ["+entry.getValue()+"]");
			}
			System.out.println("할일을 선택하세요 : ");
			System.out.println("추가:[1]  제거:[2]  목록:[3]  종료:[4]");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice){
			case 1:
				System.out.println("추가할 일을 작성해주세요 : ");
				String todoItem = sc.nextLine();
				todoMap.put(taskNum++, todoItem);
				System.out.println("할 일이 추가되었습니다.");
				break;
				
			case 2:
				System.out.println("제거할 일을 작성해주세요 : ");
				int removeNum = sc.nextInt();
				if(todoMap.containsKey(removeNum)) {
					todoMap.remove(removeNum);
				System.out.println("할 일이 제거되었습니다.");
				}else {
					System.out.println("해당 번호의 할일이 없습니다.");
				}
				break;
			case 3:
				for(Entry<Integer, String> entry:todoMap.entrySet()) {
					System.out.println("["+entry.getValue()+"]");
				}
				
				break;
				
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.out.println("반가웠어요 다음에 또 만나요");
				sc.close();
				System.exit(0);
				break;
				
			default:
				System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요");
			}
		}
	}
}
