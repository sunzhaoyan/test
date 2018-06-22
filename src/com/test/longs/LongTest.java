package com.test.longs;

import org.junit.Test;

import com.test.util.FatherTest;

public class LongTest extends FatherTest{

    @Test
    public void t1() throws Exception {
        long l = 1l;
        Long l2 = 1L;
        System.out.println(l2 == l);
        System.out.println(l2.equals(l));
    }
}
