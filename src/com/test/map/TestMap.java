package com.test.map;

import java.util.Map;

import com.szy.util.MapUtil;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Object> map = MapUtil.newInstance();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        System.out.println(map);
    }
}
