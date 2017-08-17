package com.test.equals;

import java.awt.Color;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(0, 0);
        ColorPoint cp = new ColorPoint(0, 0, Color.BLACK);
        System.out.println(p.equals(cp));
        System.out.println(cp.equals(p));
        System.out.println(p.equals(p));
        System.out.println(cp.equals(cp));
    }

    @org.junit.Test
    public void testDate() {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        System.out.println(date.getTime());
        System.out.println(timestamp.getTime());
        System.out.println(date.equals(timestamp));
        System.out.println(timestamp.equals(date));
        System.out.println(date.hashCode());
        System.out.println(timestamp.hashCode());
    }

    @org.junit.Test
    public void testNull() {
        System.out.println(null instanceof Object);
    }

    @org.junit.Test
    public void testString() {
        String str = new String("abc");
        System.out.println(str.hashCode());
    }

    @org.junit.Test
    public void testMap() {
        Map<Point, Integer> map = new HashMap<>();
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        map.put(p1, 1);
        Integer i = map.get(p2);
        System.out.println(i);
    }

    @org.junit.Test
    public void testMap2() {
        Map<Point, Integer> map = new HashMap<>();
        Point p = new Point(0, 0);
        map.put(p, 1);
        Integer i = map.get(p);
        System.out.println(i);
    }
}
