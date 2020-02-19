package com.qa.excersizes;

public class palindrome {
	public static void main(String[] args) {
		
	}	
	public boolean palindrome(String sentence) {
		String sen = sentence.replace(" ","").toLowerCase();
		String reversedString="";
		for(int i = sen.length()-1; i>=0;i--) {
			reversedString = reversedString + sen.charAt(i);
		}
		return sen.equals(reversedString);
	}
}
