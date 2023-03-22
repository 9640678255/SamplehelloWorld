package org.rupesh.stringexamples;

public class FindLengthOfStringWithoutLengthMethod {
	public static void main(String[] args) {
		int length = 0;
		String s = "prepinsta";
		for (int i = 0; i < s.length(); i++) {
			char[] c = s.toCharArray();
			length = c.length;
			
		}
		System.out.println(length);
	}
}
