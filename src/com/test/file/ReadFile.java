package com.test.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberReader;

import org.junit.Test;

public class ReadFile {
	public static void main(String[] args) {
		String filePath = "/porxy.html";
		InputStream in = ReadFile.class.getResourceAsStream(filePath);
		byte[] tempBytes = new byte[256];
		try {
			int read = -1;
			while ((read = in.read(tempBytes)) != -1) {
				System.out.write(tempBytes, 0, read);
			}
			System.out.println("done");
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void test1() {
		String filePath = "D:\\Workspaces\\itrus\\test\\src\\com\\file1.txt";
		File file = new File(filePath);
		FileReader fileReader;
		StringBuffer bf = new StringBuffer();
		try {
			fileReader = new FileReader(file);
			LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
			String string = null;
			while ((string = lineNumberReader.readLine()) != null) {
				bf.append(string + "\n");
			}
			lineNumberReader.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(bf);
	}
}
