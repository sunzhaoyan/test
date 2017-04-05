package com.test.thread;

public class MyThread extends Thread{
    private StringBuilder sb = new StringBuilder();
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            sb.append("a");
        }
        System.out.println(sb.length());
    }
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
    
}
