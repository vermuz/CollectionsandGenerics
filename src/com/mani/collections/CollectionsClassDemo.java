/*
 * HELPER CLASS FOR COLLECTIONS
 * METHODS in COLECTIONS class are static so you do not need to create an instance before invoking a method
 */

package com.mani.collections;
import java.util.*;

public class CollectionsClassDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(4);
		list.add(9);
		list.add(1);
		list.add(6);
		list.add(8);
		
		// Sort the List in ascending order
		//Collections.sort(list);
		// Reverse order of elements in the list
		//Collections.reverse(list);
		// Randomly reorder elements
		//Collections.shuffle(list);
		
		// Find a particular element in the list
		// Binary search requires sorted list
		Collections.sort(list);
		//int result = Collections.binarySearch(list,1);
		//System.out.println("Found 1 " + "at index " + result);
		// Trying finding something not in the list and you get a -ve number
		//int result = Collections.binarySearch(list,11);
		//System.out.println("Found 1 " + "at index " + result);
		
		// Max Value
		System.out.println("The Max value in the list is " + Collections.max(list));
		// Min Value
		System.out.println("The Min value in the list is " + Collections.min(list));
		
		//for (Object element: list) {
			//System.out.println(element);
		//}
	}

}
