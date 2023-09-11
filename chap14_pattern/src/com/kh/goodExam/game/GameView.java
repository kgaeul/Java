package com.kh.goodExam.game;

public class GameView {
	
	private String start = "숫자 맞추기 게임을 시작합니다. 1에서 100까지의 숫자를 맞춰주세요!";
	private String guess = "추측한 숫자를 입력하세요 : ";
	private String correct = "숫자를 맞췄습니다.";
	private String fail=  "툴렸습니다 다시 시도하세요 ";
	private String over="게임 종료";
	private int attempts;
	private String num = "시도횟수 : "+attempts;

	
	public void displayMessage() {
		System.out.println(start);
		//숫자 추측하는 값 입력하기
	}
	public void displayGuessPrompt() {
		System.out.println(guess);
	}
	
	public void displayCorrectGuess( ) {
		System.out.println(correct);
	} 
	
	public void displayinCorrectGuess() {
		System.out.println(fail);
	
}
	public void displayAttempts() {
		System.out.println(num);
	}
	public void displayGameover() {
		System.out.println(over);
	}
	
} 
