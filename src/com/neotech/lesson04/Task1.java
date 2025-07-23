package com.neotech.lesson04;

public class Task1 {

	/*
	Create an int variable named number1, assign the value of 500.
	Store/assign number1 into a byte variable named number2.
	Re-assign the number1 into number2.
	Print the value of number2. Check if it is 500.
	What if the initial value was 50?
	 */
	public static void main(String[] args) {

		int number1 = 500;
		byte number2 = (byte) number1; // narrowing
		System.out.println(number2); // we lost value

		number1 = 50;
		number2 = (byte) number1; // narrowing
		System.out.println(number2);

		// int can hold up to 2 billion something
		// byte can hold up to -128 and 127
	}

}
