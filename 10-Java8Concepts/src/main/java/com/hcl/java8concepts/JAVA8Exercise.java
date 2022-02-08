package com.hcl.java8concepts;

import java.sql.Date;
import java.util.*;

public class JAVA8Exercise {
	static List<Employee> le;

	public static void main(String[] args) {
		le = new ArrayList<Employee>();

		// Lambda expressions
		System.out.println("-- 1. Lambda expressions: Used lambda to calculate (a+b)/2");
		System.out.println("-- a=5 and b=9");
		Lambda lf = (int a, int b) -> (a + b) / 2;

		System.out.println("Called LambdaFunction and the answer is " + lf.LambdaFunction(5, 9));

		System.out.println("\n-- 2. Call Method Reference");
		InterFaceForMethodReference im = MyMethodReference::RunMethodReference;
		im.run();

		System.out.println("\n-- 3. Call Functional interfaces");
		MyFunctionalInterface mfi = () -> System.out.println("I used functional interfaces!");
		mfi.TestFunctionalInterface();

		System.out.println("\n-- 4. Use Stream API to list data");
		InitData();

		System.out.println("\n-- 5. Call Default methods ");
		MyDefaultMethods mdm = new MyDefaultMethods();
		mdm.DefaultPrint();

		System.out.println("\n-- 6. Call Static Methods In Interface");
		MyStaticMethodsInInterface.RunMyStaticMethodsInInterface();

		System.out.println("\n --7. Used Optional class with a null string");
		MyOptionalClass.RunMyOptionalClass();

		System.out.println("\n --8. Used Collectors class");
		UseCollectors uc=new UseCollectors();
		uc.RunCollector();
		
		System.out.println("\n-- 9. Use ForEach() method to print a arraylist");
		useStreamForEach();
		
		System.out.println("\n-- 10. Use Predicated with a number 10 to check if it is a positive number");
		UsePredicate.isPositivePredicate(10);
		
		System.out.println("\n-- 11. Use Multiplication BiFunction to calculate:");
		UseBiFunction.MultiplicationFunction(5,6);

	}

	// Original Data
	public static void InitData() {
		le.add(new Employee(1, "Liam", Date.valueOf("1995-03-04"), 30000.00, 26));
		le.add(new Employee(2, "Oliver", Date.valueOf("1997-03-04"), 54300.00, 24));
		le.add(new Employee(3, "Daniel", Date.valueOf("1989-12-24"), 65000.00, 32));

		System.out.println("EmpID   EmpName     DOB         Salary    	Age");
		// Used forEach
		le.stream().filter(p -> p.getSalary() < 40000).map(pm -> pm.toString()).forEach(System.out::println);
		System.out.println("--- End ---");

		System.out.println("--- Use parallel Stream to list data---");
		le.parallelStream().filter(p -> p.getSalary() < 40000).map(pm -> pm.toString()).forEach(System.out::println);
		System.out.println("--- End ---");

	}

	// Used StreamAPI filter
	public static void useStreamForEach() {
		System.out.println("EmpID   EmpName     DOB         Salary    	Age");
		le.stream().map(pm -> pm.toString()).forEach(System.out::println);
		System.out.println("--- End ---");
	}
	
}

class MyDefaultMethods implements DefaultMethods {
	public void MyDefaultMethodsPrint() {
		DefaultMethods.super.DefaultPrint();
	}
}
