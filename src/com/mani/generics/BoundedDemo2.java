package com.mani.generics;

public class BoundedDemo2 {
	public static void main(String[] args) {
		TestMouse ttm = new TestMouse("System76");
		JustAnotherClass<TestMouse> tmouse = new JustAnotherClass<>();
		tmouse.setMouse(ttm);
		tmouse.getMouse().connect();
				
	}	

}
