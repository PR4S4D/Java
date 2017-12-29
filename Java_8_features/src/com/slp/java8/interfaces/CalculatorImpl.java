package com.slp.java8.interfaces;

public class CalculatorImpl implements Calculator, BasicCalculator {

	// abstract methods in the interface
	@Override
	public double add() {
		return 0;
	}

	@Override
	public double multiply() {
		return 0;
	}

	@Override
	public double division() {
		return 0;
	}

	
	// the default method in both the super interfaces has to be implemented
	// comment it and check
	@Override
	public double subtract(double a, double b) {
		return BasicCalculator.super.subtract(a, b);
	}
	

}
