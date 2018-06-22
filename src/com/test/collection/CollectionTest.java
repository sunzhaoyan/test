package com.test.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class CollectionTest {
    private static final char[] az = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?',
            '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    @Test
    public void testList() {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < az.length; i++) {
            list.add(az[i]);
        }

        System.out.println(list);
//        boolean ordered = true;
//        for (int j = 0; j < list.size() - 1; j++) {
//            if (list.get(j) > list.get(j + 1)) {
//                System.out.println(list.get(j) + ", " + list.get(j + 1));
//                ordered = false;
//                break;
//            }
//        }
//
//        if (ordered) {
//            System.out.println("ArrayList 是有序的.");
//        } else {
//            System.out.println("ArrayList 是无序的.");
//        }
    }

    @Test
    public void testSet() {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < az.length; i++) {
            set.add(az[i]);
        }

        System.out.println(set);
//        boolean ordered = true;
//        int perv = 0;
//        Iterator<Integer> it = set.iterator();
//        while (it.hasNext()) {
//            Integer next = it.next();
//            System.out.println("prev: " + perv + ", next: " + next);
//            if (perv > next) {
//                System.out.println("prev: " + perv + ", next: " + next);
//                ordered = false;
//                break;
//            }
//            perv = next;
//
//        }
//
//        if (ordered) {
//            System.out.println("HashSet 是有序的.");
//        } else {
//            System.out.println("HashSet 是无序的.");
//        }
    }
}
