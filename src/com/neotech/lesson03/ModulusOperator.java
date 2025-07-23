package com.neotech.lesson03;

public class ModulusOperator {

	public static void main(String[] args) {
		// modulus operator ---> %

		int a = 13; 
		int b = 5;
		
		int div = a / b; //2 --> the rest is discarded/lost
		System.out.println("div --> " + div);
		
		//13 % 5
		// what is the largest number in 13 that is fully divisible by 5? 
		// 10 ---> remainder 13 - 10
		
		int remainder = a % b;
		System.out.println("remainder --> " + remainder);
		
		
		//dividing doubles
		double d1 = 13; 
		double d2 = 5;
		
		double res = d1 / d2; 
		System.out.println("res --> " + res);
		
		int num1 = 17; //I have 17 cars
		int num2 = 4; // I want to split the 17 cars to 4 kids
		
		int rem = num1 % num2; 
		System.out.println("rem --> " + rem);
		
		
		//1, 3, 5, 7, 9, 11, 13      /2		----> rem 1
		//2, 4, 6, 8, 10, 12		/2		----> rem 0
		
		
	}

}
