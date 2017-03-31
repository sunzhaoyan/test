package com.test.arrays;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestArrays {
    @Test
    public void testAsList() {
        List<String> list = Arrays.asList("1", "2", "3");
        System.out.println(list);
    }
}
