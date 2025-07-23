package com.neotech.lesson02;

public class VariableDeclaration {

	public static void main(String[] args) {
		// data-type name = value

		// lets declare and assign a value
		int number = 25;

		// i can first declare the variable
		int number2;

		// this causes compilation error -> number2 is not initialized
		// System.out.println(number2);
		number2 = 20;
		System.out.println(number2);

		// we can also declare multiple variables in one line
		char var1, var2, var3;

		// same thing in different lines
//		char var1;
//		char var2;
//		char var3;

		var1 = '@';
		var2 = '#';
		var3 = '!';

		System.out.println(var1); // the value of var1 is @ at that point

		var1 = '$';
		System.out.println(var1); // here the value is $

		var2 = 'A';
		System.out.println(var2);

		// can i re-assign the value of number2?
		number2 = 50;
		System.out.println(number2);
	}
}
