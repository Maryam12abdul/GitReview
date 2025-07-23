package com.neotech.lesson03;

public class Task1 {

	public static void main(String[] args) {
		/*
		 Create a Java program and name it Task1
			a) In your program create the variables to store student's information 
			and then print the value of those variables:
				- name
				- lastName
				- grade
				- city
				- state
			
			b) Print the following:
			My name is ______ and my lastname is _____.
			I live in the city of _____, state of ____.
			My grade is: ____
		 
		 */
		
		//a)
		
		String name = "John";
		String lastName = "Doe";
		char grade ='A';
		String city = "NYC";
		String state = "NY";
		
		
		//b)

		//System.out.println ==> print the statement and hit ENTER
		//System.out.print   ==> print the statement 
		System.out.println("My name is " + name + " and my last name is " + lastName);
		System.out.println("I live in the city of " + city + ", state of " + state);
		System.out.println("My grade is: " + grade);
		
		System.out.println("-------------------------------");
		
		//using \n (new line character) -- same as pressing ENTER key
		System.out.println("My name is " + name + " and my last is " + lastName + ".\n"
				+"I live in the city of " + city + ", state of " + state + ".\n"
				+"My grade is: " + grade);
	}

}
