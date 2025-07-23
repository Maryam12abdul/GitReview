package com.neotech.lesson09;

public class ForLoopIntro {

	public static void main(String[] args) {

		// lets print numbers from 1 to 10
		int num = 1;
		while (num <= 10) {
			System.out.print(num + " ");
			num++;
		}

		System.out.println();

		// initialization, condition, increment
		for (int num2 = 1; num2 <= 10; num2++) {
			System.out.print(num2 + " ");
		}

		System.out.println();

		System.out.println(num);
		// System.out.println(num2);
		// num2 belongs to for loop so it can only be used inside the for loop

	}

}
