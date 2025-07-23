package com.neotech.lesson13;

public class Task1 {

//	 * Create a 2D array of integer type with 3 rows 
//	 and 4 columns and print all values of the array.

	public static void main(String[] args) {

		int[][] numbers = { { 2, 3, 5, 1 }, // row-0
				{ 11, 9, 3, 4 }, // row-1
				{ 8, 4, 2, 0 } // row-2
		};

		// basic for loop
		for (int row = 0; row < numbers.length; row++) {

			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}
		}

		System.out.println();

		// advanced for loop
		for (int[] row : numbers) {

			// this loop processes the elements of the row
			for (int col : row) {
				System.out.print(col + " ");
			}
		}

	}

}
