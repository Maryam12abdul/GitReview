package com.neotech.lesson12;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] numbers = new int[2][4]; // 2 rows and 4 columns

		// lets initialize the elements of the first row
		numbers[0][0] = 3;
		numbers[0][1] = 6;
		numbers[0][2] = 1;
		numbers[0][3] = 7;

		// lets initialize the elements of the second row
		numbers[1][0] = 5;
		numbers[1][1] = 7;
		numbers[1][2] = 8;
		numbers[1][3] = 2;

		// how can i get the value of 8?
		System.out.println(numbers[1][2]);

		int[][] numbers2 = { { 1, 2, 3 }, { 4, 3, 6 }, { 7, 8, 3 } };

		// write the value of 6
		System.out.println(numbers2[1][2]);

		// can i re-assign a value
		numbers2[0][1] = 99;

		// print it
		System.out.println(numbers2[0][1]);
	}

}
