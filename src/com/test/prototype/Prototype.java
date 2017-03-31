package com.test.prototype;

public interface Prototype {
    /**
     * 克隆方法 szy 2017年3月31日 上午11:26:26
     * 
     * @return Prototype
     */
    Prototype clone();

    /**
     * 设置类名 szy 2017年3月31日 上午11:26:40 void
     */
    void setName(String name);

    /**
     * 获得类名 szy 2017年3月31日 上午11:26:54
     * 
     * @return String
     */
    String getName();
}
