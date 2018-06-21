package com.test.foreach;

import org.junit.Test;

import com.szy.util.FatherTest;

public class ForeachTest2 extends FatherTest {

	@Test
	public void t1() throws Exception {
		int[] nums3 = { 1, 2, 3, 4, 5 };
		for (int num : nums3) {
			System.out.println(num);
		}
		int[] nums2 = {};
		for (int num : nums2) {
			System.out.println(num);
		}

		int[] nums = null;
		for (int num : nums) {
			System.out.println(num);
		}

	}
}
