package com.neotech.lesson14;

public class Car {

	// What features/attributes does a car have?
	// make, model, color, year, mpg, max speed: VARIABLES

	// What actions does a car do?
	// drive(), stop(), transportsPeople(): METHODS

	// Features: VARIABLES
	String make;
	String model;
	String color;
	int year;
	int mileage;
	boolean manual;
	int maxSpeed;

	// Behaviors(actions):METHODS
	// returnType methodName()
	void drive() {
		System.out.println(make + " " + model + " drives");
	}

	// void means the method returns nothing

	void stop() {
		System.out.println(make + " stops!");
	}

	void transportPeople() {
		System.out.println(make + " transports people!");
	}

	// class is the blueprint(structure,skeleton) that is made of features and
	// behaviors

	// what is an object?
	// is an instance/example of a class

	// how can we create an object from the Car class?
	// We have to instantiate the Car class: usually done in main method

	// Can i have a main method here?
	public static void main(String[] args) {
		// dataType identifier = value;
		int number = 10;

		// create a Car object and call it car1
		Car car1 = new Car();

		// remember the scanner object
		// Scanner scan = new Scanner(System.in);

		// lets set some of cars properties
		car1.make = "Toyota";
		car1.model = "Coralla";
		car1.manual = false;
		car1.maxSpeed = 120;
		car1.mileage = 35000;
		car1.year = 2023;
		car1.color = "Grey";

		System.out.println("My car is a " + car1.make + " " + car1.model + " " + car1.year);

		System.out.println("--------------");

		// can i also access the behaviors of my car1 object?
		car1.drive();
		car1.stop();
		car1.transportPeople();
	}

}
