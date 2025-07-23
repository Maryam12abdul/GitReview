package com.neotech.lesson15;

public class Calculator {

	// our calculator will have 3 methods: add(), multiply, and divide()

	// add two numbers
	void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
		// System.out.println(a + b);
	}

	// multiply two numbers
	void multiply(int a, int b) {
		System.out.println(a * b);
	}

	void divide(double a, double b) {
		System.out.println("The division of " + a + " by " + b + " is " + a / b);
	}

}
