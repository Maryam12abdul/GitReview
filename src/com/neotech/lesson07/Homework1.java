package com.neotech.lesson07;

import java.util.Scanner;

public class Homework1 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your height in inches");
		double height = scan.nextDouble();
		
		if(height > 0 && height < 60) {
			System.out.println("Classified as SHORT!");
		}
		
		else if (height >= 60 && height < 72) {
			System.out.println("Classified as MEDIUM!");
		}
		
		else if (height >= 72) {
			System.out.println("Classified as TALL!");
		} else {
			System.out.println("Invalid Value");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
