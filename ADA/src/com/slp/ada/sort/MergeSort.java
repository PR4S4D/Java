package com.slp.ada.sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = { 20, 35, -17, 3, 67, -2, 2 };

		mergeSort(array, 0, array.length);

		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + "\t");
		}
	}

	private static void mergeSort(int[] input, int start, int end) {

		if (end - start < 2) {
			return;
		}

		int mid = (start + end) / 2;

		// left part of the array
		mergeSort(input, start, mid);

		// right part of the array
		mergeSort(input, mid, end);

		merge(input, start, mid, end);
	}

	private static void merge(int[] input, int start, int mid, int end) {
		/*
		 * (mid-1) is the last element in the left partition & (mid) is the first
		 * element in the right partition no need to do anything is it's already sorted
		 */
		if (input[mid - 1] <= input[mid]) {
			return;
		}

		int i = start;
		int j = mid;
		int tempIndex = 0;

		int[] temp = new int[end - start];
		while (i < mid && j < end) {
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}

		/*
		 * Elements left in the left array has to be copied. No need to copy the
		 * leftover element sin the right array, as they would be already sorted.
		 * i will contain the index of the remaining left array
		 */
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, input, start, tempIndex);

	}

}
