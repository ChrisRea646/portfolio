package com.qa.factorials;

public class factorials {
	public static int factorials(int i) {
		int num = 1;
		for(;i>0;i--) {
			num = num *i;
			i--;
		}
		return num;
	}

}
