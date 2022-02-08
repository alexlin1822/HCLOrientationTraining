package com.hcl.databaseexercise;

import java.sql.Date;
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
			System.out.println("4 -Update any particular employee record input given through command line arguments");
			System.out.println("5 -Delete any particular employee record input given through command line arguments");
			System.out.println("Any other keys - Exit");
			System.out.println("-----------------------------------------");
			System.out.println("Please enter:");
			String sRtn = myObj.nextLine();

			switch (sRtn) {
			// insert record
			case "1": {
				Employee rc = new Employee();

				System.out.println("Insert new employee:");

				System.out.print("\nEmployee Name: ");
				sRtn = myObj.nextLine();
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
				break;
			}
			// select all record
			case "2": {
				db.selectRecord("");
				break;
			}
			// select record based on condition
			case "3": {
				System.out.println("Acceptable conditions: EmpID, EmpName, DOB, Salary, Age.");
				System.out.println("Enter your condition for searching: ");
				sRtn = myObj.nextLine();
				db.selectRecord(sRtn);
				break;
			}
			// update record based on condition
			case "4": {
				System.out.println("Acceptable parameters: EmpID, EmpName, DOB, Salary, Age.");
				System.out.println("Enter your field and value for updating: ");
				sRtn = myObj.nextLine();
				System.out.println("Acceptable conditions: EmpID, EmpName, DOB, Salary, Age.");
				System.out.println("Enter your condition for updating: ");
				String sRtn1 = myObj.nextLine();
				db.updateRecord(sRtn, sRtn1);
				break;
			}
			// delete record based on condition
			case "5": {
				System.out.println("Acceptable conditions: EmpID, EmpName, DOB, Salary, Age.");
				System.out.println("Enter your condition for Deleteing: ");
				sRtn = myObj.nextLine();
				db.deleteRecord(sRtn);
				break;
			}
			default: {
				System.out.println("Thank you for using! See you!");
				return;
			}
			}

		}

		myObj.close();

	}

}
