package com.neotech.lesson12;

public class RetrieveElements {

	public static void main(String[] args) {
		
		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		// how do we get the values of the array?

		// 1st way: for loop
		for (int i = 0; i < grades.length; i++) {
			if (i == grades.length - 1) { // true of last element
				System.out.print(grades[i]);
			} else { // true for other elements
				System.out.print(grades[i] + ", ");
			}
		}

		System.out.println();

		// 2nd way: advanced for loop

		for (char grade : grades) {
			System.out.print(grade + ", ");
		}

		System.out.println();

		String[] fruits = { "apple", "orange", "mango", "watermelon", "dragon" };

		// lets loop using basic for loop
		for (int i = 0; i < fruits.length; i++) {

			String fruit = fruits[i];

			if (fruit.equals("mango")) {
				System.out.println(fruit + " is my favorite");
			} else {
				System.out.println(fruit);
			}
		}

		// lets do it using advanced for loop
		for (String fruit : fruits) {
			if (fruit.equals("mango")) {
				System.out.println(fruit + " is my favorite");
			} else {
				System.out.println(fruit);
			}
		}
	}

}
