package com.test.serial;

import java.io.Serializable;

public class Demo implements Serializable {

	private static final long serialVersionUID = 5420070595897965653L;

	private int id;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + "]";
	}

}
