package com.test.interfaces;

public interface InterfaceInnerClass {
	void print();
	int num = 10;
	
	class Test {
		public void printTest() {
			System.out.println(num);
		}
	}
}
