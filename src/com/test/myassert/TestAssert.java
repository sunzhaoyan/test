package com.test.myassert;

public class TestAssert {

    public static void main(String[] agrs) {
        int code = 12;
        selGift(code);
    }

    public static void selGift(int code) {
        try {
            assert (code >= 1 && code <= 5) : "只能传1~5";
        } catch(AssertionError ae) {
            ae.printStackTrace();
        }
        System.out.println("给你第" + code + "个");
    }
}
