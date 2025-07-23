package com.neotech.lesson05;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program. 
		 * Create a variable day (1 - 7) 
		 * For every weekday, print
		 * 			"Today is Monday and we are working!" 
		 * For weekend, print
		 * 			"We are on a break on Weekends!"
		 */
		
		
		byte day = 15;
		
		//if day == 1 ---> "Today is Monday and we are working!"
		//if day == 2 ---> "Today is Tuesday and we are working!"
		//...
		//...
		//if day is 6 or 7 ---> "We are on a break on Weekends!"

		if(day == 1)
		{
			System.out.println("Today is Monday and we are working!");
		}
		else if (day == 2)
		{
			System.out.println("Today is Tuesday and we are working!");
		}
		else if (day == 3)
		{
			System.out.println("Today is Wednesday and we are working!");
		}
		else if (day == 4)
		{
			System.out.println("Today is Thursday and we are working!");
		}
		else if (day == 5)
		{
			System.out.println("Today is Friday and we are working!");
		}
		else
		{
			System.out.println("We are on a break on Weekends!");
		}
		
		//what if we modify the task
		//if day is [1-5], It is a weekday and we are working 
		//if day is [6-7], We are on a break on Weekends
		
		//we could say if day >= 1 && day <= 5 ---> 
		
		//another type
		if (day < 1)
		{
			System.out.println("Wrong day value!!!");
		}
		else if (day < 6)
		{
			System.out.println("It is a weekday and we are working!");
		}
		else if (day < 8)
		{
			System.out.println("We are on a break on weekends!");
		}
		else 
		{
			System.out.println("Wrong day value!!!");
		}
		
		
		
		
		
	}

}
