package com.test.array;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTest1 extends TestArrayCopy{
	public static void main(String [] args) {
		
	}
	
	@Test
	public void test1() {
		char [] chs = new char[10];
		System.out.println((char)chs[0] + "123");
	}
	
	@Test
	public void test2() {
		Integer [][] ins = {{1,2,3}, {3,2,1}, {2,1,3}};
		System.out.println(Arrays.deepToString(ins));
	}
	
//	@Test
//	public void test3() {
//		String args = "abc";
//		String[] args2 = new String[args];
//		System.arraycopy(args, 0, args2, 0, args.length);
//		args2[args.length] = args;
//	}
}
