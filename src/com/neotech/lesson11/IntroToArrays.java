package com.neotech.lesson11;

public class IntroToArrays {

	public static void main(String[] args) {

		int num = 10;  // one variable, holds one value 

		//1st way to declare an array
		int[] array1 = new int[5];
		//declare syntax: 1 - data type (int), array indicator ([]), name 
		//initialize syntax: 1- new keyword, datatype (int), size ([5]) 
		
		
		//index -->  0, 1, 2, 3, 4
		// array1 = [0, 0, 0, 0, 0]
		
		//To access an array element, we use this form: array1[index]
		
		//be default all int array elements are initialized to 0
		System.out.println(array1[0]);  //accessing the element at index 0
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		// When you try to access an index that does not exist, then you get ArrayIndexOutOfBoundsException
//		System.out.println(array1[5]); //we dont have an index 5 (the highest is 4)
		
		//We can assign values to array elements
		
		array1[0] = 5;
		//array1 = [5, 0, 0, 0, 0]
		array1[1] = 10;
		//array1 = [5, 10, 0, 0, 0]
		array1[3] = 20;
		//array1 = [5, 10, 0, 20, 0]
		array1[4] = 25;
		//array1 = [5, 10, 0, 20, 25]
		array1[2] = 15;
		//array1 = [5, 10, 15, 20, 25]
		
		System.out.println("---- After element assignment -----");
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		
		//2nd way to declare it: 
		int[] array2;
		array2 = new int[3];
		//Let's assign 8 to the last element of the array: 
		//What is the last element index? size - 1 --> 3-1--> 2
		array2[2] = 8;
		array2[1] = 4;
		array2[0] = array2[1] + array2[2];
		
		System.out.println("array2[0] --> " + array2[0]);
		
		//another structure -- less preferred
		
		String strArray[] = new String[2];
		strArray[0] = "NYC";
		strArray[1] = "Newark";
//		strArray[2] = "Hoboken"; //OutOfBounds
		strArray[0] = "New York"; //re-assigning a string value to the first element 
		
		
		
		char[] letters = new char[6];
		
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 'X';
		letters[4] = 'W';
		letters[5] = 'D';
		
		System.out.println("Letter at index 5 is " + letters[5]);
		
		
		
		
	}

}
