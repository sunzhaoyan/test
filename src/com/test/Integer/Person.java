package com.test.Integer;

public class Person {
    private String name;
    private int age;
    private Object param;
    private double wages;
    private Integer a;
    private boolean flag;
    private Boolean flag2;
    private byte b1;
    private Byte b2;
    private long l1;
    private Long l2;
    private char c1;
    private Character c2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object getParam() {
        return param;
    }

    public void setParam(Object param) {
        this.param = param;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Boolean getFlag2() {
        return flag2;
    }

    public void setFlag2(Boolean flag2) {
        this.flag2 = flag2;
    }

    public byte getB1() {
        return b1;
    }

    public void setB1(byte b1) {
        this.b1 = b1;
    }

    public Byte getB2() {
        return b2;
    }

    public void setB2(Byte b2) {
        this.b2 = b2;
    }

    public long getL1() {
        return l1;
    }

    public void setL1(long l1) {
        this.l1 = l1;
    }

    public Long getL2() {
        return l2;
    }

    public void setL2(Long l2) {
        this.l2 = l2;
    }

    public char getC1() {
        return c1;
    }

    public void setC1(char c1) {
        this.c1 = c1;
    }

    public Character getC2() {
        return c2;
    }

    public void setC2(Character c2) {
        this.c2 = c2;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", param=" + param + ", wages=" + wages + ", a=" + a
                + ", flag=" + flag + ", flag2=" + flag2 + ", b1=" + b1 + ", b2=" + b2 + ", l1=" + l1 + ", l2=" + l2
                + ", c1=" + c1 + ", c2=" + c2 + "]";
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
    }
}
