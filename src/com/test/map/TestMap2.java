package com.test.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestMap2 {
	public static void main(String[] args) {
		List<Obj> list = new ArrayList<>();
		Obj obj1 = new Obj();
		obj1.setName("a");
		obj1.setRoleName("admin");
		Obj obj11 = new Obj();
		obj11.setName("a");
		obj11.setRoleName("admin2");
		Obj obj2 = new Obj();
		obj2.setName("b");
		obj2.setRoleName("user");
		
		list.add(obj1);
		list.add(obj11);
		list.add(obj2);
		
		HashMap<String, List<Obj>> map = new HashMap<>();
		for (Obj o : list) {
			String key = o.getName();
			List<Obj> l = map.get(key);
			if (l == null) {
				l = new ArrayList<>();
			}
			l.add(o);
			map.put(key, l);
		}
		
		System.out.println(map.size());
		
		System.out.println(map.get("c"));
		System.out.println(map.get("a"));
	}
	
}
