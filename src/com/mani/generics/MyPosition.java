package com.mani.generics;

public class MyPosition<T> {
// Bound Parameters
//public class MyPosition<T extends Number> Now the Generics Class can only pass Integers or Doubles
	private T x;
	private T y;
	
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}

}
