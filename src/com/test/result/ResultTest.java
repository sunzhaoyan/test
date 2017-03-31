package com.test.result;

public class ResultTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(Result.TEST_ERROR_001);
        }
    }
}
