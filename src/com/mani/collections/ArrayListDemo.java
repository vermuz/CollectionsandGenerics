/*
 * -----------------------------LIST INTERFACE ---------------------
 * List Interface can contain duplicate elements, ArrayList Vector
 * 
 * Vectors are synchronized. Any method that touches the Vector's contents is thread safe. 
 * ArrayList, on the other hand, is unsynchronized, making them, therefore, not thread safe. 
 * With that difference in mind, using synchronization will incur a performance hit. 
 * So if you don't need a thread-safe collection, use the ArrayList. 
 * Why pay the price of synchronization unnecessarily?
 */

package com.mani.collections;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		//ArrayList list = new ArrayList();
		//List list1 = new ArrayList();
		
		List list1 = new Vector();
		list1.add(1);
		list1.add(2);
		list1.add("Hello");
		list1.add(5.5);
		// Add an element at index 4
		list1.add(4, "Yeah");
		//list1.add(new Book("Book 1"));
		
		list1.set(2, 100);
		list1.remove("Hello");
		list1.remove(1);
		
		if (list1.contains("Yeah")) {
			System.out.println("----EXISTS-------");
		}
		
//		for (int i = 0; i < list1.size(); i++) {
//			Object element = list1.get(i);
//			System.out.println(element);
//		}
		// Enhanced For Loop
		for (Object element: list1) {
			System.out.println(element);
		}
	}
}