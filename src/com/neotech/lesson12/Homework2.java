package com.neotech.lesson12;

public class Homework2 {

	public static void main(String[] args) {
		
		
		
		// Create an array on integers and calculate the sum of all elements in an array.
       // use 2 different loops
		
		
		int [] numbers = {10,15,20,30,50} ;
		
		// 1st way: basic for loop
		int sum = 0;
		for (int i=0; i< numbers.length; i++) {
			sum += numbers[i];
		}
		
		System.out.println("sum is " + sum);
		
		
		// 2nd way: Advanced for loop
		int sum2 = 0;
		for (int number : numbers) {
			sum2 += number;
		}
		System.out.println("sum is " + sum2);
		
		
		// 3rd way: While loop
		int sum3 = 0;
		int i = 0;
		while (i < numbers.length) {
			sum3 += numbers[i];
			i++;
		}
		System.out.println("sum is " + sum3);
		
	
	}

}
