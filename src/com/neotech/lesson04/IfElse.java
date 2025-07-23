package com.neotech.lesson04;

public class IfElse {

	public static void main(String[] args) {

		// Lets assume we have $5000 in our account

		int myBalance = 500;
		int myRequest = 1000;

		if (myRequest <= myBalance) {
			// i have enough money in my account
			System.out.println("Enjoy it!");
		} else {
			System.out.println("You quested " + myRequest + " but you only have " + myBalance);
		}

		System.out.println("--------------");

		int hours = 10;

		if (hours >= 15) {
			System.out.println("good job");
		} else {
			System.out.println("you need to study more!!!");
		}

	}

}
