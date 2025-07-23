package com.neotech.lesson15;

public class TestCalculatorWithReturn {

	public static void main(String[] args) {

		CalculatorWithReturn cal = new CalculatorWithReturn();

		// this call will return the result back to us
		int result = cal.add(34, 55);
		System.out.println(result);
		// OR
		System.out.println(cal.add(3, 5));

		// this will return nothing, it will just print the result in console
		cal.add2(12254, 25665);

		// we may reuse the return value
		System.out.println(result * 2);

		int result2 = cal.multiply(45, 12);
		System.out.println(result2);

		double result3 = cal.divide(457, 41);
		System.out.println(result3);

		System.out.println("-------------");

		// what will happen if i call giveBackSomething() method?
		System.out.println(cal.giveBackSomething());
		// this will only print 10 and return 8, but i do nothing with 8
		cal.giveBackSomething();

		cal.doNotReturnAnything();

		System.out.println("The avg of 3, 5, and 93 is " + cal.average(3, 5, 93));

		// converts the number into a string and returns back to us
		System.out.println(cal.returnString(55));

	}

}
