package com.neotech.lesson14;

public class School {

	public static void main(String[] args) {

		
		Student s1 = new Student();
		s1.firstName = "Maryam";
		s1.lastName = "Abdul";
		s1.age = 27;
		s1.gender = 'F';
		s1.School = "NeoTech";
		s1.grade = 9;
		
		
		s1.study();
		s1.doHomework();
		s1.attendClass();
		
		System.out.println("-----------");
		
		Student s2 = new Student();
		s2.firstName = "Bakar";
		s2.lastName = "Khalif";
		s2.age = 26;
		s2.gender = 'M';
		s2.School = "NeoTech";
		s2.gender = 8;
		
		
		s2.study();
		s2.doHomework();
		s2.attendClass();		
		
		
		System.out.println("---------");
		
		// call the methods as many times as you need
		s2.study();
		s2.doHomework();
		
		
		
		
		
	}

}
