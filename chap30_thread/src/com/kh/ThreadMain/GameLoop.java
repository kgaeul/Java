package com.kh.ThreadMain;

import java.util.Random;


public class GameLoop implements Runnable {
	
	private boolean isGameOver = true;
	
	public void run() {
		while(isGameOver) {
			int randomValue = new Random().nextInt(10);
			System.out.println("임의의 숫자 : " + randomValue);
			
			//게임 루프 지연 시간
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//게임종료 조건
			//Enter 키를 누르면 게임이 종료
			System.out.println("게임을 종료하려면 Enter 키를 누르세요. ");	
		}
	}
}
