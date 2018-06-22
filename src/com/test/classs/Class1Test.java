package com.test.classs;

import com.test.classs.Class1.Class1InnerClass;
import com.test.classs.Class1.Class1InnerClass2;

public class Class1Test {
    public static void main(String[] args) {
        Class1InnerClass class1InnerClass = new Class1.Class1InnerClass();
        class1InnerClass.print();

        Class1InnerClass2 class1InnerClass2Instance = new Class1().getClass1InnerClass2Instance();
        class1InnerClass2Instance.print();
    }
}
