package com.test.bytes;

import org.junit.Test;

import com.test.util.FatherTest;

public class ByteTest1 extends FatherTest{
    @Test
    public void t1() throws Exception {
        byte b = 0b111;
        System.out.println(b);
    }
    
    @Test
    public void t2() throws Exception {
        long f = 1l;
        long temp = f >>> 32;
        System.out.println(temp);
        System.out.println(f ^ temp);
    }
}
