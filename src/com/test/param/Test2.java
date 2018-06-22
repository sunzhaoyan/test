package com.test.param;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int[] b = new int[1];
        String str = "a";
        setVal(a);
        System.out.println(a);
        setVal(b);
        System.out.println(b[0]);
        setVal(str);
        System.out.println(str);
    }
    
    private static void setVal(int a) {
        a = 123;
    }
    private static void setVal(int[] a) {
        a[0] = 123;
    }
    private static void setVal(String str) {
        str = "abc";
    }
}
