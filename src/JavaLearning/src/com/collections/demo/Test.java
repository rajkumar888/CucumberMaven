package com.collections.demo;
import java.util.HashSet;
import java.util.Vector;

class Test {
	public static void main(String[] args) throws Exception {
		Vector<String> data = new Vector<String>();
		data.add("apple");
		data.add("mango");
		data.add("papaya");
		data.add("cherry");
		data.add("banana");
		data.add("apple");
		System.out.println(getData(data));

	}

	public static Vector<String> getData(Vector<String> v) {
		return new Vector<String>(new HashSet<String>(v));
	}
}