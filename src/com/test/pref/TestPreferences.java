package com.test.pref;

import java.lang.reflect.Method;
import java.util.prefs.Preferences;

public class TestPreferences {
	public static void main(String[] args) throws Exception {
		Preferences userRoot = Preferences.userRoot();
		Class<? extends Preferences> userClass = userRoot.getClass();
		String name = userClass.getName();
		Method[] methods = userClass.getMethods();
		System.out.println(name);
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}
}
