package com.neotech.lesson06;

public class Homework2 {
	// write a program to implement following logic using
	// if - else if - else statement;
	// if hour is less than 12 noon, greet with good morning
	// if hour is greater than or equal to 12 noon but less than 3pm, greet with Good afternoon
	// if  hour is greater than or equal to 3pm, greet with Good evening

	public static void main(String[] args) {
		
		int hour = 13;
		
	if (hour < 12) {
      System.out.println("Good Morning");
	
	} else if ( hour <15) {
		System.out.println("Good Afternoon");
		
		
	} else {
		System.out.println("Good Evening");
	}

		
			
	}

}
 