package com.neotech.lesson06;

public class Homework3 {
	// Write a Java Program to check whether number is Even or Odd.

	public static void main(String[] args) {

		int number = 32;

		// find the remainder using the mod operator
		int remainder = number % 2;

		// 1st way
		if (remainder == 0) {
			System.out.println("It is an even number");
		} else {
			System.out.println("It is an odd number!");
		}

		// 2nd way
		if (remainder == 1) {
			System.out.println("It is an odd number!");
		} else {
			System.out.println("It is an even number");
		}

		// 3rd way
		if (number % 2 == 0) {
			System.out.println("It is an even number");
		} else {
			System.out.println("It is an odd number!");
		}
	}

}
