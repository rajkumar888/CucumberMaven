package com.collections.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(10, "str1");
		map.put(11, "str2");
		map.put(12, "str3");
		map.put(13, "str4");
		map.put(14, "str5");
		map.put(15, "str6");
		map.put(10, "str11");
		map.put(16, "str1");
		map.put(null, "str112");

		System.out.println(map);
		
		System.out.println(" ------ ");
		System.out.println(map.get(13));
		

		Set<Integer> keyval = map.keySet();
		Iterator<Integer> iter = keyval.iterator();
		Iterator<Integer> iter1 = keyval.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next() + " " + map.get(iter1.next()));
		}

		for (Map.Entry<Integer, String> ent : map.entrySet()) {
			System.out.println(ent.getKey() + "-> " + ent.getValue());
		}
	}
}
