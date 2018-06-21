package com.test.Integer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestInteger {
    public static void main(String[] args) {
        List<BigDecimal> list = new ArrayList<>();
        BigDecimal b = new BigDecimal(60359);
        list.add(b);
        System.out.println(Integer.parseInt(list.get(0).toString()));
    }
}
