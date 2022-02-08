package com.hcl.databaseexercise;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		DBHandle db = new DBHandle();
		// Connect database
		if (!db.ConnectDB()) {
			System.out.println("Can not connect database! App exit!");
			return;
		}

		// Create table and initial sample data
		if (!db.InitTable().equals("OK")) {
			System.out.println("Can not create table! App exit!");
			return;
		}

		boolean isRunning = true;

		Scanner myObj = new Scanner(System.in);

		while (isRunning) {
			// User input
			System.out.println("-----Welcome to Database sample app-----");
			System.out.println("1 -Insert the record in Employee DB input through command line arguments");
			System.out.println("2 -Retrieve all the Employee information");
			System.out.println("3 -Retrieve any employee record input given through command line arguments");
			System.out.println("4 -Update any particular employee record  input given through command line arguments");
			System.out.println("5 -Delete any particular employee record  input given through command line arguments");
			System.out.println("Any other keys - Exit");
			System.out.println("-----------------------------------------");
			System.out.println("Please enter:");
			String sRtn = myObj.nextLine();

			switch (sRtn) {
			case "1": {
				
				break;
			}
			case "2": {
				db.selectRecord("");
				break;
			}
			case "3": {
				System.out.println("Enter command line arguments for searching: ");
				sRtn = myObj.nextLine();
				db.selectRecord(sRtn);
				break;
			}
			case "4": {
				break;
			}
			case "5": {
				break;
			}default: {
				System.out.println("Thank you for using! See you!");
				return;}
			}

		}

		myObj.close();

	}

}
