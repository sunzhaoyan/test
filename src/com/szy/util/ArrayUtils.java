package com.szy.util;

public class ArrayUtils {

	private static final int DEFAULT_LENGTH = 10;

	private static final int DEFAULT_RANGE = 100;

	public static int[] randomIntArray(int length, int range) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			int temp = (int) (Math.random() * range + 1);
			array[i] = temp;
		}
		return array;
	}

	public static int[] randomIntArray(int length) {
		return randomIntArray(length, DEFAULT_RANGE);
	}

	public static int[] randomIntArray() {
		return randomIntArray(DEFAULT_LENGTH, DEFAULT_RANGE);
	}

	public static int[] sortIntArray(int length) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = i;
		}
		return array;
	}

	public static int[] sortIntArray() {
		return sortIntArray(DEFAULT_LENGTH);
	}

}
