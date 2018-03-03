package com.slp.ada.sort;

/**
 * Quadratic time complexity 
 * unstable 
 * Usually better than bubble sort as it
 * swaps once per outer loop
 *
 */
public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] array = { 5, 8, 1, -2, 98, 3, 5 };

		for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0; // Assume the first element is the largest
			
			for(int i = 1; i <= lastUnsortedIndex; i++){
				if(array[largest] < array[i]) {
					largest = i;
				}
			}
			
			swap(array,lastUnsortedIndex,largest);
		}
		
		System.out.println("Sorted array:");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");			
		}
	}


	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
}