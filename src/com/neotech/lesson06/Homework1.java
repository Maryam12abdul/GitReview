package com.neotech.lesson06;


public class Homework1 {
	/*
	 * Write a java program to check if a patient has allergies. 
	 * If the patient does not have allergies print "You’re healthy!". 
	 * If the patient has allergies, check if it is a peanut allergy, lactose allergy, 
	 * bee allergy or seafood allergy and print a statement telling the patient 
	 * "Don’t eat ___". (fill the line with the food names – peanut, seafood etc.)
	 */

	public static void main(String[] args) {

		boolean hasAllergies = true;
		boolean hasPeanutAllergy = false;
		boolean hasLactoseAllergy = true;
		boolean hasBeeAllergy = false;
		boolean hasSeafoodAllergy = false;

		if (hasAllergies) {
			// this is the logic where the person has allergies
			if (hasPeanutAllergy) {
				System.out.println("Stay away from peanuts!!!");
			}

			if (hasLactoseAllergy) {
				System.out.println("Do not drink milk!!!");
			}

			if (hasBeeAllergy) {
				System.out.println("Leave the bees alone!!!");
			}

			if (hasSeafoodAllergy) {
				System.out.println("Do not eat seafood!!!");
			}

		} else {
			// this is the logic where person has no allergies
			System.out.println("You are healthy!");
		}

	}

}
