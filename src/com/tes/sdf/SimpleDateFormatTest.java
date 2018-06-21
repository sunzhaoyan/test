package com.tes.sdf;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest implements Runnable {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    private Date date;

    @Override
    public void run() {
        synchronized (sdf) {
            System.out.println(sdf.format(date));
        }
    }
    
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        SimpleDateFormatTest formatTest = new SimpleDateFormatTest();
        formatTest.date = date;
        Thread thread = new Thread(formatTest);
        thread.start();
        
        calendar.set(2018, 05, 01);
        Date date2 = calendar.getTime();
        SimpleDateFormatTest formatTest2 = new SimpleDateFormatTest();
        formatTest2.date = date2;
        Thread thread2 = new Thread(formatTest2);
        thread2.start();
    }

}
