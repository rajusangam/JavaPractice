package com.hps.practice.java;

public class Practice1 {

	public static void main(String[] args) {

		String s="AB CD EF GH IJ KL MN OP";
		StringBuilder sb = new StringBuilder("");
		String [] letters = s.split(" ");
		int length=0;
		if(((letters.length+1) % 2)  == 0) {
			length = letters.length;
		} else {
			length = letters.length-1;
		}
		for (int i=0;i<length;i++) {
			sb.append(letters[i+1]+" ");
			sb.append(letters[i]+" ");
			i += 1;
		}
		length = length+1;
		if((length % 2) == 0) {
//			sb.append(letters[length]);
		} else {
			sb.append(letters[length-1]);
		}
		System.out.println(sb);
	}

}
