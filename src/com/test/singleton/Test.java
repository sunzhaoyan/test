package com.test.singleton;

public class Test {
    public static void main(String[] args) {
        EasySingleton easySingleton = EasySingleton.INSTANCE;
        easySingleton.doSomething();
    }
}
