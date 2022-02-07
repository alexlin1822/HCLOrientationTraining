package com.hcl.databaseexercise;

import java.util.*;

public class Employee {
	private int gEmployeeid, gAge;
	private String gEmployeeName;
	private Date gDOB;
	private double gSalary;

	public Employee(int employeeid, String employeeName, Date dob, double salary, int age) {
		gEmployeeid = employeeid;
		gEmployeeName = employeeName;
		gDOB = dob;
		gSalary = salary;
		gAge = age;
	}

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

}
