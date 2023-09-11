package com.kh.todoList;

public class todoListModel {
	//할일 목록
	//목록의 아이템
	//아이템 더하고 빼기
	
	private String items;
	private String item;
	
	public todoListModel(String text) {
		this.item=text;
	}
	
	public String getItem() {
	
		return item;
	}
	public String getItems() {
		return items;
	}
	
	public void list() {
		System.out.println("오늘의 할일은 " +item+"입니다.");
	}
}
