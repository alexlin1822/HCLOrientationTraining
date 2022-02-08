package com.hcl.java8concepts;

import java.util.function.BiFunction;

public class UseBiFunction {

	public UseBiFunction() {

	}

	static public void MultiplicationFunction(int a, int b) {
		BiFunction<Integer, Integer, Integer> func = (aa, bb) -> aa * bb;
		System.out.println(a + " X " + b + " = " + func.apply(a, b));
	}

}
