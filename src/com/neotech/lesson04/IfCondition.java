package com.neotech.lesson04;

public class IfCondition {

	public static void main(String[] args) {

		int num = 150;
		if (num > 200) {
			// if the number is greater than 200, do this
			System.out.println("Today is Wednesday!");
		}

		System.out.println("Today is Tuesday");

		int balance = 2000;

		if (balance < 3000) {
			System.out.println("You are allowed to withdraw!");
		}

		System.out.println("End of main method");

	}

}
