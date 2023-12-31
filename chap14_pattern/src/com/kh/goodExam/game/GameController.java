package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	//		String
	private GameModel model;
	
	private GameView view;
	
	public GameController(GameModel model,GameView view) {
		this.model=model;
		this.view=view; 
	}
	
	public void runGame() {
		//최초메세지 보여주는 거 출력하고
		
		//스캐너 이용해서 입력값 호춣
	
	while(true) {
	view.displayMessage();
	view.displayGuessPrompt();
	Scanner sc = new Scanner(System.in);
	int guess=sc.nextInt();	
	//숫자를 맞췄을 때 불러올 view
		if(model.inCorrectGuess(guess)) {
		view.displayCorrectGuess();
		view.displayAttempts(); 
		break;
		}else{
		//컴퓨터가 생각한 숫자와 내가입력한 숫자가 틀렸을 때 view
		view.displayinCorrectGuess();
		view.displayAttempts();
		}
	}
		view.displayGameover();
		
		
}
	
	public  static void main(String[]args) {
		                                                                                                                                         
	}
	
}
