package com.neotech.lesson09;

public class ForLoopExtra {

	public static void main(String[] args) {

		System.out.println("Print all numbers between 21 and 30");

		for (int num = 21; num <= 30; num++) {
			System.out.print(num + " ");
		}

		System.out.println();

		System.out.println("Print all even numbers between 21 and 30");

		for (int num = 22; num <= 30; num += 2) {
			System.out.print(num + " ");
		}

		System.out.println();

		System.out.println("Print all odd numbers between 21 and 30");

		for (int num = 21; num <= 30; num += 2) {
			System.out.print(num + " ");
		}

		System.out.println();

		// 2nd way (odd numbers)
		for (int num = 21; num <= 30; num++) {
			if (num % 2 == 1) {
				System.out.print(num + " ");
			}
		}

		System.out.println();

		System.out.println("Calculate the sum of odd numbers between 21 and 30");

		int sum = 0;
		for (int num = 21; num <= 30; num++) {
			if (num % 2 == 1) {
				sum += num;
			}
		}

		System.out.println("sum is " + sum);
	}

}
