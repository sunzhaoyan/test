package com.test.try1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.junit.Test;

public class TestTryWithResources {
	
	private static String basePath = System.getProperty("user.dir");
	
	@SuppressWarnings("resource")
	@Test
	public void test1() throws Exception {
		File file = new File(basePath, "test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		System.out.println(br.readLine());
//		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write("ceshi: " + new Date().getTime());
		bw.flush();
	}
	
	@Test
	public void test2(){
		File file = new File(basePath, "test.txt");
		try (FileInputStream in = new FileInputStream(file); 
				FileOutputStream out = new FileOutputStream(file)) {
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *	jdk7 引入的try-with-resources 写法。
	 *  实现了AutoCloseable的类，不论是否抛出异常都会在正常代码后执行close关闭  
	 */
	@Test
	public void testAutoClose() {
		try (MyAutoCloseable mac = new MyAutoCloseable()) {
			mac.doSomething();
//			throw new Exception("手动抛出异常...");
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("捕获异常...");
		} finally {
			System.out.println("执行finally中的方法...");
		}
	}
	
	@Test
	public void testNonAutoClose() {
		MyAutoCloseable mac = new MyAutoCloseable();
		try {
			mac.doSomething();
			throw new Exception("手动抛出异常...");
		} catch(Exception e) {
			System.out.println("捕获异常...");
		} finally {
			System.out.println("执行finally中的方法...");
			try {
				mac.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
