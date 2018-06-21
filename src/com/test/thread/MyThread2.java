package com.test.thread;

public class MyThread2 implements Runnable {
    public static void main(String[] args) {
        MyThread2 mt1 = new MyThread2();
        Thread t1 = new Thread(mt1);
        MyThread2 mt2 = new MyThread2();
        Thread t2 = new Thread(mt2);
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        int len = 100;
        String threadName = Thread.currentThread().getName();
        for (int i = 0; i < len; i++) {
            System.out.println(threadName + " --> " + i);
        }
    }
}
