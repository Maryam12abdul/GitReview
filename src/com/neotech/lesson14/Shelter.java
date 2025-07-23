package com.neotech.lesson14;

public class Shelter {
	// Create a class Shelter
	// create 3 objects of class Dog and initialize the values for each
	public static void main(String[] args) {

		// Can i do this? YES, we may instantiate the objects before assigning values
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();

		// Set the properties of the objects
		dog1.age = 3;
		dog1.breed = "Poodle";
		dog1.size = "Small";
		dog1.color = "Brown";

		dog2.age = 7;
		dog2.breed = "Husky";
		dog2.color = "White";
		dog2.size = "Medium";

		dog3.age = 1;
		dog3.breed = "Jack Russell";
		dog3.color = "White";
		dog3.size = "Small";

		// lets call the methods now
		dog1.eat();
		dog1.run();
		dog1.breed();

		System.out.println("------------");

		dog3.eat();
		dog3.run();
		dog3.breed();

		System.out.println("------------");

		dog2.run();
		dog2.eat();
		dog2.breed();

		System.out.println("------------");

		dog3.getInfo();

		dog3.age = 3;

		dog3.getInfo();

	}

}
