package com.test.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TestSerial {
	public static void main(String[] args) {
		save();

		load();
	}

	private static void save() {
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("szy");
		try (OutputStream out = new FileOutputStream("demo.txt");
		        ObjectOutputStream writer = new ObjectOutputStream(out)) {
			writer.writeObject(demo);
			writer.flush();
			System.out.println("写入完毕...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void load() {

		try (FileInputStream in = new FileInputStream("demo.txt");
		        ObjectInputStream read = new ObjectInputStream(in);) {
			Demo demo = (Demo) read.readObject();
			System.out.println(demo);
			System.out.println("读取完毕...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
