package com.slp.java8.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {
	
	public static void main(String[] args) {
		
		// immutable
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		System.out.println(LocalDate.of(1993, Month.APRIL, 22));
		
		System.out.println(LocalTime.now());
	
		System.out.println(LocalTime.parse("01:05:56.960").getMinute());
	}
	
}
