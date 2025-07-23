package com.neotech.lesson13;

public class RetrievingValuesUsingForEachLoop {

	public static void main(String[] args) {

		String[][] animals = { // parent
				{ "eagle", "cat", "dog" }, // child-0
				{ "panda", "bunny", "parrot" }, // child-1
				{ "lion", "elephant", "cockroach" } // child-2
		};

		// lets loop over the items of the animals array
		// using the basic loop
		for (int row = 0; row < animals.length; row++) { // 0,1,2

			// loop over the elements of the child array
			for (int col = 0; col < animals[row].length; col++) {
				System.out.print(animals[row][col] + " ");
			}
		}

		System.out.println();

		// using advanced for loop
		for (String[] row : animals) {
			for (String col : row) {
				System.out.print(col + " ");
			}
		}
	}

}
