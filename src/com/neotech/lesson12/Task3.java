package com.neotech.lesson12;

public class Task3 {

//	3. Create an array of countries.
//	While retrieving all values from an array print capital for each country.
//	(use 2 different loops).

	public static void main(String[] args) {

		String[] countries = { "Greece", "Germany", "Turkiye", "Brazil", "Puerto Rico" };

		for (int i = 0; i < countries.length; i++) {

			String country = countries[i];

			if (country.equals("Greece")) {
				System.out.println(country + " - Athens");
			} else if (country.equals("Germany")) {
				System.out.println(country + " - Berlin");
			} else if (country.equals("Turkiye")) {
				System.out.println(country + " - Ankara");
			} else if (country.equals("Brazil")) {
				System.out.println(country + " - Brasilia");
			} else if (country.equals("Puerto Rico")) {
				System.out.println(country + " - San Juan");
			} else {
				System.out.println("Unknown country!");
			}
		}

		// 2nd way: advanced for loop
		for (String country : countries) {

			if (country.equals("Greece")) {
				System.out.println(country + " - Athens");
			} else if (country.equals("Germany")) {
				System.out.println(country + " - Berlin");
			} else if (country.equals("Turkiye")) {
				System.out.println(country + " - Ankara");
			} else if (country.equals("Brazil")) {
				System.out.println(country + " - Brasilia");
			} else if (country.equals("Puerto Rico")) {
				System.out.println(country + " - San Juan");
			} else {
				System.out.println("Unknown country!");
			}
		}

		// task:
		// 3rd way: create a second array for the capitals
		// loop over the countries array and also write the capitals from the second
		// array

	}

}
