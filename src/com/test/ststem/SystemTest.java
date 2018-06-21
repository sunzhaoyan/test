package com.test.ststem;

import java.util.Enumeration;
import java.util.Properties;

import org.junit.Test;

import junit.framework.TestCase;

public class SystemTest {

	@Test
	public void testProperty() {
		String tempDir = System.getProperty("java.io.tmpdir");
		System.out.println(tempDir);
		Properties properties = System.getProperties();
		Enumeration<?> propertyNames = properties.propertyNames();
		while(propertyNames.hasMoreElements()) {
			System.out.println(propertyNames.nextElement());
		}
//		file.separator
		TestCase.assertNotNull(tempDir);
	}
}
