package com.axelor.guice.demo;

import com.axelor.guice.demo.module.CalculatorModule;
import com.axelor.guice.demo.service.CalculatorService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class CalculatorClient {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new CalculatorModule());
		CalculatorService calculatorService = injector.getInstance(CalculatorService.class);
		System.out.println(calculatorService);
		System.out.println("Addition: "+ calculatorService.calculate(10, 200,"add"));
		System.out.println("Substraction: "+ calculatorService.calculate(4000, 200,"sub"));
		System.out.println("Multiply: "+ calculatorService.calculate(1, 10,"mul"));
		System.out.println("Division: "+ calculatorService.calculate(4000, 200,"div"));
		CalculatorService calculatorService2 = injector.getInstance(CalculatorService.class);
		System.out.println(calculatorService2);
	}
}
