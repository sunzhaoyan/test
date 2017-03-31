package com.test.string;

import java.util.Arrays;

public class SplitTest {
    public static void main(String[] args) {
        String str = "a,b,c,,";
        String[] s = str.split(",");
        System.out.println(Arrays.toString(s));
        System.out.println(s.length);
    }
}
