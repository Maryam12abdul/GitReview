package com.neotech.lesson08;

public class PreAndPostIncrement {

	public static void main(String[] args) {

		// ++  --> increment ---> add 1 to the variable
		// --  --> decrement ---> subtract 1 from the variable
		
		
		
		/* ---------	Difference between ++x and x++   	------------ */
		
		int x; 
		int y = 20;
		
		x = y++;
		//post-increment:
		//(1) x = y  (x = 20)
		//(2) y = y + 1; (y = 21)
		
		//this is whats happening: 
		// x = y;
		// y = y + 1;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
		int a; 
		int b = 20;
		
		a = ++b;
		
		//in two lines this would be: 
		// b = b + 1;
		// a = b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	
		
		/* ---------	Difference between --x and x--   	------------ */
		
		
		int c; 
		int d = 5;
		
		System.out.println(--d);
		//decrement is happening ( d = d - 1 )
		//the operation is happening ( printing)
		
		c = --d; //pre decrement
		
		// step 1: d = d - 1
		// step 2: c = d;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		
		
		c = d--; //post decrement
		// step 1: c = d  (3)
		// step 2: d = d - 1   ( 3-1=2 )
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
	}

}
