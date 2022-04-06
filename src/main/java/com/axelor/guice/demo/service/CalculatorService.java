package com.axelor.guice.demo.service;

import com.google.inject.Inject;

public class CalculatorService {
	
	@Inject
	private Calculator calculator;
	
	public int calculate(int a, int b, String oper) {
		if(oper.equalsIgnoreCase("add")) {
			return calculator.addition(a, b);
		}else if(oper.equalsIgnoreCase("sub")) {
			return calculator.substraction(a, b);
		}else if(oper.equalsIgnoreCase("mul")) {
			return calculator.multiply(a, b);
		}else if(oper.equalsIgnoreCase("div")) {
			return calculator.division(a, b);
		}
		return 0;
	}
}
