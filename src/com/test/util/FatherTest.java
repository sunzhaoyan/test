package com.test.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

public class FatherTest {
    @Rule
    public TestName testName = new TestName();
    
    @Before
    public void before() {
        System.out.println("=====> " + testName.getMethodName());
    }
    
    @After
    public void after() {
        System.out.println();
    }
}
