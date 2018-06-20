package com.test.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestMap3 {
	public static void main(String[] args) {
		Map<Object, Object> om = new HashMap<>();
		om.put(null, null);
		System.out.println(om.get(null));
		
		Map<Object, Object> ot = new Hashtable<>();
		ot.put(null, null);
		System.out.println(ot.get(null));
	}
}
