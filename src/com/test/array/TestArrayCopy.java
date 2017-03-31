package com.test.array;

import java.util.Arrays;

public class TestArrayCopy {
    public static void main(String[] args) {
        String[] strArr = { "1", "2", "3" };
        String[] strArr2 = new String[strArr.length];
//        Long[] longArr = new Long[strArr.length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        System.out.println(Arrays.toString(strArr2));
//        System.out.println(strArr==strArr2);
    }
}
