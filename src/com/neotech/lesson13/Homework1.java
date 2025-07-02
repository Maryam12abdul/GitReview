package com.neotech.lesson13;

public class Homework1 {

	/*	
		1. Create a 2D array where you will store the following values:
			- Mr, Mrs, Ms, Miss
	        -Smith, Jordan, Jacks-on, O-bama.
	
	     After storing values print the following:
	     Mrs Smith, Mr O-bama, Ms Jack-son, Miss Jordan.

	     Be careful because they are mixed.

*/
	
	public static void main(String[] args) {

		
		String [][] names = {
				
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jack-son", "O-bama"}
				
				
		};
		
		//           0        1          2            3
		// row 0     Mr       Mrs        Ms           Miss
		// row 1    Smith    Jordan      Jack-son      O-bama
		
		// Mrs Smith
		System.out.println(names[0][1] + " " + names[1][0]);
		
		
		// Mr O-bama
		System.out.println(names[0][0] + " " + names[1][3]);
		
		// Mr Jack-son
		System.out.println(names[0][2] + " " + names[1][2]);
	
		// Miss Jordan
		System.out.println(names[0][3] + " " + names[1][1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
