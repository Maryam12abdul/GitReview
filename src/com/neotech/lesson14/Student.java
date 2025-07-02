package com.neotech.lesson14;

public class Student {

  //  features: firstName, lastName, age, gender, school, grade
		
		String firstName;
		String lastName;
		int age;
		char gender;
		String School;
		int grade;
		
 // behaviors: study(), doHomework(), attendClass()		
		
		
		void study() {
			System.out.println(firstName + " " + lastName + " " + "is studying");
		}
		
		void doHomework() {
			System.out.println(firstName + " " + lastName + " is doing Home work");
		}
		
		
		void attendClass() {
			System.out.println(firstName + " " + lastName + " always attends the classes");
		}
		
		
		

	}


