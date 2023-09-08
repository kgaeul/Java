package com.kh.mvc.circle;
import com.kh.mvc.circle.CircleModel;

public class CircleController {

	private CircleModel circlemodel;
	private CircleView circleview;
	
	public CircleController(CircleModel circlemodel,CircleView circleview) {
		this.circlemodel=circlemodel; 
		this.circleview=circleview; 
	}
	
	public void updateresult() {
		double userGetInput = circleview.get1();
		double userGetInput2 = circleview.get2();
		circlemodel.setNum(userGetInput);
		circlemodel.setNum(userGetInput2);
		circleview.result(userGetInput, userGetInput2);
		//System.out.println();
		//circleview.result(circlemodel.getNum1(),circlemodel.getNum2());
	}
	
}
