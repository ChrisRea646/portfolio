package com.qa.odity;

import java.util.ArrayList;
import java.util.List;

public class oddity {
	public List<Integer> oddity(int[] nums){
		List<Integer> numList = new ArrayList<>();
		for(int numbers:nums) {
			if(numbers % 2!=0) {
				numList.add(numbers);
			}
		}
		return numList;
	}

}
