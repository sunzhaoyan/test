package com.test.url;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest {
	public static void main(String[] args) {
		String urStr = "http://topca.itrus.com.cn/public/itruscrl?CA=4D7D63A0240BC319DA84EF4CFC5FA56495E539AA";
		try {
			URL url = new URL(urStr);
			InputStream in = url.openStream();
			System.out.println(in);
			byte[] cbuf = new byte[2048];
			int read = 0;
			while((read = in.read(cbuf, 0, 2048)) != -1) {
				System.out.println(cbuf);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
