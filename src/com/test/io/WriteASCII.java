package com.test.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteASCII {
	private static final int N = 200;

	public static void main(String[] args) {
		BufferedWriter out = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:\\Users\\szy\\Desktop\\ascii.txt");
			out = new BufferedWriter(fw);
			for (int i = 0; i < N; i++) {
				out.write(i + ":" + (char) i + "\r\n");
			}
			out.flush();
			System.out.println("done!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
