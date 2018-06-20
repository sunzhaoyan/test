package com.test.arrays;

import java.util.Arrays;

import com.szy.util.ArrayUtils;

public class TestArrays1 {
	public static void main(String[] args) {
		int[] array = ArrayUtils.sortIntArray();
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(Arrays.copyOf(array, 6)));
	}
}
