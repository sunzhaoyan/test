package com.test.enums;

public class TestEnum {
    public static void main(String[] args) {
        MyEnum ea = MyEnum.ENUM1;
        switch (ea) {
        case ENUM1:
            System.out.println(1);
            break;
        case ENUM2:
            System.out.println(2);
            break;
        default:
            System.out.println(3);
        }
    }
}
