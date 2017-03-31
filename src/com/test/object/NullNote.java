package com.test.object;

public class NullNote implements Note {

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public void show() {
		System.out.println("没有找到相关的note!");
	}

}
