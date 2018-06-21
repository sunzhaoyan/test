package com.test.from;


import org.junit.Test;

import junit.framework.TestCase;

public class ATest {
    
    @Test
    public void t1() throws Exception {
        A a = new AA();
        String uuid = a.getUuid();
        System.out.println(uuid);
        TestCase.assertNotNull(uuid);
    }
}
