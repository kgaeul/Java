package com.kh.ThreadMain;

public class StudentThread extends Thread{

	private String StudentName;

	public StudentThread (String name) {
		this.StudentName=name;
	}
	
	@Override
	public void run() {
		
		System.out.println(StudentName +"이가 드디어 공부를 시작합니다.");
		try {
			Thread.sleep(2000); //스레드가 2초동안 잠자기 상태로 있도록 합니다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i =0;i<=5;i++) {
			System.out.println("스레드 실행 중 : "+i);
		}
		System.out.println(StudentName+"이가 공부를 마칩니다.");
	}

}
