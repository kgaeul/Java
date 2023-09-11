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
		//ÃÖÃÊ¸Ş¼¼Áö º¸¿©ÁÖ´Â °Å Ãâ·ÂÇÏ°í
		
		//½ºÄ³³Ê ÀÌ¿ëÇØ¼­ ÀÔ·Â°ª È£­„
	
	while(true) {
	view.displayMessage();
	view.displayGuessPrompt();
	Scanner sc = new Scanner(System.in);
	int guess=sc.nextInt();	
	//¼ıÀÚ¸¦ ¸ÂÃèÀ» ¶§ ºÒ·¯¿Ã view
		if(model.inCorrectGuess(guess)) {
		view.displayCorrectGuess();
		view.displayAttempts(); 
		break;
		}else{
		//ÄÄÇ»ÅÍ°¡ »ı°¢ÇÑ ¼ıÀÚ¿Í ³»°¡ÀÔ·ÂÇÑ ¼ıÀÚ°¡ Æ²·ÈÀ» ¶§ view
		view.displayinCorrectGuess();
		view.displayAttempts();
		}
	}
		view.displayGameover();
		
		
}
	
	public  static void main(String[]args) {
		                                                                                                                                         
	}
	
}
