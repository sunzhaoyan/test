package com.test.pattern;

/**
 * 双重校验锁 jdk1.5之后
 * 
 * @author szy
 * @date 2016年9月29日 下午1:42:57
 *
 */
public class Singleton {
	private volatile static Singleton singleton;
	private Singleton(){}
	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized(Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
