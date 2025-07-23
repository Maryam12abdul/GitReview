package com.neotech.lesson12;

public class Largest {

	public static void main(String[] args) {

		int[] numbers = { 2, 6, 33, 1, 99, 12 };

		// find the max number

		int max = numbers[0];
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
		}

		System.out.println("max is " + max);

		// do the same using basic for loop
		int max2 = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max2) {
				max2 = numbers[i];
			}
		}

		System.out.println("max is " + max2);

		// task: find the second max

	}

}
