package com.kh.calculatorMVC;

import com.kh.calculatorMVC.CalculatorView;
import com.kh.calculatorMVC.CalculatorModel;
import com.kh.calculatorMVC.Main;

public class CalculatorController {

	private CalculatorModel calculatormodel;
	private CalculatorView calculatorview;
	
	public CalculatorController(CalculatorModel calculatormodel,CalculatorView calculatorview) {
	this.calculatormodel = calculatormodel;
	this.calculatorview = calculatorview;
}
	public void setControllerNum(int num1) {
		calculatormodel.setNum(num1);
	}
	public void setControllerNum2(int num2) {
		calculatormodel.setNum(num2);
	}
	public  int getControllerNum() {
		return calculatormodel.getNum1();
	}
	public  int getControllerNum2() {
		return calculatormodel.getNum2();
	}
	
	public void sum() {
		//DB에 변경될 값 추가
		calculatorview.infor(calculatormodel.getNum1(),calculatormodel.getNum2());
	}
	
	
	
}
