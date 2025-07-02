package com.neotech.lesson13;

public class RetrievingValuesUsingForEachLoop {

	public static void main(String[] args) {
		
		
		String [][] animals = {
				{ "Eagle", "Cat", "Dog"}, // child 1 - index 0
				{ "Panda", "Bunny", "Parrot"}, // child 2 - index 1
				{ "Lion", "Elephant", "Cougar"} // child 3 - index 2
		};
		
		// there is no limit in child elements as long as they are string
		// lets loop over the items of the animals array
		// using the basic loop
		// i = row number
		// j = column number
		
		for ( int row = 0; row < animals.length; row++) { // 0  1   2   
			
			// loop over the elements of the child array
			for ( int col = 0; col < animals[row].length; col++ ) {
				System.out.println(animals[row][col]);
			}
		}
		
		System.out.println();
		
		// using advanced for loop
		for ( String[] row : animals) {
			for (String col : row) {
				System.out.println(col + " ");
			}
		}
		
	}
		
	}


