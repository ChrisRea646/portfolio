package com.qa.excersizes;

import java.util.Arrays;
import java.util.stream.Collectors;

public class unique {
	public String uniqueLetters(String sentence) {
		return Arrays.asList(sentence.split("")).stream().distinct().collect(Collectors.joining(""));
		
		}
		
	}


