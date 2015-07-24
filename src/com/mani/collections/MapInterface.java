/*
 * Map is an object that maps keys to values
 * Cannot contain duplicate keys
 * Each key can map only to one value
 * HashMap, LinkedHashMap and Tree HashMap
 * Map does not accept duplicate keys
 */

package com.mani.collections;
import java.util.*;


public class MapInterface {
	public static void main(String[] args) {
		//HashMap map = new HashMap();
		//Map map = new HashMap();
		//If you do not want your order of mappings to change from how you entered them
		//Map map = new LinkedHashMap();
		//If you want to retain keys in ascending order
		Map map = new TreeMap();
		map.put("java", "Java Containers");
		map.put("python", "Python Containers");
		map.put("C++", "C++ Containers");
		map.put("C", "C Containers");
		map.put("Tsql", "Tsql Containers");
		
		// Same key - new value is overridden
		map.put("java", "Java Containers 3");
		map.remove("java");
		
		// Only remove a key if it is associated with a certain value
		map.remove("java", "Java Containers");
		
		//Set keys = map.keySet();
		//for (Object key: keys) {
			//Object value = map.get(key);
			//System.out.println(value);
			//System.out.println(key);
		//}
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			// Get keys
			Object key = it.next();
			// Corresponding value
			Object value = map.get(key);
			System.out.println("key " + key + " has value " + value);
		}
	}

}
