package com.kh.instance.americano;

public class Americano {
	private int size;//아메리카노 사이즈
	private boolean hasSugar;//설탕 넣냐 안넣냐
	private String type;
	
	public Americano(String type,int size, boolean hasSugar) {
		this.type=type;
		this.size=size;
		this.hasSugar=hasSugar;
	}
	
	public void makeCoffee() {
		System.out.println("아메리카노를 만듭니다. ");
		System.out.println("크기 : "+size);
		
		//만약에 설탕을 넣는다면!
		if (hasSugar) {//true라면 출력
		System.out.println("설탕을 추가합니다. ");
	}
}
}