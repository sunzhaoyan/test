package com.test.builder;

public class Test {
    public static void main(String[] args) {
        User user = new User.Bulider("szy", "123").age(24).sex("male").address("Shenzhen").build();
        System.out.println(user);
    }
}
