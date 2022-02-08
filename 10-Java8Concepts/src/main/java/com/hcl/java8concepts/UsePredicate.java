package com.hcl.java8concepts;

import java.util.function.Predicate;

public class UsePredicate {

	public UsePredicate() {
	}

	static public void isPositivePredicate(int i) {
		System.out.println("Enter number: " + i);
		Predicate<Integer> isPositive = k -> (i > 0);
		System.out.println(isPositive.test(i));
	}

}
