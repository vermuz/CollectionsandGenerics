/*
 * Comparable interface is used to order the objects of user-defined class.This interface is found in java.lang package 
 * and contains only one method named compareTo(Object).It provide only single sorting sequence 
 * i.e. you can sort the elements on based on single datamember only.For instance it may be either rollno,name,age or anything else.
 */

package com.mani.collections;
import java.util.*;

public class ComparableInterface {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		//list.add(4);
		//list.add(9);
		//list.add(6);
		//list.add(1);
		//list.add(8);
		
		// Adding book objects to list
		list.add(new Book(11, 1998, "Java Containers"));
		list.add(new Book(12, 2008, "Python Containers"));
		list.add(new Book(13, 2010, "C++ Containers"));
		list.add(new Book(14, 2013, "RD Containers"));
		list.add(new Book(15, 2015, "R Containers"));
		
		// Caution - sort method does not know how to sort list of objects
		//Collections.sort(list);
		
		for(Object element: list) {
			System.out.println(element);
		}
		
	}

}
