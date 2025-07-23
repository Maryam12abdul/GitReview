package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {

		// ask user to guess your lucky number
		// lets pick 5 as our lucky number

		int luckyNumber = 5;
		Scanner scan = new Scanner(System.in);
		int userGuess;

		// do loop solution
		do {
			System.out.println("What is my lucky number?");
			userGuess = scan.nextInt();
		} while (userGuess != luckyNumber);

		System.out.println("You got it!!!");

		// while loop solution
//		System.out.println("What is my lucky number?");
//		userGuess = scan.nextInt();
//
//		while (userGuess != luckyNumber) {
//			System.out.println("Nope, try again!");
//			userGuess = scan.nextInt();
//		}
//
//		System.out.println("You got it!!!");

		scan.close();
	}

}
