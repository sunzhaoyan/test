package com.test.singleton;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(TestSingleton.getValue());
        TestSingleton.setValue(123);
        System.out.println(TestSingleton.getValue());
    }
}
