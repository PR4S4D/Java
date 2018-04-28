package com.slp.ada.arrays;

public class Arrays {

	public static void main(String[] args) {

		// int[] myIntArray = new int[3];
		// int[] myIntArray = {1,2,3};
		// int[] myIntArray = new int[]{1,2,3};

		int[] arrays = { 1, 4, 6, 3, 10, 12, 3 };

		// Constant time complexity - O(1)
		// When we know the index
		System.out.println("Second element:" + arrays[1]);

		// Linear time complexity - O(n) - when we don't know the index
		int key = 6;
		int index = -1;
		for (int i = 0; i < arrays.length; i++) {
			// the worst case - we need to loop over the entire array
			if (key == arrays[i]) {
				index = i;
				break;
			}
		}

		System.out.printf("Index : %d", index);

		// Add an element to a full array - O(n)
		// Add an the end of the array (has space) - O(1)
		// Delete element by setting it to null - O(1)
		// Deleting an element by shifting - O(n) - worst case - deleting the first
		// element
	}
}
