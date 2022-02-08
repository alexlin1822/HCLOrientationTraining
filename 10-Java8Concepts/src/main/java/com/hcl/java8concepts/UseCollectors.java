package com.hcl.java8concepts;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseCollectors {

	public UseCollectors() {
	}

	public void RunCollector() {
		System.out.println("Data in List:");
		List<String> ll = Arrays.asList("Apple", "Boy", "Cat", "Dog");
		ll.stream().forEach(System.out::println);

		System.out.println("Print data and length after using collector changed to map:");

		Map<String, Double> map = ll.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.summingDouble(String::length)));
		System.out.println(map);
	}

}
