package com.test.exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			throw new BException();
		} catch (Exception e) {
			System.out.println(e instanceof Exception);
			System.out.println(e instanceof AException);
			System.out.println(e instanceof BException);
			System.out.println(e.getClass().equals(BException.class));
			System.out.println(e.getClass().equals(AException.class));
			System.out.println(e.getClass().equals(Exception.class));
			e.printStackTrace();
		}
	}
}
