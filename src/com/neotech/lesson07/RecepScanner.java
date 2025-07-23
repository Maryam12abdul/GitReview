package com.neotech.lesson07;

import java.util.Scanner;

public class RecepScanner {

	public static void main(String[] args) {

		// type name = value
		// int a = 5;

		// Ctrl(Cmd) + Shift + o
		Scanner input = new Scanner(System.in);

//		System.out.println("Please enter a sentence:");
//
//		String word1 = input.next(); // read the input and stop at the first space
//		System.out.println(word1);
//
//		String word2 = input.next();
//		System.out.println(word2);
//
//		String word3 = input.nextLine();
//		System.out.println(word3);

		// difference between next() and nextLine()
		// next() will read from the starting position up until the space
		// nextLine() will read from the starting position until the end of the line

//		System.out.println("Enter your age:");
//		int age = input.nextInt();
//		System.out.println(age);
//
//		System.out.println("Enter your salary:");
//		double salary = input.nextDouble();
//		System.out.println(salary);
//
//		System.out.println("Enter the current year:");
//		int year = input.nextInt();
//		System.out.println(year);
//
//		System.out.println("Is it snowing there?");
//		boolean snow = input.nextBoolean();
//		System.out.println(snow);
//
//		System.out.println("Enter your gender:");
//		char gender = input.next().charAt(0); // gets the first letter of the user input
//		System.out.println(gender);

		System.out.println("Enter your name, age, salary, and gender:");
		String name = input.next();
		int age = input.nextInt();
		double salary = input.nextDouble();
		char gender = input.next().charAt(0);

		System.out.println("Your info is: " + name + " " + age + " " + salary + " " + gender);

		// InputMismatchException - entered value does not match the expected type

		input.close();
	}

}
