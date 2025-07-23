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
		case "Azerbaijan":
			System.out.println("You speak Azerbaijan");
			break;
		case "Turkiye":
			System.out.println("You speak Turkish");
			break;
		case "India":
			System.out.println("You speak Hindi");
			break;
		case "Mexico":
			System.out.println("You speak Spanish");
			break;
		case "Philippines":
			System.out.println("You speak Tagalog");
			break;
		case "Netherlands":
			System.out.println("You speak Dutch");
			break;
		case "USA":
		case "Canada":
		case "England":
		case "Australia":
			System.out.println("You speak English");
			break;
		default:
			System.out.println("Oh I dont know about this one!");
			break;
		}

		if (country.equals("Azerbaijan")) {
			System.out.println("You speak Azerbaijan");
		} else if (country.equals("Turkiye")) {
			System.out.println("Your speak Turkish");
		} else if (country.equals("India")) {
			System.out.println("You speak Hindi");
		} else if (country.equals("Mexico")) {
			System.out.println("You speak Spanish");
		} else if (country.equals("Philippines")) {
			System.out.println("You speak Tagalog");
		} else if (country.equals("Netherlands")) {
			System.out.println("You speak Dutch");
		} else if (country.equals("USA") || country.equals("Canada") || country.equals("England")
				|| country.equals("Australia")) {
			System.out.println("You speak English");
		} else {
			System.out.println("I dont know about this one!");
		}

		myScanner.close();

	}

}
