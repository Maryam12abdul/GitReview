package com.neotech.lesson04;

public class Recap {

	public static void main(String[] args) {
		// arithmetic operators

		// PEMDAS --> Parenthesis, Exp, Multiplication, Division, Addition, Subtraction

		int num1 = 5 + 5 + 5;
		System.out.println(num1);

		int num2 = 5 + 5 * 5;
		System.out.println(num2);

		// lets print directly into the console
		System.out.println(5 * 5 + 5 / 5);

		int number1 = 15;
		int number2 = 2;

		// since div is an integer, the decimal point will be dropped
		int div = number1 / number2;
		System.out.println("div --> " + div);

		// 12 % 2 --> 0 (12 is fully divisible by 2 so the remainder is 0)
		// 15 % 2 --> 1

		int rem = number1 % number2;
		System.out.println("rem --> " + rem);

		System.out.println("Addition and Concatenation");

		int a = 10;
		int b = 10;

		String x = "Java";
		String y = "Tuesday";

		System.out.println(x + " " + y); // Java Tuesday
		System.out.println(x + y + a); // JavaTuesday10

		System.out.println(x + a + b); // Java1010
		System.out.println(x + (a + b)); // Java20

		System.out.println("" + a + b); // 1010 --> string 1010

		System.out.println(a + b);
		System.out.println(a + b + x + y); // 20JavaTuesday

		System.out.println(x + y + a * b); // JavaTuesday100
		System.out.println(x + y + a + b); // JavaTuesday1010

		// compilation error
		// System.out.println(a * x);

		// String + int --> String (Concatenation)
		// int + String --> String (Concatenation)
		// int + int --> int (Addition)
		// String * int --> error (Not allowed)

		System.out.println(""); // string but its empty
		System.out.println(" ");// string, but its value is one space(NOT empty)
	}

}
