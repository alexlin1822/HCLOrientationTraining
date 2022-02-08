package com.hcl.databaseexercise;

import java.util.*;

public class Employee {
	private int gEmployeeid, gAge;
	private String gEmployeeName;
	private Date gDOB;
	private double gSalary;

	public Employee() {
	}

	public Employee(int employeeid, String employeeName, Date dob, double salary, int age) {
		SetData(employeeid, employeeName, dob, salary, age);
	}

	// Store employee data
	public void SetData(int employeeid, String employeeName, Date dob, double salary, int age) {
		gEmployeeid = employeeid;
		gEmployeeName = employeeName;
		gDOB = dob;
		gSalary = salary;
		gAge = age;
	}

	// Get data functions
	public int getEmpID() {
		return gEmployeeid;
	}

	public String getEmpName() {
		return gEmployeeName;
	}

	public Date getDOB() {
		return gDOB;
	}

	public double getSalary() {
		return gSalary;
	}

	public int getAge() {
		return gAge;
	}

	public String toString() {
		return getEmpID() + " " + getEmpName() + " " + getDOB() + " " + getAge() + " " + getSalary();
	}

	// Set data functions
	public void setEmpID(int employeeid) {
		gEmployeeid = employeeid;
	}

	public void setEmpName(String employeeName) {
		gEmployeeName = employeeName;
	}

	public void setDOB(Date dob) {
		gDOB = dob;
	}

	public void setSalary(double salary) {
		gSalary = salary;
	}

	public void setAge(int age) {
		gAge = age;
	}
}
