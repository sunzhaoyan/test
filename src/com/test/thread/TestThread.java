package com.test.thread;

public class TestThread {
	public static void main(String[] args) {
//		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
//		for (StackTraceElement ste : stackTrace) {
//			System.out.println(ste);
//		}
		
		class MyThread implements Runnable{

			@Override
			public void run() {
				System.out.println("MyThread run ...");
			}
			
		}
		
		Thread t = new Thread(new MyThread());
		t.start();
	}
	
	
}
