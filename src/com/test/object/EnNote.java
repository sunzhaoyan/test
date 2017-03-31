package com.test.object;

public class EnNote implements Note{

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public void show() {
		System.out.println("找到了相关的note！");
	}

}
