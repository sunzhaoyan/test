package com.test.math;

import java.math.BigDecimal;

public class TestDouble {
	public static void main(String[] args) {
		double d1 = 0.1;
		double d2 = 0.2;
		System.out.println(d1 + d2);
		
		BigDecimal b1 = new BigDecimal("0.1");
		BigDecimal b2 = new BigDecimal("0.2");
		System.out.println(b1.add(b2).doubleValue());
	}
}
