package javaDemoPack;

import java.util.TreeMap;
import java.util.TreeSet;

public class Treesetdemo {

	public static void main(String[] args) {

		TreeSet<Object> treeset = new TreeSet<Object>();

		treeset.add("Ravi11");
		treeset.add("Vijay11");
		treeset.add("Ravi11");
		treeset.add("");
		//treeset.add(null);
		treeset.add("Ajay11");
		
		System.out.println(treeset.size());
		System.out.println(treeset);

		TreeMap<Object, Object> treemap = new TreeMap<Object, Object>();

		treemap.put(1, 100);
		treemap.put(2, 200);
		treemap.put(3, 300);
		treemap.put(4, 400);
		treemap.put(5, 400);
		treemap.put(6, null);
		//treemap.put(null, 800);

		System.out.println(treemap.size());
		System.out.println(treemap);

	}
}