package com.neotech.lesson03;

public class StringConcatenation {

	public static void main(String[] args) {
	
		
	// + operator: concatenates (joins) Strings	
	System.out.println("Hello " + " - " + " World!");	
	
	String language = "Java";
	
	System.out.println("I love Java!");
	System.out.println("I love " + language + "!");
		
	String s1 = "I love";
	String s2 = "programming!";
	
	//I can reassign String too
	//language = "Python";
	
	System.out.println(s1 + " "+ language + " " + s2);
	
	//Spacing matters in a String
	System.out.println("Steven");
	System.out.println("             Steven"); //this space matters
	System.out.println(             "Steven"); //this space does NOT
	
	//String + number 
	System.out.println("Why is everyone scared of number " + 13);
	//String + number ====> String
	
	String s3 = "I am " + 3;
	System.out.println(s3);
	
	String s4 = s3 + 5;
	System.out.println(s4);
	
	//Order of operations in a String
	System.out.println("I have " + 2 + 2 +" cats!");
	//Step 1: I have + 2 ===> I have 2
	//Step 2: I have 2 + 2 ==> I have 22
	//Step 3: I have 22 + cats! ===> I have 22 cats!
	
	System.out.println("I have " + (2 + 2) + " cats!");
	//Step 1: 2 + 2 ==> 4
	//Step 2: I have + 4 ==> I have 4
	//Step 3: I have 4 + cats! ===> I have 4 cats!
	
	}

}
