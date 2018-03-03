package com.slp.ada.sort;

/**
 * Time complexity = O(n^2) - Quadratic (approximately)
 * stable sort algorithm
 *
 */
public class BubbleSort {

	public static void main(String[] args) {

		int[] array = { 23, 45, 21, -11, 3, 2 };

		for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, 1 + i);
				}
			}
		}

		System.out.print("Sorted array : ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
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
