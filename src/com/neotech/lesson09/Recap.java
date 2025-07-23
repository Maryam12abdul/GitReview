package com.neotech.lesson09;

public class Recap {

	public static void main(String[] args) {

		// print good morning five times
		System.out.println("good morning");
		System.out.println("good morning");
		System.out.println("good morning");
		System.out.println("good morning");
		System.out.println("good morning");

		System.out.println("---------------");

		int count = 1;
		while (count <= 5) {
			System.out.println("good morning");
			count++;
		}

		System.out.println("---------------");

		int count2 = 1;
		do {
			System.out.println("good morning");
			count2++;
		} while (count2 <= 5);
	}

}
