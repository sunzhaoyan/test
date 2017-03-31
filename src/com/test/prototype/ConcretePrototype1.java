package com.test.prototype;

public class ConcretePrototype1 implements Prototype {
    private String name;

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1();
        prototype.setName(name);
        return prototype;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Now is the ConcretePrototype1 [name=" + name + "]";
    }

}
