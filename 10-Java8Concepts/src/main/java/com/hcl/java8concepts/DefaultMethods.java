package com.hcl.java8concepts;

interface DefaultMethods {
	default void DefaultPrint() {
		System.out.println("I ran the default methods here");
	}
}
