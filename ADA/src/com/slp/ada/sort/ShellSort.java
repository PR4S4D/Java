package com.slp.ada.sort;

/**
 * Similar to selection sort but with gap
 * unstable
 * Difficult to know to the complexity
 *
 */
public class ShellSort {
	
	public static void main(String[] args) {
		int[] array = { 3, 1, 12, 55, 99, -11, 2 };
		
		
		for(int gap = array.length / 2; gap > 0; gap/=2) {
			
			for( int i = gap; i < array.length; i++) {
				int newElement = array[i];
				
				int j = i;
				
				// check if j has reached the starting of the array 
				while ( j >= gap && newElement < array[j - gap]) {
					array[j] = array[j-gap];
					j -= gap;
				}
				
				array[j] = newElement;
			}
			
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
