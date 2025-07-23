package com.neotech.lesson11;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 Ask the user to enter an integer and build the following pattern:
			Hint: Use scanner, if user entered number 5, there should be 5 rows.
			In the first row, 0 spaces, (2 * 5) - 1 stars
			In the second row, 1 spaces, (2 * 4) - 1 stars
			In the third row, 2 spaces, (2 * 3) - 1 stars
			In the fourth row, 3 spaces, (2 * 2) - 1 stars
			In the fifth row, 4 spaces, (2 * 1) - 1 stars
			
			*********
			 *******
			  *****
			   ***
			    *
		 
		 */

		//declare scanner
		
		Scanner scan  = new Scanner(System.in);
		
		//scan an int
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		
		
		 
		//create the outer loop
		
		for (int i = 0; i < num; i++)
		{ //the outer loop is responsible to create rows
			
			
			//create the inner loop 
			for (int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			
			for (int k = 0; k < 2*(num - i) - 1; k++)
			{
				System.out.print("*");
			
			}
			
			
			System.out.println();
		}
		
				
	}
	public static void test1() {
		
	}
		
		
		
		
		
	}

