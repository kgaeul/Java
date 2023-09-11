package com.kh.goodExam.game;

public class GameModel {

	private int secretNumber;//숨겨진 번호
	private int attempts;//몇번 시도했는가//인스턴스변수                                     
	
	
	public GameModel() {
		secretNumber=(int)(Math.random()*100)+1;
		attempts=0; 
	}
	
	public int getSecretNumber() {
		return secretNumber;
	}
	public int getAttempts() {
		return attempts;
	}
	public void increamentAttempts() {
		attempts++;
	}
	
	public boolean inCorrectGuess (int guess) {
		increamentAttempts();
		
		//중가하는 값을 추가
	return guess==secretNumber;
	}
}
