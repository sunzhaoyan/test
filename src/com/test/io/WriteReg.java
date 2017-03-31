package com.test.io;

import java.io.*;

public class WriteReg {
	public static void main(String[] args) {
		String path = "C:\\Users\\szy\\Desktop\\1.reg";
		String path2 = "C:\\Users\\szy\\Desktop\\1.txt";
		String path3 = "C:\\Users\\szy\\Desktop\\2.txt";
		String data = fileReaderByPath(path);
		String data2 = bufferedReader(path);
		data = formatData(data);
		data2 = formatData(data2);
		fileWriter(data, path2);
		bufferedWriter(data2, path3);
	}

	public static String fileReaderByPath(String path) {
		StringBuffer bf = new StringBuffer();
		FileReader reader = null;
		char[] buf = new char[1024];
		int len = 0;
		try {
			reader = new FileReader(path);
			while ((len = reader.read(buf)) != -1) {
				bf.append(new String(buf, 0, len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return bf.toString();
	}

	public static String bufferedReader(String path) {
		StringBuffer bf = new StringBuffer();
		BufferedReader br = null;
		String line = "";
		try {
			br = new BufferedReader(new FileReader(path));
			line = br.readLine();
			while (line != null) {
				bf.append(line);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return bf.toString();
	}

	public static void fileWriter(String data, String path) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(path);
			fw.write(data);
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void bufferedWriter(String data, String path) {
		BufferedWriter bd = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter(path);
			bd = new BufferedWriter(fw);
			bd.write(data);
			bd.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				bd.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static String formatData(String oldData) {
		String newData = "";
		newData = oldData.substring(oldData.indexOf("hex:") + 4);
		newData = newData.replace("\\", "");
		newData = newData.replace("\r\n", "");
		newData = newData.replace(",", "");
		newData = newData.replace(" ", "");
		System.out.println(newData.length());
		return newData;
	}
}
