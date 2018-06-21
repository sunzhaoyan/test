package com.test.list;

import java.util.ArrayList;
import java.util.List;

public class TestList_conf {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		boolean contains = list.contains(2);
		System.out.println(contains);
	}
}
