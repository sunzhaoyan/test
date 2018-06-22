//package com.test.thread;
//
//public class TestThread1 {
//	public static void main(String [] args) {
//		for (int i = 0; i < 100; i++) {
//			MyThread2 t = new MyThread2(i);
//			Thread a = new Thread(t);
//			a.start();
//		}
//	}
//}
//
//class MyThread2 implements Runnable {
//	private int i;
//	public MyThread2(int i) {
//		System.out.println("init");
//		this.i = i;
//	}
//	
//	@Override
//	public void run() {
//		System.out.println("run" + "," + i);
//		Thread.yield();
//		System.out.println("run" + "," + i);
//		Thread.yield();
//		System.out.println("run" + "," + i);
//		Thread.yield();
//		return;
//	}
//}
