package com.neotech.lesson08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		
		// find the largest among three different numbers
		
		// let the user to enter these numbers	
		
		// declare three numbers (double, int etc-- not specified in this case)
		double a, b, c;
		
		// declare a scanner
		Scanner scan = new Scanner (System.in);
		
		//ask the user for input
		System.out.println("Enter three different numbers:");
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();		
		
		System.out.println(a);
		
		// how do i make sure i always find the largest???
		// if a > b
		// if a > c --
		      // a is the largest
		//  a < c 
		// c is the largest
		
		if ( a > b) // if a > b is true
		{
			if ( a > c)  // a > c  is true, only will execute if a > b
			
			{
				System.out.println(a + "is the largest!");
			}	

		
			else // only happens if c > a > b 
			{
				System.out.println(c + "is the lagest!");
			}	
			
	}      else // b > a
		{
		    if (b > c ) // it will only execute if b > c--> b is the largest
		    	
		  	
		    {
		    	System.out.println(b + "is the largest!");
		    }
		    
		    }
			
		
		// lets collect multiple conditions together
		
		 if ( a > b && a > c )
		 {
			 System.out.println( a + " is the largest! ");
		 }
		 else if ( b > a && b > c) {
			 System.out.println(b + " is the largest! ");
		 }
		 else {
			 System.out.println(c + " is the largest! ");
		 }
		
		
		
		
		
	}
		
		
	}


