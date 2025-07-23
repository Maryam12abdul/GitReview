package com.neotech.lesson04;

public class Homework {
	/*
	 2. Write a java program that converts mile to km and km to miles.
		Use scale 1 mile = 1.609344.
		Print the conversion on the console.
		For example: 10 miles is 16.09344 kilometers
	 
	 */
	public static void main(String[] args) {

		double scale = 1.609344;

		double km, mile;

		// convert miles to km
		mile = 5;
		km = mile * scale;

		System.out.println(mile + " miles is " + km + " kilometers");

		System.out.println("-----------");

		km = 60;
		mile = km / scale;

		System.out.println(km + " kilometers is " + mile + " miles");

	}

}
