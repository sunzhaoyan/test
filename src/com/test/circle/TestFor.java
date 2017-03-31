package com.test.circle;

public class TestFor {
	public static void main(String[] args) {
		int i = 0;
		for(;;) {
			for(; i < 10; i++) {
				System.out.println("i = " + i);
//				inner :
					System.out.println();
			}
		}
	}
}
