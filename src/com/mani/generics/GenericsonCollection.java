package com.mani.generics;
import java.util.*;

public class GenericsonCollection {
	
	public static void main(String[] args) {
		
		List lis = new ArrayList();
		lis.add(1);
		lis.add(2);
		lis.add(4);
		lis.add(6);
		
		int sum = 0;
		for (int i =0; i<lis.size(); i++) {
			int element = (int) lis.get(i);
			sum += element;
		}
		System.out.println("The sum of the list is " + sum);
	}

}
