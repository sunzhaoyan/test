package com.test.reg;

import java.util.regex.*;

public class TestReg1 {
	public static void main(String[] args) {
		String reg = "http:\\/\\/pan.baidu.com\\/share\\/link\\?shareid=69829562\\&amp;uk=3859809426";
		String str = "http://pan.baidu.com/share/link?shareid=69829562&amp;uk=3859809426";
		boolean b = Pattern.matches(reg, str);
		System.out.println(b);
	}
}
