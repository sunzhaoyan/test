package com.test.prototype;

public class ConcretePrototype2 implements Prototype {
    private String name;

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype2();
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
        return "Now is the ConcretePrototype2 [name=" + name + "]";
    }

}
