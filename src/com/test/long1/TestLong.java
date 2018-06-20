package com.test.long1;

import org.junit.Test;

import com.szy.util.FatherTest;

public class TestLong extends FatherTest {

	@Test
	public void test1() throws Exception {
		Long l1 = new Long(100);
		Long l2 = new Long(100);

		print("new Long(100) == new Long(100): ", l1 == l2);

		Long l3 = new Long(1);
		Long l4 = new Long(1);
		
		print("new Long(1) == new Long(1): ", l3 == l4);

		Long l5 = 1L;
		Long l6 = 1L;
		
		print("1L == 1L: ", l5 == l6);

		print("new Long(1) == 1L: ", l3 == l6);
	}

}
