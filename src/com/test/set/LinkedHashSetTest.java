package com.test.set;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.test.util.FatherTest;

public class LinkedHashSetTest extends FatherTest{
    
   /* @Test
    public void testHashSet() throws Exception {
        Set<String> hashSet = new HashSet<>();
        int n = 0;
        while (n < 1000) {
            hashSet.add(n + "");
            n++;
        }
        for (String str : hashSet) {
            System.out.println(str);
        }
    }*/
    public static void main(String[] args) {
        String s1 = "adsd";
        String s2 = new String("adsd");
        int a1 = s1.hashCode();
        int a2 = s2.hashCode();
        System.out.println(a1);
        System.out.println(a2); 
    }
}
