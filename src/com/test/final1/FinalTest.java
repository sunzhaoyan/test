package com.test.final1;

public class FinalTest {
	public static void main(String[] args) {
		int i = 123;
		System.out.println(i);
		setVal1(i);
		System.out.println(i);
		
		int[] a = new int[1];
		System.out.println(a[0]);
		setVal2(a);
		System.out.println(a[0]);
		
		System.out.println(a[0]);
		setVal4(a);
		System.out.println(a[0]);
		
	}
	
	public static void setVal1(int i) {
		i = 456;
	}
	
	public static void setVal2(int[] a) {
		a[0] = 456;
		a = new int[1];
	}
	
	public static void setVal3(final int i) {
		// 编译不能通过
//		i = 111;
	}
	
	public static void setVal4(final int[] a) {
		// 编译不能通过
//		a = new int[1];
		
		a[0] = 123;
	}
	
	
}
