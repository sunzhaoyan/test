package com.test.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>(){
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}
		
	};
	
	public static void main(String[] args) {
		Date now = new Date();
		DateFormat format = df.get();
		System.out.println(format.format(now));
	}
}
