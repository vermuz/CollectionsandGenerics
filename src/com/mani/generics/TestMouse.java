package com.mani.generics;

public class TestMouse {
	
	String name;
	
	public TestMouse (String name) {
		this.name = name;
	}
	
	public void connect() {
		System.out.println(name + " connected");
	}

}
