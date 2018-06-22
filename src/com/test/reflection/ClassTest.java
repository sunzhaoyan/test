package com.test.reflection;

import java.lang.reflect.Method;

import org.junit.Test;

import com.test.builder.User;

public class ClassTest {
	@Test
	public void testClass() throws Exception {
		Class<User> userClazz = User.class;
		System.out.println(userClazz.getName());
		System.out.println(userClazz.getCanonicalName());
		for (Method method : userClazz.getMethods()) {
			System.out.println(method.getName() + ", " + method);
		}
	}
	
	
}
