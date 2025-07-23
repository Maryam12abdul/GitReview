package com.neotech.lesson07;

public class IntroToSwitch {

	public static void main(String[] args) {

		// given a number between 1 and 7: write the day
		int number = 7;
		String day;

		if (number == 1) {
			// System.out.println("Monday");
			day = "Monday";
		} else if (number == 2) {
			// System.out.println("Tuesday");
			day = "Tuesday";
		} else if (number == 3) {
			// System.out.println("Wednesday");
			day = "Wednesday";
		} else if (number == 4) {
			// System.out.println("Thursday");
			day = "Thursday";
		} else if (number == 5) {
			// System.out.println("Friday");
			day = "Friday";
		} else if (number == 6) {
			// System.out.println("Saturday");
			day = "Saturday";
		} else if (number == 7) {
			// System.out.println("Sunday");
			day = "Sunday";
		} else {
			// System.out.println("Invalid value");
			day = "invalid value";
		}

		System.out.println("(v.IF/ELSE)number " + number + " represents " + day);

		// using switch/case statement
		switch (number) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
		default:
			day = "invalid value";
			break;
		}

		System.out.println("(v.SWITCH)number " + number + " represents " + day);

	}

}
