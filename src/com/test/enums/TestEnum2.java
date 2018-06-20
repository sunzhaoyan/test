package com.test.enums;

public class TestEnum2 {
	
	public enum Jodd {
		TYPE1,
		TYPE2
	}

	public static void main(String[] args) {
		Jodd[] values = TestEnum2.Jodd.values();
		System.out.println(values.length);
	}
}
