package com.neotech.lesson03;

public class VariableValues {

	public static void main(String[] args) {
	
		/*
		 	Create a Java program and name it VariableValues
			In your program create variables to store all different types of primitive data.
			Print the value of each variable.
			Update value of each variable.
			Print the value of each variable after updating. 
		 
		 */
		
		//How do I declare a variable???
		// Data Type   Variable Name/Identifier;
		
		//how about declaring and assigning? 
		
		// Data Type		Name/Identifier			Assignment Op (=)		Value ;
		
		byte a = 10;
		short b = 250;
		int c = 2500;
		long d = 2352354516L;
		
		float e = 25.5f;
		double f = 55.5;
		
		char g = '%';
		boolean h = false;
		
		//printing variables
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		//can I change the values of these parameters???
		//Yes, we call it reassigning!!!
		
		//we don't need to add the data type when reassigning. Java already knows it!!!
		a = 25;
		b = 50; 
		c = 35000;
		d = 1243252456l;
		e = 34543F;
		f = 5;
		g = '5'; //this is a character to Java
		h = true;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
	
}
