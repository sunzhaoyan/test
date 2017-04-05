package com.test.singleton;

/**
 * 静态工厂 模式 单例
 * 
 * @author szy
 * @date 2017年4月5日 上午11:03:38
 *
 */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

}
