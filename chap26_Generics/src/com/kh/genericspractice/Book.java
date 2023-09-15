package com.kh.genericspractice;
//제너릭 클래스 정의
public class Book <T> {
	T content;
	
	public void put(T item) {
		this.content=item;
	}
	public T get() {
		return content;
	}
	
	Book<Integer> intBook = new Book<>();
	intBook.put(42);
	intBook.put(722);
	int intValue = intBook.get();
	
	//형변환 필요없음
	
	//문자열 데이터를 저장하는 Book 인스턴스 생성
	Book<String> strBook = new Book<>();
	
	strBook.put("Hello");
	strBook.put("ggggg");
	strBook.put("java");
	strBook.put("C++");
	strBook.put("Python");
	String strValue = strBook.get();
	
}


