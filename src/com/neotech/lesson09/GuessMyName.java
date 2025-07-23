package com.neotech.lesson09;

import java.util.Scanner;

public class GuessMyName {

	public static void main(String[] args) {

		String myName = "Marissa";
		Scanner scan = new Scanner(System.in);
		String userGuess;

		do {
			System.out.println("What is my name?");
			userGuess = scan.next();
		} while (!userGuess.equals(myName));

		System.out.println("You got it!!!");

		scan.close();
	}

}
