package com.neotech.lesson11;

public class ArrayLength {

	public static void main(String[] args) {
		
		
		//Create an array of names 
		String[] names = new String[5];
		
		names[0] = "Sabah";
		names[1] = "Mo";
		names[2] = "Anna";
		names[3] = "Alaric";
		names[4] = "Mikka";
		
		int namesSize = names.length; //we are getting the length of the array 
		System.out.println(namesSize);

		//another way to declare an array: 
		int[] scores = {90, 95, 85, 80, 50};
		System.out.println(scores.length); //what is the size of the arraY?
		
		//I can change the values of the scores
		scores[4] = 75;
		
		//but I cannot changes the size of the array
		
		
		//note: 
		int a, b, c, d;  //declaring 4 int variables
		int[] scores1, scores2, scores3; //declaring 3 int arrays 
		
		
		
	}

}
