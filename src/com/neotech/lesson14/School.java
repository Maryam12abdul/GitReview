package com.neotech.lesson14;

public class School {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.firstName = "Lawrance";
		s1.lastName = "Suh";
		s1.age = 27;
		s1.gender = 'M';
		s1.School = "NeoTech";
		s1.grade = 9;

		s1.study();
		s1.doHomework();
		s1.attendClass();

		System.out.println("-----------");

		Student s2 = new Student();
		s2.firstName = "Gulay";
		s2.lastName = "Yalcin";
		s2.age = 25;
		s2.gender = 'F';
		s2.School = "NeoTech";
		s2.grade = 9;

		s2.study();
		s2.doHomework();
		s2.attendClass();

		System.out.println("------------");
		// call the methods as many times as you need
		s2.study();
		s2.doHomework();
	}

}
