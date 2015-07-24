/*
 * Elements are inserted at the end and removed from the head - FIFO
 * Implementations include - LinkedList (FIFO) and PriorityQueues
 */

package com.mani.collections;
import java.util.*;

public class QueueInterfaceDemo {
	public static void main (String[] args) {
		Queue que = new LinkedList();
		que.add("first");
		que.add("second");
		que.add("third");
		que.add("fourth");
		que.add("fifth");
		
		
		
		// Peek method returns element at the beginning of the queue 
		// Does not remove the element 		
		//Object element = que.peek();
		// Poll removes the element as well
		//Object element = que.poll();
		//System.out.println(element);
		
		// Remove Element on a certain index
		//Boolean isOk = que.remove("third");
		//System.out.println(isOk);
		
		Object element = que.remove("fifth");
		System.out.println(element);
		
		System.out.println("----------------ELEMENTS-------------------");
		Iterator it = que.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
