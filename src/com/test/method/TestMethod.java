package com.test.method;

import java.lang.reflect.Method;

import org.junit.Test;

public class TestMethod {

	@Test
	public void testMethod1() throws Exception {
		User user = new User();
		System.out.println(user);
		Method setIdMethod = User.class.getMethod("setId", long.class);
		setIdMethod.invoke(user, 1l);
		System.out.println(user);
	}
}
