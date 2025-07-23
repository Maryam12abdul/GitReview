package com.neotech.lesson04;

public class RelationEqualityOperators {

	public static void main(String[] args) {

		System.out.println(6 < 8); // true

		int a = 6;
		int b = 8;

		System.out.println(a > b); // false
		System.out.println(a < b); // true

		int c = 8;

		System.out.println(c == b); // true

		// = is for assigning values
		// == equal (is for comparison)
		// != not equal

		System.out.println(c != b); // false

		System.out.println("----------------");

		double d1 = 10.5;
		double d2 = 8.5;

		boolean result = d1 > d2;
		System.out.println(result); // true

		boolean result2 = d1 == d2; // false
		System.out.println(result2);
		System.out.println(result == result2); // false

		boolean result3 = d1 >= d2; // true
		System.out.println(result3);

	}

}
