package com.neotech.lesson09;

public class Homework1 {

	// 1. Write a program using while loop that calculates the
	// sum of the even numbers between 0 and 10.

	public static void main(String[] args) {

		// i can manually add the even numbers
		// System.out.println(2 + 4 + 6 + 8 + 10);

		int i = 0;
		int sum = 0;
		while (i <= 10) {
			if (i % 2 == 0) {
				// sum = sum + i;
				sum += i;
			}

			i++;
		}

		System.out.println("The sum is: " + sum);

		// 2nd way
		int j = 2;
		int sum2 = 0;
		while (j <= 10) {
			sum2 += j;
			j += 2;
		}

		System.out.println("The sum is: " + sum2);

		// odd numbers
		int k = 1;
		int sum3 = 0;
		while (k <= 10) {
			sum3 += k;
			k += 2;
		}

		System.out.println("sum of odds is:" + sum3);

		// lets do the do-while loop
		int x = 0;
		int sum4 = 0;
		do {
			sum4 = sum4 + x;
			x = x + 2;
		} while (x <= 10);

		System.out.println("The sum is:" + sum4);

	}

}
