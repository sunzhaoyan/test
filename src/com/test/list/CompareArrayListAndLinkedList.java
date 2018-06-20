package com.test.list;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompareArrayListAndLinkedList {

	public static LinkedList<Integer> ll;

	@Before
	public void beforePrint() {
		System.out.print("before: ");
		System.out.println(ll);
	}

	@After
	public void afterPrint() {
		System.out.print("after: ");
		System.out.println(ll);
	}

	@Test
	public void init() throws Exception {
		ll = new LinkedList<>();
		System.out.println(ll);
	}

	@Test
	public void add() throws Exception {
		ll.add(1);
		System.out.println(ll);
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
	}

}
