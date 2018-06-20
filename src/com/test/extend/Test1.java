package com.test.extend;

public class Test1 {
	public static void main(String[] args) {
		ClassA c1 = new ClassB();
		c1.fun();
		ClassB c2 = new ClassB();
		c2.fun();
		
		ClassA c3 = (ClassA) new ClassB();
		c3.fun();
		
		ClassA c4 = new ClassA();
		c4.fun();
		
		InterfaceA a1 = new ClassA();
		a1.fun();
		InterfaceA a2 = new ClassB();
		a2.fun();
	}
}
