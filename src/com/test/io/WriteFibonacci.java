package com.test.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;

public class WriteFibonacci {
	public static void main(String[] args) {
		BigInteger[] fib = getFibonacci(1000);
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("C:\\Users\\szy\\Desktop\\fibonacci.txt");
			StringBuffer bf = new StringBuffer();
			int count = 1;
			for (BigInteger i : fib) {
				bf.append(i + " ");
				System.out.println(count + ":" + i);
				count++;
			}
			for(char s : bf.toString().toCharArray()) {
				out.write(s);
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static BigInteger[] getFibonacci(int n) {
		BigInteger[] fib = new BigInteger[n];
		fib[0] = new BigInteger(1 + "");
		fib[1] = new BigInteger(1 + "");
		for (int i = 2; i < n; i++) {
			fib[i] = fib[i - 1].add(fib[i - 2]);
		}
		return fib;
	}
}
