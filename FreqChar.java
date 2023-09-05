package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqChar {
	

	public static void main(String[] args) {

	String str = "aahshshhsh";
	Map<String, Long> freqChar = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(freqChar);
	
	System.out.println(getFreqChar(str));
	
	
	}
	
	public static HashMap<Character, Integer> getFreqChar(String str){
		HashMap<Character, Integer> charFreqMap = new HashMap<>();
		char[] charArray = str.toCharArray();
		for(char c : charArray) {
			if(charFreqMap.containsKey(c)) {
				charFreqMap.put(c, charFreqMap.get(c)+1);
			}else {
				charFreqMap.put(c, 1);
			}
		}
		return charFreqMap;
	}
}
