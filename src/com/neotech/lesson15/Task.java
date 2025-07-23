package com.neotech.lesson15;

public class Task {
	/*
	 * method1: Create a method that will take 2 parameters as numbers and prints
	 * which number is larger.
	 * 
	 * method2: Create a method that will take a number and prints whether the
	 * number is even or odd.
	 * 
	 * method3: Create a method that will say Hello in a different language based on
	 * the country that will passed when method is executed.
	 */

	// method1
	void larger(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is larger than " + num1);
		} else {
			System.out.println("numbers are equal");
		}
	}

	// method2
	void evenOrOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
	}

	// method2
	void sayHello(String county) {
		switch (county) {
		case "USA":
		case "UK": {
			System.out.println("Hello");
			break;
		}
		case "Turkiye": {
			System.out.println("Merhaba");
			break;
		}
		case "Mexico": {
			System.out.println("Hola");
			break;
		}
		default:
			System.out.println("I dont know this one");
		}
	}

	public static void main(String[] args) {

		Task t1 = new Task();

		t1.larger(10, 81);
		t1.larger(7, 2);
		t1.larger(5, 5);

		t1.evenOrOdd(59);
		t1.evenOrOdd(6);

		t1.sayHello("Turkiye");
		t1.sayHello("Germany");
		t1.sayHello("Mexico");

	}

}
