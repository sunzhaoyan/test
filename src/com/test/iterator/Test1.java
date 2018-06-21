package com.test.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		for (int i = 0; i < 3; i++) {
			Iterator<Integer> iterator = list.iterator();
			iterator.next();
			iterator.remove();
		}
		
		System.out.println(list.size());
	}
}
