package com.test.try1;

public class MyAutoCloseable implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("执行关闭方法...");
	}
	
	public void doSomething() {
		System.out.println("一些操作...");
	}
	
}
