package com.test.singleton;

public enum EasySingleton {
    INSTANCE;
    public void doSomething() {
        System.out.println(Thread.currentThread().getName() + "-" + INSTANCE);
    }
}
