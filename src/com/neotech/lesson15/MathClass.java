package com.neotech.lesson15;

public class MathClass {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println("Test the addition:");
		cal.add(34, 59);
		cal.add(21, 78);
		
		
		System.out.println("Test the multiplication");
		cal.multiply(345, 871);
		cal.multiply(20, 6);
		
		
		System.out.println("Test the divison");
		cal.divide(459, 23);
		cal.divide(72, 8);
		
		
		cal.findEvenOrNot(65);
		cal.findEvenOrNot(42);
		
		
		
		
	}

}
