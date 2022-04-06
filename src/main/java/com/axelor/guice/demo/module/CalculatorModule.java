package com.axelor.guice.demo.module;

import com.axelor.guice.demo.service.Calculator;
import com.axelor.guice.demo.service.CalculatorImpl;
import com.google.inject.AbstractModule;

public class CalculatorModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Calculator.class).to(CalculatorImpl.class);
	}
}
