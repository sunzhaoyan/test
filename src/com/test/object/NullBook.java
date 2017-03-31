package com.test.object;

public class NullBook implements Book {

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public void show() {
		System.out.println("没找到符合要求的图书");
	}

}
