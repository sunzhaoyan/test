package com.test.singleton;

public class TestSingleton {
    private TestSingleton() {
    }

    private static TestSingleton singleton = null;

    public static TestSingleton getInstance() {
        if (singleton == null) {
            singleton = new TestSingleton();
        }
        return singleton;
    }

    private static int count = 0;

    public static void setValue(int count) {
        TestSingleton.count = count;
    }

    public static int getValue() {
        return TestSingleton.count;
    }
}
