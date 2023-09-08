package com.kh.calculatorMVC;

public class CalculatorView {

	public static void main(String[] args) {
		
		CalculatorModel model = new CalculatorModel();
		
		CalculatorView view = new CalculatorView ();
		
		CalculatorController Controller = new CalculatorController(model,view);
		
	}

		
}

