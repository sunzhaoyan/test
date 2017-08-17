package com.test.arrays;

import java.util.Arrays;

import org.junit.Test;

public class ArraysTest {

    @Test
    public void testCopyOf() {
        int[] src = { 1, 2, 3 };
        int[] desc = Arrays.copyOf(src, 4);
        print(desc);
    }

    @Test
    public void testPrint() {
        print(1, 3, 4, "123");
    }

    private void print(Object... obj) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getClass() == String[].class) {
                StringBuilder sb2 = new StringBuilder();
                Object[] oo = (Object[])obj[i];
                for (int j = 0; j < oo.length; j++) {
                    if (i < oo.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb.append(sb2);
            } else {
                sb.append(obj[i]);
            }
            if (i < obj.length - 1) {
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
    
    
    @Test
    public void testClass() {
//        int[] arr = {1, 2, 3, 0};
//        System.out.println(arr.getClass() == int[].class);
        Class<Integer> iClass = Integer.TYPE;
        System.out.println(iClass);
    }
}
