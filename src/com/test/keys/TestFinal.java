package com.test.keys;

public class TestFinal {
	static final int a = 1 << 3;
	final int b = 123;

	public static void main(String[] args) {

		System.out.println(a);
	}

	public void test1() {
		System.out.println(a);
	}

	public final void t1() {

	}

	public void t1(int a) {
		System.out.println(b);
	}

	static abstract class Test {

	}

	abstract class Test2 {

	}

	final class Test3 {

	}

	void t4() {
	}

	static void t5() {

	}
}
