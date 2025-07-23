package com.neotech.lesson14;

public class CarShop {

	public static void main(String[] args) {
		// Instantiating
		Car car1 = new Car();

		car1.make = "Honda";
		car1.model = "Civic";
		car1.color = "White";
		car1.manual = true;
		car1.maxSpeed = 130;
		car1.mileage = 10;
		car1.year = 2025;

		System.out.println(car1.make + " " + car1.model + " " + car1.color + " " + car1.year);

		car1.drive();
		car1.stop();
		car1.transportPeople();

		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "320";
		car2.color = "Black";
		car2.manual = false;
		car2.maxSpeed = 160;
		car2.mileage = 100000;
		car2.year = 2020;

		System.out.println("------------");

		car2.drive();
		car2.stop();
		car2.transportPeople();

		// declared and instantiated the object
		Car car3 = new Car();

		// just declaration
		Car car4;

	}

}
