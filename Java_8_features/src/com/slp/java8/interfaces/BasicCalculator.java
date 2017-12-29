package com.slp.java8.interfaces;

public interface BasicCalculator {
	double add();
	
	//use default keyword to define a method in the interface
	default double subtract(double a, double b) {
		return b - a;
	}
}
