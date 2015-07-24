/*
 * Cannot be modified
 */

package com.mani.collections;
import java.util.*;

public class ReadOnlyCollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List collection = new ArrayList();
		collection.add(2);
		collection.add(6);
		collection.add(9);
		collection.add(4);
		
		// You do not want the list modified
		collection = Collections.unmodifiableList(collection);
		// OR
		//List collection = new HashSet();
		//collection = Collections.unmodifiableSet(collection);
		
		collection.remove(1);
		collection.add(100);
		
		for (Object oo : collection) {
			System.out.println(oo);
		}

	}

}
