package com.neotech.lesson04;

public class PrimitiveCasting {

	public static void main(String[] args) {

		// type casting
		// byte --> short --> int --> long --> float --> double

		double d1 = 3.7;
		// no casting here
		System.out.println(d1);

		double d2 = 5;
		// casting happened from int to double
		System.out.println(d2);

		// compile error
		// int num = 5.5;

		// we are telling Java to convert double into an integer
		int num2 = (int) 6.5;
		System.out.println(num2);

		// you would lose the value here
		byte b1 = (byte) 4556;
		System.out.println(b1);

		int num3 = 50;
		// narrowing here
		byte b2 = (byte) num3;
		System.out.println(b2);

		// another narrowing example
		long L1 = 17L;
		int num4 = (int) L1;
		System.out.println(num4);

		long L2 = 2345234523452345345L;
		int num5 = (int) L2;
		System.out.println(num5);

		// another widening example
		int num6 = 250;
		float f1 = (float) num6;
		float f2 = num6;
		System.out.println(f1);
		System.out.println(f2);

	}

}
