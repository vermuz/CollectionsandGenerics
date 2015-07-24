package com.mani.collections;

public class Book implements Comparable {
	int ID;
	int publishedYear;
	String name;
	
	//public Book(String name) {
		//this.name = name;
	//}
	
	public Book(int ID, int publishedYear, String name) {
		this.ID= ID;
		this.publishedYear = publishedYear;
		this.name = name;
	}
	
	@Override
	public String toString() {
		//return name;
		return "ID " + " - " + publishedYear + " - " + name;
	}
	
	@Override
	public boolean equals(Object o) {
		Book b = (Book) o;
		if (this.ID == b.ID) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		//return 0;
		Book b = (Book) o;
		//if (ID > b.ID) return 1;
		//else if (ID < b.ID) return -1;
		//else return 0;
		
		if(publishedYear > b.publishedYear) return 1;
		else if (publishedYear < b.publishedYear) return -1;
		else return 0;
	}
}
