package com.test.from;

import java.util.Date;

public class A {
    public String getUuid() {
        return new Date().getTime() + "";
    }
}
