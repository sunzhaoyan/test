package com.test.lambda;

public interface FunIntreface3 {
	void fun();
	
	default void print() {
		System.out.println("FunIterface3.print.default.print");
	}
}
