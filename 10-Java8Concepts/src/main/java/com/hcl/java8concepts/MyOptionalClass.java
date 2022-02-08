package com.hcl.java8concepts;

import java.util.*;

public class MyOptionalClass {

	static public void RunMyOptionalClass() {
		String name = null;
		Optional<String> opt = Optional.ofNullable(name);
		if (!opt.isPresent())
			System.out.println("It used Optional class and the null string is not present");
	}

}
