package com.test.prototype;

public class Client {
    public static void main(String[] args) {
        try {
            Prototype prototype1 = new ConcretePrototype1();
            PrototypeManager.setPrototypr("p1", prototype1);
            
            Prototype p3 = PrototypeManager.getPrototype("p1").clone();
            p3.setName("张三");
            System.out.println("第一个原型：" + p3);

            ConcretePrototype2 prototype2 = new ConcretePrototype2();
            // 切换原型的注册
            PrototypeManager.setPrototypr("p1", prototype2);
            Prototype p4 = PrototypeManager.getPrototype("p1").clone();
            p4.setName("李四");
            System.out.println("第二个原型：" + p4);
            
            PrototypeManager.removePrototype("p1");
            Prototype p5 = PrototypeManager.getPrototype("p1");
            p4.setName("王五");
            System.out.println("第三个原型：" + p5);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
