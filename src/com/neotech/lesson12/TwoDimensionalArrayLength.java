package com.neotech.lesson12;

public class TwoDimensionalArrayLength {

	public static void main(String[] args) {

		String[][] months = { { "December", "January", "February" }, { "March", "April", "May" },
				{ "June", "July", "August" }, { "September", "October", "November" } };

		// lets get the number of rows
		int rows = months.length;
		System.out.println("rows: " + rows);

		int columnsInFirstRow = months[0].length;
		System.out.println("first row has " + columnsInFirstRow + " elements");

		// print the number of elements in second row
		System.out.println(months[1].length);

		// can we loop over the elements of a 2 dimensional array
		for (int i = 0; i < months.length; i++) {
			String[] season = months[i];

			for (String month : season) {
				System.out.print(month + " ");
			}
			System.out.println();
		}

	}

}
