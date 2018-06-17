package com.collections.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetandLinkedHashSet {

	public static void main(String[] args) {
	
		HashSet hasset = new HashSet<>();
		
		hasset.add("Ravi11");
		hasset.add("Vijay11");
		hasset.add("Ravi11");
		hasset.add("");
		hasset.add(null);
		hasset.add("Ajay11");
		
		System.out.println(hasset.size());
		System.out.println(hasset);

		
		LinkedHashSet linkedhasset = new LinkedHashSet<>();
		
		linkedhasset.add("Ravi11");
		linkedhasset.add("Vijay11");
		linkedhasset.add("Ravi11");
		linkedhasset.add("");
		linkedhasset.add(null);
		linkedhasset.add("Ajay11");
		
		System.out.println(linkedhasset.size());
		System.out.println(linkedhasset);

		
	}

	}
