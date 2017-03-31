package com.test.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestUrl {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://tieba.baidu.com/p/4859820256?pn=34");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5 * 1000);
			conn.setRequestMethod("GET");
			InputStream stream = conn.getInputStream();
			ByteArrayOutputStream outStream = new ByteArrayOutputStream();
			byte[] buffer = new byte[1204];
			int len = 0;
			while ((len = stream.read(buffer)) != -1) {
				outStream.write(buffer, 0, len);
			}
			stream.close();
			byte[] data = outStream.toByteArray(); 
			System.out.println(new String(data));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
