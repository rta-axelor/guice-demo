package com.axelor.guice.demo;

import com.axelor.guice.demo.module.CalculatorModule;
import com.axelor.guice.demo.service.*;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class CalculatorClient {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new CalculatorModule());
		Calculator calculator = injector.getInstance(Calculator.class);
		System.out.println("Addition: "+ calculator.addition(10, 200));
		System.out.println("Substraction: "+ calculator.substraction(4000, 200));
		System.out.println("Multiply: "+ calculator.multiply(1, 10));
		System.out.println("Division: "+ calculator.division(4000, 200));
		
	}
}
