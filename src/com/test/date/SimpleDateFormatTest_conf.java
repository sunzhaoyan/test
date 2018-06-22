package com.test.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest_conf implements Runnable{

    private Date now;
    private int sleep;
    private SimpleDateFormat sdf;
    SimpleDateFormatTest_conf(Date now, int sleep, SimpleDateFormat sdf) {
        this.now = now;
        this.sleep = sleep;
        this.sdf = sdf;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(sleep * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String info = Thread.currentThread().getName() + " -- " + sdf.format(now);
        System.out.println(info);
    }
    
    
    public static void main(String[] args) {
        Date d1 = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(d1);
        cal.add(Calendar.DATE, 1);
        Date d2 = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println(d1);
        System.out.println(d2);
        Thread t1 = new Thread(new SimpleDateFormatTest_conf(d1, 0, sdf));
        Thread t2 = new Thread(new SimpleDateFormatTest_conf(d2, 0, sdf));
        t1.start();
        t2.start();
    }
    
}
