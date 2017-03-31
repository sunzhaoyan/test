package com.test.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class TestPan {
	public static void main(String[] args) {
		String baseUrl = "http://tieba.baidu.com/p/4859820256"; 
		Integer totalPage = getTotalPage(baseUrl);
		List<String> list = new ArrayList<String>();
		for (int i = 1; i <= totalPage; i++) {
			System.out.println(i);
			 List<String> l = getPanUrls(baseUrl + "?pn=" + i);
			 list.addAll(l);
		}
		
		for (String string : list) {
			System.out.println(string);
		}
	}

	public static List<String> getPanUrls(String urlStr) {
		ArrayList<String> list = new ArrayList<String>();
		try {
			URL url = new URL(urlStr);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setConnectTimeout(5 * 1000);
			BufferedReader buff = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String reg = "\\w*http://pan.baidu.com/share/link\\?shareid=\\d*\\&amp;uk=\\d+"
					+ "|\\w*http://pan.baidu.com/s/\\w+";
			Pattern pattern = Pattern.compile(reg);
			String line = null;
			StringBuffer bf = new StringBuffer();
			while ((line = buff.readLine()) != null) {
				Matcher matcher = pattern.matcher(line);
				bf.append(line);
				while (matcher.find()) {
					list.add(matcher.group());
				}
			}
			System.out.println(bf.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static Integer getTotalPage(String urlStr) {
		Integer totalPage = 1;
		URL url;
		try {
			url = new URL(urlStr);
			URLConnection conn = url.openConnection();
			BufferedReader buff = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuffer bf = new StringBuffer();
			String str = null;
			while ((str = buff.readLine()) != null) {
				bf.append(str);
			}
			Pattern endPage = Pattern.compile("<a href=\"/p/\\w+\\?pn=\\d*\">尾页</a>");
			Matcher m = endPage.matcher(bf.toString());
			if (m.find()) {
				String tempStr = m.group();
				String tempInt = tempStr.substring(tempStr.indexOf("pn=") + 3, tempStr.lastIndexOf("\""));
				totalPage = new Integer(tempInt);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return totalPage;
	}
	
	@Test
	public void test1() {
		String baseUrl = "http://tieba.baidu.com/p/4859820256"; 
		List<String> list = new ArrayList<String>();
		List<String> l = getPanUrls(baseUrl + "?pn=" + 34);
	    list.addAll(l);
		for (String string : list) {
			System.out.println(string);
		}
	}
}