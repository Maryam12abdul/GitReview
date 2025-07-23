package com.neotech.lesson10;

public class Homework3 {
	// 3. Print numbers from 1 to 50 except those
	// that are divisible by 3.

	public static void main(String[] args) {

		int num = 1;
		while (num <= 50) {
			if (num % 3 == 0) {
				num++;
				continue;
			} else {
				System.out.print(num + " ");
				num++;
			}
		}

		System.out.println();

		// do while loop
		int num2 = 1;
		do {
			if (num2 % 3 == 0) {
				num2++;
				continue;
			}

			System.out.print(num2 + " ");
			num2++;
		} while (num2 <= 50);

	}

}
