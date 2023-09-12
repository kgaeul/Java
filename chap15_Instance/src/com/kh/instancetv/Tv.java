package com.kh.instancetv;

public class Tv {
	//tv 제작
	//tv의 속성(필드)
	String color;//tv 색상
	boolean power;//전원 상태
	int channel;  //채널
	
	//tv 기능(메서드)
	public void power() {
		power = !power; //전원 상태
	}
	public void channelUp() {
		++ channel;
	}
	public void channelDown() {
		-- channel;
	}
	
}
