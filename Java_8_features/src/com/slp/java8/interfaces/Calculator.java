package com.slp.java8.interfaces;

public interface Calculator {
	double add();

	//use default keyword to define a method in the interface
	default double subtract(double a, double b) {
		return b - a;
	}
	
	double multiply();
	double division();
	
	// A default method cannot override method from Object class
/*	default boolean equals(Object o){
		return true;
	}*/
}
 