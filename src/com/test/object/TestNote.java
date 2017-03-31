package com.test.object;

public class TestNote {
	public static void main(String[] args) {
		Note note = getNote();
		System.out.println(note.isNull());
		note.show();
	}
	
	public static Note getNote() {
		Note note = new NullNote();
		boolean a = false;
		if (!a) {
			note = new EnNote();
		}
		return note;
	}
}
