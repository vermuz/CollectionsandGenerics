/*
 * Priority Queue. It is an implementation of a Queue wherein the order of elements will be decided based on priority of each elements.
 * Makes sure the least element is at the head of the queue
 */

package com.mani.collections;
import java.util.*;

public class QueueInterfacePriorityQueueDemo {
	public static void main (String[] args) {
		//Queue que = new PriorityQueue();
		Queue que = new PriorityQueue(new IDComparator());
//		que.add(4);
//		que.add(9);
//		que.add(3);
//		que.add(1);
//		que.add(6);
//		que.add(8);
		
		// Adding Objects
		que.add(new Book(11, 1998, "Java 1"));
		que.add(new Book(12, 2001, "Java 2"));
		que.add(new Book(13, 2004, "Java 3"));
		que.add(new Book(14, 2009, "Java 4"));
		
		Iterator it = que.iterator();
		while (it.hasNext()) {
			System.out.println(que.poll());
		}
		
	}

}
