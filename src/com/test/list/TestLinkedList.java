package com.test.list;

import java.util.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.addFirst(2);
		System.out.println(ll);
		Integer element = ll.element();
		System.out.println(element);
		ll.offer(3);
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		ll.push(123);
		System.out.println(ll);
		ll.add(1, 456);
		System.out.println(ll);
	}
}
