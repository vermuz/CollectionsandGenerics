package com.mani.generics;

public class GenericsonClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MyPosition ps = new MyPosition();
		// We want to everything to setup as Ints in MyPosition
		MyPosition<Integer> pos = new MyPosition();
		// MyPosition<String> pos = new Position();
		// pos.setX("4");
		// pos.setY("5");
		
		pos.setX(14);
		pos.setY(15);
		
		System.out.println(pos.getX());
		System.out.println(pos.getY());

	}

}
