package com.test.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(10);
		list.add(1);
		System.out.println("list.size: " + list.size());
		Iterator<Integer> it = list.iterator();
		int itLen = 0;
		while (it.hasNext()) {
			it.next();
			itLen ++;
		}
		System.out.println("iterator.szie: " + itLen);
	}
}
