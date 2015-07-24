package com.mani.collections;

public class IDComparator implements java.util.Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Book b1 = (Book)o1;
		Book b2 = (Book)o2;
		if (b1.ID > b2.ID) return 1;
		else if (b1.ID < b2.ID) return -1;
		else return 0;
	}

}
