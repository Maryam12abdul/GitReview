package com.neotech.lesson12;

public class Largest {

	public static void main(String[] args) {
		
		
		
		int[] numbers = { 2, 6, 33, 1, 99, 12 };
		
		
		// fix the max number
		
		int max = numbers[0];
		for (int number:numbers) {
			if (number > number) {
				
				max = number;
			}
		}
		
		
		System.out.println("Max is " + max);
		
		// do the same using basic for loop
		int max2 = numbers[0];
		for (int i  = 1; i < numbers.length; i++) {
			if (numbers[i] > max2) {
				max2 = numbers[i];
			}
		}
		
		System.out.println("Max is " + max2);
		
		// tasks: find the second max
		
		
		
		
	}

}
