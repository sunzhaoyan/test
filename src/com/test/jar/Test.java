package com.test.jar;

import com.test.testJar.Runner;

public class Test {
    public static void main(String[] args) {
        boolean b = Runner.writeFile("123", "123");
        System.out.println(b);
    }
}
