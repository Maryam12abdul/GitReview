package com.neotech.lesson13;

public class Task4 {

//	Create an array of cars : American, German, Korean, Italian. 
//	Then retrieve all values from that array using 2 different loops

	public static void main(String[] args) {

		String[][] cars = { { "Ford", "Chevy", "Jeep" }, // American
				{ "BMW", "Walksvagen", "Mercedes" }, // German
				{ "Kia", "Hyundai" }, // Korean
				{ "Ferrari" } // Italian
		};

		// using advanced for loop
		for (String[] child : cars) {

			for (String brand : child) {
				System.out.print(brand + " ");
			}
		}

		// task: do the same using basic for loop

	}

}
