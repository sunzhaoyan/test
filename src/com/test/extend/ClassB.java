package com.test.extend;

public class ClassB extends ClassA implements InterfaceA{

	@Override
	public void fun() {
//		super.fun();
		System.out.println(ClassB.class);
	}
	
}
