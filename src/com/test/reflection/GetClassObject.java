package com.test.reflection;


public class GetClassObject {
    public static void main(String[] args) {
        try {
            Class<?> class1 = Class.forName("java.lang.String");
            System.out.println(class1);
            Class<?> class2 = String.class;
            System.out.println(class2);
            String str = new String();
            Class<? extends String> class3 = str.getClass();
            System.out.println(class3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
