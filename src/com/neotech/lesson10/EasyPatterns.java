package com.neotech.lesson10;

public class EasyPatterns {
	// *****
	// ****
	// ***
	// **
	// *
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 4; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 1; i++) {
			System.out.print("*");
		}
		System.out.println();

		// lets find a smarter solution
		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
