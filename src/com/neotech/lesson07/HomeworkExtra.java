package com.neotech.lesson07;

import java.util.Scanner;

public class HomeworkExtra {
	
    // Create a Java program that will ask user to input city and temperature.
    //Your program should convert Farenheit into celcius and print "The temperature is the city __ is __"
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the city");
		String city = input.nextLine();
		
		
		System.out.println("Please enter the temperature");
		double farenheit = input.nextDouble();
		
		// converting f to c; c= (f-32)/1.8
		double celcius = (farenheit-32)/1.8;
		
		System.out.println("The temperature in " + city + " is " + celcius + "c" );
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
	}

}
