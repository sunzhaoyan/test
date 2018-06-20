package com.test.string;

import org.junit.Test;

public class TestEqual {
	@Test
	public void test1() throws Exception {
		String str1 = "1";
		String str2 = "1";
		System.out.println(str1 == str2);

		String str3 = new String("1");
		String str4 = new String("1");
		System.out.println(str3 == str4);

		System.out.println(str1 == str3);
	}

	@Test
	public void test2() throws Exception {
		String s = "1";
		Long l = 1L;
		System.out.println(s.equals(l));
		System.out.println(l.equals(s));
	}
}
