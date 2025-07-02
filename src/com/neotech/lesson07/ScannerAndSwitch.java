package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		
		// ask the user to enter their country
		// then print the language they speak
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter your country:");
		
		String country = myScanner.nextLine();
		
		
		switch (country) {
		case "Somalia":
		  System.out.println("You speak Somali");
		  break;
		case "Turkiye":
			System.out.println("You speak Turkish");
			break;
		case "India":
			System.out.println("You speak Hindi");
			break;
		case "Philippines":
			System.out.println("You speak Tagalog");
			break;
		case "Netherlands":
			System.out.println("You speak Dutch");
			break;
		case "USA":
		case "Canada":
		case "Australia":
		case "England":
			System.out.println("You speak English");
			break;
		
			default:
				System.out.println("Oh i don't know about this one");
		
		
		break;
		
		}
		
		if (country.equals("Somalia")) {
			System.out.println("You speak Somali");
		}
		else if (country.equals("Turkiye")) {
			System.out.println("You speak Turkish");
		}
		else if (country.equals("India")){
		System.out.println("You speak Hindi");
		}
		else if (country.equals("USA")|| country.equals("Canada") || country.equals("Australia") || country.equals("England")) {
			
			System.out.println("You speak English");
	    }  else  {
		System.out.println("Oh i don't know about this one");
		
	  }
		
		myScanner.close();
		
		
		
		
		
		
		
		
		}
	}


