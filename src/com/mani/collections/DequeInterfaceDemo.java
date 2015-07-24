/*
 * Elements can be inserted and removed from both sides
 * -------------------------- DOUBLE ENDED QUEUE --------------------------------------------------
 * Implementations - ArrayDeque and ListedList
 * Same functionality but LinkedList does not need contiguous memory locations like ArrayDeque and hence has better performance
 */

package com.mani.collections;
import java.util.*;

public class DequeInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque de = new ArrayDeque(10);
		de.add(3);
		de.addLast(5);
		de.addLast(8);
		de.addLast(9);
		de.addFirst(1);
		de.addFirst(2);
		
		//Object element = de.peekFirst();
		//System.out.println(element);
		//Object element = de.peekLast();
		//System.out.println(element);
		
		// Remove element from Deque
		// Fetch and Remove
		Object element = de.pollFirst();
		System.out.println(element);
		
		Iterator it = de.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
