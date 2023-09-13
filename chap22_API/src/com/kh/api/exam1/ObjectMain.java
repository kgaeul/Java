package com.kh.api.exam1;

public class ObjectMain {

	public static void main(String[] args) {
		//Object클래스의 예제
		
		//객체 생성
		Object obj = new Object();
		Object obj2 = new Object();
		
		// equals() 두 객체 비교
		boolean isEqual = obj.equals(obj2);
		System.out.println(isEqual);
		
		//해쉬코드 Hashcode() 메소드를 사용하여 객체의 해시코드 출력
		int Hashcode1= obj.hashCode();
		int Hashcode2= obj2.hashCode();
		System.out.println(Hashcode1);
		System.out.println(Hashcode2);
		
		//toString()
		
		String objString = obj.toString();
		String objString2 = obj2.toString();
		
		System.out.println(objString);
		System.out.println(objString2);
		
		//getClass()
		
	Class<?> classOfObj1 = obj.getClass();
		Class<?> classOfObj2 = obj2.getClass();
		System.out.println(classOfObj1.getName());
		System.out.println(classOfObj2.getName());
	}

}
