package com.neotech.lesson13;

public class Task3 {

//	 * Create a 2D array of integer type with 3 rows and different number of columns. 
//    Print the sum of the numbers in the array.

	public static void main(String[] args) {

		int[][] numbers = { { 2, 3, 5, 1, 0, 90, 33 }, // row-0
				{ 11, 9 }, // row-1
				{ 8, 4, 2, 0 } // row-2
		};

		// basic for loop
		int sum = 0;
		for (int row = 0; row < numbers.length; row++) {

			for (int col = 0; col < numbers[row].length; col++) {
				sum += numbers[row][col];
			}
		}

		System.out.println("sum is " + sum);

		System.out.println();

		// advanced for loop: prints the odd numbers
		int total = 0;
		for (int[] child : numbers) {

			// this loop processes the elements of the child
			for (int element : child) {
				total += element;
			}
		}

		System.out.println("sum is " + total);

	}

}
