package com.test.string;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class CertUtils {
	public static Map<String, String> getCertDn(String dnStr) {
		Map<String, String> retMap = new HashMap<String, String>();
		
		return retMap;
	}
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-zA-Z]+=\"?.+\"?, ");
		Matcher mather = p.matcher("OU=123, ");
		System.out.println(mather.group());
	}
	
	@Test
	public void test1() {
		Pattern pattern = Pattern.compile("(?:(\\d+))?\\s?([a-zA-Z]+)?.+");
		String source = "2133 fdsdee4333";
		Matcher matcher = pattern.matcher(source);
		if (matcher.matches()) {
			for (int i = 0; i <= matcher.groupCount(); i++) {
				System.out.println("group " + i + ":" + matcher.group(i));
			}
         }
	}
}
