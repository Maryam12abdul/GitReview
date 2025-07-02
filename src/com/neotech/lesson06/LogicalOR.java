package com.neotech.lesson06;

public class LogicalOR {
	// define an exam score
	// if the score is less than 0 or greater than 100, say 'wrong score'

	public static void main(String[] args) {

     int score = -3;
     
     if ( score < 0 || score > 100) {
    	 System.out.println("Wrong number") ;
     }
     
    	 else {
    		 System.out.println("Your score is" + score);
    	 }
    	 
     }


}
