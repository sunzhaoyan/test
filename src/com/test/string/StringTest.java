package com.test.string;

import org.junit.Test;

import com.szy.util.FatherTest;

public class StringTest extends FatherTest {

	@Test
	public void test1() throws Exception {
		char[] cs = {'1', 'a'};
		reviceString(new String(cs));
	}
	
	private void reviceString(String str) {
		System.out.println(str);
	}
}
