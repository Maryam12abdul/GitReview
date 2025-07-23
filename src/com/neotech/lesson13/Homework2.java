package com.neotech.lesson13;

public class Homework2 {

	/*
	 Create a 2D array that first row will contain 4 names and second row will contain 
	 grades, all Strings.
	 Then you program should print name of the students that has A or B grade 
	 
	 */

	public static void main(String[] args) {

		String[][] students = { { "Cengiz", "Anna", "Nadim", "Ozan" }, // names
				{ "B", "A", "B", "A" } // grades
		};

		// do it manually
		System.out.println(students[0][0]); // Cengiz
		System.out.println(students[0][1]); // Anna
		System.out.println(students[0][2]); // Nadim

		// lets find the number of columns in each row
		System.out.println("total rows: " + students.length);
		System.out.println("number of columns in first row:" + students[0].length);
		System.out.println("number of columns in second row:" + students[1].length);

		for (int i = 0; i < students[1].length; i++) {
			// this loop will go over each element of the second child array
			if (students[1][i].equals("A") || students[1][i].equals("B")) {
				System.out.println(students[0][i]);
			}
		}

	}

}
