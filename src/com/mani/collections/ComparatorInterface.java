package com.mani.collections;
import java.util.*;

public class ComparatorInterface {
	public static void main(String[] args) {
		// Elements added to tree set are sorted automatically
		//Set list = new TreeSet(new IDComparator());
		//Set list = new TreeSet(new PublishedYearComparator());
		List list = new ArrayList();
		list.add(new Book(11, 2011, "Book 1"));
		list.add(new Book(12, 2012, "Book 2"));
		list.add(new Book(13, 2013, "Book 3"));
		list.add(new Book(14, 2014, "Book 4"));
		list.add(new Book(15, 2015, "Book 5"));
		
		Collections.sort(list, new PublishedYearComparator());
		
		for (Object element: list) {
			System.out.println(element);
		}
	}

}
