package com.neotech.lesson13;

public class RetrievingValuesFrom2DArrays {

	public static void main(String[] args) {
		
		
		String[][] months = {
				{"December", "January", "February"},
				{"March", "April", "May"}, 
				{"June", "July", "August"},
				{"September", "October", "November"}
		};
		
		//the array has two dimensions: [4][3]
		int rows = months.length; //returns the number of rows
		System.out.println(rows);
		
		int cols = months[0].length; //returns the number of columns on row 0
		System.out.println(cols);
		
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols;j++)
			{
				//this is just to show, that with the nested loop, we are creating all possible 
				//combinations of the indexes
			//	System.out.print("[" + i + "][" + j + "], ");
				
				System.out.print(months[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("--------------------------");
		
		int[][] numbers = {
				{1,3,5,7},
				{2,4,5,6,7,9,11,15},
				{10},
				{12,13}
		};
		
		//how many times do I have to loop to print all values of the row 0??
				//4 times --> 0, 1, 2, 3
		//how many times do I have to loop to print all values of the row 1??
				//8 times --> 0, 1, 2, 3, 4, 5, 6, 7
		//how many times do I have to loop to print all values of the row 2??
				//1 time --> 0
		//how many times do I have to loop to print all values of the row 3??
				//2 times --> 0, 1
		
		for (int i = 0; i < numbers.length;i++)
		{
			//I need to make sure this loop runs for every record depending on the record length
			for (int j = 0;j < numbers[i].length; j++)
			{
				//what does numbers[i].length give for i = 1??? 8
				//what does numbers[i].length give for i = 2??? 1
				System.out.print(numbers[i][j] + " ");
			}
			
			
			System.out.println();
		}
		
		
		
		
	}
}
