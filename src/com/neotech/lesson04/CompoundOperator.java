package com.neotech.lesson04;

public class CompoundOperator {

	public static void main(String[] args) {

		// aka shorthand operator

		int num = 100; // declare a variable and assign its value
		System.out.println(num);

		// re-assing its value
		num = 150;
		System.out.println(num);

		num = num + 50;
		System.out.println(num);

		// there is another way of doing this operation
		num += 100;
		System.out.println(num);

		// do the same for subtraction: num = num - 100
		num -= 100;
		System.out.println(num);

		num /= 5; // num = num / 5
		System.out.println(num);

		num *= 6; // num = num * 6
		System.out.println(num);

		num %= 8; // num = num % 8
		System.out.println(num);

		// 100/3 = 33.333
		// 100%3 = 1

	}

}
