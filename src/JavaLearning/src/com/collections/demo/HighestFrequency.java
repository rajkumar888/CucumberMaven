package com.collections.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HighestFrequency {

	public static void main(String[] args) {
		// System.out.println("Enter the char string to check higest
		// occurrence");
		// Scanner scan = new Scanner(System.in);
		// String str = scan.next();

		String str1 = "123456789055557777744444444444";

		if (str1 != null && !str1.isEmpty()) {
			Map<Character, Integer> map = countOccurrence(str1);
			getHigestOccurrenceChar(map);
		} else {
			System.out.println("enter valid string");
		}
	}

	public static Map<Character, Integer> countOccurrence(String str) {
		char strArr[] = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character ch : strArr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		return map;
	}

	public static void getHigestOccurrenceChar(Map<Character, Integer> map) {
		Character ch = null;
		Integer no = 0;

		Set<Entry<Character, Integer>> entrySet = map.entrySet();

		for (Entry<Character, Integer> entry : entrySet) {
			if (no != 0 && ch != null) {
				if (entry.getValue() > no) {
					no = entry.getValue();
					ch = entry.getKey();
				}
			} else {
				no = entry.getValue();
				ch = entry.getKey();
			}
		}
		System.out.println(ch + " Higest occurrence char is " + no);
	}
}
