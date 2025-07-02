package com.neotech.lesson06;

public class Homework3 {
	// write a java program to check whether number is even or odd.

	public static void main(String[] args) {
		
		int number = 10;
		
		int remainder = number % 2;
		
		// 1st way
		
		if (remainder == 0) {
			System.out.println("It is an even number");
		} else {
			System.out.println("It is an odd number");
		}
		
		// 2nd way 
		if ( remainder == 1) {
			System.out.println("It is an odd number");
		} else {
			System.out.println("It is an even number");
		}
		
		
		// 3rd way
		if (number % 2 == 0) {
			System.out.println("It is an even number");
		} else {
			System.out.println("It is an odd number");
		}
		
	}

}
