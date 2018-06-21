package com.test.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaTest2 {
	public static void main(String[] args) {
		// list.forEach since 1.8
		List<String> list = Arrays.asList("a", "b", "c");
		list.forEach(n -> System.out.println(n));

		System.out.println("=========");

		list.forEach(System.out::println);

		list = list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());

		System.out.println("=========");

		list.forEach(System.out::println);

		list = list.stream().map(String::toLowerCase).collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println("=========");
		list.forEach(System.out::println);

	}
}
