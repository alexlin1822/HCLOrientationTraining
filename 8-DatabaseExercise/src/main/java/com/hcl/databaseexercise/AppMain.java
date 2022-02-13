package com.hcl.databaseexercise;

import java.sql.Date;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.hcl.databaseexercise.utility.DBHandling;
import com.hcl.databaseexercise.utility.Employee;

public class AppMain {

	private static Scanner myObj = new Scanner(System.in);
	private static DBHandling db = new DBHandling();
	private static final Logger logger = LogManager.getLogger(AppMain.class);

	public static void main(String[] args) {
		// Connect database

		logger.debug("Connecting database and table...");

		// Create table and initial sample data
		if (!db.initTable().equals("OK")) {
			System.out.println("Can not create table! App exit!");
			logger.fatal("Can not create table! App exit!");
			return;
		}

		boolean isRunning = true;

		logger.trace("Menu showing");

		while (isRunning) {
			logger.info("waiting to user enter...");
			// User input
			String sRtn = showCLI();

			switch (sRtn) {
			// insert record
			case "1": {
				insertRecord();
				break;
			}
			// select all record
			case "2": {
				selectAllRecord();
				break;
			}
			// select record based on condition
			case "3": {
				selectRecord();
				break;
			}
			// update record based on condition
			case "4": {
				updateRecord();
				break;
			}
			// delete record based on condition
			case "5": {
				removeRecord();
				break;
			}
			default: {
				System.out.println("Thank you for using! See you!");
				isRunning = false;
			}
			}

		}

		myObj.close();

	}

	private static String showCLI() {
		System.out.println("-----Welcome to Database sample app-----");
		System.out.println("1 -Insert the record in Employee DB input through command line arguments");
		System.out.println("2 -Retrieve all the Employee information");
		System.out.println("3 -Retrieve any employee record input given through command line arguments");
		System.out.println("4 -Update any particular employee record input given through command line arguments");
		System.out.println("5 -Delete any particular employee record input given through command line arguments");
		System.out.println("Any other keys - Exit");
		System.out.println("-----------------------------------------");
		System.out.println("Please enter:");

		return myObj.nextLine();
	}

	private static void insertRecord() {
		Employee rc = new Employee();

		System.out.println("Insert new employee:");

		System.out.print("\nEmployee Name: ");
		String sRtn = myObj.nextLine();
		rc.setEmpName(sRtn);

		System.out.print("\nEmployee DOB: ");
		sRtn = myObj.nextLine();
		rc.setDOB(Date.valueOf(sRtn));

		System.out.print("\nSalary: ");
		sRtn = myObj.nextLine();
		rc.setSalary(Double.valueOf(sRtn));

		System.out.print("\nAge: ");
		sRtn = myObj.nextLine();
		rc.setAge(Integer.valueOf(sRtn));

		db.insertRecord(rc);
	}

	private static void selectAllRecord() {
		db.selectRecord("");
	}

	private static void selectRecord() {
		System.out.println("Acceptable conditions: EmpID, EmpName, DOB, Salary, Age.");
		System.out.println("Enter your condition for searching: ");
		String sRtn = myObj.nextLine();
		db.selectRecord(sRtn);
	}

	private static void updateRecord() {
		System.out.println("Acceptable parameters: EmpID, EmpName, DOB, Salary, Age.");
		System.out.println("Enter your field and value for updating: ");
		String sRtn = myObj.nextLine();
		System.out.println("Acceptable conditions: EmpID, EmpName, DOB, Salary, Age.");
		System.out.println("Enter your condition for updating: ");
		String sRtn1 = myObj.nextLine();
		db.updateRecord(sRtn, sRtn1);
	}

	private static void removeRecord() {
		System.out.println("Acceptable conditions: EmpID, EmpName, DOB, Salary, Age.");
		System.out.println("Enter your condition for Deleteing: ");
		String sRtn = myObj.nextLine();
		db.deleteRecord(sRtn);
	}

}
