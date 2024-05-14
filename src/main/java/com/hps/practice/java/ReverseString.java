package com.hps.practice.java;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Xerox";
		/*
		 * String revString = reverString(s); // using Stream
		 * System.out.println(s+"      Reverse:   "+revString);
		 * 
		 * StringBuilder sb = new StringBuilder(s); // without Stream
		 * System.out.println("  StringBuilder Reverse"+sb.reverse());
		 */
		
		 System.out.println(usingArray(s));
	}

	private static String reverString(String s) {

		return (String)Stream.of(s).map(String->new StringBuilder(s).reverse()).collect(Collectors.joining(s));
	}

	private static String usingArray(String s) {
		char [] ch= s.toCharArray();
		StringBuilder revSB = new StringBuilder("");
		for (int i=ch.length-1;i>=0;i--) {
			revSB.append(ch[i]);
		}
		
		return revSB.toString();
	}
}
