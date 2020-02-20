package com.qa.find;

public class Find {
	public boolean find(String s, int i, char c) {
		//return s.substring(i - 1, i).equals(String.valueOf(c));
		return s.charAt(i-1)==c;
	}
}
