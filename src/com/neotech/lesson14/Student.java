package com.neotech.lesson14;

public class Student {

	// Features:
	// firstName, lastName, age, gender, school, grade

	String firstName;
	String lastName;
	int age;
	char gender;
	String School;
	int grade;

	// Behaviors:
	// study(), doHomework(),attendClass()

	void study() {
		System.out.println(firstName + " " + lastName + " is studying");
	}

	void doHomework() {
		System.out.println(firstName + " " + lastName + " is doing hw");
	}

	void attendClass() {
		System.out.println(firstName + " " + lastName + " always attends the classes");
	}
}
