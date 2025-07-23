package com.neotech.lesson05;

public class NestedIf {

	public static void main(String[] args) {

		//If it is morning ---> say good morning 
			//if it is a school day ---> you are at school
			//else 		---> you are at home
		//Else (not morning) ---> good afternoon

		
		boolean isMorning = true;
		boolean isSchoolDay = true;
		
		if (isMorning)  //outer if starts
		{
			System.out.println("Good Morning!");
			
			if (isSchoolDay) //inner if 
			{
				System.out.println("You are at school!");
			}
			else //inner else
			{
				System.out.println("You are at home!");
			}
			
		}//outer if ends 
		else //outer else starts
		{
			System.out.println("Good Afternoon!");
		}//outer else ends
		
		
		
		
		
		
	}

}
