package com.collections.demo;

import java.util.HashMap;

public class StringDemo {

	public static void main(String[] args) {
	
		HashMap<Character, Integer> numChars = new HashMap<Character, Integer>();
		
		String str="aaaabbbccccdddaabcdeeedfefe";
		
		int len = str.length();
		
			for (int i = 0; i < len; i++)
			{
			    char charAt = str.charAt(i);

			    if (!numChars.containsKey(charAt))
			    {
			        numChars.put(charAt, 1);
			    }
			    else
			    {
			        numChars.put(charAt, numChars.get(charAt) + 1);
			    }
			}
			System.out.print(str.length()+" ");
			System.out.println(numChars);
		}
	}

