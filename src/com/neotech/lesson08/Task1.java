package com.neotech.lesson08;

public class Task1 {

	public static void main(String[] args) {
		
		// How can I print numbers from 50 to 1??

		int x = 50;
		
		while (x > 0)
		{
			System.out.print(x + " ");
			
			x--;
		}
		
		System.out.println();
		
		// Can we now write a loop to print ONLY EVEN numbers from 50 to 1
		
		//1st way: start with 50 (even) and then decrement by 2 - always go from even to the next even
		
		x = 50;
		
		while (x > 0)
		{
			System.out.print(x + " ");
			x -= 2;  //x = x - 2, same as x--; x--;
		}
		
		System.out.println();
		
		//2nd way: 
		
		//step 1: I need to loop from 50 to 1
		
		x = 50; 
		
		while (x > 0)
		{
			if (x % 2 == 0)//if x is fully divisible by 2
			{
				System.out.print(x + " ");
			}
			
			x--;
		}
		
	}

}
