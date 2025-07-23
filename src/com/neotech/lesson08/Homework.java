package com.neotech.lesson08;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/*
		 Allow user to enter grade and then provide explanation: 
			 A-Excellent, 
			 B-Good, 
			 C-Average, 
			 D-Bad, 
			 any other grade --> Not Acceptable. 
		 At the end your program should print which grade was entered by the user with explanation.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your grade: ");
		
		char grade = input.next().charAt(0);
		
		switch (grade)
		{
		case 'A':
		case 'a': //this means if A or a then Excellent
			System.out.println("A - Excellent!");
			break;
			
		case 'B': 
			System.out.println("B - Good!");
			break;
		
		case 'C':
			System.out.println("C - Average!");
			break;
		
		case 'D': 
			System.out.println("D - Bad!");
			break;
			
		default: 
			System.out.println("Not Acceptable!");
			break;
			
		}
		
		
		// true and true ==> true
		// true and false ==> false
		// false and true ==> false 
		//false and false ==> false 
		
		
		// true or true ==> true
		// true or false ==> true 
		// false or true ==> true 
		// false or false ==> false
		
		
		
		
		//using else if 
		
		if (grade == 'A' || grade == 'a')
		{
			System.out.println("A - Excellent!");
		}
		else if (grade == 'B' || grade == 'b')
		{
			System.out.println("B - Good!");
		}
		else if (grade == 'C' || grade == 'c')
		{
			System.out.println("C - Average!");
		}
		else if (grade == 'D' || grade == 'd')
		{
			System.out.println("D - Bad!");
		}
		else 
		{
			System.out.println("Not Acceptable!");
		}
		
	}

}
