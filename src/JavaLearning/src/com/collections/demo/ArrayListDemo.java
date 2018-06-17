package com.collections.demo;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(al.size());
		System.out.println(al);

		List<String> list = new ArrayList<String>();
		list.add("Ravi1");
		list.add("Vijay1");
		list.add("Ravi1");
		list.add("Ajay1");

		Iterator<String> itr1 = list.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println(list.size());
		System.out.println(list);
		
		
		List<String> linklist = new LinkedList<String>();
		linklist.add("Ravi11");
		linklist.add("Vijay11");
		linklist.add("Ravi11");
		linklist.add("");
		linklist.add(null);
		linklist.add("Ajay11");
		

		ListIterator<String> itr2 = linklist.listIterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("---");
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		System.out.println(linklist.size());
		System.out.println(linklist);

	}
}