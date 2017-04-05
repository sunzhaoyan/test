package com.test.singleton;

/**
 * 单例模式 双重检查锁
 * 
 * @author szy
 * @date 2017年4月5日 上午10:38:02
 *
 */
public class DoubleCheckedLockingSingleton {
    private DoubleCheckedLockingSingleton() {
    };

    private volatile DoubleCheckedLockingSingleton instance;

    public DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
