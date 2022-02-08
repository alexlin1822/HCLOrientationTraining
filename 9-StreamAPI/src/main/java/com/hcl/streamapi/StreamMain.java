package com.hcl.streamapi;

import java.sql.Date;
import java.util.*;

public class StreamMain {
	static List<Employee> le;

	public static void main(String[] args) {
		le = new ArrayList<Employee>();

		System.out.println("----- Original Data ------");
		InitData();
		System.out.println("\nThe employee records whose salary >1000 $ ,Name Startes with B & D and age > 30 .");
		System.out.println("\n--- Used StreamAPI filter:");
		useStreamAPI();
		System.out.println("\n--- Did not use StreamAPI filter:");
		NoStreamAPI();
	}

	// Original Data
	public static void InitData() {
		le.add(new Employee(1, "Liam", Date.valueOf("1995-03-04"), 30000.00, 26));
		le.add(new Employee(2, "Oliver", Date.valueOf("1997-03-04"), 54300.00, 24));
		le.add(new Employee(3, "James", Date.valueOf("1996-03-24"), 25000.00, 25));
		le.add(new Employee(4, "Bryan", Date.valueOf("1990-12-24"), 45000.00, 31));
		le.add(new Employee(5, "Daniel", Date.valueOf("1989-12-24"), 65000.00, 32));

		System.out.println("EmpID   EmpName     DOB         Salary    	Age");
		le.stream().map(pm -> pm.toString()).forEach(System.out::println);
		System.out.println("--- End ---");
		;
	}

	// Used StreamAPI filter
	public static void useStreamAPI() {
		System.out.println("EmpID   EmpName     DOB         Salary    	Age");
		le.stream().filter(p -> p.getSalary() > 1000 && Arrays.asList("B", "D").contains(p.getEmpName().substring(0, 1))
				&& p.getAge() > 30).map(pm -> pm.toString()).forEach(System.out::println);
		System.out.println("--- End ---");
	}

	// Use String function
	public static void NoStreamAPI() {
		System.out.println("EmpID   EmpName     DOB         Salary    	Age");
		for (Employee l1 : le) {
			if (l1.getSalary() > 1000 && Arrays.asList("B", "D").contains(l1.getEmpName().substring(0, 1))
					&& l1.getAge() > 30) {
				System.out.println(l1.toString());
			}
		}
		System.out.println("--- End ---");
	}
}
