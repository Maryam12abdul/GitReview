package com.neotech.lesson12;

public class Recap {

	public static void main(String[] args) {

		int[] grades = new int[5]; // [0,0,0,0,0]

		// How can i get the size of this array?
		System.out.println("the size of the array is " + grades.length);

		System.out.println("grade with index number 2 is " + grades[2]);

		System.out.println("grade in position 3 is " + grades[2]);

		// 0 1 2 3 4 --> indexes
		// 0 0 0 0 0 --> values

		// lets change a grade: grades[3]
		grades[3] = 85;

		// grades[5] = 100; -> will give an error at runtime
		// grades[0] = "Ten"; -> will give an error at compile

		grades[2] = 100;
		// 0 0 100 85 0

		grades[4] = 95;
		// 0 0 100 85 95

		grades[1] = 90;
		// 0 90 100 85 95

		grades[0] = 100;
		// 100 90 100 85 95

		grades[0] = 95;

		grades[0] = 99;

		// Lets find the avg of the grades

		// 1st way:
		int total = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];
		int avg = total / 5;
		System.out.println("avg is " + avg);

		// 2nd way:
		int sum = 0;
		for (int i = 0; i < grades.length; i++) {
			int grade = grades[i];
			sum += grade;
		}

		System.out.println("sum is " + sum);
		System.out.println("avg is " + sum / grades.length);

		String[] cities = { "Istanbul", "Barcelona", "Houston", "Osaka", "Budapest", "Moscow" };

		System.out.println("there are " + cities.length + " cities");

		// print the last city
		System.out.println("the last city is: " + cities[cities.length - 1]); // cities[5]

		// print the cities in order
		for (int i = 0; i < cities.length; i++) {
			System.out.print(cities[i] + " ");
		}

		System.out.println();

		// print the cities in reverse order
		// last index = cities.length - 1
		for (int i = cities.length - 1; i >= 0; i--) {
			System.out.print(cities[i] + " ");
		}

	}

}
