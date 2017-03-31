package com.test.reflection;

import java.util.Random;


public class HelloWorld {
    public void printStr(String str) {
        System.out.println(str);
    }

    public void printStr(String str1, String str2) {
        System.out.println(str1 + "," + str2);
    }
    
    public String returnStr(int num, int max) {
        StringBuffer bf = new StringBuffer();
        for(int i = 0; i < num; i++) {
            bf.append(new Random().nextInt(max) + 1);
            if (i < num - 1) {
                bf.append(",");
            }
        }
        return bf.toString();
    }
    
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        String str = helloWorld.returnStr(10, 1000);
        System.out.println(str);
    }
}
