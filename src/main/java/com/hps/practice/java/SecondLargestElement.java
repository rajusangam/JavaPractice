package com.hps.practice.java;

import java.util.Arrays;
import java.util.Stack;

public class SecondLargestElement {

	public static void main(String[] args) {

		int [] num = {82, 85, 81, 90, 80, 84};
		
//		softWithoutForLoop(num);
//		softWithForLoop(num);
		balancedBracklet();
	}
	
	static void softWithoutForLoop(int[] num) {
		Arrays.sort(num,0,num.length);
		if(num.length>=2) {
			System.out.println("IInd Highest value is: "+num[num.length-2]);
		} else {
			System.out.println(num[1]);
		}
			
	}
	
	static void softWithForLoop(int[] num) {
		int temp=0;
		for (int i=0;i<num.length;i++) {
			for (int j=i+1;j<num.length;j++) {
				if(num[j]>num[i]) {
					temp=num[j];
					num[j]=num[i];
					num[i]=temp;
				}
			}
			System.out.println(num[i]);
		}
	}
	
	
	static void balancedBracklet() {
		String s = "}])({[";
        String balancedString = convertToBalancedBrackets(s);
        System.out.println("Original String: " + s);
        System.out.println("String with Balanced Brackets: " + balancedString);
	}
	public static String convertToBalancedBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    result.append('('); // Insert opening bracket
                }
            }
            System.out.println(c);
            result.append(c);
        }
        
        while (!stack.isEmpty()) {
            result.append(')'); // Insert closing brackets for remaining open brackets
            stack.pop();
        }
        
        return result.toString();
    }

}
