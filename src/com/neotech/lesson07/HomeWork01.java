package com.neotech.lesson07;

import java.util.Scanner;

public class HomeWork01 {
	// Allow user to enter grade and then provide explanation:
	// A-Excellent, B-Good,C-AveragA-Excellent, B-Gooe, D-Bad, any other grade --> Not Acceptable. 
	// At the end your program should print which grade was entered by the user with explanation.
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner (System.in);
		 
		System.out.println("Please enter your grade:");
		
		String  grade = myScanner.next();
		  
		    switch (grade) {
	        case "A":
		    System.out.println("Excellent");
		    break;
		
		
	        case "B" :
	     	System.out.println("Good");
		    break;
			
			case "C" :
			System.out.println("Average");
			break;
		
				
	
			case "D" :
			System.out.println("Bad");
			break;
			
			default:
				System.out.println("Invalid Input");
				break;
		    }	
				System.out.println("Your grade is " + grade );
			
				myScanner.close();
				
			
			}
					
				}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

