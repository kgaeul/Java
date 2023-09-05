package com.kh.classAM;

public class AM {

	public int pNum =10;
	protected int pNum2=20;
	int pNum3 =30;//접근 제한자를 명시하지 않으면 default가 자동 적용
	private int pNum4 =40;
	
	//호출 메소드를 작성해서 각각 호출하기
	
	public void publicMethod() {
		System.out.println("public Method() 호출됨");
	}
	
	protected void protectedMethod() {
		System.out.println("protected Method() 호출됨");
	}
	void defaultMethod() {
		System.out.println("default Method() 호출됨");
	}
	private void privateMethod() {
		System.out.println("private Method() 호출됨");
	}
}
