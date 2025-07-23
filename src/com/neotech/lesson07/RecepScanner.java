package com.neotech.lesson07;

import java.util.Scanner;

public class RecepScanner {

	// This has been added by elion
	public static void main(String[] args) {

		// type name = value
		// int a = 5;

		// Ctrl(Cmd) + Shift + o
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name, age, salary, and gender:");
		String name = input.next();
		int age = input.nextInt();
		double salary = input.nextDouble();
		char gender = input.next().charAt(0);

		System.out.println("Your info is: " + name + " " + age + " " + salary + " " + gender);

		// InputMismatchException - entered value does not match the expected type

		input.close();
	}
	
	public void method2() {
		
	}

}
