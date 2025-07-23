package com.neotech.lesson05;

public class ElseIfCondition {

	public static void main(String[] args) {

		// I have two double variables, what possible situations are there 

		double d1 = 55.5;
		double d2 = 55.5;
		
		//if() {} 		else {} --- is used to express only two exclusive situations
		//for any other situation which could have more than two outcomes then 
		//we can expand the if else condition....
		/*
		 
		 if () 
		 {
		 
		 }
		 else 
		 { 
		 
		 }
		 
		 
		 */
		
		
		if (d1 > d2)
		{ //this part will ONLY get executed if d1 > d2
			System.out.println(d1 + " is bigger than " + d2);
		}
		
		
		else if(d1 < d2)
		{//this part will ONLY get executed if d1 < d2
			System.out.println(d1 + " is smaller than " + d2);
		}
		
		
		else 
		{//this part will ONLY get executed if d1 is equal to d2
			System.out.println(d1 + " is equal "+ d2);
		}
		

		
		
	}

}
