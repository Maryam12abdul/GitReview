package com.neotech.lesson10;

public class PrintHours {
	// Print the whole combination of hours in a digital clock
	// 00:00
	// 00:01
	// .....
	// 23:59
	public static void main(String[] args) {

		for (int hour = 0; hour <= 23; hour++) {

			// lets create the loop for the minutes (child loop)
			for (int min = 0; min <= 59; min++) {
				// fix the preceding 0 issue for hour
				if (hour < 10) {
					System.out.print("0" + hour + ":");// convert one digit number to two digits
				} else {
					System.out.print(hour + ":");
				}

				// fix the preceding 0 issue for min
				if (min < 10) {
					System.out.println("0" + min);// convert one digit number to two digits
				} else {
					System.out.println(min);
				}
			}
		}

	}

}
