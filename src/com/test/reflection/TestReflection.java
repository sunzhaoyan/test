package com.test.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) {
        Class<?> helloWorld;
        try {
            helloWorld = Class.forName("HelloWorld");
        @SuppressWarnings("rawtypes")
        Class<? extends Class> clazz = helloWorld.getClass();
            Method method = clazz.getMethod("returnStr", int.class, int.class);
            Object invoke = method.invoke(helloWorld, 10, 10000);
            System.out.println(invoke);
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
        }
    }

    @SuppressWarnings("unused")
    private static void printArray(Object arr[]) {
        System.out.println(Arrays.toString(arr));
    }
}
