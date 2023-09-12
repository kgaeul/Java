package com.kh.instancetv;

public class TvMain {
	//스택메모리에 올라간다// 리턴 할 거 없이 출력한다
	public static void main(String[] args) {
	Tv tv;//Tv  인스턴스를 참조하기 위해서 변수 tv를 선언-선언만 한 것
	tv = new Tv();// tv 인스턴스 생성 - 공간 만들어짐!!!
	//객체(Tv)의 주소를 인스턴스(tv) 안에다가 저장
	
	
		tv.channel=7;  //인스턴스의 멤버변수 값을 7로 설정
		tv.power();
		tv.channelDown(); //인스턴스의 메서드 channelDown 호출
		tv.channelUp(); //인스턴스의 메서드 channelUp 호출
		System.out.println("channel : "+tv.channel);
	}

}
