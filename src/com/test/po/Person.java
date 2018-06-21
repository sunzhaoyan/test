package com.test.po;

public class Person {
    /**
     * 用户唯一标识
     */
    private long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 获取 #{bare_field_comment}
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * 设置 #{bare_field_comment}
     * @param id #{bare_field_comment}
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * 获取 #{bare_field_comment}
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 #{bare_field_comment}
     * @param name #{bare_field_comment}
     */
    public void setName(String name) {
        this.name = name;
    }

    
}
