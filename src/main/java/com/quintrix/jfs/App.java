package com.quintrix.jfs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		System.out.println("Hello World");
		// long biggerNum = 1000;

		// boolean checkNum = false;

		// int carsCounter = 0;

		// char alphabet = 7;

		Date curDate = new Date();

		// System.out.println("It is " + curDate);
		DateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		String strDate = dateFormate.format(curDate);
		System.out.println("The date is " + strDate);

		// carsCounter = 2;
		// carsCounter++;

		// System.out.println("Katie is Great \n" + alphabet);

	}
}
