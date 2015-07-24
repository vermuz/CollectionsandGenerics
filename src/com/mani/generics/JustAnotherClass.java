package com.mani.generics;

// To force a class to inherit from other classes or implement a USB Interface
//public class JustAnotherClass <T extends TestMouse & TestInterface>

public class JustAnotherClass <T extends TestMouse> {
	
	T mouse;
	
	void setMouse(T mouse) {
		this.mouse = mouse;
	}
	
	T getMouse() {
		return this.mouse;
	}

}
