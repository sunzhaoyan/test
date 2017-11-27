package com.test.exception;

import org.junit.Test;

public class ExceptionTest {
	
	@Test
	public void test1() {
		try {
			int a = 1, b = 0;
			System.out.println(a / b);
		} catch(Exception e) {
			System.out.println("catch exception");
		}
		System.out.println("over");
	}
}
