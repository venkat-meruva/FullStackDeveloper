package com.map.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSort {

	public static void main(String[] args) {
		Map<String, Integer> unsorted = new HashMap<String, Integer>();

		unsorted.put("a", 1);
		unsorted.put("c", 5);
		unsorted.put("z", 14);
		unsorted.put("b", 11);
		unsorted.put("m", 25);
		System.out.println("The Unsorted order are as follows:" + unsorted);

		Map<String, Integer> sortedbykey = unsorted.entrySet().stream().sorted(Map.Entry.comparingByKey()).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

	System.out.println("The sorted order based on Key are as follows:"+sortedbykey);
	
	
	
	Map<String,Integer> sortedbyvalue =unsorted.entrySet().stream().sorted(Map.Entry.comparingByValue()).
			collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)-> oldValue,LinkedHashMap::new));

	System.out.println("The sorted order based on Value are as follows:"+sortedbyvalue);

	}
	
}