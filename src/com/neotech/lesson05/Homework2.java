package com.neotech.lesson05;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 	2. Create a Java program and name it TemperatureCheck.
			Create a variable to store temperature.
			Your program should check if the temperature is below 32
			If the temperature is below 32
			    then it should print "Water will freeze with temperature __",
			    otherwise should print "Water will NOT freeze with temperature __".
		 */
		
		double temp = 35; //widening   int --> double
		
		
		//if statements are used for selective execution 
		//if    (true) 		 -  temp < 32     whatever the condition is
				// this code will execute
		//else 
				//  this code will execute
		
		//if I ask you: is 9 > 6?
		
		
		//syntax: 
		
		//  if ( expression ) 
		//	{
				//if body   -----   code goes here...
		//	}
		// 	else 
		// { 
				//   else body ---- code goes here...
		//	}
		
		
		if(temp < 32)  //boolean expression --> an expression where the result is boolean
		{
			System.out.println("Water will freeze with temperature " + temp);
		}
		else
		{
			System.out.println("Water will NOT freeze with temperature " + temp);
		}
		
		
	}

}
