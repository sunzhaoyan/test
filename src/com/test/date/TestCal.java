package com.test.date;

import java.util.Calendar;

import org.junit.Test;

public class TestCal {
	
	@Test
	public void test() {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		calendar.add(Calendar.DATE, 21);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.MONTH, -1);
		System.out.println(calendar.getTime());
	}
}
