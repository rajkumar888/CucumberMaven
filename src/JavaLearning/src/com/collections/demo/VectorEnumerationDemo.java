package com.collections.demo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEnumerationDemo {

	public static void main(String[] args) {

		Vector<String> vct = new Vector<String>();
		vct.add("rajeev1");
		vct.add("rajeev2");
		vct.add("rajeev3");
		vct.add("rajeev4");
		vct.add("rajeev5");
		vct.add("rajeev6");
		vct.add(null);

		System.out.println(vct.size());
		System.out.println(vct);

		Enumeration<String> enu = vct.elements();

		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}

		Iterator<String> itr = vct.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
