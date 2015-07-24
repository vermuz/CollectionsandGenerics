package com.mani.collections;

public class equalshashcodemethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(11, 1998, "Modern Java");
		Book b2 = new Book(12, 2001, "Modern Java1");
		
		if (b1.equals(b2)) {
			System.out.println("EQUAL");
		}
		else {
			System.out.println("Not Equal");
		}

	}

}
