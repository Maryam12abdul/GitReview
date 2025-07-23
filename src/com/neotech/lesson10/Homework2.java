package com.neotech.lesson10;

import java.util.Scanner;

public class Homework2 {

	// 2. Write a program that asks the user to
	// enter his/her username and password until the user
	// enters them correctly.

	public static void main(String[] args) {
		// correct credentials
		String exptectedUsername = "neo";
		String expectedPassword = "academy";

		Scanner scan = new Scanner(System.in);
		String username, password;

//		do {
//			System.out.println("Enter the username and password:");
//			username = scan.next();
//			password = scan.next();
//
//			if (username.equals(exptectedUsername) && password.equals(expectedPassword)) {
//				System.out.println("Congratulations, you are in!");
//				break;
//			}
//		} while (true);

		// 2nd way
//		boolean success = false;
//
//		do {
//			System.out.println("Enter the username and password:");
//			username = scan.next();
//			password = scan.next();
//
//			if (username.equals(exptectedUsername) && password.equals(expectedPassword)) {
//				System.out.println("Congratulations, you are in!");
//				success = true;
//			}
//		} while (!success);

		System.out.println("Enter the username and password:");
		username = scan.next();
		password = scan.next();

		while (!username.equals(exptectedUsername) || !password.equals(expectedPassword)) {
			System.out.println("Enter the username and password:");
			username = scan.next();
			password = scan.next();
		}

		System.out.println("Congratulations, you are in!");

		scan.close();

	}

}
