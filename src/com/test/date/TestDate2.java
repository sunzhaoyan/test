package com.test.date;

import java.util.Date;

public class TestDate2 {
	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now.compareTo(now));
	}
}
