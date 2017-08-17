package com.test.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer integer = it.next();
            if(2 == integer) {
                it.remove();
            }
        }
        for (int i : list) {
            System.out.println(i);
        }
    }
}
