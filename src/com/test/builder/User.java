package com.test.builder;

@SuppressWarnings("unused")
public class User {
    private final String name;
    private final String password;
    private final int age;
    private final String sex;
    private final String address;

    public static class Bulider {
        // 一定要赋值的字段
        private final String name;
        private final String password;

        // 选择性赋值的字段
        private int age;
        private String sex;
        private String address;

        public Bulider(String name, String password) {
            this.name = name;
            this.password = password;
        }

        public Bulider age(int age) {
            this.age = age;
            return this;
        }

        public Bulider sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Bulider address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    private User(com.test.builder.User.Bulider bulider) {
        this.name = bulider.name;
        this.password = bulider.password;
        this.age = bulider.age;
        this.sex = bulider.sex;
        this.address = bulider.address;
    }
}
