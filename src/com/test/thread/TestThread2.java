package com.test.thread;

import org.junit.Test;

public class TestThread2 {
	public static void main(String[] args) {
//		new MyThread3("A").start();
//		new MyThread3("B").start();
		//-----
//		MyThread4 t4 = new  MyThread4();
//		new Thread(t4, "A").start();
//		new Thread(t4, "B").start();
//		new Thread(t4, "C").start();
	}
	
	@Test
	public void test1() {
		new MyThread3("A").start();
		new MyThread3("B").start();
	}
	
	@Test
	public void test2() {
		MyThread4 t4 = new  MyThread4();
		new Thread(t4, "A").start();
		new Thread(t4, "B").start();
		new Thread(t4, "C").start();
	}
	
	@Test
	public void test3() {
		int a = -1;
		System.out.println(a % 2);
	}
}

class MyThread3 extends Thread{
	private int count = 5;
	public MyThread3(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "," + count--);
			try {
				Thread.sleep((int) Math.random() * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread4 implements Runnable{

	private int count = 15;
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "," + count--);
			try {
				Thread.sleep((int) Math.random() * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}