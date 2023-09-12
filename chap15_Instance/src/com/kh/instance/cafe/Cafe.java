package com.kh.instance.cafe;

public class Cafe {
	private int size;//아메리카노 사이즈
	private boolean hasSugar;//설탕 넣냐 안넣냐
	private String type;
	
	public Cafe (String type,int size, boolean hasSugar) {
		this.type=type;
		this.size=size;
		this.hasSugar=hasSugar;
	}
	
	public void makeCoffee() {
		System.out.println("선택한 음료 : "+type);
		System.out.println(type+" 제조를 시작합니다. ");
		System.out.println("크기 : "+size);
		
		//만약에 설탕을 넣는다면!
		if (hasSugar) {//true라면 출력
		System.out.println("설탕을 추가합니다. ");
	}
}
}
