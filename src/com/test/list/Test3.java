package com.test.list;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(4);
		list.add(1);
		list.remove(0);
		list.addAll(null);
		System.out.println(list.size());

		ArrayList<Integer> al = new ArrayList<>(11);
		al.trimToSize();
		System.out.println(al);

	}
}
