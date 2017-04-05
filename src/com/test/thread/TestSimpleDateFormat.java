//package com.test.thread;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class TestSimpleDateFormat {
//	public static void main(String[] args) throws InterruptedException {
//		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
//		Date a = new Date();
//		Thread.sleep(2000);
//		Date b = new Date();
//		System.out.println(a);
//		System.out.println(b);
//		MyThread t1 = new MyThread(sdf, a, "a");
//		MyThread t2 = new MyThread(sdf, b, "b");
//		t1.start();
//		t2.start();
//	}
//}
//
//class MyThread extends Thread{
//	private SimpleDateFormat sdf;
//	private Date d;
//	
//	public MyThread(){};
//	
//	public MyThread(SimpleDateFormat sdf, Date d, String name) {
//		this.sdf = sdf;
//		this.d = d;
//		setName(name);
//	}
//	
//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread().getName() + ":" + sdf.format(d));
//	}
//	
//}
