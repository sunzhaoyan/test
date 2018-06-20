package com.test.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		String[] strs = {"a", "b", "c"};
		List<String> list = Arrays.asList(strs);
		List<String> list2 = new ArrayList<>();
		list2.addAll(list);
		list2.add("d");
		System.out.println(list2);
	}
}
