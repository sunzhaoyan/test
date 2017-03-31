package com.test.foreach;

public class TestForeach {
    public static void main(String[] args) {
        int a = 0;
        while (a < 100) {
            runFor();
            a++;
        }
    }

    private static void runFor() {
        int[] is = new int[100];
        double num = 1d;
        long time1 = System.nanoTime();
        for (@SuppressWarnings("unused")
        int i : is) {
            num += num;
        }
        long time2 = System.nanoTime();
        long foreach = time2 - time1;
        num = 1d;
        long time3 = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            num += num;
        }
        long time4 = System.nanoTime();
        long fori = time4 - time3;
        System.out.println(foreach + "," + fori + "," + (foreach >= fori));
    }
}
