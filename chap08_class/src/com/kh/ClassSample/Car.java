package com.kh.ClassSample;

public class Car {

	//1.상태 2.필드 3.멤버변수
	String brand;		//브랜드
	String model;		//모델
	int speed;			//속도
	boolean engineOn;	//엔진 상태
	//멤버변수 밑에는 모두 메서드로 정의//
	//=============================================//
	
	//2.생성자는 메서드의 한가지 종류(입력한 다음 실행하세요)
	public Car(int speed, String brand,String model) {
		this.brand = brand;
		this.model=model;
		this.speed=0;	
		this.engineOn=false;
		System.out.println("car 정의");
		
	}
	//엔진 시작 메서드
	public void startEngine() {
		//만약에 엔진이 true면 엔진 시동하고 
		if(engineOn) {
			System.out.println("엔진을 시동합니다.");//출력 메소드 작성
		} else {//엔진이 false면 이미 엔진이 켜져있다.
			System.out.println("이미 엔진이 켜져 있습니다.");
			}
		
		
	}//가속 메서드
	public void acclerate(int amount) {
		if(engineOn) {
			//엔진이 true면 지금 속도가 얼마다.
			speed+=amount;
			System.out.println("속도 얼마입니다.");
		}else {
			System.out.println("속도를 알 수 없다.");
			//엔진이 false면 엔진이 꺼져있어 속도를 낼 수 없다.
		
	
		}	
	}	
}