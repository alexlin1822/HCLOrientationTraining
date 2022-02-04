package com.hcl.listassignment;

import java.util.*;

/**
 * List Assignment
 *
 */
public class ListAssignment {
	public static void main(String[] args) {
		List<Employee> arrEmployees = new ArrayList<Employee>();
		arrEmployees.add(new Employee(1, "John", "Chicago"));
		arrEmployees.add(new Employee(3, "James", "Dallas"));
		arrEmployees.add(new Employee(2, "Robert", "Austin"));
		arrEmployees.add(new Employee(5, "Thomas", "Houston"));
		arrEmployees.add(new Employee(4, "Daniel", "Philadelphia"));
		arrEmployees.add(new Employee(6, "Steven", "Mesa"));

		System.out.println("--- Employees data in ArrayList ---");
		for (Employee p : arrEmployees) {
			System.out.println(p.toString());
		}
	}
}
