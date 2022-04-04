package com.quintrix.jfs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world! and test objects
 *
 */
public class App {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		// long biggerNum = 1000;

		// boolean checkNum = false;

		/*
		 * String str1 = new String("Hello"); //creates new object therefore not equal
		 * to str2 String str2 = new String("Hello");
		 * 
		 * if (str1 == str2) { System.out.println("They are equal"); } else {
		 * System.out.println("They are not equal"); }
		 */

		// Integer carsCounter1 = 10; // points to same value as carsCounter2 therefore
		// equal
		// Integer carsCounter2 = 10;
		// if (carsCounter1.intValue() == carsCounter2.intValue()) {

		// System.out.println("They are equal");
		// } else {
		// System.out.println("They are not equal");
		// }

		char alphabet = '\u2764'; // prints heart from unicode

		// double testDecimalVal = 0.1;
		// testDecimalVal = testDecimalVal + 0.2;

		Date curDate = new Date();

		// System.out.println("It is " + curDate);

		DateFormat dateFormate = new SimpleDateFormat("MM-dd-yyyy hh:mm"); // creates date format
		String strDate = dateFormate.format(curDate); // grabs data from Date stored in curDate variable and applies
														// formating
		System.out.println("The date is " + strDate);

		// carsCounter = 2;
		// carsCounter++;

		System.out.println("Katie is Great \n" + alphabet);

	}
}
