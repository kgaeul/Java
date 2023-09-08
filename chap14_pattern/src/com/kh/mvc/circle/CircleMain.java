package com.kh.mvc.circle;



public class CircleMain {
	public static void main(String[] args) {
		
	CircleModel model = new CircleModel();
	CircleView view = new CircleView();
	CircleController controller = new CircleController(model,view);
	
	
	controller.character();
	
	
	}

}