package com.collections.demo;

public class StringReverse {

	public static void main(String[] args) {

		StringBuffer sbf = new StringBuffer("MyJava");

		System.out.println(sbf.reverse());

		String test = "my name is rajeev my name is rajeev my name is rajeev hello";

		String[] splittest = test.split(" ");

		String finalstr ="";

		for (int i = splittest.length - 1; i >= 0; i--) {
			System.out.print(splittest[i] + " "); // reverse printing

			if (!finalstr.contains(splittest[i]))
				finalstr = finalstr + splittest[i] + " ";

		}
		System.out.println("");
		System.out.println(finalstr);
	}
}
