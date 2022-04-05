package com.quintrix.jfs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

		System.out.println("PI is " + Math.PI);

		char alphabet = '\u2764'; // prints heart from unicode

		// double testDecimalVal = 0.1;
		// testDecimalVal = testDecimalVal + 0.2;

		Date curDate = new Date();

		System.out.println("It is " + curDate.getTime()); // from Epoch (jan 1, 1970)

		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy G, E hh:mm z, YY"); // creates date
																						// format
		String strDate = dateFormat.format(curDate); // grabs data from Date stored in curDate variable and applies
														// formating

		System.out.println("The date is " + strDate);

		// carsCounter = 2;
		// carsCounter++;

		System.out.println("Katie is Great \n" + alphabet);

		LocalDate thisYear = LocalDate.now();
		boolean isLeap = thisYear.isLeapYear();
		System.out.printf("Year %d, leap year = %s", thisYear.getYear(), isLeap + "\n");

		List<Dog> dogList = new ArrayList<>();

		Dog dog1 = new Dog("Pug", 1, "Black & White", 100);
		dogList.add(dog1);

		Dog dog2 = new Dog("Lab", 2, "Black", 90);
		dogList.add(dog2);

		Collections.sort(dogList);

		for (Dog d : dogList) {
			System.out.println(d);
		}

		// System.out.println(dog);

		// SpecialDog sepecialDog = new SpecialDog();
		// sepecialDog.fight();

		Map<String, String> stateMap;
		{
			stateMap = new TreeMap<>();
			stateMap.put("CO", "Colorado");
			stateMap.put("OH", "Ohio");
			stateMap.put("NJ", "New Jersey");
		}

		if (stateMap.get("OH") != null) {
			System.out.println(stateMap.get("OH"));
		} else {
			System.out.println("State not in the list.");
		}

		for (String key : stateMap.keySet()) {
			System.out.println(key);
		}

		List<Integer> intSet = new ArrayList<>();
		intSet.add(15);
		intSet.add(12);

		intSet.sort(null);

		for (Integer i : intSet) {
			System.out.println(i);
		}

	}// ends main

} // ends App class
