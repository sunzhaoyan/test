package com.test.object;

public class BookFactory {
	private BookFactory() {
	}

	private static BookFactory bookFactory = null;

	public static synchronized BookFactory getInstance() {
		if (bookFactory == null) {
			bookFactory = new BookFactory();
		}
		return bookFactory;
	}

	public Book getBook(long id) {
		Book book;
		switch ((int) id) {
		case 1:
			book = new ConcreteBook(1, "设计模式1", "作者1");
			break;
		case 2:
			book = new ConcreteBook(2, "设计模式2", "作者2");
		default:
			book = new NullBook();
		}
		return book;
	}
}
