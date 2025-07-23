package com.neotech.lesson09;

public class IntroToDoWhile {

	public static void main(String[] args) {

		// while loop
		// check the condition first
		// if the condition is true, run the while code
		// otherwise quit the loop
		int num = 5;
		while (num < 10) {
			System.out.print(num + " ");
			// num = num + 1;
			// num += 1; // shorthand
			num++;
		}

		System.out.println();

		// do while loop
		// there is no initial condition to check
		// code will run at least once before the condition is checked
		// if condition is true, the loop code will run
		// otherwise it will quit
		int num2 = 5;
		do {
			System.out.print(num2 + " ");
			num2++;
		} while (num2 < 10);

		// the main difference between while loop and do-while loop is:
		// do-while loop executes at least once where this is not the case for the while
		// loop
	}

}
