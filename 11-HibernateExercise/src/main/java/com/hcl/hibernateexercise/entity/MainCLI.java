package com.hcl.hibernateexercise.entity;

import java.util.*;

import com.hcl.hibernateexercise.utility.DBHandle;

public class MainCLI {

	private static Scanner myObj = new Scanner(System.in);
	private static DBHandle db = new DBHandle();

	public MainCLI() {

	}

	// Main CLI function
	public static void RunCLI() {
		boolean isRunning = true;

		while (isRunning) {
			// Getting User input from menu
			String sRtn = ShowMenu();

			switch (sRtn) {
			// insert record
			case "1": {
				InsertRecord();
				break;
			}
			// select all record
			case "2": {
				SelectRecord();
				break;
			}
			// select record based on condition
			case "3": {
				SelectAllRecord();
				break;
			}
			// update record based on condition
			case "4": {
				UpdateRecord();
				break;
			}
			// delete record based on condition
			case "5": {
				DeleteRecord();
				break;
			}
			default: {
				// Exit
				System.out.println("Thank you for using! See you!");
				isRunning = false;
			}
			}
		}
		myObj.close();
	}

	// Getting User input from menu
	private static String ShowMenu() {
		System.out.println("-----Welcome to Alex's Hibernate app-----");
		System.out.println("1 -Insert a new student record");
		System.out.println("2 -Retrieve a student record based on ID");
		System.out.println("3 -Retrieve all the Employee information");
		System.out.println("4 -Update a student record based on ID");
		System.out.println("5 -Delete a student record based on ID");
		System.out.println("Any other keys - Exit");
		System.out.println("-----------------------------------------");
		System.out.println("Please enter:");
		String sRtn = "";
		if (myObj.hasNextLine())
			sRtn = myObj.nextLine();

		return sRtn;
	}

	private static void InsertRecord() {
		String sF = "", sL = "", sE = "";

		System.out.println("Insert new student:");

		System.out.print("\nFirst Name: ");
		if (myObj.hasNext())
			sF = myObj.nextLine();

		System.out.print("\nLast Name: ");
		if (myObj.hasNext())
			sL = myObj.nextLine();

		System.out.print("\nEmail: ");
		if (myObj.hasNext())
			sE = myObj.nextLine();

		db.insertEntity(sF, sL, sE);
		System.out.println("-- Record inserted! --");
	}

	private static void SelectRecord() {
		String sRtn = "";
		System.out.println("Enter an ID for searching: ");
		if (myObj.hasNext())
			sRtn = myObj.nextLine();
		db.SelectEntity(sRtn);
	}

	private static void SelectAllRecord() {
		db.SelectEntity("");
	}

	private static void UpdateRecord() {
		int iID = 0;
		System.out.println("Enter a student ID for updating: ");
		if (myObj.hasNext()) {
			iID = myObj.nextInt();
			myObj.nextLine();
		}

		String sF = "", sL = "", sE = "";

		System.out.print("\nNew First Name: ");
		if (myObj.hasNext())
			sF = myObj.nextLine();

		System.out.print("\nNew Last Name: ");
		if (myObj.hasNext())
			sL = myObj.nextLine();

		System.out.print("\nNew Email: ");
		if (myObj.hasNext())
			sE = myObj.nextLine();

		db.updateEntity(iID, sF, sL, sE);
		System.out.println("-- Record updated! --");
	}

	private static void DeleteRecord() {
		int iID = 0;
		System.out.println("Enter a student ID for removing: ");
		if (myObj.hasNext()) {
			iID = myObj.nextInt();
			myObj.nextLine();
		}

		db.removeEntity(iID);
		System.out.println("-- Record deleted! --");
	}

}
