package com.neotech.lesson15;

public class CalculatorWithReturn {
	
	
	int add(int a, int b) {
		// return a + b;
		int sum = a + b;
		return sum;
		
	}
	

	int multiply(int a, int b) {
		return a * b;
	}
	
	
	int divide(int a, int b) {
		return a / b;
	}
	
	int fiveBackSomething() {
		System.out.println(10);
		return 8;
	}
	
	void doNotReturnAnything() {
		System.out.println("I do nothing but print this");
	}
	
	double average(double a, double b, double c) {
		return(a + b + c) / 3;
	}
	
	String returnString(int number) {
		return number + "";
	}
	
}
