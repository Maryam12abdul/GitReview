package com.neotech.lesson07;

import java.util.Scanner;

public class HomeworkExtra {

	/*
	 3. Create a Java program that will ask user to input city and temperature.
		Your program should convert Fahrenheit into Celsius and print 
		"The temperature is the city __ is __"
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the city:");
		String city = input.nextLine();

		System.out.println("Please enter the temperature in Fahrenheit:");
		double fahrenheit = input.nextDouble();

		// converting f to c: c = (f-32)/1.8 OR c = (f-32)*5/9
		double celcius = (fahrenheit - 32) / 1.8;

		System.out.println("The temperature in " + city + " is " + celcius + " C!");

		input.close();

	}

}
