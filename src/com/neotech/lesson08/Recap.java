package com.neotech.lesson08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		// Find the largest among three different numbers 
		// Let the user to enter these numbers
		
		
		//declare three numbers (double, int etc. - not specified in this case)
		double a, b, c;
		
		//declare a scanner 
		Scanner scan = new Scanner(System.in);
		
		//Let's ask the user for input
		System.out.println("Enter three different numbers: ");
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		//how do I make sure I always find the largest???
		
		
		//if a > b
				//if a > c
						//a is the largest
				// a < c
						//c is the largest
		
		
		if (a > b)  //if a > b is true
		{
			if (a > c) //a > c is true, only will execute if a > b
			{
				System.out.println(a + " is the largest!");
			}
			else //only way this happens is c > a > b
			{
				System.out.println(c + " is the largest!");
			}
		}
		else // b > a 
		{
			if (b > c) // it will only execute if b > a AND b > c ---> b is the largest
			{
				System.out.println(b + " is the largest!");
			}
			else //c > b  ---> c > b > a
			{
				System.out.println(c + " is the largest!");
			}
			
		}
		
		
		//Let us collect multiple conditions together.....
		
		if (a > b && a > c)
		{
			System.out.println(a + " is the largest!");
		}
		else if (b > a && b > c)
		{
			System.out.println(b + " is the largest!");
		}
		else
		{
			System.out.println(c + " is the largest!");
		}
		
		
		
	}

}
