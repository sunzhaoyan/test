package com.szy.util;

import java.util.Random;

public class IntegerUtil {

	private int begin = 0;
	private int end = 0;

	public IntegerUtil(int begin, int end) {
		this.begin = begin;
		this.end = end;
	}

	/**
	 * 获得一个begin到end的随机的int类型数字
	 * szy
	 * 2016年12月27日 下午5:04:30
	 * @return
	 * int
	 */
	public int getRandomInt() {
		int ret = 0;
		ret = new Random().nextInt(end) + begin;
		return ret;
	}
	
}
