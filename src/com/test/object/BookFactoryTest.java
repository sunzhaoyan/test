package com.test.object;


import org.junit.Test;

public class BookFactoryTest {

	@Test
	public void testGetBook() {
		BookFactory bookFactory = BookFactory.getInstance();
		Book book = bookFactory.getBook(1);
		if (book.isNull()) {
			System.out.println("输入不合法");
		} else {
			book.show();
		}
	}

}
