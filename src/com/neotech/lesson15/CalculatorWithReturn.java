package com.neotech.lesson15;

public class CalculatorWithReturn {

	int add(int a, int b) {
		// return a + b;
		int sum = a + b;
		return sum;
	}

	void add2(int a, int b) {
		System.out.println(a + b);
	}

	int multiply(int a, int b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}

	int giveBackSomething() {
		System.out.println(10);
		return 8;
	}

	void doNotReturnAnything() {
		System.out.println("i do nothing but print this");
	}

	double average(double a, double b, double c) {
		return (a + b + c) / 3;
	}

	String returnString(int number) {
		return number + "";
	}

}
