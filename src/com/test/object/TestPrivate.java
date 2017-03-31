package com.test.object;

public class TestPrivate {
    private final String aa;

    public TestPrivate() {
        this.aa = new String();
    }

    public TestPrivate(TestPrivate str) {
        this.aa = str.aa;
    }
}