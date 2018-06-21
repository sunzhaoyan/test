package com.test.syso;

public class TestSyso {
    public static void main(String[] args) {
        int a = 1;
        String b = "123";
        System.out.println(getObjStr(a, b));
    }

    public static String getObjStr(Object... obj) {
        if (obj == null) {
            return "null";
        }
        int iMax = obj.length - 1;
        if (iMax == -1) {
            return "[]";
        }
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0;; i++) {
            b.append(obj[i]);
            if (i == iMax) {
                return b.append(']').toString();
            }
            b.append(", ");
        }
    }
}
