package com.test.string;

import org.junit.Test;

/**
 * 检测StringBuilder的不同步 TODO 待完善
 * 
 * @author szy
 * @date 2017年4月5日 下午1:24:13
 *
 */
public class SBandSB {

    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder();
        Thread t1 = new Thread() {
            public void start() {
                test(sb);
            }
        };
        Thread t2 = new Thread() {
            public void start() {
                test(sb);
            }
        };
        
        t1.start();
        t2.start();
    }

    @Test
    public static void test(StringBuilder sb) {
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sb.indexOf("b"));
    }

    @Test
    public static void test2(StringBuffer sb) {
        for (int i = 0; i < 100000; i++) {
            sb.append("b");
        }
        System.out.println(sb.indexOf("a"));
    }
}
