package com.test.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public static void main(String[] args) {
		Date date = new Date();
		String formatDate = formatDate(date);
		System.out.println(date);
		System.out.println(formatDate);
	}
	
	private static String formatDate(Date date) {
		return sdf.format(date);
	}
}
