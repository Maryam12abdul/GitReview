package com.neotech.lesson05;

public class NestedElseIf {

	public static void main(String[] args) {

		// Write a Java program to check if a student has done the Quiz. 
		// If the student did the Quiz, then check the score and give the 
		// following evaluations:
		// ◆ If the score is 90 or greater, print “A, Great job!”.
		// ◆ If the score is 80 or greater but less than 90, print “B, Well done!”.
		// ◆ If the score is 70 or greater but less than 80, print “C, You passed!”.
		// ◆ Otherwise, print “F, You failed”
		// If the student did not do the Quiz, print "You did not do the quiz, 
		// so you failed!"

		
		//Lets plan: 
			//If the quiz is done:
				//check the score
				//If the score is >=90		--> A
				//If the score is 80 <= score < 90 ---> B
				//..
				//..
			//Else (no quiz done): "You did not do the quiz, so you failed!"
		
		boolean isDone = true;
		byte score = 110;
		
		
		if (isDone)
		{
			//we can check the score since the quiz is done
			if (score >= 90)
			{
				System.out.println("A, Great Job!");
			}
			else if (score >= 80)
			{
				System.out.println("B, Well Done!");
			}
			else if (score >= 70)
			{
				System.out.println("C, You Passed!");
			}
			else
			{
				System.out.println("F, You Failed!");
			}
		}
		else
		{
			System.out.println("You did not do the quiz, so you failed!");
		}
		
		
		
	}

}
