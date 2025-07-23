package com.neotech.lesson15;

public class Phone {

//	Create a Class "Phone". Create 3 Objects of it: 
// iPhone, Android, Nokia with specific  attributes and behaviors.

	// Lets create some properties/attributes for phones
	String brand, model, color;
	int price;

	// Behaviors
	void call() {
		System.out.println(brand + " makes calls!");
		System.out.println("And the call quality is perfect for " + model);
	}

	void text() {
		System.out.println(brand + " texts!");
	}

	void navigate() {
		System.out.println(brand + " navigates!");
	}

	// this method is added by elion
	void installApplication() {
		System.out.println(brand + " installing the application!");
	}
}
