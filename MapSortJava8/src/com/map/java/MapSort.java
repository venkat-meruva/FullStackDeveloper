package com.map.java;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class MapSort {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("a", 1);
		map.put("c", 5);
		map.put("z",14);
		map.put("b", 11);
		map.put("m", 25);
		
	List<Entry<String,Integer>> list = new LinkedList<Entry<String,Integer>>(map.entrySet());
	//Sort by value
	Collections.sort(list,new Comparator<Entry<String,Integer>>(){
		@Override
		public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {	
			return arg0.getValue().compareTo(arg1.getValue());
		}
});
	System.out.println("The Sorted list based on Value:");
	for(Entry<String,Integer> item: list) {
		System.out.println(item);
	}
	//sort by key
	Collections.sort(list,new Comparator<Entry<String,Integer>>(){

		@Override
		public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
			
			return arg0.getKey().compareToIgnoreCase(arg1.getKey());
		}
		
});
	System.out.println("Sorted List Based on  Key:");
	for(Entry<String,Integer> item: list) {
		System.out.println(item);
	}
}
}