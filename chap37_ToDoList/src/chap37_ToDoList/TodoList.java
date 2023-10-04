package chap37_ToDoList;

import java.util.*;

public class TodoList {

	private static Map<Integer,String>tasks;
	private  int nextId;
	
	public TodoList() {
		tasks = new HashMap<>();
		nextId=1;
	}
	public void addTask(String task) {
		tasks.put(nextId, task);
		nextId++;
	}
	
	public void remoceTack(int Id) {
		if(tasks.containsKey(Id)) {
			tasks.remove(Id);
		}else{
			System.out.println("잘못된 인덱스입니다.");
		}
	}	
	
	public void displayTasks() {
		System.out.println("나의 투두리스트");
		System.out.println();
		for(Map.Entry<Integer, String> entry : tasks.entrySet() ) {
			System.out.println( tasks.entrySet() );
		}
	}
	public static void main(String[] args) {
		
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("할일 추가:add 삭제:remove 할일보기:list 종료:exit 입력하세요");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("할일을 입력하세요");
				String task = sc.nextLine();
			
				todoList.addTask(task);
			}else if(choice.equalsIgnoreCase("remove")) {
				System.out.println("삭제할 일 번호 입력하기");
				try{
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.remoceTack(index);
				}catch(Exception e) {
					System.out.println("유효하지 않은 입력입니다.");
				}
			}else if(choice.equalsIgnoreCase("list")) {
				for(String todo : args) {
					System.out.println(todo);
				}
			}else if(choice.equalsIgnoreCase("exit")) {
				System.out.println("종료!");
				break;
			}else {
				System.out.println("잘못된 명령입니다.");
			}
		}
		System.out.println("잘못된 명령입니다.");
		
		
	}

}
