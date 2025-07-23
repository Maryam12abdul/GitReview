package com.neotech.lesson11;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*
		Ask the user to enter an integer and build the following pattern:
		Hint: Use scanner, if user entered number 5, there should be two parts
		The first part, 1 to 5
		The second part, 4 to 1
		
		1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5 
		1 2 3 4 
		1 2 3 
		1 2 
		1 
		 
		 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the pattern size: ");
		
		int num = scan.nextInt();
		
		
		//Assuming num is 5: 
		//In the first iteration (1st row): i = 1, j = 1, how many times does the inner loop run? 1
		//In the second iteration(2nd row): i = 2, j = 1, 2 how many times does the inner loop run? 2 
		//In the third iteration (3rd row): i = 3, j = 1, 2, 3 how many times does the inner loop run? 3
		
		for (int i = 1 ; i < num; i++)
		{
			
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			
			
			System.out.println();
		}
		
		//with the part above we just did this: 
	//	1 
	//	1 2 
	//	1 2 3 
	//	1 2 3 4

		
		
		//now let us print the 2nd half
		
		//to print the 2nd half, I only changed this line from incrementing i to decrementing it
		for (int i = num; i >= 1; i--) 
		{
			
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			
			
			System.out.println();
		}
		
	}
	
	//Break until: 8:55
	

}
