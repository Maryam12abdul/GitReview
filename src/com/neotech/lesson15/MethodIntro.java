package com.neotech.lesson15;

public class MethodIntro {

	// lets create greet() method

	void greet() { // method header
		// method body
		System.out.println("Hello");
		System.out.println("How are you doing?");
		System.out.println("Bye");
	}

	void greet2(String name) { // method header, name is the parameter here
		// method body
		System.out.println("Hello " + name);
		System.out.println("How are you doing?");
		System.out.println("Bye " + name);
	}

	public static void main(String[] args) {

		MethodIntro obj = new MethodIntro();

		System.out.println("I am in main method");

		System.out.println("Now going into greet() method!");

		obj.greet();

		obj.greet2("Sarosh"); // Sarosh is the argument here

	}

}
