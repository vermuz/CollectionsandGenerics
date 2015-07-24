/*
 * ---------------------------------SET INTERFACE -------------------------------------
 * Set Interface cannot contain duplicates. Treeset, Hash Set, LinkedHashset
 */

package com.mani.collections;
import java.util.*;

public class SetInterfaceDemo {
	public static void main(String[] args) {
		//HashSet set = new HashSet();
		//HashSet does not accept duplicate elements
		//HashSet will also not follow the order in which elements are ordered
		//Set set = new HashSet();
		
		//If you do not your order of elements changed - keep it in the order you added elements
		//Set set = new LinkedHashSet();
		
		//If you want elements to be sorted in ascending order, use TreeSet
		Set set = new TreeSet();
		
		
		set.add(1);
		set.add(2);
		set.add(7);
		set.add(0);
		set.add(3);
		set.add(6);
		set.add(11);
		
		// We can add a list to a Set
		ArrayList lst = new ArrayList();
		lst.add(22);
		lst.add(33);
		lst.add(44);
		
		set.addAll(lst);
		
		set.remove(3);
		
		if (set.contains(5)) {
			System.out.println("EXISTS");
		}
//		for (Object element: set) {
//			System.out.println(element);
//		}	
		
		// Traverse a class without caring about underlying data structure
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
