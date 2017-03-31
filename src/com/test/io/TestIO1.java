package com.test.io;

import java.io.*;

public class TestIO1 {
	public static void main(String[] args) {
		int readNumber = 0;
		byte[] buff = new byte[1024];
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("C:\\Users\\szy\\Desktop\\1.jpg");
			out = new FileOutputStream("C:\\Users\\szy\\Desktop\\2.jpg");
			while((readNumber = in.read(buff)) != -1) {
				out.write(buff, 0, readNumber);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
