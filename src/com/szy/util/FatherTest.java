package com.szy.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

public class FatherTest {
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void before() {
		System.out.println("start :=====> " + testName.getMethodName());
	}

	@After
	public void after() {
		System.out.println("end :=====> " + testName.getMethodName());
	}

	protected void print(Object... values) {
		if (values != null && values.length == 0) {
			return;
		}
		for (Object obj : values) {
			System.out.print(obj);
		}
		System.out.println();
	}
}
