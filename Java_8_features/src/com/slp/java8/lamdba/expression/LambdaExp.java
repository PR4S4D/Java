package com.slp.java8.lamdba.expression;

/**
 * Conceptually, a functional interface has exactly one abstract method. default
 * methods have an implementation, they are not abstract.
 *
 */
@FunctionalInterface
interface Logger {
	/**
	 * the only abstract method in this functional interface
	 */
	void log(String s);

	/**
	 * default not abstract
	 */
	default void log() {
		System.out.println("Inside the default method");
	};
}

public class LambdaExp {

	public static void main(String[] args) {
		
		Logger logger = new Logger(){

			@Override
			public void log(String s) {
				System.out.println("Without using lamdba!");
				
			}
			
		};
		
		// Lambda expression
		Logger logger1 = (i) -> System.out.println(i);

		Logger logger2 = (i) -> {
			System.out.println("Entering log");
			System.out.println(i);
			System.out.println("Exiting log");
		};
		logger.log();
		logger1.log("LP");
		logger2.log("SLP");
		logger1.log();
	}
}
