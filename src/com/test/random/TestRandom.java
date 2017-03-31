package com.test.random;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10));
    }
}
