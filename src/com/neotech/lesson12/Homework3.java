package com.neotech.lesson12;

public class Homework3 {

	public static void main(String[] args)  {
		
		// Create an array of countries
       // While retrieving/get all values from an array print capital for each country.
		
		String[] countries = {"Greece", "Germany", "Turkiye", "Brazil", "Puerto Rico"};
		
		for (int i = 0; i < countries.length; i++) {
			
			String country = countries[i];
			
			if (country.equals("Greece")) {
				System.out.println(country + " -Athens");
			
		} else if (country.equals("Germany")) {
			
			System.out.println(country + "-Berlin");
		} else if(country.equals("Turkiye")) {
			System.out.println(country + " -Ankara");

		} else if (country.equals("Brazil")) {
			System.out.println(country + " -Brasilia");

		} else if (country.equals("Puerto Rico")) {
			System.out.println(country + " -San Juan");

		} else {
			System.out.println("Unknown country!");

		}
			
		}
		
		// 2nd way: Advanced for loop
		// loop over the countries and also write the capitals from the 2nd array
		
		
		
		
		
		
		
		
		
		
		
	}

}
