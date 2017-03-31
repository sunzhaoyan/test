package com.test.object;

public class ConcreteBook implements Book {
	
	private long id;
	private String name;
	private String author;
	
	public ConcreteBook(){}
	public ConcreteBook(long id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public void show() {
		System.out.println(this.id + "**" + this.name + "**" + this.author);
	}

}
