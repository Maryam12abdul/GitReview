package com.neotech.lesson07;

import java.util.Scanner;

public class Homework1 {
	/*
	 1. Ask the user to enter the height in inches. 
	 Person should be classified as one of the following:
		• short (under 60 inch)
		• medium (between 60 -72 inch)
		• tall (over 72 inch) 
			 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your height in inches:");
		double height = scan.nextDouble();

		if (height > 0 && height < 60) {
			System.out.println("Classief as SHORT!");
		} else if (height >= 60 && height < 72) {
			System.out.println("Classief as MEDIUM!");
		} else if (height >= 72) {
			System.out.println("Classief as TALL!");
		} else {
			System.out.println("Invalid Value");
		}

		scan.close();

	}

}
