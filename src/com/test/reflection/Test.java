package com.test.reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        try {
            Test test = Test.class.newInstance();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            Integer a = Integer.valueOf(br.readLine());
            Integer b = Integer.valueOf(br.readLine());
            Method method = Test.class.getDeclaredMethod(s, int.class, int.class);
            System.out.println("Test." + method.getName() + "(" + a + ", " + b + ")");
            Object invoke = method.invoke(test, a, b);
            System.out.println(invoke);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    public void show1() {
        System.out.println("show1");
    }

    public void show2() {
        System.out.println("show2");
    }

    public Integer print(int a, int b) {
        System.out.println("a=" + a + ", b=" + b);
        return a + b;
    }

    @org.junit.Test
    public void test() {
        try {
            Class<?> testClass = Class.forName("com.test.reflection.Test");
            Method m = testClass.getDeclaredMethod("print", int.class, int.class);
            Object invoke = m.invoke(testClass.newInstance(), 1, 2);
            System.out.println(invoke);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
