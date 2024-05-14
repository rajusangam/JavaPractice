package com.hps.practice.java;

public class Practice {

	public static void main(String[] args) {

		String s="abcdefgh";
		StringBuffer sb = new StringBuffer("");
		char [] a = s.toCharArray();
		for (int i=0; i<=a.length-1;i++) {
			char temp=a[i];
			for (int j=0; j<=i;j++) {
				if (j==0) {					
					sb.append(String.valueOf(temp).toUpperCase());
				} else {
					sb.append(temp);
				}
				if (j>=i) {
					sb.append("\n");
				}
			}
		}
		System.out.println(sb);
	}

}

/*
 * Print out abcdefgh as below: A Bb Ccc Dddd Eeeee Ffffff Ggggggg Hhhhhhhh
 */