package com.hcl.listassignment;

public class Employee {
	private int gEmployeeid;
	private String gEmployeeName, gCity;

	public Employee(int employeeid, String employeeName, String city) {
		gEmployeeid = employeeid;
		gEmployeeName = employeeName;
		gCity = city;
	}

	public int getID() {
		return gEmployeeid;
	}

	public String getCity() {
		return gCity;
	}

	public String getName() {
		return gEmployeeName;
	}

	public String toString() {
		return getID() + " " + getName() + " " + getCity();
	}

}
