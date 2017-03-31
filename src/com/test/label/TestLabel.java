package com.test.label;

public class TestLabel {
    public static void main(String[] args) {
        int i = 0;
        outer: for (; true;) {
            inner: for (; i < 10; i++) {
                System.out.println("i = " + i);
            }
        }
    }
}
