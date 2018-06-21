package com.test.param;

public class Test1 {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(n);
        setVal(n);
        System.out.println(n);
    }
    
    private static void setVal(int n) {
        n = (int) Math.pow(n, 2);
        System.out.println(n);
    }
}
