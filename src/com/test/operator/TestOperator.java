package com.test.operator;

public class TestOperator {
    public static void main(String[] args) {
        int a = 1;
        int b = ~a;
        System.out.println(Integer.toBinaryString(a) + "," + Integer.toBinaryString(b));
        System.out.println(a + "," + b);
        a &= b;
        System.out.println(a + "," + b);
        a ^= b;
        System.out.println(a + "," + b);
        
       String c = Integer.valueOf("11111111111111111111", 2).toString();
       System.out.println(c);
    }
}
