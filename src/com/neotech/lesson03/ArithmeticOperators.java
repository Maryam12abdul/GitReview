package com.neotech.lesson03;

public class ArithmeticOperators {

	public static void main(String[] args) {

		//declare some integers 
		int num1, num2; //both are integers 
		
		//initialize them
		num1 = 24; 
		num2 = 5;
		
		int add = num1 + num2; //addition
		int sub = num1 - num2; //subtraction
		int mult = num1 * num2; //multiplication
		int div = num1 / num2; //division, lost the decimal part 
		
		System.out.println("add --> " + add);
		System.out.println("sub --> " + sub);
		System.out.println("mult --> " + mult);
		System.out.println("div --> " + div);
		

		//if we assign a double (a result) to an it, we lose the decimal part
		double d1, d2;
		d1 = 24;
		d2 = 5;
		
		double division = d1 / d2;
		System.out.println("division --> " + division);
		
		
		//int/int results in int
		// dividing two integers, the result is 4 
		//storing 4 in a double --> 4.0
		//example:
		double intResult = num1 / num2;
		System.out.println("intResult --> " + intResult);
		
	}

}
