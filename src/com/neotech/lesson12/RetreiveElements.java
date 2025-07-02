package com.neotech.lesson12;

public class RetreiveElements {

	public static void main(String[] args) {
		
		char [] grades = { 'A', 'B', 'C', 'D', 'F'};
		
		// how do we get the values of the array
		
		//1st way: for loop
		for(int i = 0; i < grades.length; i++) {
			if (i == grades.length -1) { // true of last element
				System.out.print(grades[i]);

			} else {  // true for other elements
				System.out.print(grades[i] + ", ");
			}
		}
		
		System.out.println();
		
		// 2nd way: Advanced for loop
		
		for (char grade : grades) {
			
			System.out.print(grade + ", ");
			
        }
		
		
		System.out.println();
		
		String[] fruits = {"Apple", "Orange", "Mango", "Watermelon", "Dragonfruit"};
		

	  // lets loop using basic for loop
		
		for (int i = 0; i < fruits.length; i++) {
			if ( fruits[i].equals("Mango")) {
				System.out.println(fruits[i] + " is my favourite");
			} else {
				System.out.println(fruits[i]);
			}
			
		
		}
		
		
		// lets do it using advanced for loop --> we can not use it for reverse
		for (String fruit:fruits) {
			if ( fruit.equals("Mango")) {
				System.out.println(fruit + " is my favourite");
			} else {
				System.out.println(fruit);
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
