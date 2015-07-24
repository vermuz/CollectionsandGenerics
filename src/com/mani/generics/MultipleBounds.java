package com.mani.generics;

public class MultipleBounds {
	
	public static void main(String[] args) {
		int n1 =5;
		int n2 = 7;
		checkValues(n1, n2);
	}
	
	/*public static void checkValues(int n1, int n2) {
		if (n1 > n2) {
			System.out.println("n1 is greater");
		}
		else {
			System.out.println("n2 is greater");
		}
	}*/
	
	public static <T1 extends Integer, T2 extends Integer> void checkValues(T1 n1, T2 n2) {
		if (n1 > n2) {
			System.out.println("n1 is greater");
		}
		else {
			System.out.println("n2 is greater");
		}
	}
}
