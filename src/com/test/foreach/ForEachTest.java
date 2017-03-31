package com.test.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
//        for (String string : list) {
//            if ("2".equals(string)) {
//                list.remove(string);
//            }
//        }
        
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String temp = it.next();
            if ("1".equals(temp)) {
                it.remove();
            }
        }
        
        System.out.println(list);
    }
}
