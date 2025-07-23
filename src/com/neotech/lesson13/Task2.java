package com.neotech.lesson13;

public class Task2 {

//	 * Create a 2D array of integer type with 3 rows and different number of columns and print all
//	 *  EVEN values of the array.

	public static void main(String[] args) {

		int[][] numbers = { { 2, 3, 5, 1, 0, 90, 33 }, // row-0
				{ 11, 9 }, // row-1
				{ 8, 4, 2, 0 } // row-2
		};

		// basic for loop
		for (int row = 0; row < numbers.length; row++) {

			for (int col = 0; col < numbers[row].length; col++) {
				if (numbers[row][col] % 2 == 0) {
					// found an even number, print it!
					System.out.print(numbers[row][col] + " ");
				}
			}
		}

		System.out.println();

		// advanced for loop: prints the odd numbers
		for (int[] row : numbers) {

			// this loop processes the elements of the row
			for (int col : row) {
				if (col % 2 != 0) {
					System.out.print(col + " ");
				}
			}
		}

	}

}
