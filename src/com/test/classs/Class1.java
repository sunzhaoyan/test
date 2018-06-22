package com.test.classs;

public class Class1 {
    static class Class1InnerClass {
        public void print() {
            System.out.println("Class1InnerClass.print");
        }
    }
    
    public static Class1InnerClass getClass1InnerClassInstance () {
        return new Class1.Class1InnerClass();
    }
    
    class Class1InnerClass2 {
        public void print() {
            System.out.println("Class1InnerClass2.print");
        }
    }
    
    public Class1InnerClass2 getClass1InnerClass2Instance() {
        return new Class1.Class1InnerClass2();
    }
}
