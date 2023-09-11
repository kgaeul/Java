package com.kh.goodExam.game;

public class main {

	public static void main(String[] args) {

		GameModel model = new GameModel();
		
		GameView view = new GameView();
		
		GameController Controller = new GameController (model,view);
		
		Controller.runGame();
	}

	
	
}
