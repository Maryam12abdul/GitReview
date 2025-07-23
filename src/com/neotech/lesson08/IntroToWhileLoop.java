package com.neotech.lesson08;

import java.util.Scanner;

public class IntroToWhileLoop {

	public static void main(String[] args) {

		int num = 11;
		
		//The execution of the while loop follows these steps: 
			//1. check the loop condition (true or false)
				//if it is false, then skip the entire block
				//if it is true, go inside the block, execute statements, then make sure to increment (change)
								//get back and check the condition again
		
		
		
		while (num < 11) //loop header - run the code in the body below while num is less than 11
		{
			System.out.println(num);
			// we must update the num so that the condition becomes false at some point (otherwise we get stuck on infinite loop).
			num++;
		}
		
		
		num = 1; 
		
		while(num < 11)
		{
			System.out.println(num++); //print the num then increment it
		}
		
		
		
		//how can I enter 5 numbers from the console using while loop?
		
		Scanner scan = new Scanner(System.in);
		int count = 1;
		
		while(count <= 5)
		{
			System.out.println("Enter a number: ");
			int var = scan.nextInt();
			
			System.out.println("You entered " + var);
			
			count++;
		}
		
		//2nd way: 
		
		count = 5;
		
		while (count > 0)
		{
			System.out.println("Enter a number: ");
			int var = scan.nextInt();
			
			System.out.println("You entered " + var);
			
			count--;
		}
		
		
		
		
	}

}
