package com.slp.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamApi {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

		// forEach - consumer interface
		list.forEach(i -> System.out.println(i));

		Stream<Integer> stream = list.stream();
		stream.forEach(i -> System.out.println(i));

		/*
		 * A stream should be operated only once.
		 * 
		 * IlleagalStateException is thrown when Stream is reused
		 * 
		 * stream.forEach(i->System.out.println(i));
		 * 
		 */

		/*
		 * multithreaded
		 */
		list.parallelStream().forEach(i -> System.out.println(i));

		/*
		 * filter - test method of Predicate interface is implemented
		 */
		list.stream().filter(i -> i % 3 == 0).forEach(i -> System.out.println(i + " is a divisible by 3"));
		
		System.out.println("The first element is -" + list.stream().findAny().get());
		
	}
}
