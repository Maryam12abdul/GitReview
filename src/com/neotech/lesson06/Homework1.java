package com.neotech.lesson06;

public class Homework1 {
 
		// write a java program to check if a patient has allergies.
		// if the patient does not have allergies print "you're healthy!".
		// if the patient has allergies, check if it is peanut allergy, lactose allergy, bee allergy or sea food allergy and print a statement telling the patient "Don't eat --"
		// ( fill the line with the food names - peanut, sea food etc.)
		
		public static void main(String[] args) {
			boolean hasAllergies = true;
			boolean hasPeanutAllergy = false;
			boolean hasLactoseAllergy = true;
			boolean hasBeeAllergy = true;
			boolean hasSeafoodAllergy = true;
			
			if (hasAllergies)  {
				// this is the logic where the person has allergies
				if (hasPeanutAllergy) {
					System.out.println("Stay away from Peanuts");
				}
		
			}
			if (hasLactoseAllergy) {
				System.out.println("Don't drink milk!!!");
			}
			
			if(hasBeeAllergy) {
				System.out.println("Leave the bees alone");
			}
			if (hasSeafoodAllergy) {
				System.out.println("Don not eat seafood!!!");
			}
		else {
				// this is the logic where the person has no allergies
				System.out.println("You are healthy!");
			}
			
			
			


	}

}
