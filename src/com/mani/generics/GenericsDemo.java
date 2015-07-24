package com.mani.generics;

public class GenericsDemo {
	
	public static void main(String[] args) {
		Integer intArr[] = {1,2,3,4};
		String strAss[] = {"This","is","an","example"};
		//printArray(intArr);
		//printArray(strAss);
		printArray(strAss, 23, 2.9);
	}
	
	// Same functionality but difference in data type
	public static void printArray(Integer[] arr) {
		for (int i =0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
    }
	
	public static void printArray(Double[] arr) {
		for (int i =0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
    }
	
	public static void printArray(String[] arr) {
		for (int i =0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
    }
	// Above functions can be replaced by
	public static <T> void printArray(T[] arr) {
		for (int i =0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static <T, T2, T3> void printArray(T[] arr, T2 param2, T3 param3) {
		for (int i =0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(param2);
		System.out.println(param3);
	}
}


