package com.neotech.lesson14;

public class Dog {

		// create a class called dog
	   // features: breed, size, color, age
	   // behaviors: eat(), run(), breed()
	
	
	 // features:
	String breed;
	String size;
	String color;
	int age;
	
	// behaviors:
	void eat() {
		System.out.println(breed + " eats");
	}
	
	void run() {
		System.out.println(breed + " runs!");
	}
	void breed() {
		System.out.println(breed + " breeds!");
	}
	
	void sleep() {
		System.out.println(breed + " sleeps!");
	}
	
	void getInfo() {
		System.out.println("Breed: " + breed);
		System.out.println("Size: " + size);
		System.out.println("Color:" + color);
		System.out.println("Age: " + age);
	
	}
	
	// can i have a main method here? YES
	// should i have a main method here? NO, you should not
	
	
	
	
	

	}


