package com.test.bool;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBoolean2 {
	
	@Test
	public void test1() {
		Boolean b1 = new Boolean(false);
		System.out.println(false == b1);
		assertEquals(false, b1);
	}
}
