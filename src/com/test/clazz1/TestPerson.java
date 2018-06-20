package com.test.clazz1;

import com.test.clazz.Person;

public class TestPerson {
	
	public static void main(String[] args) {
		new Person(){
			public void sayHello() {
				System.out.println("Hello World!");
			}
		}.sayHello();
	}
}
