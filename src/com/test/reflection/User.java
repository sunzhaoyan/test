package com.test.reflection;

import java.lang.reflect.Field;

@SuppressWarnings("unused")
public class User {
	private static final int age = 100;

	private User() {
	}

	static {
		try {
			Class<?> userClass = User.class;
			Field age = userClass.getDeclaredField("age");
			System.out.println(age.getInt(userClass.newInstance()));
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static class Builder {
		public User build() {
			return new User();
		}
	}

	public static void main(String[] args) {
		Builder builder = new User.Builder();
		System.out.println(builder.build());
	}
}
