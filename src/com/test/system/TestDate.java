package com.test.system;

import java.util.Calendar;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		System.out.println(System.nanoTime());
		System.out.println(Calendar.getInstance().getTimeInMillis());
		System.out.println(new Date().getTime());
		System.out.println(System.currentTimeMillis());
	}
}
