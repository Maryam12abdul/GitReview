package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

//		int age = 25;
//		System.out.println("your age is " + age);

		// Create a Scanner object from the Scanner class
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name:");

		String name = input.next();
		System.out.println("Your name is " + name);

		System.out.println("How old are you?");
		int age = input.nextInt();
		System.out.println("You are " + age + " years old!");

		System.out.println("What is your salary?");
		double salary = input.nextDouble();
		System.out.println("Your salary is " + salary);

		System.out.println("Are you happy? true/false");
		boolean happy = input.nextBoolean();
		System.out.println("Happy: " + happy);

		System.out.println("What is your full name?");
		String fullName = input.next() + " " + input.next();
		System.out.println("your full name is " + fullName);

		System.out.println("Enter your name and age:");
		name = input.next();
		age = input.nextInt();

		System.out.println("You are " + name + " and you are " + age + " years old!");

		input.close();
	}

}
